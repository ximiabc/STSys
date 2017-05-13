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
	
	private Set<QuestionSelectSingle>singles=new HashSet<QuestionSelectSingle>();
	private Set<QuestionSelects>selects=new HashSet<QuestionSelects>();
	private Set<QuestionPack>packs=new HashSet<QuestionPack>();
	private Set<QuestionJudge>judges=new HashSet<QuestionJudge>();
	private Set<QuestionSimple>simples=new HashSet<QuestionSimple>();
	private Set<QuestionStrong>strongs=new HashSet<QuestionStrong>();
	
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

	public Set<QuestionSelectSingle> getSingles() {
		return singles;
	}

	public void setSingles(Set<QuestionSelectSingle> singles) {
		this.singles = singles;
	}

	public Set<QuestionSelects> getSelects() {
		return selects;
	}

	public void setSelects(Set<QuestionSelects> selects) {
		this.selects = selects;
	}

	public Set<QuestionPack> getPacks() {
		return packs;
	}

	public void setPacks(Set<QuestionPack> packs) {
		this.packs = packs;
	}

	public Set<QuestionJudge> getJudges() {
		return judges;
	}

	public void setJudges(Set<QuestionJudge> judges) {
		this.judges = judges;
	}

	public Set<QuestionSimple> getSimples() {
		return simples;
	}

	public void setSimples(Set<QuestionSimple> simples) {
		this.simples = simples;
	}

	public Set<QuestionStrong> getStrongs() {
		return strongs;
	}

	public void setStrongs(Set<QuestionStrong> strongs) {
		this.strongs = strongs;
	}
	
}
