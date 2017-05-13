package cn.lzf.stsys.pro.action.publics;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;

import cn.lzf.stsys.base.BaseAction;
import cn.lzf.stsys.pro.entity.publics.Course;
import cn.lzf.stsys.pro.entity.publics.KnowType;
import cn.lzf.stsys.pro.entity.publics.QuestionPack;
import cn.lzf.stsys.pro.entity.publics.QuestionSelectSingle;
import cn.lzf.stsys.pro.entity.publics.QuestionSimple;
import cn.lzf.stsys.util.HqlHelper;
import cn.lzf.stsys.util.PageBean;

/**
 * 简答题
 * @author 李志飞
 *
 */
public class SimpleAction extends BaseAction<QuestionSimple>{
	private Integer course_id;
	private Integer knowType_id;
	public void setCourse_id(Integer course_id) {
		this.course_id = course_id;
	}
	public Integer getCourse_id() {
		return course_id;
	}
	public void setKnowType_id(Integer knowType_id) {
		this.knowType_id = knowType_id;
	}
	public Integer getKnowType_id() {
		return knowType_id;
	}
	
	
	//分页查询
	public String list() {
		PageBean pageBean=simpleService.getPageBean(pageNum, 10, new HqlHelper(QuestionSimple.class, "c")
			.addOrderByProperty("id", true));
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.set("pageBean", pageBean);
		geCourse();
		vs.set("listby", 0);
		return "list";
	}
	public String listbyid() {
		PageBean pageBean=simpleService.getPageBean(pageNum, 10, new HqlHelper(QuestionSimple.class, "c")
			.addOrderByProperty("id", true)
			.addWhereCondition("course.id = ?",getModel().getId()));
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.set("pageBean", pageBean);
		geCourse();
		vs.set("listby", 1);
		return "list";
	}
	//单选详情
	public String view() {
		QuestionSimple single=simpleService.getById(getModel().getId());
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.set("bean", single);
		return "view";
	}
	//添加单选题
	public String add() {
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.set("bean", new QuestionSimple());
		geCourse();
		return "add";
	}
	public String adds() {
		QuestionSimple single=getModel();
		single.setCourse(courseService.getById(course_id));
		single.setKnowType(knowTypeService.getById(knowType_id));
		single.setTypes(questionTypeService.getById(1));//加入单选类型
		simpleService.save(single);
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.set("bean", single);
		geCourse();
		addActionMessage("添加成功");
		return "add";
	}
	//更新
	public String update() {
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.set("bean", simpleService.getById(getModel().getId()));
		geCourse();
		return "update";
	}
	public String updates() {
		QuestionSimple single=getModel();
		single.setCourse(courseService.getById(course_id));
		single.setKnowType(knowTypeService.getById(knowType_id));
		single.setTypes(questionTypeService.getById(1));//加入单选类型
		simpleService.update(single);
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.set("bean", single);
		geCourse();
		addActionMessage("修改成功！");
		return "update";
	}
	//删除
	public String del(){
		QuestionSimple single=new QuestionSimple();
		single.setId(getModel().getId());
		simpleService.update(single);
		simpleService.delete(getModel().getId());
		list();
		return "list";
	}
	
	private void geCourse() {
		List<Course> courses=courseService.findAll();
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.set("courseBean", courses);
	}
}
