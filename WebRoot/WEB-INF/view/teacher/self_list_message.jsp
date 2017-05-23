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
    <title>教师查看个人信息页</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap/css/bootstrap.min.css" type="text/css"></link>
	<script type="text/javascript" src="${pageContext.request.contextPath }/bootstrap/js/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/bootstrap/js/bootstrap.min.js"></script>
  </head>
  
  <body>
  	<div class="text-center" style="padding-left: 50px;">
  		<form action="teacherupdateselfMessage" method="post">
  			<table>
  				<thead><tr><th>个人信息</th></tr></thead>
  				<tbody>
  					<tr><td>姓名</td><td><input name="name" value="${self.name }"> </td></tr>
  					<tr><td>账号</td><td><input name="account" value="${self.account }"></td></tr>
  					<tr><td>角色</td><td><input disabled="disabled" value="${body }"></td></tr>
  					<tr><td>加入日期</td><td><input disabled="disabled" name="date" value="${self.date }"></td></tr>
  				</tbody>
  				<tfoot>
  					<tr><td><input type="submit" value="立即修改" class="btn btn-primary"> </td></tr>
  					<tr><td><s:actionmessage/></td> </tr>
  				</tfoot>
  			</table>
  		</form>
  	</div>
  </body>
</html>