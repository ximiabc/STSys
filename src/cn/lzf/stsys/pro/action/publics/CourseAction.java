package cn.lzf.stsys.pro.action.publics;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import cn.lzf.stsys.base.BaseAction;
import cn.lzf.stsys.pro.entity.publics.Course;
import cn.lzf.stsys.pro.entity.publics.KnowType;

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
	
}
