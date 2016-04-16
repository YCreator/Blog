package com.dong.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.dayatang.utils.Page;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dong.application.dto.BlogDTO;
import com.dong.application.dto.BlogTypeDTO;
import com.dong.application.dto.PageBean;
import com.dong.service.BlogApplication;
import com.dong.util.PageUtil;
import com.dong.util.StringUtil;

/**
 * ��ҳController
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/")
public class IndexController {

	@Resource
	private BlogApplication blogApplication;
	
	
	/**
	 * ������ҳ
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/myindex")
	public ModelAndView index(@RequestParam(value="page",required=false)String page,@RequestParam(value="typeId",required=false)String typeId,@RequestParam(value="releaseDateStr",required=false)String releaseDateStr,HttpServletRequest request)throws Exception{
		ModelAndView mav=new ModelAndView();
		if(StringUtil.isEmpty(page)){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page),10);
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("start", pageBean.getStart());
		map.put("size", pageBean.getPageSize());
		map.put("typeId", typeId);
		map.put("releaseDateStr", releaseDateStr);
		//List<Blog> blogList=blogService.list(map);
		BlogDTO dto = new BlogDTO();
		Page<BlogDTO> blogList=blogApplication.pageQuery(dto, pageBean.getStart(), pageBean.getPageSize());
		for (BlogDTO d : blogList.getData()) {
			List<String> imagesList=d.getImagesList();
			String blogInfo=d.getContent();
			Document doc=Jsoup.parse(blogInfo);
			Elements jpgs=doc.select("img[src$=.jpg]"); //��������չ����jpg��ͼƬ
			for(int i=0;i<jpgs.size();i++){
				Element jpg=jpgs.get(i);
				imagesList.add(jpg.toString());
				if(i==2){
					break;
				}
			}
		}
		/*for(Blog blog:blogList){
			List<String> imagesList=blog.getImagesList();
			String blogInfo=blog.getContent();
			Document doc=Jsoup.parse(blogInfo);
			Elements jpgs=doc.select("img[src$=.jpg]"); //��������չ����jpg��ͼƬ
			for(int i=0;i<jpgs.size();i++){
				Element jpg=jpgs.get(i);
				imagesList.add(jpg.toString());
				if(i==2){
					break;
				}
			}
		}*/
		mav.addObject("blogList", blogList.getData());
		StringBuffer param=new StringBuffer(); // ��ѯ����
		if(StringUtil.isNotEmpty(typeId)){
			param.append("typeId="+typeId+"&");
		}
		if(StringUtil.isNotEmpty(releaseDateStr)){
			param.append("releaseDateStr="+releaseDateStr+"&");
		}
		mav.addObject("test","hello");
		//mav.addObject("pageCode",PageUtil.genPagination(request.getContextPath()+"/index.html", blogService.getTotal(map), Integer.parseInt(page), 10, param.toString()));
		mav.addObject("mainPage", "foreground/blog/list.jsp");
		mav.addObject("pageTitle","Java��Դ����ϵͳ");
		mav.setViewName("mainTemp");
		return mav;
	}
	
	/**
	 * Դ������
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/download")
	public ModelAndView download()throws Exception{
		ModelAndView mav=new ModelAndView();
		mav.addObject("mainPage", "foreground/system/download.jsp");
		mav.addObject("pageTitle","��վԴ������ҳ��_Java��Դ����ϵͳ");
		mav.setViewName("mainTemp");
		return mav;
	}
	
	/**
	 * ������ҳ
	 * @param page
	 * @param typeId
	 * @param releaseDateStr
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/index")
	public ModelAndView staticIndex(@RequestParam(value="page",required=false)String page,@RequestParam(value="typeId",required=false)String typeId,@RequestParam(value="releaseDateStr",required=false)String releaseDateStr,HttpServletRequest request) throws Exception {
		ModelAndView mav=new ModelAndView();
		if(StringUtil.isEmpty(page)){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page),10);
		BlogDTO dto = new BlogDTO();
		if (StringUtil.isNotEmpty(typeId)) {
			BlogTypeDTO typeDTO = new BlogTypeDTO();
			typeDTO.setId(Long.valueOf(typeId));
			dto.setBlogTypeDTO(typeDTO);
		}
		Page<BlogDTO> blogList=blogApplication.pageQuery(dto, pageBean.getPage(), pageBean.getPageSize());
		mav.addObject("blogList", blogList.getData());
		
		StringBuffer param=new StringBuffer(); // ��ѯ����
		if(StringUtil.isNotEmpty(typeId)){
			param.append("typeId="+typeId+"&");
		}
		if(StringUtil.isNotEmpty(releaseDateStr)){
			param.append("releaseDateStr="+releaseDateStr+"&");
		}
		Map<String, Object> params = new HashMap<String, Object>();
		if (typeId != null && !typeId.equals("")) {
			params.put("typeId", typeId);
		}
		mav.addObject("pageCode",PageUtil.genPagination(request.getContextPath()+"/index.html",blogApplication
				.getTotal(params).longValue(), Integer.parseInt(page), 10, param.toString()));
		mav.addObject("pageTitle","Dong����ϵͳ");
		mav.addObject("mainPage", "foreground/myblog/home.jsp");
		mav.addObject("listPage", "list.jsp");
		mav.setViewName("index");
		return mav;
	}
}
