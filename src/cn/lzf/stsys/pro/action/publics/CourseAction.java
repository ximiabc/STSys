package cn.lzf.stsys.pro.action.publics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import cn.lzf.stsys.base.BaseAction;
import cn.lzf.stsys.pro.entity.publics.Course;
import cn.lzf.stsys.pro.entity.publics.KnowType;
import cn.lzf.stsys.pro.entity.publics.Question;

/**
 * 课程管理
 * @author 李志飞
 *
 */
public class CourseAction extends BaseAction<Course>{
	private String result;
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	private Integer q_id;
	public Integer getQ_id() {
		return q_id;
	}
	public void setQ_id(Integer q_id) {
		this.q_id = q_id;
	}
	/**
	 * 获取指定id课程的号，
	 * @return
	 */
	public String type() {
		Course course=courseService.getById(getModel().getId());
		Set<KnowType>types=course.getKnowTypes();
		if(types.size()<=0){
			setResult("{\"code\":0}");
			return "types";//返回码为0，数据为空
		}
		Iterator<KnowType> it=types.iterator();
		StringBuffer buffer=new StringBuffer("{\"code\":1,\"result\":[");
		while(it.hasNext()){
			KnowType type=it.next();
			buffer.append("{\"id\":"+type.getId()+",\"name\":\""+type.getName()+"\"}");
			if(it.hasNext())buffer.append(",");
		}
		buffer.append("]}");
		setResult(buffer.toString());
		return "types";
	}
	
	public String question() {
		KnowType type=knowTypeService.getById(getModel().getId());
		Set q=new HashSet();
		switch (q_id) {
		case 1://单选
			q=type.getSingles();
			break;
		case 2://多选
			q=type.getSelects();
			break;
		case 3://填空
			q=type.getPacks();
			break;
		case 4://判断
			q=type.getJudges();
			break;
		case 5://简答
			q=type.getSimples();
			break;
		case 6://大题
			q=type.getStrongs();
			break;
		default:
			break;
		}
		if(q.size()<=0){
			setResult("{\"code\":0}");
			return "types";//返回码为0，数据为空
		}
		Iterator<Question> it=q.iterator();
		StringBuffer buffer=new StringBuffer("{\"code\":1,\"result\":[");
		while(it.hasNext()){
			Question its=it.next();
			buffer.append("{\"id\":"+its.getId()+",\"name\":\""+its.getTitle()+"\"}");
			if(it.hasNext())buffer.append(",");
		}
		buffer.append("]}");
		setResult(buffer.toString());
		return "types";
	}
	
}
