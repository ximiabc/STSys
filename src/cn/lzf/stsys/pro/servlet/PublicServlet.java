package cn.lzf.stsys.pro.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 公共部分控制器
 *
 */
public class PublicServlet extends HttpServlet{
	
	/**
	 * 公共部分请求处理
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
//		测试公共部分跳转
		req.getRequestDispatcher("/WEB-INF/view/public/index.jsp").forward(req, resp);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
		doGet(req, resp);
		
	}
	
}
