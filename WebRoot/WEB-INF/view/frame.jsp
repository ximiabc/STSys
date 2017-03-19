<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>考试系统</title>
    
  </head>
  
  <frameset rows="75,*" border= "0">
  	<frame name="top" src="viewtop" scrolling="no"><!-- top -->
  	<frameset rows="*,30">
  		<frameset cols="135,*">
  			<frame name="left" src="viewleft" scrolling="auto"><!-- left -->
  			<frame name="main" src="viewmain" scrolling="auto"><!-- main -->
  		</frameset>
  		<frame name="bottom" src="viewbottom" scrolling="no"><!-- bottom -->
  	</frameset>
  </frameset>
  
  <noframes>
  <body>
    <center><h3>您的浏览器不支持框架！！！请使用其他浏览器</h3></center>
  </body>
  </noframes>
</html>
