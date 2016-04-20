package com.dong.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dong.application.dto.BloggerDTO;
import com.dong.service.BloggerApplication;
import com.dong.util.CryptographyUtil;

/**
 * ����Controller��
 * @author java1234_С��
 *
 */
@Controller
@RequestMapping("/blogger")
public class BloggerController {

	/*@Resource*/
	@Inject
	private BloggerApplication bloggerApplication;
	
	/**
	 * �û���¼
	 * @param blogger
	 * @param request
	 * @return
	 */
	@RequestMapping("/login")
	public String login(BloggerDTO blogger,HttpServletRequest request){
		Subject subject=SecurityUtils.getSubject();
		UsernamePasswordToken token=new UsernamePasswordToken(blogger.getUsername(), CryptographyUtil.md5(blogger.getPassword(), "java1234"));
		try{
			subject.login(token); // ��¼��֤
			return "redirect:/admin/main.jsp";
		}catch(Exception e){
			e.printStackTrace();
			request.setAttribute("blogger", blogger);
			request.setAttribute("errorInfo", "�û������������");
			return "login";
		}
	}
	
	/**
	 * ���Ҳ�����Ϣ
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/aboutMe")
	public ModelAndView aboutMe()throws Exception{
		ModelAndView mav=new ModelAndView();
		mav.addObject("blogger",bloggerApplication.getBlogger());
		mav.addObject("mainPage", "foreground/blogger/info.jsp");
		mav.addObject("pageTitle","���ڲ���_Java��Դ����ϵͳ");
		mav.setViewName("mainTemp");
		return mav;
	}
}
