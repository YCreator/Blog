package com.dong.controller.admin;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.dong.application.dto.BlogDTO;
import com.dong.application.dto.BlogTypeDTO;
import com.dong.application.dto.BloggerDTO;
import com.dong.application.dto.LinkDTO;
import com.dong.entity.Blog;
import com.dong.entity.Link;
import com.dong.service.BlogApplication;
import com.dong.service.BlogTypeApplication;
import com.dong.service.BloggerApplication;
import com.dong.service.LinkApplication;
import com.dong.util.ResponseUtil;

/**
 * ����ԱϵͳController��
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/admin/system")
public class SystemAdminController {

	/*@Resource*/
	//private BloggerService bloggerService;
	
	/*@Resource*/
	//private BlogTypeService blogTypeService;
	
	/*@Resource*/
	//private BlogService blogService;
	
	/*@Resource*/
	//private LinkService linkService;
	@Inject
	private BloggerApplication bloggerApplication;
	@Inject
	private BlogTypeApplication blogTypeApplication;
	@Inject
	private BlogApplication blogApplication;
	@Inject
	private LinkApplication linkApplication;
	
	/**
	 * ˢ��ϵͳ����
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/refreshSystem")
	public String refreshSystem(HttpServletResponse response,HttpServletRequest request)throws Exception{
		ServletContext application=RequestContextUtils.getWebApplicationContext(request).getServletContext();
		//Blogger blogger=bloggerService.find(); // ��ѯ������Ϣ
		BloggerDTO blogger = bloggerApplication.getBlogger();
		blogger.setPassword(null);
		application.setAttribute("blogger", blogger);
		
		List<BlogTypeDTO> blogTypeCountList=blogTypeApplication.findAll(); // ��ѯ��������Լ����͵�����
		application.setAttribute("blogTypeCountList", blogTypeCountList);
		
		//List<Blog> blogCountList=blogService.countList(); // �������ڷ����ѯ����
		List<BlogDTO> blogCountList=blogApplication.findAll();
		application.setAttribute("blogCountList", blogCountList);
		
		List<LinkDTO> linkList=linkApplication.findAll(); // ��ȡ������������
		application.setAttribute("linkList", linkList);
		
		JSONObject result=new JSONObject();
		result.put("success", true);
		ResponseUtil.write(response, result);
		return null;
	}
}
