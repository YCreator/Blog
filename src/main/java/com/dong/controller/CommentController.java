package com.dong.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dong.application.dto.BlogDTO;
import com.dong.application.dto.CommentDTO;
import com.dong.service.BlogApplication;
import com.dong.service.CommentApplication;
import com.dong.util.ResponseUtil;

/**
 * ����Controller��
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/comment")
public class CommentController {
	
	@Resource
	private CommentApplication commentApplication;
	@Resource	
	private BlogApplication blogApplication;
	
	/**
	 * ��ӻ����޸�����
	 * @param comment
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/save")
	public String save(CommentDTO comment,@RequestParam("imageCode") String imageCode,HttpServletRequest request,HttpServletResponse response,HttpSession session)throws Exception{
		String sRand=(String) session.getAttribute("sRand"); // ��ȡϵͳ���ɵ���֤��
		JSONObject result=new JSONObject();
		if(!imageCode.equals(sRand)){
			result.put("success", false);
			result.put("errorInfo", "��֤����д����");
		}else{
			String userIp=request.getRemoteAddr(); // ��ȡ�û�IP
			comment.setUserIp(userIp);
			if(comment.getId()==null){
				comment = commentApplication.save(comment);
				// �ò��͵Ļظ�������1
				BlogDTO blog=blogApplication.get(comment.getBlogId());
				blog.setReplyHit(blog.getReplyHit()+1);
				blogApplication.update(blog);
			}
			if(comment.getId() != null){
				result.put("success", true);
			}else{
				result.put("success", false);
			}
		}
		ResponseUtil.write(response, result);
		return null;
	}

}
