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
    
    <title>更新个人信息</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap/css/bootstrap.min.css" type="text/css"></link>
	<script type="text/javascript" src="${pageContext.request.contextPath }/bootstrap/js/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/bootstrap/js/bootstrap.min.js"></script>
  </head>
  
  <body>
  	<div class="text-center" style="padding-left: 50px;">
  		<form action="teacherupdateselfpass" method="post">
  			<table>
  				<thead><tr><th>修改密码</th></tr></thead>
  				<tbody>
  					<tr><td>密码</td><td><input name="pass" type="password" 
  						onblur="if(pass.value == null || pass.value == '')document.getElementById('pass01').hidden=false;" 
  						onfocus="document.getElementById('pass01').hidden=true;" 
						onclick="document.getElementById('pass01').hidden=true;"></td>
  						<td><label hidden="true" id="pass01" style="color: red;">密码不能为空！</label></td></tr>
  					<tr><td>新密码</td><td><input name="pass1" type="password"
  						onblur="if(pass1.value == null || pass1.value == ''){document.getElementById('pass11').hidden=false;}; if(pass1.value == pass.value && pass1.value != null && pass1.value != ''){document.getElementById('pass12').hidden=false;}" 
  						onfocus="document.getElementById('pass11').hidden=true;document.getElementById('pass12').hidden=true;"
						onclick="document.getElementById('pass11').hidden=true;document.getElementById('pass12').hidden=true;"></td>
  						<td><label hidden="true" id="pass11" style="color: red;">新密码不能为空！</label>
  						<label hidden="true" id="pass12" style="color: red;">新密码与原密码不能相同！</label></td></tr>
  					<tr><td>密码确认</td><td><input name="pass2" type="password"
  						onblur="if(pass2.value != null && pass2.value != '' && pass2.value != pass1.value)document.getElementById('pass21').hidden=false;" 
  						onfocus="document.getElementById('pass21').hidden=true;"
						onclick="document.getElementById('pass21').hidden=true;"></td>
  						<td><label hidden="true" id="pass21" style="color: red;">两次密码不一致！</label></td></tr>
  				</tbody>
  				<tfoot>
  					<tr><td><input type="submit" value="立即修改" class="btn btn-primary"> </td></tr>
  					<tr><td><s:actionmessage/><s:actionerror/> </td> </tr>
  				</tfoot>
  			</table>
  		</form>
  	</div>
  </body>
</html>
