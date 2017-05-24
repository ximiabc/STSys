package cn.lzf.stsys.pro.entity.publics;

import cn.lzf.stsys.pro.entity.student.Student;

/**
 * 成绩单
 * @author 李志飞
 *
 */
public class Scores {
	private Integer id;
	private Student student;
	private Paper paper;
	public Scores() {
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
	
}
