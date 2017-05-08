package cn.lzf.stsys.pro.entity.publics;

import java.util.HashSet;
import java.util.Set;

/**
 * 判断题
 * @author 李志飞
 *
 */
public class QuestionJudge extends Question{
	private Integer result;
	private Set<QuestionList>lists=new HashSet<QuestionList>();
	
	public QuestionJudge() {
	}
	
	public Integer getResult() {
		return result;
	}
	public void setResult(Integer result) {
		this.result = result;
	}

	public Set<QuestionList> getLists() {
		return lists;
	}

	public void setLists(Set<QuestionList> lists) {
		this.lists = lists;
	}
	
}
