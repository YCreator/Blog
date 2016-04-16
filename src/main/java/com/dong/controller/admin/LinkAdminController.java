package com.dong.controller.admin;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dong.application.LinkService;
import com.dong.application.dto.LinkDTO;
import com.dong.application.dto.PageBean;
import com.dong.entity.Link;
import com.dong.service.LinkApplication;
import com.dong.util.ResponseUtil;

/**
 * ��������Controller��
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/admin/link")
public class LinkAdminController {
	
	/*@Resource*/
	//private LinkService linkService;
	@Resource
	private LinkApplication linkApplication;
	
	/**
	 * ��ҳ��ѯ����������Ϣ
	 * @param page
	 * @param rows
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list")
	public String list(@RequestParam(value="page",required=false)String page,@RequestParam(value="rows",required=false)String rows,HttpServletResponse response)throws Exception{
		PageBean pageBean=new PageBean(Integer.parseInt(page),Integer.parseInt(rows));
		/*Map<String,Object> map=new HashMap<String,Object>();
		map.put("start", pageBean.getStart());
		map.put("size", pageBean.getPageSize());*/
		List<LinkDTO> linkList = linkApplication.getPage(pageBean.getPage(), pageBean.getPageSize()).getData();
		//List<Link> linkList=linkService.list(map);
		Long total=linkApplication.getTotal().longValue();
		JSONObject result=new JSONObject();
		JSONArray jsonArray=JSONArray.fromObject(linkList);
		result.put("rows", jsonArray);
		result.put("total", total);
		ResponseUtil.write(response, result);
		return null;
	}
	
	/**
	 * ��ӻ����޸�����������Ϣ
	 * @param link
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/save")
	public String save(LinkDTO link,HttpServletResponse response)throws Exception{
		boolean isUpdateSuccess=false; // �����ļ�¼����
		if(link.getId()==null){
			link = linkApplication.save(link);
		}else{
			isUpdateSuccess=linkApplication.update(link);
		}
		JSONObject result=new JSONObject();
		if(link.getId() != null || isUpdateSuccess){
			result.put("success", true);
		}else{
			result.put("success", false);
		}
		ResponseUtil.write(response, result);
		return null;
	}
	
	/**
	 * ɾ������������Ϣ
	 * @param ids
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/delete")
	public String delete(@RequestParam(value="ids")String ids,HttpServletResponse response)throws Exception{
		String []idsStr=ids.split(",");
		for(int i=0;i<idsStr.length;i++){
			linkApplication.remove(Long.parseLong(idsStr[i]));
		}
		JSONObject result=new JSONObject();
		result.put("success", true);
		ResponseUtil.write(response, result);
		return null;
	}
}
