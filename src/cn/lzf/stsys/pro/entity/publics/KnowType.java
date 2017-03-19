package cn.lzf.stsys.pro.entity.publics;

/**
 * 知识点项
 * @author 李志飞
 *
 */
public class KnowType {
	private Integer id;
	private String name;//知识点关键字
	
	public KnowType() {
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
