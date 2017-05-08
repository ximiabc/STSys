package cn.lzf.stsys.pro.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lzf.stsys.base.BaseDaoImpl;
import cn.lzf.stsys.pro.entity.admin.Admin;
import cn.lzf.stsys.pro.service.AdminService;

@Service
@Transactional
public class AdminServiceImpl extends BaseDaoImpl<Admin> implements AdminService{

	public Admin Login(String account,String pass) {
		return (Admin)getSession().createQuery("FROM Admin n where n.account = ? and n.pass = ?").setString(0, account).setString(1, pass).uniqueResult();
	}
	
}
