package cn.lzf.stsys.pro.action.student;

import com.opensymphony.xwork2.ActionContext;

import cn.lzf.stsys.base.BaseAction;
import cn.lzf.stsys.pro.entity.student.Student;

/**
 * 学生
 * @author 李志飞
 *
 */
public class StudentAction extends BaseAction<Student>{

//	教师首页跳转
	public String index(){
		ActionContext.getContext().getSession().put("body","student");
		return "index";
	}
	
//	个人信息
	public String listself() {
		return "listself";
	}
	public String updateself() {
		return "updateself";
	}
	
//	模拟考试
	public String testexam() {
		return "testexam";
	}
	public String testhistory() {
		return "testhistory";
	}
	
//	考试相关
	public String listexam() {
		return "listexam";
	}
	public String listhistory() {
		return "listhistory";
	}
	
}
