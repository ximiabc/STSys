package cn.lzf.stsys.pro.entity.publics;

import java.util.HashSet;
import java.util.Set;

/**
 * 课程
 * @author 李志飞
 *
 */
public class Course {
	private Integer id;
	private String name;
	private Set<KnowType>knowTypes=new HashSet<KnowType>();
	private Set<Paper> papers=new HashSet<Paper>();
	private Set<Classes>classes=new HashSet<Classes>();
	
	private Set<QuestionSelectSingle>selectSingles=new HashSet<QuestionSelectSingle>();
	private Set<QuestionSelects>selects=new HashSet<QuestionSelects>();
	private Set<QuestionPack>packs=new HashSet<QuestionPack>();
	private Set<QuestionJudge>judges=new HashSet<QuestionJudge>();
	private Set<QuestionSimple>simples=new HashSet<QuestionSimple>();
	private Set<QuestionStrong>strongs=new HashSet<QuestionStrong>();
	
	public Course() {
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

	public Set<KnowType> getKnowTypes() {
		return knowTypes;
	}

	public void setKnowTypes(Set<KnowType> knowTypes) {
		this.knowTypes = knowTypes;
	}

	public Set<Paper> getPapers() {
		return papers;
	}

	public void setPapers(Set<Paper> papers) {
		this.papers = papers;
	}

	public Set<Classes> getClasses() {
		return classes;
	}

	public void setClasses(Set<Classes> classes) {
		this.classes = classes;
	}

	public Set<QuestionSelectSingle> getSelectSingles() {
		return selectSingles;
	}

	public void setSelectSingles(Set<QuestionSelectSingle> selectSingles) {
		this.selectSingles = selectSingles;
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
