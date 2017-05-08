package cn.lzf.stsys.pro.service;

import cn.lzf.stsys.base.BaseDao;
import cn.lzf.stsys.pro.entity.student.Student;


public interface StudentService extends BaseDao<Student>{

	/**
	 * 管理员登录
	 * @param username
	 * @param password
	 * @return
	 */
	Student Login(String account,String pass);
}
