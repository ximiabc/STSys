<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>top</title>
    
    <style type="text/css">
    	body {
    		padding:0px;
    		margin:0px;
			border-right: 3px;
			border-right-color: black;
			border-style: outset;
		}
		
		.title-item{
			position:absolute;
			bottom: 10px;
			right: 10px;
		}
		
    </style>
  </head>
  
  <body>
    <h1>考试系统</h1>
    <div class="title-item">
    	<a>
    	<s:if test="#session.body == 'student'">
    		学生 :${student.name }
    	</s:if>
    	<s:elseif test="#session.body == 'teacher'">
    		老师 :${teacher.name }
    	</s:elseif>
    	<s:elseif test="#session.body == 'admin'">
    		管理员 :${admin.name }
    	</s:elseif>
    	，您好！</a><br>
    	<a href="viewexit" target="_parent">退出登录</a>
    </div>
  </body>
</html>
