<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>考试系统</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap/css/bootstrap.min.css" type="text/css"></link>
	<script type="text/javascript" src="${pageContext.request.contextPath }/bootstrap/js/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/bootstrap/js/bootstrap.min.js"></script>
    <style type="text/css">
    	.tab-pane{
    		width: 400px;
    		height: 300px;
    	}
    	.div-main{
    		margin-top:100px;
    		margin-right:200px;
    		width: 400px;
    		height: 300px;
    		float:right;
    		border-right: 3px;
			border-right-color: black;
			border-style: outset;
    	}
    	.form-control{
    		width:170px; 
    		display: inline;
    	}
    	.btn{
    		width: 120px;
    	}
    </style>
  </head>
  <body>
  <div class="div-main">
  		<center><h4>欢迎使用考试系统！</h4></center>
  		<hr style="border-width:3px; margin: 0px;padding: 0px;">
	  	<ul id="myTab" class="nav nav-tabs">
			<li class="active">
				<a href="#student" data-toggle="tab">学生入口</a>
			</li>
			<li>
				<a href="#teacher" data-toggle="tab">教师入口</a>
			</li>
			<li>
				<a href="#admin" data-toggle="tab">管理入口</a>
			</li>
		</ul>
		<div id="myTabContent" class="tab-content">
			<div class="tab-pane fade in active" id="student">
				<center>
				<!-- 学生-->
			    <form action="studentlogin" method="post">
			      	<strong>学号</strong><input type="text" name="account" class="form-control" placeholder="请输入学号"><br>
			    	<strong>密码</strong><input type="password" name="pass" class="form-control" placeholder="请输入密码"><br>
				    <input type="submit" value="登录" class="btn btn-primary"/>
			    </form>
			    </center>
			</div>
			<div class="tab-pane fade" id="teacher">
				<center>
				<!-- 教师 -->
			    <form action="teacherlogin" method="post">
			    	<strong>账号</strong><input type="text" name="account" class="form-control" placeholder="请输入学号"><br>
			    	<strong>密码</strong><input type="password" name="pass" class="form-control" placeholder="请输入密码"><br>
				    <input type="submit" value="登录" class="btn btn-primary"/>
			    </form>				
			    </center>
			</div>
			<div class="tab-pane fade" id="admin">
				<center>
				<!--管理-->
			    <form action="adminlogin" method="post">
			    	<strong>账号</strong><input type="text" name="account" class="form-control" placeholder="请输入学号"><br>
			    	<strong>密码</strong><input type="password" name="pass" class="form-control" placeholder="请输入密码"><br>
				    <input type="submit" value="登录" class="btn btn-primary"/>
			    </form>
			    </center>
			</div>
		</div>
		<label style="color: red;"><s:fielderror></s:fielderror></label>
	</div>
	<script>
		$(function () {
			$('#myTab li:eq(0) a').tab('show');
		});
	</script>
  </body>
</html>
