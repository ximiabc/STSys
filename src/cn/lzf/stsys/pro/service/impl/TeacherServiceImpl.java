package cn.lzf.stsys.pro.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lzf.stsys.base.BaseDaoImpl;
import cn.lzf.stsys.pro.entity.teacher.Teacher;
import cn.lzf.stsys.pro.service.TeacherService;

@Service
@Transactional
public class TeacherServiceImpl extends BaseDaoImpl<Teacher> implements TeacherService{

	public Teacher Login(String account,String pass) {
		return (Teacher)getSession().createQuery("FROM Teacher n where n.account = ? and n.pass = ?").setString(0, account).setString(1, pass).uniqueResult();
	}
	
}
