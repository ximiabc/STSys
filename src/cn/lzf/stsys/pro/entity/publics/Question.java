package cn.lzf.stsys.pro.entity.publics;

import java.util.Set;

/**
 * 单个试题--基类
 * @author 李志飞
 *
 */
public abstract class Question {
	private Integer id;
	private QuestionType types;//题目所属类型
	
	private String title;//标题
	private String context;//内容
	private Integer scoreMax;//满分
	private Integer scores;//得分
	
	public Question() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public Integer getScoreMax() {
		return scoreMax;
	}

	public void setScoreMax(Integer scoreMax) {
		this.scoreMax = scoreMax;
	}

	public Integer getScores() {
		return scores;
	}

	public void setScores(Integer scores) {
		this.scores = scores;
	}

	public QuestionType getTypes() {
		return types;
	}

	public void setTypes(QuestionType types) {
		this.types = types;
	}

}