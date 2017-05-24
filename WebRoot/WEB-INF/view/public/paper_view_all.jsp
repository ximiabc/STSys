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
    
    <title>试题预览</title>
    
    <link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap/css/bootstrap.min.css" type="text/css"></link>
	<script type="text/javascript" src="${pageContext.request.contextPath }/bootstrap/js/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/bootstrap/js/bootstrap.min.js"></script>
  </head>
  
  <body>
  	<a onclick="history.go(-1)" class="btn btn-default">
    	<span class="glyphicon glyphicon-menu-left"></span>
    </a>
    <h3>试题预览</h3>
  	<div class="text-center" style="padding-left: 50px;">
  		<form action="aquestionlist?id=${bean.id }" method="post">
  			<table>
  				<tbody>
  					<tr><th>${paper.name }</th></tr>
  					<tr><th>${paper.info }</th></tr>
  					<c:if test="${singles.size() != 0 }">
  					<tr><th>单选题</th></tr>
  						<s:iterator value="singles" status="indexs">
  							<tr><th>( ${indexs.index+1 } )[${title }] ${context }(${result })</th></tr>
  							<tr><td>A:${itemA }</td></tr>
  							<tr><td>B:${itemB }</td></tr>
  							<tr><td>C:${itemC }</td></tr>
  							<tr><td>D:${itemD }</td></tr>
  						</s:iterator>
  					</c:if>
  					<c:if test="${selects.size() != 0 }">
  					<tr><th><br>多选题</th></tr>
  						<s:iterator value="selects" status="indexs">
  							<tr><th>( ${indexs.index+1 } )[${title }] ${context }(${result })</th></tr>
  							<tr><td>A:${itemA }</td></tr>
  							<tr><td>B:${itemB }</td></tr>
  							<tr><td>C:${itemC }</td></tr>
  							<tr><td>D:${itemD }</td></tr>
  						</s:iterator>
  					</c:if>
  					<c:if test="${packs.size() != 0 }">
  					<tr><th><br>填空题</th></tr>
  						<s:iterator value="packs" status="indexs">
  							<tr><th>( ${indexs.index+1 } )[${title }] ${context }</th></tr>
  						</s:iterator>
  					</c:if>
  					<c:if test="${judges.size() != 0 }">
  					<tr><th><br>判断题</th></tr>
  						<s:iterator value="judges" status="indexs">
  							<tr><th>( ${indexs.index+1 } )[${title }] ${context }</th></tr>
  						</s:iterator>
  					</c:if>
  					<c:if test="${simples.size() != 0 }">
  					<tr><th><br>简答题</th></tr>
  						<s:iterator value="simples" status="indexs">
  							<tr><th>( ${indexs.index+1 } )[${title }] ${context }</th></tr>
  						</s:iterator>
  					</c:if>
  					<c:if test="${strongs.size() != 0 }">
  					<tr><th><br>解答题</th></tr>
  						<s:iterator value="strongs" status="indexs">
  							<tr><th>( ${indexs.index+1 } )[${title }] ${context }</th></tr>
  						</s:iterator>
  					</c:if>
  				</tbody>
  				<tfoot>
  					<tr><td><input type="submit" value="试题管理" class="btn btn-primary">
  					</td></tr>
  					<tr><td><s:actionmessage/> </td> </tr>
  				</tfoot>
  			</table>
  		</form>
  	</div>
  	
  </body>
</html>