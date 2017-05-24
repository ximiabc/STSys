package cn.lzf.stsys.pro.action.publics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;

import cn.lzf.stsys.base.BaseAction;
import cn.lzf.stsys.pro.entity.publics.Course;
import cn.lzf.stsys.pro.entity.publics.KnowType;
import cn.lzf.stsys.pro.entity.publics.Paper;
import cn.lzf.stsys.pro.entity.publics.QuestionJudge;
import cn.lzf.stsys.pro.entity.publics.QuestionList;
import cn.lzf.stsys.pro.entity.publics.QuestionPack;
import cn.lzf.stsys.pro.entity.publics.QuestionSelectSingle;
import cn.lzf.stsys.pro.entity.publics.QuestionSelects;
import cn.lzf.stsys.pro.entity.publics.QuestionSimple;
import cn.lzf.stsys.pro.entity.publics.QuestionStrong;
import cn.lzf.stsys.util.HqlHelper;
import cn.lzf.stsys.util.PageBean;

/**
 * 填空题
 * @author 李志飞
 *
 */
public class PaperAction extends BaseAction<Paper>{
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
		PageBean pageBean=paperService.getPageBean(pageNum, 10, new HqlHelper(Paper.class, "c")
			.addOrderByProperty("id", true));
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.set("pageBean", pageBean);
		geCourse();
		vs.set("listby", 0);
		return "list";
	}
	public String listbyid() {
		PageBean pageBean=paperService.getPageBean(pageNum, 10, new HqlHelper(Paper.class, "c")
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
		Paper single=paperService.getById(getModel().getId());
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.set("bean", single);
		return "view";
	}
	//查看试卷所有数据
	public String viewall() {
		Paper paper=paperService.getById(getModel().getId());
		List<QuestionSelectSingle>singles=new ArrayList<QuestionSelectSingle>();
		List<QuestionSelects>selects=new ArrayList<QuestionSelects>();
		List<QuestionPack>packs=new ArrayList<QuestionPack>();
		List<QuestionJudge>judges=new ArrayList<QuestionJudge>();
		List<QuestionSimple>simples=new ArrayList<QuestionSimple>();
		List<QuestionStrong>strongs=new ArrayList<QuestionStrong>();
		Set<QuestionList>lists=paper.getQuestions();
		Iterator<QuestionList> it=lists.iterator();
		while(it.hasNext()){
			QuestionList list=it.next();
			switch (list.getTypes().getId()) {
			case 1:singles.add(list.getSelectSingle());
				break;
			case 2:selects.add(list.getSelects());
				break;
			case 3:packs.add(list.getPack());
				break;
			case 4:judges.add(list.getJudge());
				break;
			case 5:simples.add(list.getSimple());
				break;
			case 6:strongs.add(list.getStrong());
				break;
			default:
				break;
			}
		}
		
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.set("paper", paper);
		vs.set("singles", singles);
		vs.set("selects", selects);
		vs.set("packs", packs);
		vs.set("judges", judges);
		vs.set("simples", simples);
		vs.set("strongs", strongs);
		return "viewall";
	}
	//添加单选题
	public String add() {
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.set("bean", new Paper());
		geCourse();
		return "add";
	}
	public String adds() {
		Paper single=getModel();
		single.setCourse(courseService.getById(course_id));
		paperService.save(single);
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.set("bean", single);
		geCourse();
		addActionMessage("添加成功");
		return "add";
	}
	//更新
	public String update() {
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.set("bean", paperService.getById(getModel().getId()));
		geCourse();
		return "update";
	}
	public String updates() {
		Paper single=getModel();
		single.setCourse(courseService.getById(course_id));
		paperService.update(single);
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.set("bean", single);
		geCourse();
		addActionMessage("修改成功！");
		return "update";
	}
	//删除
	public String del(){
		Paper single=new Paper();
		single.setId(getModel().getId());
		paperService.update(single);
		paperService.delete(getModel().getId());
		list();
		return "list";
	}
	
	private void geCourse() {
		List<Course> courses=courseService.findAll();
		ValueStack vs=ActionContext.getContext().getValueStack();
		vs.set("courseBean", courses);
	}
}
