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
    
    <title>浏览班级信息</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap/css/bootstrap.min.css" type="text/css"></link>
	<script type="text/javascript" src="${pageContext.request.contextPath }/bootstrap/js/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/bootstrap/js/bootstrap.min.js"></script>
  </head>
  
  <body>
   		<a href="teacheraddclass" class="btn btn-success">
    	<span class="glyphicon glyphicon-plus"></span>
    	添加</a>
    	<div><!-- 教师表格 -->
		<table class="table table-bordered table-header text-center">
			<thead><!-- 表头 -->
				<tr class="bolder">
					<td></td>
					<td class="w10">班级名</td>
					<td class="w15">描述</td>
					<td class="w15">课程量</td>
					<td class="w15">学生数</td>
					<td class="w15">注册时间</td>
					<td class="w15">操作</td>
				</tr>
			</thead>
			<tbody style="color: #000;"><!-- 表单体 -->
				<s:iterator value="pageBean.recordList" var="n" status="indexs">
					<tr>
						<td>${indexs.index+1 }</td>
						<td>${name }</td>
						<td>${info }</td>
						<td>${courses.size() }</td>
						<td>${students.size() }</td>
						<td>${date }</td>
						<td>
							<a href="adminupdateclass?id=${id }" class="btn btn-warning btn-sm">
								<i class="glyphicon glyphicon-wrench"></i>
							</a>
                          	<a href="admindelclass?id=${id }" onclick="return confirm('确认删除此班级？');" class="btn btn-default btn-sm">
								<i class="glyphicon glyphicon-trash"></i>
							</a>
						</td>
					</tr>
				</s:iterator>
			</tbody>
			<tfoot><!-- 页码 -->
				<tr>
					<td colspan="9">
						<div class="pull-right">
							<nav>
							<ul class="pagination">
								<li><a href="adminlistclass?pageNum=0" aria-label="Previous">
										<span aria-hidden="true">&laquo;</span> </a></li>
								<s:iterator begin="pageBean.beginPageIndex"
									end="pageBean.endPageIndex" var="pageNums">
									<li><c:if test="${pageBean.currentPage == pageNums }">
											<a class="cur">${pageNums }</a>
										</c:if> <c:if test="${pageBean.currentPage != pageNums }">
											<a href="adminlistclass?pageNum=${pageNums }">${pageNums }</a>
										</c:if></li>
								</s:iterator>
								<li><a href="adminlistclass?pageNum=${pageBean.pageCount }"
									aria-label="Next"> <span aria-hidden="true">&raquo;</span>
								</a></li>
							</ul>
							</nav>
						</div></td>
				</tr>
			</tfoot>
		</table>
	</div>
  </body>
</html>
