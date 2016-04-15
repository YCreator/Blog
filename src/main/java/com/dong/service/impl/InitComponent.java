package com.dong.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import com.dong.application.dto.BlogDTO;
import com.dong.application.dto.BlogTypeDTO;
import com.dong.application.dto.BloggerDTO;
import com.dong.application.dto.LinkDTO;
import com.dong.service.BlogApplication;
import com.dong.service.BlogTypeApplication;
import com.dong.service.BloggerApplication;
import com.dong.service.LinkApplication;

/**
 * 初始化组件 把博主信息 根据博客类别分类信息 根据日期归档分类信息 存放到application中，用以提供页面请求性能
 * @author Administrator
 *
 */
@Component
public class InitComponent implements ServletContextListener,ApplicationContextAware{

	private static ApplicationContext applicationContext;
	
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		this.applicationContext=applicationContext;
	}

	public void contextInitialized(ServletContextEvent servletContextEvent) {
		ServletContext application=servletContextEvent.getServletContext();
		
		BlogApplication blogApplication = (BlogApplication) applicationContext.getBean("blogApplication");
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("orderType", "clickHit");
		List<BlogDTO> clickBlogs = blogApplication.pageQuery(params, 0, 6).getData(); //查询点击量最高的前六篇博客
		application.setAttribute("clickBlogs", clickBlogs);
		params.put("orderType", "releaseDate");
		List<BlogDTO> dateBlogs = blogApplication.pageQuery(params, 0, 6).getData(); //查询最新的六篇博客
		application.setAttribute("dateBlogs", dateBlogs);
		
		LinkApplication linkApplication = (LinkApplication) applicationContext.getBean("linkApplication");
		List<LinkDTO> linkList = linkApplication.findAll(); // 查询所有的友情链接信息
		application.setAttribute("linkList", linkList);
		
		BlogTypeApplication blogTypeApplication = (BlogTypeApplication) applicationContext.getBean("blogTypeApplication");
		List<BlogTypeDTO> typeList = blogTypeApplication.findAll(); // 查询博客类别以及博客的数量
		application.setAttribute("blogTypeCountList", typeList);
		
		BloggerApplication bloggerApplication = (BloggerApplication) applicationContext.getBean("bloggerApplication");
		BloggerDTO blogger = bloggerApplication.get(1L);
		blogger.setPassword(null);
		application.setAttribute("blogger", blogger);
		
		/*BloggerService bloggerService=(BloggerService) applicationContext.getBean("bloggerService");
		Blogger blogger=bloggerService.find(); // 查询博主信息
		blogger.setPassword(null);
		application.setAttribute("blogger", blogger);
		
		BlogTypeService blogTypeService=(BlogTypeService) applicationContext.getBean("blogTypeService");
		List<BlogType> blogTypeCountList=blogTypeService.countList(); // 查询博客类别以及博客的数量
		application.setAttribute("blogTypeCountList", blogTypeCountList);
		
		BlogService blogService=(BlogService) applicationContext.getBean("blogService");
		List<Blog> blogCountList=blogService.countList(); // 根据日期分组查询博客
		application.setAttribute("blogCountList", blogCountList);
		
		LinkService linkService=(LinkService) applicationContext.getBean("linkService");
		List<Link> linkList=linkService.list(null); // 查询所有的友情链接信息
		application.setAttribute("linkList", linkList);*/
	}

	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

}
