<%@ include file="config.jsp" %>
<%@ page import="java.net.URL" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.Date"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Random"%>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.io.IOException" %>
<%@ page import="java.net.URLDecoder" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.io.BufferedReader" %>
<%@ page import="java.net.URLConnection" %>
<%@ page import="java.io.InputStreamReader" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.security.MessageDigest" %>
<%@ page import="java.io.UnsupportedEncodingException" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <%!    
	public static String sendPost(String url, Map<String,String> params) {
        PrintWriter out = null;
        BufferedReader in = null;
        StringBuilder sb = new StringBuilder();
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conn.setRequestProperty("Authorization", "Bearer " + API_TOKEN);
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());
            // 发送请求参数
            out.print(params);
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                sb.append(line).append(System.getProperty("line.separator"));
            }
        } catch (Exception e) {
            System.out.println("发送 POST 请求出现异常！"+e);
            e.printStackTrace();
        }
        //使用finally块来关闭输出流、输入流
        finally{
            try{
                if(out!=null){
                    out.close();
                }
                if(in!=null){
                    in.close();
                }
            }
            catch(IOException ex){
                ex.printStackTrace();
            }
        }
        return sb.toString();
    } 
	
	public static String sendGet(String url, String param) {
        String result = "";
        BufferedReader in = null;
        StringBuilder sb = new StringBuilder();
        try {
            String urlNameString = url + "?" + param;
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setRequestProperty("Authorization", "Bearer " + API_TOKEN);
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
            for (String key : map.keySet()) {
            }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
            		sb.append(line).append(System.getProperty("line.separator"));
            }
        } catch (Exception e) {
            System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
       
        return sb.toString();
    }
    
    public static Map<String, String> jsonToMap(String str) {
		Map<String,String> result = new HashMap<String, String>();
	
		str = str.replaceAll("[\\{\\}]", "");
		String[] sourceStrArray = str.split(",");
		String[] res = new String[sourceStrArray.length];
		
		for (int i = 0; i < sourceStrArray.length; i++) {
			String[] ele = sourceStrArray[i].split(":");
			String eleK = ele[0].replaceAll("[\"]", "");
			String eleV = ele[1].replaceAll("[\"]", "");
			result.put(eleK, eleV);
        }
		
		return result;
	}
    
    public static String md5(String str) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes()); 
            StringBuffer buf=new StringBuffer();            
            for(byte b:md.digest()){
                 buf.append(String.format("%02x", b&0xff));        
            }
           return  buf.toString();
         }catch( Exception e ){
             e.printStackTrace(); 

             return null;
          } 
    }
    
    public static String verifySign(Map<String, String>data, String sign){
		String tmp = "";
		int length = data.size();
		int i = 1;
		for (Map.Entry<String, String> entry : data.entrySet()) {
			try {
				String key = URLDecoder.decode(entry.getKey(), "utf-8");
    			String value = URLDecoder.decode(entry.getValue(), "utf-8");
    			tmp = tmp + key + "=" + value;
    			if (length != i) {
    				tmp = tmp + "&";
    			}
    			i++;
			} catch(UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		
		try {
			String vSign = md5(tmp + API_TOKEN);
			if (vSign.equals(sign)) {
				return "SUCCESS";
			} else {
				return "FAIL";
			} 
		} catch (Exception e) {
			e.printStackTrace();
        	return "";
		}
	}
    %>
</body>
</html>