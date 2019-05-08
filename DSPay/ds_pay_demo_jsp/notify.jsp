<%@ include file="payutil.jsp" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.TreeMap" %>
<%@ page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style> 
.tabPages{
margin-top:50px;text-align:center;display:block; border:3px solid #d9d9de; padding:30px; font-size:14px;
}
</style>
</head>
<body>
    <%
    Map<String, String> data = new TreeMap<String, String>();
    String sign = request.getParameter("sign");
	
    // 顺序
	data.put("order_id", request.getParameter("order_id"));
	data.put("out_trade_no", request.getParameter("out_trade_no"));
	data.put("price", request.getParameter("price"));
	data.put("status", request.getParameter("status"));
	data.put("timestamp", request.getParameter("timestamp"));

	String result = verifySign(data, sign);
%>
<div id="Order">
  <div class="tabPages">notify return: <% if(result != null ) {%><%=result %><%}%></div>
</div>
</body>
</html>