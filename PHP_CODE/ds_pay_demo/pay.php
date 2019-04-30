<?php

include_once( __DIR__ . '/config.php');

class pay
{
    protected $queryUrl;
    protected $submitUrl;
    protected $apiToken;

    function __construct()
    {
        $this->queryUrl = BASE_URL . '/api/partner/order';   // 查询订单
        $this->submitUrl = BASE_URL . '/api/partner/order';  // 下单地址
        $this->apiToken = API_TOKEN;                         // 合作伙伴 api_token
    }

    /**
     * @param $orderParams
     *        $type           类型:支付宝/微信
     *        $price          价格:分
     *        $buyer_id       充值用户ID:限32位
     *        $notify_url     通知回调:限128位
     *        $out_trade_no   本地订单:限64位
     * @return bool|mixed|string
     */
    public function order($orderParams)
    {
        $orderParameters = array(
            'type' => $orderParams['type'],
            'price' => $orderParams['price'],
            'buyer_id' => $orderParams['buyer_id'],
            'notify_url' => $orderParams['notify_url'],
            'out_trade_no' => $orderParams['out_trade_no']
        ); 

        $result = $this->send(
            $this->submitUrl,
            $orderParameters,
            'POST'
        );

        return $result;
    }

    public function queryOrder($orderId)
    {
        $result = $this->send($this->queryUrl,
            ['order_id' => $orderId],
            'GET'
        );

        return $result;
    }

    public function verifySign($data, $sign)
    {
        ksort($data);
        $queryStr = urldecode(http_build_query($data));
        $tmpSign = md5($queryStr . $this->apiToken);

        if ($tmpSign == $sign) {
            return true;
        }

        return false;
    }

    private function send($url, $params = [], $method='GET', $header = [])
    {
        $opts = array(
            CURLOPT_TIMEOUT => 30,
            CURLOPT_RETURNTRANSFER => TRUE,
            CURLOPT_SSL_VERIFYHOST => FALSE,
            CURLOPT_SSL_VERIFYPEER => FALSE,
            CURLOPT_HTTPHEADER => empty($header) ? array("Authorization: Bearer $this->apiToken") : $header,
            CURLOPT_HEADER => FALSE
        );
        switch(strtoupper($method)){
            case 'GET':
                $opts[CURLOPT_URL] = $url . '?' . http_build_query($params);
                break;
            case 'POST':
                $opts[CURLOPT_URL] = $url;
                $opts[CURLOPT_POST] = TRUE;
                $opts[CURLOPT_POSTFIELDS] = $params;
                break;
        }
        $ch = curl_init();
        curl_setopt_array($ch,$opts);
        $result = curl_exec($ch);
        $error = curl_error($ch);
        curl_close($ch);
        if($error){
            echo 'curl执行出错';
        }
        return json_decode($result,true);
    }
 }
