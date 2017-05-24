package cn.lzf.stsys.pro.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lzf.stsys.base.BaseDaoImpl;
import cn.lzf.stsys.pro.entity.publics.QuestionSimple;
import cn.lzf.stsys.pro.entity.publics.QuestionStrong;
import cn.lzf.stsys.pro.service.SimpleService;
import cn.lzf.stsys.pro.service.StrongService;

@Service
@Transactional
public class StrongServiceImpl extends BaseDaoImpl<QuestionStrong> implements StrongService{
}
