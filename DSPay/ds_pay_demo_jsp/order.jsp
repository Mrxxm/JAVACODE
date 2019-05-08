<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="payutil.jsp" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>下单</title>
<script>
self.moveTo(0,0);
self.resizeTo(screen.availWidth,screen.availHeight);
</script>
<style> 
.tabOrder{
margin-top:150px;text-align:center;display:block; border:3px solid #d9d9de; padding:30px; font-size:14px;
}
.tabQuery{
margin-top:50px;text-align:center;display:block; border:3px solid #d9d9de; padding:30px; font-size:14px;
}
</style>
</head>
<body onLoad="document.uncome.submit()">

<%
    String submitUrl    = BASE_URL + "/api/partner/order";
	String queryUrl     = BASE_URL + "/api/partner/order";
	String query        = "";
	String order        = "";
	
	String type         = request.getParameter("type");
    String price        = request.getParameter("price");
    String buyer_id     = request.getParameter("buyer_id");
    String notify_url   = request.getParameter("notify_url");  
    String out_trade_no = request.getParameter("out_trade_no");
    
    Map<String,String> orderParameters = new HashMap<String, String>();
    orderParameters.put("type", request.getParameter("type"));
    orderParameters.put("price", request.getParameter("price"));
    orderParameters.put("buyer_id", request.getParameter("buyer_id"));
    orderParameters.put("notify_url", request.getParameter("notify_url"));
    orderParameters.put("out_trade_no", request.getParameter("out_trade_no"));
    
    order = sendPost(submitUrl, orderParameters);
    Map<String, String> orderM = jsonToMap(order);
	System.out.println(orderM.get("id"));
	
	// 查单 "947836923"
	String orderId = order == "" ? "" : orderM.get("id");
	query = sendGet(queryUrl, orderId);
	Map<String, String> queryM = jsonToMap(query);
	System.out.println(queryM.get("id"));
  
%>    
<div id="Order">
  <div class="tabOrder">下单返回：<% if(order != null ) {%><%=order %><%}%></div>
  <div class="tabQuery">查单返回：<% if(query != null ) {%><%=query %><%}%></div>
</div>

</body>
</html>