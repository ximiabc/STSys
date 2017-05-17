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
  		<form action="aselectupdates?id=${bean.id }" method="post">
  			<table>
  				<tbody>
  					<tr><td>（所属课程：
  						<select name="course_id" onchange="asyn(this.options[this.options.selectedIndex].value)">
							<s:iterator value="courseBean">
								<option value="${id }" <c:if test='${bean.course.id == id }'>selected="selected"</c:if>>${name }</option>
							</s:iterator>
						</select>
						，考点：
						<select id="s1" name="knowType_id">
								<option>----</option>
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
  					<tr><td colspan="2">E：<input name="itemE" type="text" value="${bean.itemE }"></td></tr>
  					<tr><td colspan="2">F：<input name="itemF" type="text" value="${bean.itemF }"></td></tr>
  					<tr><td colspan="2">G：<input name="itemG" type="text" value="${bean.itemG }"></td></tr>
  					<tr><td colspan="2">H：<input name="itemH" type="text" value="${bean.itemH }"></td></tr>
  					<tr><td colspan="2">I：<input name="itemI" type="text" value="${bean.itemI }"></td></tr>
  					<tr><td colspan="2">J：<input name="itemJ" type="text" value="${bean.itemJ }"></td></tr>
  					<tr><td colspan="2">K：<input name="itemK" type="text" value="${bean.itemK }"></td></tr>
  					<tr><td colspan="2">L：<input name="itemL" type="text" value="${bean.itemL }"></td></tr>
  					<tr><td colspan="2">M：<input name="itemM" type="text" value="${bean.itemM }"></td></tr>
  					<tr><td colspan="2">N：<input name="itemN" type="text" value="${bean.itemN }"></td></tr>
  					<tr><td colspan="2">O：<input name="itemO" type="text" value="${bean.itemO }"></td></tr>
  					<tr><td colspan="2">答案：
		  					<select name="result">
									<option value="1" <c:if test='${bean.result == 1 }'>selected="selected"</c:if>>A</option>
									<option value="2" <c:if test='${bean.result == 2 }'>selected="selected"</c:if>>B</option>
									<option value="3" <c:if test='${bean.result == 3 }'>selected="selected"</c:if>>C</option>
									<option value="4" <c:if test='${bean.result == 4 }'>selected="selected"</c:if>>D</option>
									<option value="5" <c:if test='${bean.result == 5 }'>selected="selected"</c:if>>E</option>
									<option value="6" <c:if test='${bean.result == 6 }'>selected="selected"</c:if>>F</option>
									<option value="7" <c:if test='${bean.result == 7 }'>selected="selected"</c:if>>G</option>
									<option value="8" <c:if test='${bean.result == 8 }'>selected="selected"</c:if>>H</option>
									<option value="9" <c:if test='${bean.result == 9 }'>selected="selected"</c:if>>I</option>
									<option value="10" <c:if test='${bean.result == 10 }'>selected="selected"</c:if>>J</option>
									<option value="11" <c:if test='${bean.result == 11 }'>selected="selected"</c:if>>K</option>
									<option value="12" <c:if test='${bean.result == 12 }'>selected="selected"</c:if>>L</option>
									<option value="13" <c:if test='${bean.result == 13 }'>selected="selected"</c:if>>M</option>
									<option value="14" <c:if test='${bean.result == 14 }'>selected="selected"</c:if>>N</option>
									<option value="15" <c:if test='${bean.result == 15 }'>selected="selected"</c:if>>O</option>
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
  	
  	<script type="text/javascript">
  		var obj;
  		//异步加载数据
		function asyn(id){
			$.ajax({
                    type : "post",
                    url : "${pageContext.request.contextPath}/asyntype?id="+id,
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
									//$('#s1').options.add(new Option(obj.result[i].name,obj.result[i].id));
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