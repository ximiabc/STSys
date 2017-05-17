package cn.lzf.stsys.pro.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lzf.stsys.base.BaseDaoImpl;
import cn.lzf.stsys.pro.entity.publics.Paper;
import cn.lzf.stsys.pro.service.PaperService;

@Service
@Transactional
public class PaperServiceImpl extends BaseDaoImpl<Paper> implements PaperService{
}
