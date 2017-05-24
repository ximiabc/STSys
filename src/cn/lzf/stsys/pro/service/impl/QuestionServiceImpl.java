package cn.lzf.stsys.pro.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lzf.stsys.base.BaseDaoImpl;
import cn.lzf.stsys.pro.entity.publics.QuestionList;
import cn.lzf.stsys.pro.service.QuestionService;

@Service
@Transactional
public class QuestionServiceImpl extends BaseDaoImpl<QuestionList> implements QuestionService{

	public List<QuestionList> getSingleByPaperId(Integer id) {
		return (List<QuestionList>)getSession().createQuery("from QuestionList f where f.paper.id = ? and f.types.id = 1").setInteger(0, id).list();
	}

	public List<QuestionList> getSelectsByPaperId(Integer id) {
		return (List<QuestionList>)getSession().createQuery("from QuestionList f where f.paper.id = ? and f.types.id = 2").setInteger(0, id).list();
	}

	public List<QuestionList> getPackByPaperId(Integer id) {
		return (List<QuestionList>)getSession().createQuery("from QuestionList f where f.paper.id = ? and f.types.id = 3").setInteger(0, id).list();
	}

	public List<QuestionList> getJudgeByPaperId(Integer id) {
		return (List<QuestionList>)getSession().createQuery("from QuestionList f where f.paper.id = ? and f.types.id = 4").setInteger(0, id).list();
	}

	public List<QuestionList> getSimpleByPaperId(Integer id) {
		return (List<QuestionList>)getSession().createQuery("from QuestionList f where f.paper.id = ? and f.types.id = 5").setInteger(0, id).list();
	}

	public List<QuestionList> getStrongByPaperId(Integer id) {
		return (List<QuestionList>)getSession().createQuery("from QuestionList f where f.paper.id = ? and f.types.id = 6").setInteger(0, id).list();
	}
}
