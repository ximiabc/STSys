package cn.lzf.stsys.pro.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lzf.stsys.base.BaseDaoImpl;
import cn.lzf.stsys.pro.entity.publics.Course;
import cn.lzf.stsys.pro.service.CourseService;

@Service
@Transactional
public class CourseServiceImpl extends BaseDaoImpl<Course> implements CourseService{
}
