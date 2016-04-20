package com.dong.controller.admin;

import java.io.File;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.dong.application.dto.BloggerDTO;
import com.dong.service.BloggerApplication;
import com.dong.util.CryptographyUtil;
import com.dong.util.DateUtil;
import com.dong.util.ResponseUtil;

/**
 * ����Ա����Controller��
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/admin/blogger")
public class BloggerAdminController {

	/*@Resource*/
	@Inject
	private BloggerApplication bloggerApplication;
	
	/**
	 * �޸Ĳ�����Ϣ
	 * @param file1
	 * @param blogger
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/save")
	public String save(@RequestParam("imageFile") MultipartFile imageFile,BloggerDTO blogger,HttpServletRequest request,HttpServletResponse response)throws Exception{
		if(!imageFile.isEmpty()){
			String filePath=request.getServletContext().getRealPath("/");
			String imageName=DateUtil.getCurrentDateStr()+"."+imageFile.getOriginalFilename().split("\\.")[1];
			imageFile.transferTo(new File(filePath+"static/userImages/"+imageName));
			blogger.setImageName(imageName);
		}
		boolean isUpdateSuccess =bloggerApplication.update(blogger);
		StringBuffer result=new StringBuffer();
		if(isUpdateSuccess){
			result.append("<script language='javascript'>alert('�޸ĳɹ���');</script>");
		}else{
			result.append("<script language='javascript'>alert('�޸�ʧ�ܣ�');</script>");
		}
		ResponseUtil.write(response, result);
		return null;
	}
	
	/**
	 * ��ѯ������Ϣ
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/find")
	public String find(HttpServletResponse response)throws Exception{
		BloggerDTO blogger=bloggerApplication.getBlogger();
		JSONObject jsonObject=JSONObject.fromObject(blogger);
		ResponseUtil.write(response, jsonObject);
		return null;
	}
	
	/**
	 * �޸Ĳ�������
	 * @param newPassword
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/modifyPassword")
	public String modifyPassword(String newPassword,HttpServletResponse response)throws Exception{
		BloggerDTO blogger=new BloggerDTO();
		blogger.setPassword(CryptographyUtil.md5(newPassword, "java1234"));
		boolean isUpdateSuccess=bloggerApplication.update(blogger);
		JSONObject result=new JSONObject();
		if(isUpdateSuccess){
			result.put("success", true);
		}else{
			result.put("success", false);
		}
		ResponseUtil.write(response, result);
		return null;
	}
	
	/**
	 * ע��
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/logout")
	public String  logout()throws Exception{
		SecurityUtils.getSubject().logout();
		return "redirect:/login.jsp";
	}
}
