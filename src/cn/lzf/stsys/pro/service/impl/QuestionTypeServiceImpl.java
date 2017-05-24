package cn.lzf.stsys.pro.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lzf.stsys.base.BaseDaoImpl;
import cn.lzf.stsys.pro.entity.publics.QuestionType;
import cn.lzf.stsys.pro.service.QuestionTypeService;

@Service
@Transactional
public class QuestionTypeServiceImpl extends BaseDaoImpl<QuestionType> implements QuestionTypeService{
}
