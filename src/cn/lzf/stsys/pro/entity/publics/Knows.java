package cn.lzf.stsys.pro.entity.publics;

/**
 * 知识点关键字
 * @author 李志飞
 *
 */
public class Knows {

	private Integer id;
	private String name;
	private KnowType type;//知识点
	
	public Knows() {
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
	
	public KnowType getType() {
		return type;
	}

	public void setType(KnowType type) {
		this.type = type;
	}
}
