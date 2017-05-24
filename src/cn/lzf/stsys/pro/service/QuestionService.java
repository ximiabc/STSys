package cn.lzf.stsys.pro.service;


import java.util.List;

import cn.lzf.stsys.base.BaseDao;
import cn.lzf.stsys.pro.entity.publics.QuestionList;

/**
 * 试卷
 * @author 李志飞
 *
 */
public interface QuestionService extends BaseDao<QuestionList>{
	
	List<QuestionList> getSingleByPaperId(Integer id);
	
	List<QuestionList> getSelectsByPaperId(Integer id);
	
	List<QuestionList> getPackByPaperId(Integer id);
	
	List<QuestionList> getJudgeByPaperId(Integer id);
	
	List<QuestionList> getSimpleByPaperId(Integer id);
	
	List<QuestionList> getStrongByPaperId(Integer id);
	
}
