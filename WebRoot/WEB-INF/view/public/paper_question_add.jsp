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
  		<form action="aquestionadds?paper_id=${paper.id }&type=1" method="post">
  			<table>
  				<tbody>
  					<tr><td>
  						试卷：${paper.name }<br>
  						所属课程：${paper.course.name }<br>
  						考点：
  						<select name="knowType_id" onchange="asyn(this.options[this.options.selectedIndex].value)" >
							<s:iterator value="knows">
								<option value="${id }" <c:if test='${paper.course.id == course.id }'>selected="selected"</c:if>>${name }</option>
							</s:iterator>
						</select>
						<br>
						试题：
						<select id="s1" name="q_id" onchange="window.location.href='aquestionaddview?paper_id=${paper.id }&type=${type }&q_id='+this.options[this.options.selectedIndex].value">
								<c:if test="${question != null }">
									<option value="${question.id }">${question.title }</option>
								</c:if>
								<c:if test="${question == null }">
									<option>----</option>
								</c:if>
						</select>
						</td>
					</tr>
  					<tr><td>（分值：${question.scoreMax }
						，推荐度：${question.stars }
						</td>
					</tr>
  					<tr><td>标题：
  							<c:if test="${type == 1 }">${question.title }</c:if>
							<c:if test="${type == 2 }">${bean.selects.title }</c:if>
							<c:if test="${type == 3 }">${bean.pack.title }</c:if>
							<c:if test="${type == 4 }">${bean.judge.title }</c:if>
							<c:if test="${type == 5 }">${bean.simple.title }</c:if>
							<c:if test="${type == 6 }">${bean.strong.title }</c:if>
						</td>
					</tr>
  					<tr><td colspan="2">试题内容：<br>
							<c:if test="${type == 1 }">${question.context }</c:if>
							<c:if test="${type == 2 }">${bean.selects.context }</c:if>
							<c:if test="${type == 3 }">${bean.pack.context }</c:if>
							<c:if test="${type == 4 }">${bean.judge.context }</c:if>
							<c:if test="${type == 5 }">${bean.simple.context }</c:if>
							<c:if test="${type == 6 }">${bean.strong.context }</c:if>
						</td>
					</tr>
  					<tr><td colspan="2">答案：
		  					<c:if test="${type == 1 }">${question.result }</c:if>
							<c:if test="${type == 2 }">${bean.selects.result }</c:if>
							<c:if test="${type == 3 }">${bean.pack.result }</c:if>
							<c:if test="${type == 4 }">${bean.judge.result }</c:if>
							<c:if test="${type == 5 }">${bean.simple.result }</c:if>
							<c:if test="${type == 6 }">${bean.strong.result }</c:if>
						</td>
					</tr>
  				</tbody>
  				<tfoot>
  					<tr><td><input type="submit" value="立即添加" class="btn btn-primary"> </td></tr>
  					<tr><td><s:actionmessage/> </td> </tr>
  				</tfoot>
  			</table>
  		</form>
  	</div>
  	
  	<script type="text/javascript">
  		var obj;
  		//异步加载数据
		function asyn(id){
			$.ajax({
                    type : "post",
                    url : "${pageContext.request.contextPath}/asynquestion?id="+id+"&q_id="+1,
                    data : {//发出的数据//userName : userName
                    },
                    dataType:"json",
                    success : function(data) {
                    	obj = $.parseJSON(data);
                    	
                    	var oSelect = document.getElementById("s1");//获取标签  
                    	if(obj.code==1){
                    		for (var i = oSelect.options.length-1; i>=0; i--){
						        oSelect.options.remove(i);
						    }
                    		if(obj.result.length!=0){
	                    		for(var i=0;i<obj.result.length;i++){
	                    			var oOption = document.createElement("option");//js中创建select标签下的OPTION子标签  
	                    			oOption.value = obj.result[i].id;//内容对应的value值  
									oOption.innerHTML =obj.result[i].name;
									oSelect.options[i]=oOption;//将新建的OPTION子标签添加到select标签下
	                    		}
                    		}
                    	}else{
                    		for (var i = oSelect.options.length-1; i>=0; i--){
						        oSelect.options.remove(i);
						    }
                    		var oOption = document.createElement("option");//js中创建select标签下的OPTION子标签  
							oOption.innerHTML ="----";
							oSelect.options[0]=oOption;//将新建的OPTION子标签添加到select标签下
                    	}
                    },
                    error : function() {
                        console.log("异步请求失败！");
                    }
                });
		};
  	</script>
  </body>
</html>