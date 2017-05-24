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
    
    <title>填空题详情</title>
    
    <link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap/css/bootstrap.min.css" type="text/css"></link>
	<script type="text/javascript" src="${pageContext.request.contextPath }/bootstrap/js/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/bootstrap/js/bootstrap.min.js"></script>
  </head>
  
  <body>
  	<a onclick="history.go(-1)" class="btn btn-default">
    	<span class="glyphicon glyphicon-menu-left"></span>
    </a>
  	<div class="text-center" style="padding-left: 50px;">
  		<form action="" method="post">
  			<table>
  				<tbody>
  					<tr><td>${bean.title }（课程：${bean.course.name }，考点：${knowType.name }）</td></tr>
  					<tr><td colspan="2">${bean.context }（${bean.scoreMax }分，推荐度：${bean.stars }）</td></tr>
  					<tr><td colspan="2">答案：<c:if test="${bean.result == 'Y' }">√</c:if>
  											<c:if test="${bean.result == 'N' }">×</c:if></td></tr>
  				</tbody>
  				<tfoot>
  					<tr><td><s:actionmessage/> </td> </tr>
  				</tfoot>
  			</table>
  		</form>
  	</div>
  </body>
</html>