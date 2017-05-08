package cn.lzf.stsys.pro.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lzf.stsys.base.BaseDaoImpl;
import cn.lzf.stsys.pro.entity.publics.QuestionPack;
import cn.lzf.stsys.pro.service.PacksService;

@Service
@Transactional
public class PacksServiceImpl extends BaseDaoImpl<QuestionPack> implements PacksService{
}
