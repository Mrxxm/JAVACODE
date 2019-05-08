<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>在线充值</title>
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
	</head>
  <body>
	<div style="text-align:center">
	  <h2>下单</h2>
	</div>
	<form name="form1" action="order.jsp" method="post">
  		<table width="445" border="0" align="center" cellpadding="0" cellspacing="0" style="border:#99CC00 solid 2px">
    		<tr>
      		<td  colspan="2" align="center" bordercolor="#00CCFF">
				    <table width="68%" border="0" cellpadding="0" cellspacing="1" bgcolor="#CCCCCC">
      				<tr>
		            <td width="32%" height="25" align="left" bgcolor="#FFFFFF">
		            		<input type="radio" name="type" value="wechat_trans_qr"  />微信支付
		            	</td>
		          	<td width="32%" align="left" bgcolor="#FFFFFF">
		          	    <input type="radio" name="type" value="alipay_wap" />支付宝支付
		          	</td>
      				</tr>
      			</table>
      				<div style="text-align:center">
    			    		充值金额：<input type="text" name="price" value="5000" />
    			    </div>
    			    <div style="text-align:center">
    			    		本地订单号：<input type="text" name="out_trade_no" value="<%=(int)(Math.floor(Math.random()*999999))%>" />
    			    </div>
    			    <div style="text-align:center">
    			    		充值用户ID：<input type="text" name="buyer_id" value="<%=(int)(Math.floor(Math.random()*10000))%>" />
    			    </div>
    			    <div style="text-align:center">
    			    		通知回调url：<input type="text" name="notify_url" value="http://xxx/xxx" />
    			    </div>
			    </td>
    		</tr>
    		<tr>
      		<td height="36" colspan="2" align="center">
      		    <input type="submit" name="submit1" value="确认付款" />
      		</td>
    		</tr>
  		</table>
	</form>
	<div style="text-align:center">
	  <h2>查单</h2>
	</div>
	<form name="form2" action="query.jsp" method="post">
  		<table width="445" border="0" align="center" cellpadding="0" cellspacing="0" style="border:#99CC00 solid 2px">
    		<tr>
      		<td  colspan="2" align="center" bordercolor="#00CCFF">
    				<div style="text-align:center">
			    		订单号：<input type="text" name="order_id" value="947836923" />
  			    </div>  
			     </td>
    		</tr>
    		<tr>
      		<td height="36" colspan="2" align="center">
    		    <input type="submit" name="submit2" value="查询" />
      		</td>
    		</tr>
  		</table>
	</form>
  </body>
</html>