package cn.lzf.stsys.pro.action.publics;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;

import cn.lzf.stsys.base.BaseAction;
import cn.lzf.stsys.pro.entity.publics.KnowType;
import cn.lzf.stsys.util.HqlHelper;
import cn.lzf.stsys.util.PageBean;

/**
 * 知识点类型
 * @author 李志飞
 *
 */
public class KnowTypeAction extends BaseAction<KnowType>{
	public String add() {
		ValueStack vs = ServletActionContext.getContext().getValueStack();
		vs.set("body", new KnowType());
		vs.set("courseBean", courseService.findAll());
		return "add";
	}
	public String adds() {
		KnowType entity=new KnowType();
		entity.setName(getModel().getName());
		entity.setCourse(courseService.getById(getModel().getId()));
		knowTypeService.save(entity);
		ValueStack vs = ServletActionContext.getContext().getValueStack();
		vs.set("body", entity);
		vs.set("courseBean", courseService.findAll());
		addActionMessage("添加成功！");
		return "add";
	}
	public String list() {
		PageBean pageBean=knowTypeService.getPageBean(pageNum, 10, new HqlHelper(KnowType.class, "c")
			.addOrderByProperty("id", true));
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.set("pageBean", pageBean);
		vs.set("courseBean", courseService.findAll());
		vs.set("listby", 0);
		return "list";
	}
	public String listbyid() {
		PageBean pageBean=knowTypeService.getPageBean(pageNum, 10, new HqlHelper(KnowType.class, "c")
			.addOrderByProperty("id", true)
			.addWhereCondition("c.course.id = ?", getModel().getId()));
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.set("pageBean", pageBean);
		vs.set("courseBean", courseService.findAll());
		vs.set("listby", 1);
		vs.set("id", getModel().getId());
		return "list";
	}
	public String update() {
		ValueStack vs = ServletActionContext.getContext().getValueStack();
		vs.set("body", knowTypeService.getById(getModel().getId()));
		return "update";
	}
	public String updates() {
		KnowType classes=knowTypeService.getById(getModel().getId());
		classes.setName(getModel().getName());
		knowTypeService.update(classes);
		ValueStack vs = ServletActionContext.getContext().getValueStack();
		vs.set("body", classes);
		addActionMessage("修改成功！");
		return "update";
	}
	public String delete(){
		knowTypeService.delete(getModel().getId());
		list();
		return "list";
	}
}
