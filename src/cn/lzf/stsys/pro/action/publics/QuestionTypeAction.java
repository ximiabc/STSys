package cn.lzf.stsys.pro.action.publics;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;

import cn.lzf.stsys.base.BaseAction;
import cn.lzf.stsys.pro.entity.publics.Classes;
import cn.lzf.stsys.pro.entity.publics.Question;
import cn.lzf.stsys.pro.entity.publics.QuestionType;

/**
 * 试题个类型
 * @author 李志飞
 *
 */
public class QuestionTypeAction extends BaseAction<QuestionType>{
	
	@Override
	public String execute() throws Exception {
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.set("qtype", questionTypeService.findAll());
		return "list";
	}
	
}
