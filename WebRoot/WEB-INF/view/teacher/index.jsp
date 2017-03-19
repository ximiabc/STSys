<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%-- <% 
	request.getRequestDispatcher(request.getContextPath() + "/viewframe").forward(request, response);
%> --%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>考试系统-教师端</title>
  </head>
  
  <body>
    <jsp:forward page="../frame.jsp"></jsp:forward>
  </body>
</html>
