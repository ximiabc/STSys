package cn.lzf.stsys.pro.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lzf.stsys.base.BaseDaoImpl;
import cn.lzf.stsys.pro.entity.publics.QuestionSelectSingle;
import cn.lzf.stsys.pro.service.SelectSingleService;

@Service
@Transactional
public class SelectSingleServiceImpl extends BaseDaoImpl<QuestionSelectSingle> implements SelectSingleService{
}
