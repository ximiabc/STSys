package cn.lzf.stsys.pro.action.admin;

import org.omg.CORBA.Request;

import com.opensymphony.xwork2.ActionContext;

import cn.lzf.stsys.base.BaseAction;
import cn.lzf.stsys.pro.entity.admin.Admin;

/**
 * 管理员
 * @author 李志飞
 *
 */
public class AdminAction extends BaseAction<Admin>{

//	默认首页
	public String index(){
		ActionContext.getContext().getSession().put("body","admin");
		return "index";
	}
	
//	个人相关
	public String listself() {
		return "listself";
	}
	public String updateself() {
		return "updateself";
	}
	
//	教师相关
	public String addteacher() {
		return "addteacher";
	}
	public String listteacher() {
		return "listteacher";
	}
	public String updateteacher() {
		return "updateteacher";
	}
	
//	班级相关
	public String addclass() {
		return "addclass";
	}
	public String listclass() {
		return "listclass";
	}
	public String updateclass() {
		return "updateclass";
	}
	
//	学生相关
	public String addstudent() {
		return "addstudent";
	}
	public String liststudent() {
		return "liststudent";
	}
	public String updatestudent() {
		return "updatestudent";
	}
	
//	考试安排相关
	public String addexam() {
		return "addexam";
	}
	public String listexam() {
		return "listexam";
	}
	public String updateexam() {
		return "updateexam";
	}
	
//	题库相关
	public String addentrepot() {
		return "addentrepot";
	}
	public String listentrepot() {
		return "listentrepot";
	}
	public String updateentrepot() {
		return "updateentrepot";
	}
	

	
////	显示详情--附带前后展示
//	public String view() {
//		List<SoftCenter> list;
//		if(softCenterService.getById(getModel().getId()).isView()){
//			list=softCenterService.findAllByDateShow();
//		}else{
//			list=softCenterService.findAllByDateUnShow();
//		}
//		return viewdeal(list);
//	}
////	
//	private String viewdeal(List<SoftCenter> list){
//		SoftCenter[]news=new SoftCenter[3];
//		for(int i=0;i<list.size();i++){
//			if(list.get(i).getId()==getModel().getId()){
//				if(i-1>=0){
//					news[0]=list.get(i-1);
//				}else{
//					news[0]=null;
//				}
//				news[1]=list.get(i);
//				if(i+1<list.size()){
//					news[2]=list.get(i+1);
//				}else{
//					news[2]=null;
//				}
//				ActionContext.getContext().put("beans",news[1]);
//				ActionContext.getContext().put("up",news[0]);
//				ActionContext.getContext().put("down",news[2]);
//				countadd();
//				return "view";
//			}
//		}
//		ActionContext.getContext().put("beans",null);
//		ActionContext.getContext().put("up",null);
//		ActionContext.getContext().put("down",null);
//		return "view";
//	}
////	添加浏览量
//	private void countadd(){
//		SoftCenter n=softCenterService.getById(getModel().getId());
//		n.setId(n.getId());
//		n.setTitles(n.getTitles());
//		n.setDate(n.getDate());
//		n.setContext(n.getContext());
//		n.setView(n.isView());
//		n.setCount(n.getCount()+1);
//		n.setPath(n.getPath());
//		softCenterService.update(n);
//	}
//	
////	分页查询-
//	private void selectPage(boolean isview){
//		PageBean pageBean=softCenterService.getPageBean(pageNum,10, new HqlHelper(SoftCenter.class, "center").
//				addOrderByProperty("date", false).
//				addWhereCondition("center.view = ?", isview));
//		pageBean.setCurrentPage(pageNum);
//		ValueStack vs = ServletActionContext.getContext().getValueStack();
//		vs.set("pageBean", pageBean);
//	}
//	
////	设置为显示
//	public String show(){
//		SoftCenter n=softCenterService.getById(getModel().getId());
//		n.setId(n.getId());
//		n.setTitles(n.getTitles());
//		n.setDate(n.getDate());
//		n.setContext(n.getContext());
//		n.setView(true);
//		n.setCount(n.getCount()+1);
//		n.setPath(n.getPath());
//		softCenterService.update(n);
//		
//		selectPage(true);
//		return "update";
//	}
//	
////	设置为不显示
//	public String unshow(){
//		SoftCenter n=softCenterService.getById(getModel().getId());
//		n.setId(n.getId());
//		n.setTitles(n.getTitles());
//		n.setDate(n.getDate());
//		n.setContext(n.getContext());
//		n.setView(false);
//		n.setCount(n.getCount()+1);
//		n.setPath(n.getPath());
//		softCenterService.update(n);
//		
//		selectPage(false);
//		return "history";
//	}
//	
////	写入数据
//	public String write() {
//		SoftCenter news=new SoftCenter();
//		news.setTitles(getModel().getTitles());
//		news.setContext(getModel().getContext());
//		news.setDate(new Date());
//		news.setView(true);
//		news.setCount(0);
//		news.setPath(null);//暂时为空
//		softCenterService.save(news);
//		return "add";
//	}
//	/**
//	 * 王志汤：首部
//	 * @return
//	 */
//	//前端界面连接
//	public String indexs(){
//		selectPage(true);
//		return "indexs";
//	}
//	//查找信息
//	public String finds(){
//		view();
//		selectPage(true);
//		return "indexs";
//	}
}
