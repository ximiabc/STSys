package cn.lzf.stsys.pro.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lzf.stsys.base.BaseDaoImpl;
import cn.lzf.stsys.pro.entity.publics.QuestionSelects;
import cn.lzf.stsys.pro.service.SelectsService;

@Service
@Transactional
public class SelectsServiceImpl extends BaseDaoImpl<QuestionSelects> implements SelectsService{
}
