<?php

class PasswordAlgorithm
{
    /*  生成固定和不固定长度组合密码 
    *   @generatePassword($arg,  $min, $max)
    *   $arg               可选参数  1  小写英文字母
    *                               2  大写英文字母
    *                               3  数字 
    *                               4  小写英文字母 大写英文字母 
    *                               5  小写英文字母 数字        
    *                               6  小写英文字母 特殊符号     
    *                               7  大写英文字母 数字        
    *                               8  大写英文字母 特殊符号     
    *                               9  数字        特殊符号 
    *                               10 小写英文字母 大写英文字母 数字
    *                               11 小写英文字母 大写英文字母 特殊符号
    *                               12 小写英文字母 数字        特殊符号
    *                               13 大写英文字母 数字        特殊符号
    *                               14 小写英文字母 大写英文字母 数字     特殊符号
    *   $min    密码最小长度
    *   $max    密码最大长度
    *
    *   生成固定长度为8的密码组合
    *   例1: $this->generatePassword(10, 8, 8);
    *
    *   生成不固定长度为8~16的密码组合
    *   例2: $this->generatePassword(10, 8, 16);  
    */
    public static function generatePassword(int $arg = 10, $min = 8, $max = 30)
    {
        if ($min < 4) {
            return "";
        }

        if (in_array($arg, range(1, 14))) {

            $args = self::getArgs($arg);

            $argsCombinationNum = count($args);

            if ($min == $max) {

                $passwordLength = $min;

                $randomNum = self::getRandomNumber($argsCombinationNum, $passwordLength);

                return self::getRandomPassword($args, $randomNum);

            }

            if ($min < $max) {

                $passwordLength = mt_rand($min, $max);

                $randomNum = self::getRandomNumber($argsCombinationNum, $passwordLength);

                return self::getRandomPassword($args, $randomNum);

            }
            
        }

        return "";
    }  

    private static function getArgs($arg)
    {
        $optionalChars = array(range('a', 'z'), range('A', 'Z'), range('0', '9'), ["(", ")", "`", "~", "!", "@", "#", "$", "%", "^", "&", "*", "-", "+", "=", "|", "{", "}", "[", "]", ":", ";", "'", "<", ">", ",", ".", "?", "/"]);

        switch ($arg) {
            case 1: 
                $args = [$optionalChars[0]];
               break;
            case 2:
                $args = [$optionalChars[1]];
                break;
            case 3:
                $args = [$optionalChars[2]];
                break;
            case 4:
                $args = [$optionalChars[0], $optionalChars[1]];
               break;
            case 5:
                $args = [$optionalChars[0], $optionalChars[2]];
                break;
            case 6:
                $args = [$optionalChars[0], $optionalChars[3]];
                break;
            case 7:
                $args = [$optionalChars[1], $optionalChars[2]];
               break;
            case 8:
                $args = [$optionalChars[1], $optionalChars[3]];
                break;
            case 9:
                $args = [$optionalChars[2], $optionalChars[3]];
                break;
            case 10:
                $args = [$optionalChars[0], $optionalChars[1], $optionalChars[2]];
               break;
            case 11:
                $args = [$optionalChars[0], $optionalChars[1], $optionalChars[3]];
                break;
            case 12:
                $args = [$optionalChars[0], $optionalChars[2], $optionalChars[3]];
                break;
            case 13:
                $args = [$optionalChars[1], $optionalChars[2], $optionalChars[3]];
                break;
            case 14:
                $args = [$optionalChars[0], $optionalChars[1], $optionalChars[2], $optionalChars[3]];
                break;    
        }

        return $args;
    }

    private static function getRandomNumber($argsCombinationNum, $passwordLength)
    {
        for ($i = 0; $i < $argsCombinationNum; $i++) {

            if ($i == ($argsCombinationNum - 1)) {

                $randomNum[$i] = $passwordLength;

            } else {

                $randomNum[$i] = rand(1, $passwordLength - ($argsCombinationNum - ($i + 1)));

                $passwordLength = $passwordLength - $randomNum[$i]; 
            }
            
        }

        return $randomNum;
    }

    private static function getRandomPassword($chars, array $randomNum)
    {
        $password = "";

        foreach ($chars as $k => $char) {
   
            for ($i = 0; $i < $randomNum[$k]; $i++) { 

                $keys[$i] = mt_rand(0, count($char) - 1);

                $password .= $char[$keys[$i]];

            }
        }

        return str_shuffle($password);
    }

    private static function getRandomArgs($args)
    {
        $argsCombinationNum = mt_rand(3, count($args));

        $keys = array_rand($args, $argsCombinationNum);

        for ($i = 0; $i < $argsCombinationNum; $i++) { 

            $randomArgs[$i] = $args[$keys[$i]];
        }

        return $randomArgs;
    } 
}

$passwordAlgorithm = new PasswordAlgorithm();
$pass1 = $passwordAlgorithm->generatePassword();
 
var_dump($pass1);

