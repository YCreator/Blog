package com.dong.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dong.service.BloggerApplication;
import com.dong.util.ResponseUtil;
import com.google.gson.Gson;


@Controller
@RequestMapping("/")
public class TestController {
	
	@Resource
	BloggerApplication bloggerApplication;
	
	@RequestMapping("/test")
	public void test(HttpServletRequest request,HttpServletResponse response) throws Exception {
		ResponseUtil.write(response, new Gson().toJson(bloggerApplication.get(1L)));
	}

}
