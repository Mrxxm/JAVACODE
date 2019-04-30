<?php

header('Content-Type:text/json;charset=utf-8');

include_once(__DIR__ . '/pay.php');

$pay = new pay();

// 需要传入下单返回时的订单ID
$orderId = '';

$orderData = $pay->queryOrder($orderId);

var_dump($orderData);

