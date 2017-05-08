package cn.lzf.stsys.pro.entity.publics;

import java.util.HashSet;
import java.util.Set;

/**
 * 知识点类型
 * @author 李志飞
 *
 */
public class KnowType {
	private Integer id;
	private String name;
	private Course course;
	private Set<Knows> knows=new HashSet<Knows>();
	private Set<QuestionList> lists=new HashSet<QuestionList>();
	public KnowType() {
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

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Set<Knows> getKnows() {
		return knows;
	}

	public void setKnows(Set<Knows> knows) {
		this.knows = knows;
	}

	public Set<QuestionList> getLists() {
		return lists;
	}

	public void setLists(Set<QuestionList> lists) {
		this.lists = lists;
	}
	
}
