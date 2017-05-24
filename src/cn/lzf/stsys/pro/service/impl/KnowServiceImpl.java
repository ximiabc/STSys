package cn.lzf.stsys.pro.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lzf.stsys.base.BaseDaoImpl;
import cn.lzf.stsys.pro.entity.publics.Knows;
import cn.lzf.stsys.pro.service.KnowService;

@Service
@Transactional
public class KnowServiceImpl extends BaseDaoImpl<Knows> implements KnowService{
}
