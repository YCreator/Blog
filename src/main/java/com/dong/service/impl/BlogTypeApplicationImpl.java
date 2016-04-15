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
		BlogTypeDTO dto = new BlogTypeDTO();
		BlogType blogType = BlogType.load(BlogType.class, pk);
		try {
			BeanUtils.copyProperties(dto, blogType);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return dto;
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
		BlogType bt = new BlogType();
		try {
			BeanUtils.copyProperties(bt, t);
		} catch(Exception e) {
			e.printStackTrace();
		}
		bt.save();
		t.setId(bt.getId());
		return t;
	}

	public void update(BlogTypeDTO t) {
		BlogType bt = BlogType.get(BlogType.class, t.getId());
		try {
			BeanUtils.copyProperties(bt, t);
		} catch(Exception e) {
			e.printStackTrace();
		}	
	}

	public void remove(Long pk) {
		removes(new Long[]{pk});
		
	}

	public void removes(Long[] pks) {
		for(int i = 0; i < pks.length; i++) {
			BlogType bt = BlogType.load(BlogType.class, pks[i]);
			bt.remove();
		}
	}

}
