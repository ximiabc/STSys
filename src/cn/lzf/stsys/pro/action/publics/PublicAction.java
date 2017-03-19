package cn.lzf.stsys.pro.action.publics;

import com.opensymphony.xwork2.ActionSupport;

public class PublicAction extends ActionSupport{
	
	/**
	 * 加载默认页
	 */
	public String index() {
		return "index";
	}
//	注销登录
	public String exit(){
		return "exit";
	}
	
//	登录角色分发
	public String frame(){
		return "frame";
	}
	public String admin(){
		return "admin";
	}
	public String teacher(){
		return "teacher";
	}
	public String student(){
		return "student";
	}
	
	
//	框架请求处理
	public String top(){
		return "top";
	}
	public String left(){
		return "left";
	}
	public String main(){
		return "main";
	}
	public String bottom(){
		return "bottom";
	}
	
}
