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
    
    <title>浏览试卷试题</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap/css/bootstrap.min.css" type="text/css"></link>
	<script type="text/javascript" src="${pageContext.request.contextPath }/bootstrap/js/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/bootstrap/js/bootstrap.min.js"></script>
  </head>
  
  <body>
		<table class="table table-bordered table-header text-center">
			<thead><!-- 表头 -->
				<tr class="bolder">
					<td class="w10">类型</td>
					<td class="w15">试题数量</td>
				</tr>
			</thead>
			<tbody style="color: #000;"><!-- 表单体 -->
				<tr><td><a href="aquestionlists?id=${id }&type=1">单选题</a></td><td>${bean_single.size() }</td></tr>
				<tr><td><a href="aquestionlists?id=${id }&type=2">多选题</a></td><td>${bean_select.size() }</td></tr>
				<tr><td><a href="aquestionlists?id=${id }&type=3">填空题</a></td><td>${bean_pack.size() }</td></tr>
				<tr><td><a href="aquestionlists?id=${id }&type=4">判断题</a></td><td>${bean_judge.size() }</td></tr>
				<tr><td><a href="aquestionlists?id=${id }&type=5">简答题</a></td><td>${bean_simple.size() }</td></tr>
				<tr><td><a href="aquestionlists?id=${id }&type=6">解答题</a></td><td>${bean_strong.size() }</td></tr>
			</tbody>
		</table>
  </body>
</html>
