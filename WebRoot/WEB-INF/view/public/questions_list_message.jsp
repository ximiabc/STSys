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
    
    <title>题库浏览</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap/css/bootstrap.min.css" type="text/css"></link>
	<script type="text/javascript" src="${pageContext.request.contextPath }/bootstrap/js/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/bootstrap/js/bootstrap.min.js"></script>
  </head>
  
  <body>
		<table class="table table-bordered table-header text-center">
			<thead><!-- 表头 -->
				<tr class="bolder">
					<td></td>
					<td class="w10">类型</td>
					<td class="w15">试题数量</td>
				</tr>
			</thead>
			<tbody style="color: #000;"><!-- 表单体 -->
				<s:iterator value="qtype" var="n" status="indexs">
					<tr>
						<td>${indexs.index+1 }</td>
						<td>
							<c:if test="${id == 1 }"><a href="asinglelist">${name }</a></c:if>
							<c:if test="${id == 2 }"><a href="aselectlist">${name }</a></c:if>
							<c:if test="${id == 3 }"><a href="">${name }</a></c:if>
							<c:if test="${id == 4 }"><a href="">${name }</a></c:if>
							<c:if test="${id == 5 }"><a href="">${name }</a></c:if>
							<c:if test="${id == 6 }"><a href="">${name }</a></c:if>
						</td>
						<td>${lists.size() }</td>
					</tr>
				</s:iterator>
			</tbody>
		</table>
  </body>
</html>
