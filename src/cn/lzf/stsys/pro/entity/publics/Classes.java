package cn.lzf.stsys.pro.entity.publics;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import cn.lzf.stsys.pro.entity.student.Student;

/**
 * 班级
 * @author 李志飞
 *
 */
public class Classes {
	
	private Integer id;
	private String name;
	private String info;//描述
	private Date date;
	private Set<Course>courses=new HashSet<Course>();
	private Set<Student> students=new HashSet<Student>();
	
	public Classes() {
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
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getDate() {
		return date;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
}
