<?php

class PasswordUtil
{
    // 生成固定长度密码和不固定长度密码
    public static function generatePassword($min = 8, $max = 30)  
    {
        if ($min > 3 && $max > 3) {
           
            $availChars = array(range('a', 'z'), range('A', 'Z'), range('0', '9'), ["(", ")", "`", "~", "!", "@", "#", "$", "%", "^", "&", "*", "-", "+", "=", "|", "{", "}", "[", "]", ":", ";", "'", "<", ">", ",", ".", "?", "/"]);

            // 满足提供的三种或以上组合
            $length = mt_rand(3, count($availChars));
            $keys = array_rand($availChars, $length);
            for ($i = 0; $i < $length; $i++) { 
                $randChars[$i] = $availChars[$keys[$i]];
            }

            if ($min == $max) {
                // 根据组合数，生成相应组合所需随机数量
                $passwordLength = $min;
                for ($i = 0; $i < $length; $i++) {
                    if ($i == ($length - 1)) {
                        $randNum[$i] = $passwordLength;
                    } else {
                        $randNum[$i] = rand(1, $passwordLength - ($length - ($i + 1)));
                        $passwordLength = $passwordLength - $randNum[$i]; 
                    }
                    
                }
                return self::getRandomChars($randChars, $randNum);
            } 

            if ($min < $max && ($max - $min) >= 3) {

                // 根据组合数，生成相应组合所需随机数量
                $mi = intval($min / $length);
                $ma = intval($max / $length);
                $leng = mt_rand($mi, $ma);
                if ( $leng * $length < $min) {
                    ++$leng;
                } 
                for ($i = 0; $i < $length; $i++) { 
                    $randomNum[$i] = $leng;
                }
                return self::getRandomChars($randChars, $randomNum);
            }
            return "";
        }   
    }

    private static function getRandomChars($randomChars, array $randomNum)
    {
        // 根据组合与相应组合所需随机数量，生成密码
        $password = "";
        foreach ($randomChars as $i => $chars) {
            $keys = array_rand($chars, $randomNum[$i]); // array_rand(,)第二参数为1时，$keys不为数组
            $passwordPart = '';
            for ($j = 0; $j < $randomNum[$i]; $j++) {
                if ($randomNum[$i] == 1) {
                    $passwordPart .= $chars[$keys];
                } else {
                    $passwordPart .= $chars[$keys[$j]];
                }   
            }
            $password .= $passwordPart;
        }
        return str_shuffle($password);
    }
}