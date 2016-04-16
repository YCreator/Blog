package com.dong.controller.admin;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dong.application.dto.BlogDTO;
import com.dong.application.dto.PageBean;
import com.dong.lucene.BlogIndex;
import com.dong.service.BlogApplication;
import com.dong.util.ResponseUtil;
import com.dong.util.StringUtil;


/**
 * ����Ա����Controller��
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/admin/blog")
public class BlogAdminController {

	@Resource
	private BlogApplication blogApplication;
	
	// ��������
	private BlogIndex blogIndex=new BlogIndex();
	
	/**
	 * ��ӻ����޸Ĳ�����Ϣ
	 * @param blog
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/save")
	public String save(BlogDTO blog,HttpServletResponse response)throws Exception{
		System.out.println("save===========================>");
		boolean isUpdateSuccess = false;
		if(blog.getId()==null){
			blog = blogApplication.save(blog);
			blogIndex.addIndex(blog); // ��Ӳ�������
		}else{
			isUpdateSuccess = blogApplication.update(blog);
			blogIndex.updateIndex(blog); // ���²�������
		}
		JSONObject result=new JSONObject();
		if (blog.getId() != null || isUpdateSuccess) {
			result.put("success", true);
		} else {
			result.put("success", false);
		}
		ResponseUtil.write(response, result);
		return null;
	}
	
	/**
	 * ��ҳ��ѯ������Ϣ
	 * @param page
	 * @param rows
	 * @param s_customer
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list")
	public String list(@RequestParam(value="page",required=false)String page,@RequestParam(value="rows",required=false)String rows,BlogDTO s_blog,HttpServletResponse response)throws Exception{
		PageBean pageBean=new PageBean(Integer.parseInt(page),Integer.parseInt(rows));
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("title", StringUtil.formatLike(s_blog.getTitle()));
		List<BlogDTO> blogList=blogApplication.pageQuery(map, pageBean.getPage(), pageBean.getPageSize()).getData();
		Long total=blogApplication.getTotal(map).longValue();
		JSONObject result=new JSONObject();
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd"));
		JSONArray jsonArray=JSONArray.fromObject(blogList,jsonConfig);
		result.put("rows", jsonArray);
		result.put("total", total);
		ResponseUtil.write(response, result);
		return null;
	}
	
	/**
	 * ɾ��������Ϣ
	 * @param ids
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/delete")
	public String delete(@RequestParam(value="ids")String ids,HttpServletResponse response)throws Exception{
		String []idsStr=ids.split(",");
		for(int i=0;i<idsStr.length;i++){
			blogApplication.remove(Long.valueOf(idsStr[i]));
			blogIndex.deleteIndex(idsStr[i]); // ɾ����Ӧ���͵�����
		}
		JSONObject result=new JSONObject();
		result.put("success", true);
		ResponseUtil.write(response, result);
		return null;
	}
	
	/**
	 * ͨ��ID����ʵ��
	 * @param id
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findById")
	public String findById(@RequestParam(value="id")String id,HttpServletResponse response)throws Exception{
		System.out.println("find======================>");
		BlogDTO blog=blogApplication.get(Long.valueOf(id));
		JSONObject jsonObject=JSONObject.fromObject(blog);
		ResponseUtil.write(response, jsonObject);
		return null;
	}
	
	
	
}
