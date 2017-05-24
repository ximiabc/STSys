<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>添加单选题</title>
    
    <link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap/css/bootstrap.min.css" type="text/css"></link>
	<script type="text/javascript" src="${pageContext.request.contextPath }/bootstrap/js/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/bootstrap/js/bootstrap.min.js"></script>
  </head>
  
  <body>
  	<a onclick="history.go(-1)" class="btn btn-default">
    	<span class="glyphicon glyphicon-menu-left"></span>
    </a>
    <h3>添加单项选择题</h3>
  	<div class="text-center" style="padding-left: 50px;">
  		<form action="aquestionlist?id=${bean.id }" method="post">
  			<table>
  				<tbody>
					<tr><td>课程：${bean.course.name }</tr>
  					<tr><td>试卷名：${bean.name }</tr>
  					<tr><td>描述：${bean.info }</tr>
  					<tr><td>试题数量：${bean.questions.size() }</td></tr>
  				</tbody>
  				<tfoot>
  					<tr><td><input type="submit" value="试题管理" class="btn btn-primary"><a href="apaperviewall?id=${bean.id }" class="btn btn-primary">浏览试卷</a> </td></tr>
  					<tr><td><s:actionmessage/> </td> </tr>
  				</tfoot>
  			</table>
  		</form>
  	</div>
  	
  </body>
</html>