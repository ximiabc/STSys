package cn.lzf.stsys.pro.action.teacher;

import java.util.Date;

import javax.servlet.Servlet;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;

import cn.lzf.stsys.base.BaseAction;
import cn.lzf.stsys.pro.entity.publics.Classes;
import cn.lzf.stsys.pro.entity.student.Student;
import cn.lzf.stsys.pro.entity.teacher.Teacher;
import cn.lzf.stsys.util.DateUtil;
import cn.lzf.stsys.util.HqlHelper;
import cn.lzf.stsys.util.PageBean;


public class TeacherAction extends BaseAction<Teacher>{
private String info;
private String pass1;
private String pass2;
public void setInfo(String info){
	this.info=info;
}
public String getInfo(){
	return info;
}
public String getPass1() {
	return pass1;
}
public void setPass1(String pass1) {
	this.pass1 = pass1;
}
public String getPass2() {
	return pass2;
}
public void setPass2(String pass2) {
	this.pass2 = pass2;
}

	//	教师首页跳转
	public String index(){
		ActionContext.getContext().getSession().put("body","teacher");
		return "index";
	}
	
//	个人相关
	public String listself() {//浏览个人信息
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.set("self", ActionContext.getContext().getSession().get("teacher"));
		return "listself";
	}
	public String updateselfMessage() {//更新基本信息
		Teacher teacher=(Teacher)ActionContext.getContext().getSession().get("teacher");
		teacher.setName(getModel().getName());
		teacher.setAccount(getModel().getAccount());
		teacherService.update(teacher);
		//addActionMessage("修改成功!");
		ActionContext.getContext().getSession().put("teacher", teacher);
		listself();
		return "updateself";
	}
	public String updateself() {//更新密码信息
		return "updateself";
	}
	public String updateselfpass(){
		Teacher teacher=(Teacher)ActionContext.getContext().getSession().get("teacher");
		if(teacher.getPass().equals(getModel().getPass())){
			teacher.setPass(pass1);
			teacherService.update(teacher);
			addActionMessage("修改成功!");
			ActionContext.getContext().getSession().put("teacher", teacher);
		}else{
			addActionError("密码错误，请重新输入！");
		}
		return "updateself";
	}
	
//	班级相关
	public String addclass() {
		ValueStack vs=ServletActionContext.getContext().getValueStack();
		vs.set("body", new Classes());
		return "addclass";
	}
	public String addclasss(){
		Classes entity=new Classes();
		entity.setName(getModel().getName());
		entity.setInfo(getInfo());
		entity.setDate(new Date());
		classesService.save(entity);
		ValueStack vs=ServletActionContext.getContext().getValueStack();
		vs.set("body", entity);
		addActionMessage("添加成功！");
		return "addclasss";
	}
	public String listclass() {
		PageBean pageBean=classesService.getPageBean(pageNum, 10, new HqlHelper(Classes.class,"c")
		.addOrderByProperty("id", true));
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.set("pageBean", pageBean);
		return "listclass";
	}
	public String updateclass() {
		ValueStack vs=ServletActionContext.getContext().getValueStack();
		vs.set("body", classesService.getById(getModel().getId()));
		return "updateclass";
	}
	public String updateclasss(){
		Classes classes=classesService.getById(getModel().getId());
		classes.setName(getModel().getName());
		classes.setInfo(getInfo());
		classesService.update(classes);
		ValueStack vs=ServletActionContext.getContext().getValueStack();
		vs.set("body", classes);
		addActionMessage("修改成功！");
		return "updateclass";
	}
	
//	学生相关
	public String addstudent() {
		ValueStack vs=ServletActionContext.getContext().getValueStack();
		vs.set("body", new Student());
		return "addstudent";
	}
	public String addstudents(){
		String accounts=DateUtil.getUUID();
		Student entity=new Student();
		entity.setName(getModel().getName());
		entity.setAccount(accounts);
		entity.setDate(new Date());
		entity.setPass(accounts.substring(12));
		studentService.save(entity);
		ValueStack vs=ServletActionContext.getContext().getValueStack();
		vs.set("body", entity);
		addActionMessage("添加成功！");
		return "addstudent";
	}
	public String liststudent() {
		PageBean pageBean=selectSingleService.getPageBean(pageNum, 10, new HqlHelper(Student.class,"c")
		.addOrderByProperty("id", true));
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.set("pageBean", pageBean);
		return "liststudent";
	}
	public String updatestudent() {
		ValueStack vs=ServletActionContext.getContext().getValueStack();
		vs.set("body", studentService.getById(getModel().getId()));
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
	
	//登录
	public String login(){
		Teacher teacher=teacherService.Login(getModel().getAccount(), getModel().getPass());
		if(teacher==null){
			addFieldError("error", "用户名或密码错误！");
			return "login";
		}else{
			ActionContext.getContext().getSession().put("body", "teacher");
			ActionContext.getContext().getSession().put("teacher", teacher);
			return "index";
		}
	}
}
