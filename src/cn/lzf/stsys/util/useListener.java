package cn.lzf.stsys.util;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class useListener implements HttpSessionListener{

	/**
	 * 初始化session时的操作
	 */
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("==============>初始化了用户监听器");
		ServletContext sc=se.getSession().getServletContext();
		Integer totalcount=(Integer)sc.getAttribute("totalcount");
		Integer linecount=(Integer)sc.getAttribute("linecount");
		
		sc.setAttribute("totalcount", totalcount+1);
		sc.setAttribute("linecount", linecount+1);
	}
	
	/**
	 * session销毁时的操作
	 */
	public void sessionDestroyed(HttpSessionEvent se) {
		ServletContext sc=se.getSession().getServletContext();
		Integer linecount=(Integer)sc.getAttribute("linecount");
		sc.setAttribute("linecount", linecount-1);
	}

	
}
