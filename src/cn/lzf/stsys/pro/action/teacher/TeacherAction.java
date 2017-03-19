package cn.lzf.stsys.pro.action.teacher;

import com.opensymphony.xwork2.ActionContext;

import cn.lzf.stsys.base.BaseAction;
import cn.lzf.stsys.pro.entity.teacher.Teacher;


public class TeacherAction extends BaseAction<Teacher>{

//	教师首页跳转
	public String index(){
		ActionContext.getContext().getSession().put("body","teacher");
		return "index";
	}
	
//	个人相关
	public String listself() {
		return "listself";
	}
	public String updateself() {
		return "updateself";
	}
	
//	班级相关
	public String addclass() {
		return "addclass";
	}
	public String listclass() {
		return "listclass";
	}
	public String updateclass() {
		return "updateclass";
	}
	
//	学生相关
	public String addstudent() {
		return "addstudent";
	}
	public String liststudent() {
		return "liststudent";
	}
	public String updatestudent() {
		return "updatestudent";
	}
	
//	考试安排相关
	public String addexam() {
		return "addexam";
	}
	public String listexam() {
		return "listexam";
	}
	public String updateexam() {
		return "updateexam";
	}
	
//	题库相关
	public String addentrepot() {
		return "addentrepot";
	}
	public String listentrepot() {
		return "listentrepot";
	}
	public String updateentrepot() {
		return "updateentrepot";
	}
	
}
