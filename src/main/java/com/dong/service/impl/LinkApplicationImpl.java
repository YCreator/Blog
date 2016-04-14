package com.dong.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dong.application.dto.LinkDTO;
import com.dong.domain.Link;
import com.dong.service.LinkApplication;

@Service("linkApplication")
@Transactional
public class LinkApplicationImpl extends BaseApplicationImpl implements LinkApplication {

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public LinkDTO get(Long pk) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<LinkDTO> findAll() {
		List<Link> list = Link.findAll(Link.class);
		List<LinkDTO> dtos = new ArrayList<LinkDTO>();
		for (Link link : list) {
			LinkDTO dto = new LinkDTO();
			try {
				BeanUtils.copyProperties(dto, link);
			} catch (Exception e) {
				e.printStackTrace();
			}
			dtos.add(dto);
		}
		return dtos;
	}

	public LinkDTO save(LinkDTO t) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(LinkDTO t) {
		// TODO Auto-generated method stub
		
	}

	public void remove(Long pk) {
		// TODO Auto-generated method stub
		
	}

	public void removes(Long[] pks) {
		// TODO Auto-generated method stub
		
	}

}
