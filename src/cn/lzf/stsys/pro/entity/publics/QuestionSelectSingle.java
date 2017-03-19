package cn.lzf.stsys.pro.entity.publics;

/**
 * 单选题
 * @author 李志飞
 *
 */
public class QuestionSelectSingle extends Question{
	private String itemA;
	private String itemB;
	private String itemC;
	private String itemD;
	private Integer result;
	
	public QuestionSelectSingle() {
	}
	
	public String getItemA() {
		return itemA;
	}
	public void setItemA(String itemA) {
		this.itemA = itemA;
	}
	public String getItemB() {
		return itemB;
	}
	public void setItemB(String itemB) {
		this.itemB = itemB;
	}
	public String getItemC() {
		return itemC;
	}
	public void setItemC(String itemC) {
		this.itemC = itemC;
	}
	public String getItemD() {
		return itemD;
	}
	public void setItemD(String itemD) {
		this.itemD = itemD;
	}
	public Integer getResult() {
		return result;
	}
	public void setResult(Integer result) {
		this.result = result;
	}
}
