package com.dong.applicationImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dong.application.BloggerService;
import com.dong.dao.BloggerDao;
import com.dong.entity.Blogger;

/**
 * 博主Service实现类
 * @author Administrator
 *
 */
@Service("bloggerService")
public class BloggerServiceImpl implements BloggerService{

	/*@Resource
	private BloggerDao bloggerDao;*/

	public Blogger find() {
		//return bloggerDao.find();
		return null;
	}

	public Blogger getByUserName(String userName) {
		//return bloggerDao.getByUserName(userName);
		return null;
	}

	public Integer update(Blogger blogger) {
		//return bloggerDao.update(blogger);
		return null;
	}
	
	
}
