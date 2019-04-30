<?php

header('Content-Type:text/json;charset=utf-8');

include_once(__DIR__ . '/pay.php');

$pay = new pay();

$storeParams = array(
	'type' => 'alipay_wap',
    'price' => '50000',
    'buyer_id' => random_int('1000', '9999'),
    'notify_url' => 'http://xxx/xxx',
    'out_trade_no' => time()
);

$receiveData = $pay->order($storeParams);

if (isset($receiveData['pay_url'])) {
    var_dump($receiveData);
    echo "----------order_info------------\n";

    $orderId = $receiveData['id'];
    $orderData = $pay->queryOrder($orderId);

    var_dump($orderData);
} else {
	var_dump($receiveData);
}



