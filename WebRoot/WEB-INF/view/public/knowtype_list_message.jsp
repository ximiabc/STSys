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
    
    <title>浏览知识类型</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap/css/bootstrap.min.css" type="text/css"></link>
	<script type="text/javascript" src="${pageContext.request.contextPath }/bootstrap/js/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/bootstrap/js/bootstrap.min.js"></script>
  </head>
  
  <body>
   		<a href="atypeadd" class="btn btn-success">
    	<span class="glyphicon glyphicon-plus"></span>
    	添加</a>
    	<div class="btn-group">
		  <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
		    选择课程 <span class="caret"></span>
		  </button>
		  <ul class="dropdown-menu">
		  	<s:iterator value="courseBean">
		  		<li><a href="atypelistbyid?id=${id }">${name }</a></li>
		  	</s:iterator>
		  </ul>
		</div>
    	<div><!-- 教师表格 -->
		<table class="table table-bordered table-header text-center">
			<thead><!-- 表头 -->
				<tr class="bolder">
					<td></td>
					<td class="w10">考点类型</td>
					<td class="w15">字段数</td>
					<td class="w15">所属课程</td>
					<td class="w15">操作</td>
				</tr>
			</thead>
			<tbody style="color: #000;"><!-- 表单体 -->
				<s:iterator value="pageBean.recordList" var="n" status="indexs">
					<tr>
						<td>${indexs.index+1 }</td>
						<td><a href="aknowlistById?id=${id }">${name }</a></td>
						<td>${knows.size() }</td>
						<td>${course.name }</td>
						<td>
							<a href="atypeupdate?id=${id }" class="btn btn-warning btn-sm">
								<i class="glyphicon glyphicon-wrench"></i>
							</a>
                          	<a href="atypedelete?id=${id }" onclick="return confirm('确认删除此知识类型？');" class="btn btn-default btn-sm">
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
								<c:if test="${listby == 0 }">
									<li><a href="atypelist?pageNum=0" aria-label="Previous">
											<span aria-hidden="true">&laquo;</span> </a></li>
									<s:iterator begin="pageBean.beginPageIndex"
										end="pageBean.endPageIndex" var="pageNums">
										<li><c:if test="${pageBean.currentPage == pageNums }">
												<a class="cur">${pageNums }</a>
											</c:if> <c:if test="${pageBean.currentPage != pageNums }">
												<a href="atypelist?pageNum=${pageNums }">${pageNums }</a>
											</c:if></li>
									</s:iterator>
									<li><a href="atypelist?pageNum=${pageBean.pageCount }"
										aria-label="Next"> <span aria-hidden="true">&raquo;</span>
									</a></li>
								</c:if>
								<c:if test="${listby == 1 }">
									<li><a href="atypelistbyid?id=${id }&pageNum=0" aria-label="Previous">
											<span aria-hidden="true">&laquo;</span> </a></li>
									<s:iterator begin="pageBean.beginPageIndex"
										end="pageBean.endPageIndex" var="pageNums">
										<li><c:if test="${pageBean.currentPage == pageNums }">
												<a class="cur">${pageNums }</a>
											</c:if> <c:if test="${pageBean.currentPage != pageNums }">
												<a href="atypelistbyid?id=${id }&pageNum=${pageNums }">${pageNums }</a>
											</c:if></li>
									</s:iterator>
									<li><a href="atypelistbyid?id=${id }&pageNum=${pageBean.pageCount }"
										aria-label="Next"> <span aria-hidden="true">&raquo;</span>
									</a></li>
								</c:if>
							</ul>
							</nav>
						</div></td>
				</tr>
			</tfoot>
		</table>
	</div>
  </body>
</html>
