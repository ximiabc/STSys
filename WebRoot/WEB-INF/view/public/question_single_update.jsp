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
    
    <title>添加单选题</title>
    
    <link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap/css/bootstrap.min.css" type="text/css"></link>
	<script type="text/javascript" src="${pageContext.request.contextPath }/bootstrap/js/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/bootstrap/js/bootstrap.min.js"></script>
  </head>
  
  <body>
  	<a onclick="history.go(-1)" class="btn btn-default">
    	<span class="glyphicon glyphicon-menu-left"></span>
    </a>
    <h3>添加单项选择题</h3>
  	<div class="text-center" style="padding-left: 50px;">
  		<form action="asingleupdates?id=${bean.id }" method="post">
  			<table>
  				<tbody>
  					<tr><td>（所属课程：
  						<select name="course_id">
							<s:iterator value="courseBean">
								<option value="${id }" <c:if test='${bean.course.id == id }'>selected="selected"</c:if>>${name }</option>
							</s:iterator>
						</select>
						，考点：
						<select name="knowType_id">
							<s:iterator value="courseBean">
								<option value="${id }" <c:if test='${bean.knowType.id == id }'>selected="selected"</c:if>>${name }</option>
							</s:iterator>
						</select>
						）</td>
					</tr>
  					<tr><td>（分值：
						<select name="scoreMax">
								<option value="1" <c:if test='${bean.scoreMax == 1 }'>selected="selected"</c:if>> 1分</option>
								<option value="2" <c:if test='${bean.scoreMax == 2 }'>selected="selected"</c:if>> 2分</option>
								<option value="3" <c:if test='${bean.scoreMax == 3 }'>selected="selected"</c:if>> 3分</option>
								<option value="4" <c:if test='${bean.scoreMax == 4 }'>selected="selected"</c:if>> 4分</option>
								<option value="5" <c:if test='${bean.scoreMax == 5 }'>selected="selected"</c:if>> 5分</option>
								<option value="0" <c:if test='${bean.scoreMax == 0 }'>selected="selected"</c:if>> 自动</option>
						</select>
						，推荐度：
						<select name="stars">
								<option value="1" <c:if test='${bean.stars == 1 }'>selected="selected"</c:if>> 1星</option>
								<option value="2" <c:if test='${bean.stars == 2 }'>selected="selected"</c:if>> 2星</option>
								<option value="3" <c:if test='${bean.stars == 3 }'>selected="selected"</c:if>> 3星</option>
								<option value="4" <c:if test='${bean.stars == 4 }'>selected="selected"</c:if>> 4星</option>
								<option value="5" <c:if test='${bean.stars == 5 }'>selected="selected"</c:if>> 5星</option>
						</select>）
						</td>
					</tr>
  					<tr><td>标题：<input name="title"  type="text" value="${bean.title }"></td></tr>
  					<tr><td colspan="2">试题内容：<br><textarea name="context" maxlength="250" rows="6" cols="50">${bean.context }</textarea></td></tr>
  					<tr><td colspan="2">A：<input name="itemA"  type="text" value="${bean.itemA }"></td></tr>
  					<tr><td colspan="2">B：<input name="itemB" type="text" value="${bean.itemB }"></td></tr>
  					<tr><td colspan="2">C：<input name="itemC" type="text" value="${bean.itemC }"></td></tr>
  					<tr><td colspan="2">D：<input name="itemD" type="text" value="${bean.itemD }"></td></tr>
  					<tr><td colspan="2">答案：
		  					<select name="result">
									<option value="1" <c:if test='${bean.result == 1 }'>selected="selected"</c:if> >A</option>
									<option value="2" <c:if test='${bean.result == 2 }'>selected="selected"</c:if> >B</option>
									<option value="3" <c:if test='${bean.result == 3 }'>selected="selected"</c:if>>C</option>
									<option value="4" <c:if test='${bean.result == 4 }'>selected="selected"</c:if>>D</option>
							</select>
						</td>
					</tr>
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