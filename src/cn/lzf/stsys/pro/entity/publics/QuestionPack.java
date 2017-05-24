package cn.lzf.stsys.pro.entity.publics;

import java.util.HashSet;
import java.util.Set;

/**
 * 填空题
 * @author 李志飞
 *
 */
public class QuestionPack extends Question{
	private Integer itemSize; 
	private String result;
	private Set<QuestionList>lists=new HashSet<QuestionList>();
	
	public QuestionPack() {
	}
	
	public Integer getItemSize() {
		return itemSize;
	}

	public void setItemSize(Integer itemSize) {
		this.itemSize = itemSize;
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
