package cn.lzf.stsys.pro.entity.publics;

import java.util.HashSet;
import java.util.Set;

/**
 * 大题
 * @author 李志飞
 *
 */
public class QuestionStrong extends Question{
	private String result;
	private Set<QuestionList>lists=new HashSet<QuestionList>();
	
	public QuestionStrong() {
	}
	
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}

	public Set<QuestionList> getLists() {
		return lists;
	}

	public void setLists(Set<QuestionList> lists) {
		this.lists = lists;
	}
	
}
