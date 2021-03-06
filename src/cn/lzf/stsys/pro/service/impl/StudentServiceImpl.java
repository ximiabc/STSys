package cn.lzf.stsys.pro.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lzf.stsys.base.BaseDaoImpl;
import cn.lzf.stsys.pro.entity.student.Student;
import cn.lzf.stsys.pro.service.StudentService;

@Service
@Transactional
public class StudentServiceImpl extends BaseDaoImpl<Student> implements StudentService{

	public Student Login(String account,String pass) {
		return (Student)getSession().createQuery("FROM Student n where n.account = ? and n.pass = ?").setString(0, account).setString(1, pass).uniqueResult();
	}
	
}
