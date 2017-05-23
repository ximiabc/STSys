package cn.lzf.stsys.pro.action.student;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;

import cn.lzf.stsys.base.BaseAction;
import cn.lzf.stsys.pro.entity.admin.Admin;
import cn.lzf.stsys.pro.entity.student.Student;
import cn.lzf.stsys.pro.service.StudentService;

/**
 * 学生
 * @author 李志飞
 *
 */
public class StudentAction extends BaseAction<Student>{
	private String pass1;
	
public String getPass1() {
		return pass1;
	}

	public void setPass1(String pass1) {
		this.pass1 = pass1;
	}

	//	教师首页跳转
	public String index(){
		ActionContext.getContext().getSession().put("body","student");
		return "index";
	}
	
//	个人相关
	public String listself() {
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.set("self", ActionContext.getContext().getSession().get("student"));
		return "listself";
	}
	public String updateselfMessage(){//更新基本信息
		Student student=(Student)ActionContext.getContext().getSession().get("student");
		student.setName(getModel().getName());
		student.setAccount(getModel().getAccount());
		studentService.update(student);
		addActionMessage("修改成功！");
		ActionContext.getContext().getSession().put("student", student);
		listself();
		return "listself";
	}
	public String updateself() {//更新密码信息
		return "updateself";
	}
	public String updateselfpass(){
		Student student=(Student)ActionContext.getContext().getSession().get("student");
		if(student.getPass().equals(getModel().getPass())){
			student.setPass(pass1);
			studentService.update(student);
			//addActionMessage("修改成功！");
			ActionContext.getContext().getSession().put("student", student);
		}else{
			addActionError("密码错误！请检查");
		}
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

	//登录
	public String login(){
		Student student=studentService.Login(getModel().getAccount(),getModel().getPass());
		if(student==null){
			addFieldError("error", "用户名或密码错误！");
			return "login";
		}else{
			ActionContext.getContext().getSession().put("body", "student");
			ActionContext.getContext().getSession().put("student", student);
			return "index";
		}
	}
}
