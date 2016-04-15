package com.dong.service;

import org.dayatang.utils.Page;

import com.dong.application.dto.LinkDTO;

public interface LinkApplication extends BaseApplication<LinkDTO, Long> {
	
	Page<LinkDTO> getPage(int currentPage, int pageSize);
	
	int getTotal();

}
