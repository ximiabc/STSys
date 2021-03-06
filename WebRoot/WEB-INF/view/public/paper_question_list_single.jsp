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
    
    <title>浏览单选题</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap/css/bootstrap.min.css" type="text/css"></link>
	<script type="text/javascript" src="${pageContext.request.contextPath }/bootstrap/js/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/bootstrap/js/bootstrap.min.js"></script>
  </head>
  
  <body>
   		<a onclick="history.go(-1)" class="btn btn-default">
    	<span class="glyphicon glyphicon-menu-left"></span>
    	</a>
   		<a href="aquestionadd?id=${id }&type=${type }" class="btn btn-success">
    	<span class="glyphicon glyphicon-plus"></span>
    	添加</a>
    	<div>
		<table class="table table-bordered table-header text-center">
			<thead><!-- 表头 -->
				<tr class="bolder">
					<td></td>
					<td class="w10">考题</td>
					<td class="w10">考点</td>
					<td class="w15">试卷名</td>
					<td class="w15">所属课程</td>
					<td class="w15">推荐分值</td>
					<td class="w15">推荐度</td>
					<td class="w15">操作</td>
				</tr>
			</thead>
			<tbody style="color: #000;"><!-- 表单体 -->
				<s:iterator value="pageBean.recordList" var="n" status="indexs">
					<tr>
						<td>${indexs.index+1 }</td>
						<td>
							<c:if test="${types.id == 1 }">${selectSingle.title }</c:if>
							<c:if test="${types.id == 2 }">${selects.title }</c:if>
							<c:if test="${types.id == 3 }">${pack.title }</c:if>
							<c:if test="${types.id == 4 }">${judge.title }</c:if>
							<c:if test="${types.id == 5 }">${simple.title }</c:if>
							<c:if test="${types.id == 6 }">${strong.title }</c:if>
						</td>
						<td><a href="aknowlistById?id=${knowType.id }">${knowType.name }</a></td>
						<td>${paper.name }</td>
						<td>${knowType.course.name }</td>
						<td>
							<c:if test="${types.id == 1 }">${selectSingle.scoreMax }</c:if>
							<c:if test="${types.id == 2 }">${selects.scoreMax }</c:if>
							<c:if test="${types.id == 3 }">${pack.scoreMax }</c:if>
							<c:if test="${types.id == 4 }">${judge.scoreMax }</c:if>
							<c:if test="${types.id == 5 }">${simple.scoreMax }</c:if>
							<c:if test="${types.id == 6 }">${strong.scoreMax }</c:if>
						</td>
						<td>
							<c:if test="${types.id == 1 }">${selectSingle.stars }</c:if>
							<c:if test="${types.id == 2 }">${selects.stars }</c:if>
							<c:if test="${types.id == 3 }">${pack.stars }</c:if>
							<c:if test="${types.id == 4 }">${judge.stars }</c:if>
							<c:if test="${types.id == 5 }">${simple.stars }</c:if>
							<c:if test="${types.id == 6 }">${strong.stars }</c:if>
						</td>
						<td>
							<a href="asingleupdate?id=${id }" class="btn btn-warning btn-sm">
								<i class="glyphicon glyphicon-wrench"></i>
							</a>
                          	<a href="asingledel?id=${id }" onclick="return confirm('确认删除此知识类型？');" class="btn btn-default btn-sm">
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
									<li><a href="asinglelist?pageNum=0" aria-label="Previous">
											<span aria-hidden="true">&laquo;</span> </a></li>
									<s:iterator begin="pageBean.beginPageIndex"
										end="pageBean.endPageIndex" var="pageNums">
										<li><c:if test="${pageBean.currentPage == pageNums }">
												<a class="cur">${pageNums }</a>
											</c:if> <c:if test="${pageBean.currentPage != pageNums }">
												<a href="asinglelist?pageNum=${pageNums }">${pageNums }</a>
											</c:if></li>
									</s:iterator>
									<li><a href="asinglelist?pageNum=${pageBean.pageCount }"
										aria-label="Next"> <span aria-hidden="true">&raquo;</span>
									</a></li>
								</c:if>
								<c:if test="${listby == 1 }">
									<li><a href="asinglelistbyid?id=${id }&pageNum=0" aria-label="Previous">
											<span aria-hidden="true">&laquo;</span> </a></li>
									<s:iterator begin="pageBean.beginPageIndex"
										end="pageBean.endPageIndex" var="pageNums">
										<li><c:if test="${pageBean.currentPage == pageNums }">
												<a class="cur">${pageNums }</a>
											</c:if> <c:if test="${pageBean.currentPage != pageNums }">
												<a href="asinglelistbyid?id=${id }&pageNum=${pageNums }">${pageNums }</a>
											</c:if></li>
									</s:iterator>
									<li><a href="asinglelistbyid?id=${id }&pageNum=${pageBean.pageCount }"
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
