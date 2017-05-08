package cn.lzf.stsys.pro.service;

import cn.lzf.stsys.base.BaseDao;
import cn.lzf.stsys.pro.entity.teacher.Teacher;


public interface TeacherService extends BaseDao<Teacher>{

	/**
	 * 管理员登录
	 * @param username
	 * @param password
	 * @return
	 */
	Teacher Login(String account,String pass);
}
