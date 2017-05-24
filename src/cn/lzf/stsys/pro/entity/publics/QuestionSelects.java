package cn.lzf.stsys.pro.entity.publics;

import java.util.HashSet;
import java.util.Set;

/**
 * 多选题
 * @author 李志飞
 *
 */
public class QuestionSelects extends Question{
	private Integer itemSize;
	private String itemA;
	private String itemB;
	private String itemC;
	private String itemD;
	private String itemE;
	private String itemF;
	private String itemG;
	private String itemH;
	private String itemI;
	private String itemJ;
	private String itemK;
	private String itemL;
	private String itemM;
	private String itemN;
	private String itemO;
	private Integer result;
	
	private Set<QuestionList>lists=new HashSet<QuestionList>();
	
	public QuestionSelects() {
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

	public Integer getItemSize() {
		return itemSize;
	}

	public void setItemSize(Integer itemSize) {
		this.itemSize = itemSize;
	}

	public String getItemE() {
		return itemE;
	}

	public void setItemE(String itemE) {
		this.itemE = itemE;
	}

	public String getItemF() {
		return itemF;
	}

	public void setItemF(String itemF) {
		this.itemF = itemF;
	}

	public String getItemG() {
		return itemG;
	}

	public void setItemG(String itemG) {
		this.itemG = itemG;
	}

	public String getItemH() {
		return itemH;
	}

	public void setItemH(String itemH) {
		this.itemH = itemH;
	}

	public String getItemI() {
		return itemI;
	}

	public void setItemI(String itemI) {
		this.itemI = itemI;
	}

	public String getItemJ() {
		return itemJ;
	}

	public void setItemJ(String itemJ) {
		this.itemJ = itemJ;
	}

	public String getItemK() {
		return itemK;
	}

	public void setItemK(String itemK) {
		this.itemK = itemK;
	}

	public String getItemL() {
		return itemL;
	}

	public void setItemL(String itemL) {
		this.itemL = itemL;
	}

	public String getItemM() {
		return itemM;
	}

	public void setItemM(String itemM) {
		this.itemM = itemM;
	}

	public String getItemN() {
		return itemN;
	}

	public void setItemN(String itemN) {
		this.itemN = itemN;
	}

	public String getItemO() {
		return itemO;
	}

	public void setItemO(String itemO) {
		this.itemO = itemO;
	}

	public Set<QuestionList> getLists() {
		return lists;
	}

	public void setLists(Set<QuestionList> lists) {
		this.lists = lists;
	}
}
