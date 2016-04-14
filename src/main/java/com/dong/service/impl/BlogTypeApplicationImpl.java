package com.dong.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dong.application.dto.BlogTypeDTO;
import com.dong.domain.BlogType;
import com.dong.service.BlogTypeApplication;

@Service("blogTypeApplication")
@Transactional
public class BlogTypeApplicationImpl extends BaseApplicationImpl implements BlogTypeApplication {

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public BlogTypeDTO get(Long pk) {
		return null;
	}

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<BlogTypeDTO> findAll() {
		List<BlogType> list = BlogType.findAll(BlogType.class);
		List<BlogTypeDTO> dtos = new ArrayList<BlogTypeDTO>();
		for (BlogType blogType : list) {
			BlogTypeDTO dto = new BlogTypeDTO();
			try {
				BeanUtils.copyProperties(dto, blogType);
			} catch (Exception e) {
				e.printStackTrace();
			}
			dtos.add(dto);
		}
		return dtos;
	}

	public BlogTypeDTO save(BlogTypeDTO t) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(BlogTypeDTO t) {
		// TODO Auto-generated method stub
		
	}

	public void remove(Long pk) {
		// TODO Auto-generated method stub
		
	}

	public void removes(Long[] pks) {
		// TODO Auto-generated method stub
		
	}

}
