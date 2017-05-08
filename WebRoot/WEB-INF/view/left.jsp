<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>left</title>

<link rel="stylesheet" href="${pageContext.request.contextPath }/bootstrap/css/bootstrap.min.css" type="text/css"></link>
<script type="text/javascript" src="${pageContext.request.contextPath }/bootstrap/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/bootstrap/js/bootstrap.min.js"></script>

<style type="text/css">
	body{
		border-right: 3px;
		border-right-color: black;
		border-style: outset;
	}
	
	.panel-group .panel+.panel{
		margin-top: 1px;
	}
	
	.panel-body{
		padding: 5px;
	}
	
</style>

</head>

<body>
	
	<s:if test="#session.body == 'student'">
	<!-- 学生的界面 -------------------------------------------------------->
	<div class="panel-group" id="accordion">
		<!-- 考试安排 -->
		<div class="panel panel-default">
			<div class="panel-heading">
				<h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion"
						href="#collapse4">
						<span class="glyphicon glyphicon-edit"></span> 考试相关 </a>
				</h4>
			</div>
			<div id="collapse4" class="panel-collapse collapse in">
				<div class="panel-body text-center"><a href="studentlistexam" target="main">考试安排</a></div>
				<div class="panel-body text-center"><a href="studentlisthistory" target="main">我的成绩</a></div>
			</div>
		</div>
		<!-- 模拟考试 -->
		<div class="panel panel-default">
			<div class="panel-heading">
				<h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion"
						href="#collapse5">
						<span class="glyphicon glyphicon-list-alt"></span> 模拟考试 </a>
				</h4>
			</div>
			<div id="collapse5" class="panel-collapse collapse">
				<div class="panel-body text-center"><a href="studenttestexam" target="main">模拟考试</a></div>
				<div class="panel-body text-center"><a href="studenttesthistory" target="main">模拟历史</a></div>
			</div>
		</div>
		<!-- 个人相关 -->
		<div class="panel panel-default">
			<div class="panel-heading">
				<h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion"
						href="#collapse6">
						<span class="glyphicon glyphicon-user"></span> 我的信息 </a>
				</h4>
			</div>
			<div id="collapse6" class="panel-collapse collapse">
				<div class="panel-body text-center"><a href="studentlistself" target="main">我的信息</a></div>
				<div class="panel-body text-center"><a href="studentupdateself" target="main">修改密码</a></div>
			</div>
		</div>
	</div>
	</s:if>
	
	<s:elseif test="#session.body == 'teacher'">
	<!-- 教师的登陆界面 ---------------------------------------------------->
	<div class="panel-group" id="accordion">
		<!-- 班级管理 -->
		<div class="panel panel-default">
			<div class="panel-heading">
				<h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion"
						href="#collapseTwo">
						<span class="glyphicon glyphicon-modal-window"></span> 班级管理 </a>
				</h4>
			</div>
			<div id="collapseTwo" class="panel-collapse collapse in">
				<div class="panel-body text-center"><a href="teacherlistclass" target="main">浏览班级</a></div>
				<div class="panel-body text-center"><a href="teacherupdateclass" target="main">修改班级</a></div>
			</div>
		</div>
		<!-- 学生管理 -->
		<div class="panel panel-default">
			<div class="panel-heading">
				<h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion"
						href="#collapseThree">
						<span class="glyphicon glyphicon-education"></span> 学生管理</a>
				</h4>
			</div>
			<div id="collapseThree" class="panel-collapse collapse">
				<div class="panel-body text-center"><a href="teacherliststudent" target="main">浏览学生</a></div>
				<div class="panel-body text-center"><a href="teacherupdatestudent" target="main">修改班级</a></div>
			</div>
		</div>
		<!-- 考试安排 -->
		<div class="panel panel-default">
			<div class="panel-heading">
				<h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion"
						href="#collapse4">
						<span class="glyphicon glyphicon-edit"></span> 考试相关 </a>
				</h4>
			</div>
			<div id="collapse4" class="panel-collapse collapse">
				<div class="panel-body text-center"><a href="teacherlistexam" target="main">考试安排</a></div>
				<div class="panel-body text-center"><a href="teacherupdateexam" target="main">考试管理</a></div>
			</div>
		</div>
		<!-- 题库管理 -->
		<div class="panel panel-default">
			<div class="panel-heading">
				<h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion"
						href="#collapse5">
						<span class="glyphicon glyphicon-list-alt"></span> 题库管理 </a>
				</h4>
			</div>
			<div id="collapse5" class="panel-collapse collapse">
				<div class="panel-body text-center"><a href="teacherlistentrepot" target="main">考试安排</a></div>
				<div class="panel-body text-center"><a href="teacherupdateentrepot" target="main">考试管理</a></div>
			</div>
		</div>
		<!-- 个人相关 -->
		<div class="panel panel-default">
			<div class="panel-heading">
				<h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion"
						href="#collapse6">
						<span class="glyphicon glyphicon-user"></span> 我的信息 </a>
				</h4>
			</div>
			<div id="collapse6" class="panel-collapse collapse">
				<div class="panel-body text-center"><a href="teacherlistself" target="main">查看信息</a></div>
				<div class="panel-body text-center"><a href="teacherupdateself" target="main">修改密码</a></div>
			</div>
		</div>
	</div>
	</s:elseif>

	<s:elseif test="#session.body == 'admin'">
	<!-- 管理员登陆后的界面 ------------------------------------------------>
	<div class="panel-group" id="accordion">
		<!-- 教师管理 -->
		<div class="panel panel-default">
			<div class="panel-heading">
				<h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion"
						href="#collapseOne">
						<span class="glyphicon glyphicon-blackboard"></span> 教师管理 </a>
				</h4>
			</div>
			<div id="collapseOne" class="panel-collapse collapse in">
				<div class="panel-body text-center"><a href="adminlistteacher" target="main">教师一览</a></div>
			</div>
		</div>
		<!-- 班级管理 -->
		<div class="panel panel-default">
			<div class="panel-heading">
				<h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion"
						href="#collapseTwo">
						<span class="glyphicon glyphicon-modal-window"></span> 班级管理 </a>
				</h4>
			</div>
			<div id="collapseTwo" class="panel-collapse collapse">
				<div class="panel-body text-center"><a href="adminlistclass" target="main">浏览班级</a></div>
				<div class="panel-body text-center"><a href="adminliststudent" target="main">浏览学生</a></div>
			</div>
		</div>
		<!-- 课程管理 -->
		<div class="panel panel-default">
			<div class="panel-heading">
				<h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion"
						href="#collapseThree1">
						<span class="glyphicon glyphicon-education"></span> 课程管理</a>
				</h4>
			</div>
			<div id="collapseThree1" class="panel-collapse collapse">
				<div class="panel-body text-center"><a href="adminlistcourse" target="main">浏览课程</a></div>
			</div>
		</div>
		<!-- 考试安排 -->
		<div class="panel panel-default">
			<div class="panel-heading">
				<h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion"
						href="#collapse4">
						<span class="glyphicon glyphicon-edit"></span> 考试安排 </a>
				</h4>
			</div>
			<div id="collapse4" class="panel-collapse collapse">
				<div class="panel-body text-center"><a href="adminlistexam" target="main">管理课程</a></div>
				<div class="panel-body text-center"><a href="adminlistexam" target="main">考试安排</a></div>
				<div class="panel-body text-center"><a href="adminupdateexam" target="main">考试管理</a></div>
			</div>
		</div>
		<!-- 题库管理 -->
		<div class="panel panel-default">
			<div class="panel-heading">
				<h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion"
						href="#collapse5">
						<span class="glyphicon glyphicon-list-alt"></span> 题库管理 </a>
				</h4>
			</div>
			<div id="collapse5" class="panel-collapse collapse">
				<div class="panel-body text-center"><a href="atypelist" target="main">考点类型</a></div>
				<div class="panel-body text-center"><a href="adminupdateentrepot" target="main">试卷管理</a></div>
				<div class="panel-body text-center"><a href="qtlist" target="main">题库管理</a></div>
			</div>
		</div>
		<!-- 个人相关 -->
		<div class="panel panel-default">
			<div class="panel-heading">
				<h4 class="panel-title">
					<a data-toggle="collapse" data-parent="#accordion"
						href="#collapse6">
						<span class="glyphicon glyphicon-user"></span> 我的信息 </a>
				</h4>
			</div>
			<div id="collapse6" class="panel-collapse collapse">
				<div class="panel-body text-center"><a href="adminlistself" target="main">我的信息</a></div>
				<div class="panel-body text-center"><a href="adminupdateself" target="main">修改密码</a></div>
			</div>
		</div>
	</div>
	</s:elseif>
</body>
</html>
