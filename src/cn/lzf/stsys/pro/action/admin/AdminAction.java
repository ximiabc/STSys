package cn.lzf.stsys.pro.action.admin;

import java.util.Date;

import org.apache.struts2.ServletActionContext;

import cn.lzf.stsys.base.BaseAction;
import cn.lzf.stsys.pro.entity.admin.Admin;
import cn.lzf.stsys.pro.entity.publics.Classes;
import cn.lzf.stsys.pro.entity.publics.Course;
import cn.lzf.stsys.pro.entity.student.Student;
import cn.lzf.stsys.pro.entity.teacher.Teacher;
import cn.lzf.stsys.pro.service.CourseService;
import cn.lzf.stsys.util.DateUtil;
import cn.lzf.stsys.util.HqlHelper;
import cn.lzf.stsys.util.PageBean;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;

/**
 * 管理员
 * @author 李志飞
 *
 */
public class AdminAction extends BaseAction<Admin>{
	private String pass1;
	public void setPass1(String pass1) {
		this.pass1 = pass1;
	}
	public String getPass1() {
		return pass1;
	}
	private String pass2;
	public void setPass2(String pass2) {
		this.pass2 = pass2;
	}
	public String getPass2() {
		return pass2;
	}
	private String info;
	public void setInfo(String info) {
		this.info = info;
	}
	public String getInfo() {
		return info;
	}

//	登录
	public String login() {
		Admin admin=adminService.Login(getModel().getAccount(), getModel().getPass());
		if(admin==null){
			addFieldError("error", "用户或密码错误！");
			return "login";
		}else{
			ActionContext.getContext().getSession().put("body","admin");
			ActionContext.getContext().getSession().put("admin",admin);
			return "index";
		}
	}
	
//**************视图	
//	默认首页
	public String index(){
		//ActionContext.getContext().getSession().put("body","admin");
		return "index";
	}
	
//	个人相关
	public String listself() {
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.set("self", ActionContext.getContext().getSession().get("admin"));
		return "listself";
	}
	public String updateselfMessage(){//更新基本信息
		Admin admin=(Admin)ActionContext.getContext().getSession().get("admin");
		admin.setName(getModel().getName());
		admin.setAccount(getModel().getAccount());
		adminService.update(admin);
		addActionMessage("修改成功！");
		ActionContext.getContext().getSession().put("admin", admin);
		listself();
		return "listself";
	}
	public String updateself() {//更新密码信息
		return "updateself";
	}
	public String updateselfpass(){
		Admin admin=(Admin)ActionContext.getContext().getSession().get("admin");
		if(admin.getPass().equals(getModel().getPass())){
			admin.setPass(pass1);
			adminService.update(admin);
			addActionMessage("修改成功！");
			ActionContext.getContext().getSession().put("admin", admin);
		}else{
			addActionError("密码错误！请检查");
		}
		return "updateself";
	}
	
//	教师相关
	public String addteacher() {//view
		ValueStack vs = ServletActionContext.getContext().getValueStack();
		vs.set("body", new Teacher());
		return "addteacher";
	}
	public String addteachers() {
		String accounts=DateUtil.getUUID();
		Teacher teacher=new Teacher();
		teacher.setName(getModel().getName());
		teacher.setAccount(accounts);
		teacher.setDate(new Date());
		teacher.setPass(accounts.substring(12));
		teacherService.save(teacher);
		
		ValueStack vs = ServletActionContext.getContext().getValueStack();
		vs.set("body", teacher);
		addActionMessage("添加成功");
		return "addteacher";
	}
	public String listteacher() {//分页查询
		PageBean pageBean=teacherService.getPageBean(pageNum, 10,new HqlHelper(Teacher.class, "t").addOrderByProperty("id", true));
		pageBean.setCurrentPage(pageNum);
		ValueStack vs = ServletActionContext.getContext().getValueStack();
		vs.set("pageBean", pageBean);
		return "listteacher";
	}
	public String updateteacher() {//view
		ValueStack vs = ServletActionContext.getContext().getValueStack();
		vs.set("body", teacherService.getById(getModel().getId()));
		return "updateteacher";
	}
	public String updateteachers() {
		Teacher teacher=teacherService.getById(getModel().getId());
		teacher.setName(getModel().getName());
		teacher.setAccount(getModel().getAccount());
		teacher.setPass(getModel().getPass());
		teacherService.update(teacher);
		ValueStack vs = ServletActionContext.getContext().getValueStack();
		vs.set("body", teacher);
		addActionMessage("修改成功！");
		return "updateteacher";
	}
	public String delteacher(){
		teacherService.delete(getModel().getId());
		listteacher();
		return "listteacher";
	}
	
//	班级相关
	public String addclass() {
		ValueStack vs = ServletActionContext.getContext().getValueStack();
		vs.set("body", new Classes());
		return "addclass";
	}
	public String addclasss() {
		Classes entity=new Classes();
		entity.setName(getModel().getName());
		entity.setInfo(getInfo());
		entity.setDate(new Date());
		classesService.save(entity);
		ValueStack vs = ServletActionContext.getContext().getValueStack();
		vs.set("body", entity);
		addActionMessage("添加成功！");
		return "addclass";
	}
	public String listclass() {
		PageBean pageBean=classesService.getPageBean(pageNum, 10, new HqlHelper(Classes.class, "c")
			.addOrderByProperty("id", true));
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.set("pageBean", pageBean);
		return "listclass";
	}
	public String updateclass() {
		ValueStack vs = ServletActionContext.getContext().getValueStack();
		vs.set("body", classesService.getById(getModel().getId()));
		return "updateclass";
	}
	public String updateclasss() {
		Classes classes=classesService.getById(getModel().getId());
		classes.setName(getModel().getName());
		classes.setInfo(getInfo());
		classesService.update(classes);
		ValueStack vs = ServletActionContext.getContext().getValueStack();
		vs.set("body", classes);
		addActionMessage("修改成功！");
		return "updateclass";
	}
	public String delclass() {
		classesService.delete(getModel().getId());
		listclass();
		return "listclass";
	}
	
	
//	学生相关
	public String addstudent() {
		ValueStack vs = ServletActionContext.getContext().getValueStack();
		vs.set("body", new Student());
		return "addstudent";
	}
	public String addstudents() {
		String accounts=DateUtil.getUUID();
		Student entity=new Student();
		entity.setName(getModel().getName());
		entity.setAccount(accounts);
		entity.setDate(new Date());
		entity.setPass(accounts.substring(12));
		studentService.save(entity);
		ValueStack vs = ServletActionContext.getContext().getValueStack();
		vs.set("body", entity);
		addActionMessage("添加成功！");
		return "addstudent";
	}
	public String liststudent() {
		PageBean pageBean=studentService.getPageBean(pageNum, 10, new HqlHelper(Student.class, "c")
			.addOrderByProperty("id", true));
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.set("pageBean", pageBean);
		return "liststudent";
	}
	public String updatestudent() {
		ValueStack vs = ServletActionContext.getContext().getValueStack();
		vs.set("body", studentService.getById(getModel().getId()));
		return "updatestudent";
	}
	public String updatestudents() {
		Student student=studentService.getById(getModel().getId());
		student.setName(getModel().getName());
		student.setAccount(getModel().getAccount());
		student.setPass(getModel().getPass());
		studentService.update(student);
		ValueStack vs = ServletActionContext.getContext().getValueStack();
		vs.set("body", student);
		addActionMessage("修改成功！");
		return "updatestudent";
	}
	public String delStudent() {
		studentService.delete(getModel().getId());
		liststudent();
		return "liststudent";
	}
	
//	课程管理
	public String addcourse() {
		ValueStack vs = ServletActionContext.getContext().getValueStack();
		vs.set("body", new Course());
		return "addcourse";
	}
	public String addcourses() {
		String accounts=DateUtil.getUUID();
		Course entity=new Course();
		entity.setName(getModel().getName());
		courseService.save(entity);
		ValueStack vs = ServletActionContext.getContext().getValueStack();
		vs.set("body", entity);
		addActionMessage("添加成功！");
		return "addcourse";
	}
	public String listcourse() {
		PageBean pageBean=courseService.getPageBean(pageNum, 10, new HqlHelper(Course.class, "c")
			.addOrderByProperty("id", true));
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.set("pageBean", pageBean);
		return "listcourse";
	}
	public String updatecourse() {
		ValueStack vs = ServletActionContext.getContext().getValueStack();
		vs.set("body", courseService.getById(getModel().getId()));
		return "updatecourse";
	}
	public String updatecourses() {
		Course course=courseService.getById(getModel().getId());
		course.setName(getModel().getName());
		courseService.update(course);
		ValueStack vs = ServletActionContext.getContext().getValueStack();
		vs.set("body", course);
		addActionMessage("修改成功！");
		return "updatecourse";
	}
	public String delcourse() {
		courseService.delete(getModel().getId());
		listcourse();
		return "listcourse";
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
	

	
////	显示详情--附带前后展示
//	public String view() {
//		List<SoftCenter> list;
//		if(softCenterService.getById(getModel().getId()).isView()){
//			list=softCenterService.findAllByDateShow();
//		}else{
//			list=softCenterService.findAllByDateUnShow();
//		}
//		return viewdeal(list);
//	}
////	
//	private String viewdeal(List<SoftCenter> list){
//		SoftCenter[]news=new SoftCenter[3];
//		for(int i=0;i<list.size();i++){
//			if(list.get(i).getId()==getModel().getId()){
//				if(i-1>=0){
//					news[0]=list.get(i-1);
//				}else{
//					news[0]=null;
//				}
//				news[1]=list.get(i);
//				if(i+1<list.size()){
//					news[2]=list.get(i+1);
//				}else{
//					news[2]=null;
//				}
//				ActionContext.getContext().put("beans",news[1]);
//				ActionContext.getContext().put("up",news[0]);
//				ActionContext.getContext().put("down",news[2]);
//				countadd();
//				return "view";
//			}
//		}
//		ActionContext.getContext().put("beans",null);
//		ActionContext.getContext().put("up",null);
//		ActionContext.getContext().put("down",null);
//		return "view";
//	}
////	添加浏览量
//	private void countadd(){
//		SoftCenter n=softCenterService.getById(getModel().getId());
//		n.setId(n.getId());
//		n.setTitles(n.getTitles());
//		n.setDate(n.getDate());
//		n.setContext(n.getContext());
//		n.setView(n.isView());
//		n.setCount(n.getCount()+1);
//		n.setPath(n.getPath());
//		softCenterService.update(n);
//	}
//	
////	分页查询-
//	private void selectPage(boolean isview){
//		PageBean pageBean=softCenterService.getPageBean(pageNum,10, new HqlHelper(SoftCenter.class, "center").
//				addOrderByProperty("date", false).
//				addWhereCondition("center.view = ?", isview));
//		pageBean.setCurrentPage(pageNum);
//		ValueStack vs = ServletActionContext.getContext().getValueStack();
//		vs.set("pageBean", pageBean);
//	}
//	
////	设置为显示
//	public String show(){
//		SoftCenter n=softCenterService.getById(getModel().getId());
//		n.setId(n.getId());
//		n.setTitles(n.getTitles());
//		n.setDate(n.getDate());
//		n.setContext(n.getContext());
//		n.setView(true);
//		n.setCount(n.getCount()+1);
//		n.setPath(n.getPath());
//		softCenterService.update(n);
//		
//		selectPage(true);
//		return "update";
//	}
//	
////	设置为不显示
//	public String unshow(){
//		SoftCenter n=softCenterService.getById(getModel().getId());
//		n.setId(n.getId());
//		n.setTitles(n.getTitles());
//		n.setDate(n.getDate());
//		n.setContext(n.getContext());
//		n.setView(false);
//		n.setCount(n.getCount()+1);
//		n.setPath(n.getPath());
//		softCenterService.update(n);
//		
//		selectPage(false);
//		return "history";
//	}
//	
////	写入数据
//	public String write() {
//		SoftCenter news=new SoftCenter();
//		news.setTitles(getModel().getTitles());
//		news.setContext(getModel().getContext());
//		news.setDate(new Date());
//		news.setView(true);
//		news.setCount(0);
//		news.setPath(null);//暂时为空
//		softCenterService.save(news);
//		return "add";
//	}
//	/**
//	 * 王志汤：首部
//	 * @return
//	 */
//	//前端界面连接
//	public String indexs(){
//		selectPage(true);
//		return "indexs";
//	}
//	//查找信息
//	public String finds(){
//		view();
//		selectPage(true);
//		return "indexs";
//	}
}
