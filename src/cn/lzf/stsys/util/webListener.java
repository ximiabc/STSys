package cn.lzf.stsys.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 在线访问监听器
 * @author 李志飞
 *
 */
//@WebListener()
public class webListener implements ServletContextListener{

	/**
	 * 初始化时调用
	 */
	public void contextInitialized(ServletContextEvent arg0) {
		ServletContext sc=arg0.getServletContext();
		String filename=sc.getRealPath("/WEB-INF/count.txt");
		File file=new File(filename);
		System.out.println("==============>初始化了监听器");
		Integer totalcount=0;
		
		if(file.exists()){
			try {
				FileReader fr=new FileReader(file);
				BufferedReader br=new BufferedReader(fr);
				
				totalcount=Integer.valueOf(br.readLine());
				
				br.close();
				
				fr.close();
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			sc.setAttribute("totalcount", totalcount);
			sc.setAttribute("linecount", 0);
			
		}else{
			System.out.println("文件不存在！！！");
		}
	}
	
	/**
	 * 销毁时调用
	 */
	public void contextDestroyed(ServletContextEvent arg0) {
		ServletContext sc=arg0.getServletContext();
		String filename=sc.getRealPath("/WEB-INF/count.txt");
		File file=new File(filename);
		try {
			FileWriter fw=new FileWriter(file);
			BufferedWriter bw=new BufferedWriter(fw);
			
			bw.write(sc.getAttribute("totalcount").toString());
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
