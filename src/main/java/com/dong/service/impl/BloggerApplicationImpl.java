package com.dong.service.impl;

import java.util.List;

import javax.inject.Named;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dong.application.dto.BloggerDTO;
import com.dong.domain.Blogger;
import com.dong.service.BloggerApplication;
import com.google.gson.Gson;

/*@Service("bloggerApplication")*/
@Named
@Transactional
public class BloggerApplicationImpl extends BaseApplicationImpl implements  BloggerApplication {
	
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public BloggerDTO get(Long pk) {
		Blogger blogger = Blogger.get(Blogger.class, pk);
		BloggerDTO bloggerDTO = new BloggerDTO();
		try {
			BeanUtils.copyProperties(bloggerDTO, blogger);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bloggerDTO;
	}

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<BloggerDTO> findAll() {
		return null;
	}

	public BloggerDTO save(BloggerDTO t) {
		return null;
	}

	public boolean update(BloggerDTO t) {
		Blogger blogger = Blogger.get(Blogger.class, t.getId());
		boolean isSuccess;
		try {
			BeanUtils.copyProperties(blogger, t);
			isSuccess = true;
		} catch(Exception e) {
			e.printStackTrace();
			isSuccess = false;
		}
		return isSuccess;
	}

	public void remove(Long pk) {
		// TODO Auto-generated method stub

	}

	public void removes(Long[] pks) {
		// TODO Auto-generated method stub

	}

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public BloggerDTO findByUsername(String username) {
		String jpql = "select _blogger from Blogger _blogger where _blogger.username= '" + username + "'";
		Blogger blogger = (Blogger) this.getQueryChannelService()
				.createJpqlQuery(jpql).singleResult();
		BloggerDTO bloggerDTO = new BloggerDTO();
		try {
			Logger.getLogger(BloggerApplicationImpl.class).debug(new Gson().toJson(blogger));
			BeanUtils.copyProperties(bloggerDTO,  blogger);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bloggerDTO;
	}

	public BloggerDTO getBlogger() {
		return this.get(1L);
	}

}
