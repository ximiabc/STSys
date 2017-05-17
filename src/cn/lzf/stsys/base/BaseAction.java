package cn.lzf.stsys.base;

import java.lang.reflect.ParameterizedType;

import javax.annotation.Resource;

import cn.lzf.stsys.pro.service.AdminService;
import cn.lzf.stsys.pro.service.ClassesService;
import cn.lzf.stsys.pro.service.CourseService;
import cn.lzf.stsys.pro.service.JudgeService;
import cn.lzf.stsys.pro.service.KnowService;
import cn.lzf.stsys.pro.service.KnowTypeService;
import cn.lzf.stsys.pro.service.PacksService;
import cn.lzf.stsys.pro.service.PaperService;
import cn.lzf.stsys.pro.service.QuestionTypeService;
import cn.lzf.stsys.pro.service.SelectSingleService;
import cn.lzf.stsys.pro.service.SelectsService;
import cn.lzf.stsys.pro.service.SimpleService;
import cn.lzf.stsys.pro.service.StrongService;
import cn.lzf.stsys.pro.service.StudentService;
import cn.lzf.stsys.pro.service.TeacherService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public abstract class BaseAction<T> extends ActionSupport implements ModelDriven<T>{
	protected T model;
	public BaseAction(){
		try{
			ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
			Class<T> clazz = (Class<T>) pt.getActualTypeArguments()[0];
			model = clazz.newInstance();
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
	protected int pageNum = 1;

	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	//获取模型驱动
	public T getModel(){
		return model;
	}
	
	
	
	/**
	 * 注入所有的service
	 */
	@Resource
	protected AdminService adminService;
	@Resource
	protected TeacherService teacherService;
	@Resource
	protected StudentService studentService;
	@Resource
	protected ClassesService classesService;
	@Resource
	protected CourseService courseService;
	@Resource
	protected KnowService knowService;
	@Resource
	protected KnowTypeService knowTypeService;
	
	//试卷
	@Resource
	protected PaperService paperService;
	
	
	@Resource
	protected QuestionTypeService questionTypeService;
	@Resource
	protected SelectSingleService selectSingleService;
	@Resource
	protected SelectsService selectsService;
	@Resource
	protected PacksService packsService;
	@Resource
	protected JudgeService judgeService;
	@Resource
	protected SimpleService simpleService;
	@Resource
	protected StrongService strongService;
}
