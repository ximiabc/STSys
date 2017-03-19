package cn.lzf.stsys.pro.entity.publics;

/**
 * 问题类型--选择、多选、填空、判断、简答、大题
 * @author 李志飞
 *
 */
public class QuestionType {

	private Integer id;
	private String name;//类型名
	
	public QuestionType() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
