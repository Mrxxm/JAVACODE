<?php

include_once(__DIR__ . '/pay.php');

$pay = new pay();

//接收回调信息
$data = array(
    'price' => $_POST['price'],
    'status' => $_POST['status'],
    'order_id' => $_POST['order_id'],
    'timestamp' => $_POST['timestamp'],
    'out_trade_no' => $_POST['out_trade_no']
);

$sign = $_POST['sign'];

$boolVerifySign = $pay->verifySign($data,$sign);

if ($boolVerifySign) {
    echo 'success';
} else {
    echo 'fail';
}

