package cn.lzf.stsys.pro.entity.student;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;


/**
 * 学生
 * @author 李志飞
 *
 */
public class Student implements java.io.Serializable {
	private Integer id;//id
	private String name;//用户名
	private String account;//账号
	private String pass;//密码
	private Date date; //最新登录日期
	
	public Student() {
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

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
