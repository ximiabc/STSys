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
    
    <title>单选题详情</title>
    
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
  					<tr><td>${bean.title }（课程：${bean.course.name }，考点：${bean.knowType.name }）</td></tr>
  					<tr><td colspan="2">${bean.context }（${bean.scoreMax }分，推荐度：${bean.stars }）</td></tr>
  					<tr><td colspan="2">A：${bean.itemA }</td></tr>
  					<tr><td colspan="2">B：${bean.itemB }</td></tr>
  					<tr><td colspan="2">C：${bean.itemC }</td></tr>
  					<tr><td colspan="2">D：${bean.itemD }</td></tr>
  					<tr><td colspan="2">E：${bean.itemE }</td></tr>
  					<tr><td colspan="2">F：${bean.itemF }</td></tr>
  					<tr><td colspan="2">G：${bean.itemG }</td></tr>
  					<tr><td colspan="2">H：${bean.itemH }</td></tr>
  					<tr><td colspan="2">I：${bean.itemI }</td></tr>
  					<tr><td colspan="2">J：${bean.itemJ }</td></tr>
  					<tr><td colspan="2">K：${bean.itemK }</td></tr>
  					<tr><td colspan="2">L：${bean.itemL }</td></tr>
  					<tr><td colspan="2">M：${bean.itemM }</td></tr>
  					<tr><td colspan="2">N：${bean.itemN }</td></tr>
  					<tr><td colspan="2">O：${bean.itemO }</td></tr>
  					<tr><td colspan="2">答案：${bean.result }</td></tr>
  				</tbody>
  				<tfoot>
  					<tr><td><input type="submit" value="立即添加" class="btn btn-primary"> </td></tr>
  					<tr><td><s:actionmessage/> </td> </tr>
  				</tfoot>
  			</table>
  		</form>
  	</div>
  </body>
</html>