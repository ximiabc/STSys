package cn.lzf.stsys.pro.action.publics;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;

import cn.lzf.stsys.base.BaseAction;
import cn.lzf.stsys.pro.entity.publics.Course;
import cn.lzf.stsys.pro.entity.publics.KnowType;
import cn.lzf.stsys.pro.entity.publics.Paper;
import cn.lzf.stsys.pro.entity.publics.QuestionList;
import cn.lzf.stsys.pro.entity.publics.QuestionPack;
import cn.lzf.stsys.pro.entity.publics.QuestionSelectSingle;
import cn.lzf.stsys.util.HqlHelper;
import cn.lzf.stsys.util.PageBean;

/**
 * 填空题
 * @author 李志飞
 *
 */
public class QuestionAction extends BaseAction<QuestionList>{
	private Integer paper_id;
	public Integer getPaper_id() {
		return paper_id;
	}
	public void setPaper_id(Integer paper_id) {
		this.paper_id = paper_id;
	}
	private String type;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	private Integer knowType_id;
	public Integer getKnowType_id() {
		return knowType_id;
	}
	public void setKnowType_id(Integer knowType_id) {
		this.knowType_id = knowType_id;
	}
	private Integer q_id;
	public Integer getQ_id() {
		return q_id;
	}
	public void setQ_id(Integer q_id) {
		this.q_id = q_id;
	}
	//查寻对应实体的对象
	public String list() {
		List<QuestionList>list_single=questionListService.getSingleByPaperId(getModel().getId());
		List<QuestionList>list_select=questionListService.getSelectsByPaperId(getModel().getId());
		List<QuestionList>list_pack=questionListService.getPackByPaperId(getModel().getId());
		List<QuestionList>list_judge=questionListService.getJudgeByPaperId(getModel().getId());
		List<QuestionList>list_simple=questionListService.getSimpleByPaperId(getModel().getId());
		List<QuestionList>list_strong=questionListService.getStrongByPaperId(getModel().getId());
		
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.set("bean_single", list_single);
		vs.set("bean_select", list_select);
		vs.set("bean_pack", list_pack);
		vs.set("bean_judge", list_judge);
		vs.set("bean_simple", list_simple);
		vs.set("bean_strong", list_strong);
		vs.set("id",getModel().getId());
		return "list";
	}
	
	public String lists() {
		PageBean pageBean=questionListService.getPageBean(pageNum, 10, new HqlHelper(QuestionList.class, "c")
			.addOrderByProperty("id", true)
			.addWhereCondition("types.id = ?",Integer.parseInt(type))
			.addWhereCondition("paper.id = ?",getModel().getId()));
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.set("pageBean", pageBean);
		vs.set("type", Integer.parseInt(type));
		vs.set("id", getModel().getId());
		return "lists";
	}
	
	public String listbyid() {
		PageBean pageBean=questionListService.getPageBean(pageNum, 10, new HqlHelper(QuestionList.class, "c")
			.addOrderByProperty("id", true)
			.addWhereCondition("types.id = ?",Integer.parseInt(type)));
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.set("pageBean", pageBean);
		geCourse();
		vs.set("listby", 1);
		return "list";
	}
	//单选详情
	public String view() {
		QuestionList single=questionListService.getById(getModel().getId());
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.set("bean", single);
		vs.set("type", Integer.parseInt(type));
		vs.set("id", getModel().getId());
		return "view";
	}
	//添加题
	public String add() {
		ValueStack vs=ActionContext.getContext().getValueStack();
		Paper p=paperService.getById(getModel().getId());
		vs.set("bean", new QuestionList());
		vs.set("type", Integer.parseInt(type));
		vs.set("paper", p);//试卷名
		vs.set("knows", knowTypeService.getByCourse(p.getCourse().getId()));//试卷名
		return "add";
	}
	public String addview() {
		ValueStack vs=ActionContext.getContext().getValueStack();
		Paper p=paperService.getById(paper_id);
		vs.set("bean", new QuestionList());
		vs.set("type", Integer.parseInt(type));
		vs.set("paper", p);//试卷名
		vs.set("knows", knowTypeService.getByCourse(p.getCourse().getId()));//试卷名
		vs.set("question", selectSingleService.getById(q_id));
		return "add";
	}
	public String adds() {
		QuestionList single=getModel();
		single.setPaper(paperService.getById(paper_id));
		single.setKnowType(knowTypeService.getById(knowType_id));
		single.setTypes(questionTypeService.getById(Integer.parseInt(type)));
		switch (Integer.parseInt(type)) {
		case 1:
			single.setSelectSingle(selectSingleService.getById(q_id));
			break;
		case 2:
			single.setSelects(selectsService.getById(q_id));
			break;
		case 3:
			single.setPack(packsService.getById(q_id));
			break;
		case 4:
			single.setJudge(judgeService.getById(q_id));
			break;
		case 5:
			single.setSimple(simpleService.getById(q_id));
			break;
		case 6:
			single.setStrong(strongService.getById(q_id));
			break;
		default:System.out.println("无试题");
			break;
		}
		questionListService.save(single);
		addview();
		addActionMessage("添加成功");
		return "add";
	}
	//更新
	public String update() {
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.set("bean", questionListService.getById(getModel().getId()));
		geCourse();
		return "update";
	}
	public String updates() {
		QuestionList single=getModel();
		single.setPaper(paperService.getById(paper_id));
		questionListService.update(single);
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.set("bean", single);
		geCourse();
		addActionMessage("修改成功！");
		return "update";
	}
	//删除
	public String del(){
		QuestionList single=new QuestionList();
		single.setId(getModel().getId());
		questionListService.update(single);
		questionListService.delete(getModel().getId());
		list();
		return "list";
	}
	
	private void geCourse() {
		List<Course> courses=courseService.findAll();
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.set("courseBean", courses);
	}
}
