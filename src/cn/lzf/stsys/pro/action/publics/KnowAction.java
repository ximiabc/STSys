package cn.lzf.stsys.pro.action.publics;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;

import cn.lzf.stsys.base.BaseAction;
import cn.lzf.stsys.pro.entity.publics.Knows;
import cn.lzf.stsys.util.HqlHelper;
import cn.lzf.stsys.util.PageBean;

/**
 * 知识点
 * @author 李志飞
 *
 */
public class KnowAction extends BaseAction<Knows>{
	public String add() {
		ValueStack vs = ServletActionContext.getContext().getValueStack();
		vs.set("body", new Knows());
		vs.set("typeBean", knowTypeService.findAll());
		return "add";
	}
	public String adds() {
		Knows entity=new Knows();
		entity.setName(getModel().getName());
		entity.setType(knowTypeService.getById(getModel().getId()));
		knowService.save(entity);
		ValueStack vs = ServletActionContext.getContext().getValueStack();
		vs.set("body", entity);
		vs.set("typeBean", knowTypeService.findAll());
		addActionMessage("添加成功！");
		return "add";
	}
	public String list() {
		PageBean pageBean=knowService.getPageBean(pageNum, 10, new HqlHelper(Knows.class, "c")
			.addOrderByProperty("id", true));
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.set("pageBean", pageBean);
		return "list";
	}
	public String listById() {
		PageBean pageBean=knowService.getPageBean(pageNum, 10, new HqlHelper(Knows.class, "c")
			.addOrderByProperty("id", true)
			.addWhereCondition("c.type.id = ?", getModel().getId()));
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.set("pageBean", pageBean);
		vs.set("id", getModel().getId());
		return "listbyid";
	}
	public String update() {
		ValueStack vs = ServletActionContext.getContext().getValueStack();
		vs.set("body", knowService.getById(getModel().getId()));
		return "update";
	}
	public String updates() {
		Knows classes=knowService.getById(getModel().getId());
		classes.setName(getModel().getName());
		knowService.update(classes);
		ValueStack vs = ServletActionContext.getContext().getValueStack();
		vs.set("body", classes);
		addActionMessage("修改成功！");
		return "update";
	}
	public String delete(){
		knowService.delete(getModel().getId());
		list();
		return "list";
	}
}
