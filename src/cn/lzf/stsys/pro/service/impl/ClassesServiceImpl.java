package cn.lzf.stsys.pro.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lzf.stsys.base.BaseDaoImpl;
import cn.lzf.stsys.pro.entity.publics.Classes;
import cn.lzf.stsys.pro.service.ClassesService;

@Service
@Transactional
public class ClassesServiceImpl extends BaseDaoImpl<Classes> implements ClassesService{
}
