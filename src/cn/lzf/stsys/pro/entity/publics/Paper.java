package cn.lzf.stsys.pro.entity.publics;

import java.util.HashSet;
import java.util.Set;

/**
 * 试卷
 * @author 李志飞
 */
public class Paper {
	private Integer id;
	private String name;
	private String info;
	private Course course;
	//对应的试题
	private Set<QuestionList>questions=new HashSet<QuestionList>();
	//对应成绩
	private Set<Scores>scores=new HashSet<Scores>();
	private Set<Answers>answers=new HashSet<Answers>();
	public Paper() {
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
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Set<QuestionList> getQuestions() {
		return questions;
	}
	public void setQuestions(Set<QuestionList> questions) {
		this.questions = questions;
	}
	public Set<Scores> getScores() {
		return scores;
	}
	public void setScores(Set<Scores> scores) {
		this.scores = scores;
	}
	public Set<Answers> getAnswers() {
		return answers;
	}
	public void setAnswers(Set<Answers> answers) {
		this.answers = answers;
	}
	
}
