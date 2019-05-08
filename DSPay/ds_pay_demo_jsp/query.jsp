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
.tabPages{
margin-top:150px;text-align:center;display:block; border:3px solid #d9d9de; padding:30px; font-size:14px;
}
</style>
</head>
<body onLoad="document.uncome.submit()">

<%
	String queryUrl    = BASE_URL + "/api/partner/order";
	String query       = "";
	
	// 查单 "947836923"
	String orderId = request.getParameter("order_id");
	query = sendGet(queryUrl, orderId);
	Map<String, String> queryM = jsonToMap(query);
	System.out.println(queryM.get("id"));
  
%>    
<div id="Order">
  <div class="tabPages">查单返回：<% if(query != null ) {%><%=query %><%}%></div>
</div>

</body>
</html>