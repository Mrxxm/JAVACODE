<?php
/*
* 1002.写出这个数
* 读入一个自然数n，计算其各位数字之和，用汉语拼音写出和的每一位数字。
*/
echo "1002.写出这个数\n";
echo "读入一个自然数n，计算其各位数字之和，用汉语拼音写出和的每一位数字\n";
echo "输入一个自然数:";

$N = fopen("php://stdin", "r");

$n = trim(fgets($N)); 

$length = mb_strlen($n,'utf8');

$sum = 0;

$str = ["ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu"];

for ($i = 0; $i < $length; $i++) { 
	$sum += ($n[$i] - '0');
}

$sum = strval($sum);

$length = mb_strlen($sum,'utf8');

echo "结果为:";

for ($i = 0; $i < $length; $i++) { 
	echo $str[$sum[$i] - '0'] . ' ';
}