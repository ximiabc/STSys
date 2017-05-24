package cn.lzf.stsys.pro.service;

import java.util.List;

import cn.lzf.stsys.base.BaseDao;
import cn.lzf.stsys.pro.entity.publics.KnowType;

/**
 * 课程
 * @author 李志飞
 *
 */
public interface KnowTypeService extends BaseDao<KnowType>{
	
	List<KnowType> getByCourse(Integer id);
	
}
