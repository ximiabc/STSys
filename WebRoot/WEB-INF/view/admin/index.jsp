<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%-- <% 
	response.sendRedirect(request.getContextPath() + "/viewframe");
%> --%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>考试系统-管理端</title>
  </head>
  
  <body>
    <jsp:forward page="../frame.jsp"></jsp:forward>
  </body>
</html>
