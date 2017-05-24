package cn.lzf.stsys.pro.entity.publics;

/**
 * 试卷-试题表
 * @author 李志飞
 *
 */
public class QuestionList {
	private Integer id;
	private Paper paper;//所属试卷
	private QuestionType types;//题目所属类型：1单选、2多选、3填空、4判断、5简答、6大题
	private KnowType knowType;//知识点 类型
	
	private QuestionSelectSingle selectSingle;//单选
	private QuestionSelects selects;//选择
	private QuestionPack pack;//填空
	private QuestionJudge judge;//判断
	private QuestionSimple simple;//简答
	private QuestionStrong strong;//大题
	
	public QuestionList() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public QuestionType getTypes() {
		return types;
	}

	public void setTypes(QuestionType types) {
		this.types = types;
	}

	public Paper getPaper() {
		return paper;
	}

	public void setPaper(Paper paper) {
		this.paper = paper;
	}

	public KnowType getKnowType() {
		return knowType;
	}

	public void setKnowType(KnowType knowType) {
		this.knowType = knowType;
	}

	public QuestionSelectSingle getSelectSingle() {
		return selectSingle;
	}

	public void setSelectSingle(QuestionSelectSingle selectSingle) {
		this.selectSingle = selectSingle;
	}

	public QuestionSelects getSelects() {
		return selects;
	}

	public void setSelects(QuestionSelects selects) {
		this.selects = selects;
	}

	public QuestionPack getPack() {
		return pack;
	}

	public void setPack(QuestionPack pack) {
		this.pack = pack;
	}

	public QuestionJudge getJudge() {
		return judge;
	}

	public void setJudge(QuestionJudge judge) {
		this.judge = judge;
	}

	public QuestionSimple getSimple() {
		return simple;
	}

	public void setSimple(QuestionSimple simple) {
		this.simple = simple;
	}

	public QuestionStrong getStrong() {
		return strong;
	}

	public void setStrong(QuestionStrong strong) {
		this.strong = strong;
	}
	
}
