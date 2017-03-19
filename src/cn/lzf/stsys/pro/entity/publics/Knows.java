package cn.lzf.stsys.pro.entity.publics;

import java.util.Set;

/**
 * 知识点类型--积分、概率
 * @author 李志飞
 *
 */
public class Knows {

	private Integer id;
	private String name;
	private Set<KnowType>types;//知识点集合
	
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

	public Set<KnowType> getTypes() {
		return types;
	}

	public void setTypes(Set<KnowType> types) {
		this.types = types;
	}
	
}
