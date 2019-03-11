<?php


/*
* 1001.计算A+B的和，然后以每三位加一个”,”的格式输出。
* 
*/

echo "A-1001.计算A+B的和，然后以每三位加一个”,”的格式输出...\n";

$a = fopen("php://stdin", "r");
$b = fopen("php://stdin", "r");

echo "输入A:";
$A = trim(fgets($a));

echo "输入B:"; 
$B = trim(fgets($b));

// $A $B string类型、$c int类型
$c = $A + $B;

$C = str_split($c);

$length = count($C);

echo "结果为:";
for ($i = 0; $i < $length; $i++) { 
	echo $C[$i];
	if ($C[$i] == '-') {
		continue;
	}
	if (($i + 1) % 3 == $length % 3 && $i != $length - 1) {
		echo ",";
	}
}

fclose($a);
fclose($b);
