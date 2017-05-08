package cn.lzf.stsys.pro.entity.publics;

import cn.lzf.stsys.pro.entity.student.Student;

/**
 * 回答问题表
 * @author 李志飞
 *
 */
public class Answers {
	private Integer id;
	private Student student;
	private Paper paper;
	private QuestionType type;//试题类型
	private Integer question_id;//试题id
	private String answer;//回答的答案
	private String score;//得分
	
	public Answers() {
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Paper getPaper() {
		return paper;
	}
	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	public QuestionType getType() {
		return type;
	}
	public void setType(QuestionType type) {
		this.type = type;
	}
	public Integer getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(Integer question_id) {
		this.question_id = question_id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	
}
