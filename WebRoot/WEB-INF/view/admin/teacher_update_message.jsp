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
    
    <title>更新教师信息</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap/css/bootstrap.min.css" type="text/css"></link>
	<script type="text/javascript" src="${pageContext.request.contextPath }/bootstrap/js/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/bootstrap/js/bootstrap.min.js"></script>
  </head>
  
  <body>
    <div class="text-center" style="padding-left: 50px;">
  		<form action="adminupdateteachers?id=${body.id }" method="post">
  			<table>
  				<thead><tr><th>修改教师</th></tr></thead>
  				<tbody>
  					<tr><td>姓名</td><td><input name="name" value="${body.name }"> </td></tr>
  					<tr><td>账号</td><td><input name="account" value="${body.account }"></td></tr>
  					<tr><td>密码</td><td><input name="pass" value="${body.pass }"></td></tr>
  				</tbody>
  				<tfoot>
  					<tr><td><input type="submit" value="立即修改" class="btn btn-primary"> </td></tr>
  					<tr><td><s:actionmessage/> </td> </tr>
  				</tfoot>
  			</table>
  		</form>
  	</div>
  </body>
</html>
