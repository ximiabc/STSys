<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>添加试卷</title>

<link rel="stylesheet"
	href="${pageContext.request.contextPath }/bootstrap/css/bootstrap.min.css"
	type="text/css"></link>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/bootstrap/js/jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/bootstrap/js/bootstrap.min.js"></script>
</head>

<body>
	<a onclick="history.go(-1)" class="btn btn-default"> <span
		class="glyphicon glyphicon-menu-left"></span> </a>
	<h3>添加试卷</h3>
	<div class="text-center" style="padding-left: 50px;">
		<form action="asingleadds" method="post">
			<table>
				<tbody>
					<tr>
						<td>（所属课程： <select name="course_id">
								<s:iterator value="courseBean">
									<option value="${id }" <c:if test='${bean.course.id == id }'>selected="selected"</c:if>>
										${name }
									</option>
								</s:iterator>
						</select>
						）</td>
					</tr>
					<tr>
						<td>试卷：<input name="name" type="text" value="${bean.name }"></td>
					</tr>
					<tr>
						<td>备注：<input name="info" type="text" value="${bean.info }"></td>
					</tr>
				</tbody>
				<tfoot>
					<tr>
						<td><input type="submit" value="立即添加" class="btn btn-primary"></td>
					</tr>
					<tr>
						<td><s:actionmessage /></td>
					</tr>
				</tfoot>
			</table>
		</form>
	</div>

</body>
</html>