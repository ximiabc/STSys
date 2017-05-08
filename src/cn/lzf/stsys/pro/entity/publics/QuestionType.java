package cn.lzf.stsys.pro.entity.publics;

import java.util.HashSet;
import java.util.Set;

/**
 * 问题类型--选择、多选、填空、判断、简答、大题
 * @author 李志飞
 *
 */
public class QuestionType {//题目所属类型：1单选、2多选、3填空、4判断、5简答、6大题

	private Integer id;
	private String name;//类型名
	private Set<QuestionList>lists=new HashSet<QuestionList>();
	private Set<Answers>answers=new HashSet<Answers>();
	
	public QuestionType() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<QuestionList> getLists() {
		return lists;
	}

	public void setLists(Set<QuestionList> lists) {
		this.lists = lists;
	}

	public Set<Answers> getAnswers() {
		return answers;
	}

	public void setAnswers(Set<Answers> answers) {
		this.answers = answers;
	}
	
}
