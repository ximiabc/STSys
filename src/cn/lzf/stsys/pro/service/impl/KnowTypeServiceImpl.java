package cn.lzf.stsys.pro.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lzf.stsys.base.BaseDaoImpl;
import cn.lzf.stsys.pro.entity.publics.KnowType;
import cn.lzf.stsys.pro.service.KnowTypeService;

@Service
@Transactional
public class KnowTypeServiceImpl extends BaseDaoImpl<KnowType> implements KnowTypeService{

	public List<KnowType> getByCourse(Integer id) {
		return getSession().createQuery("from KnowType k where k.course.id = ?").setInteger(0, id).list();
	}
}
