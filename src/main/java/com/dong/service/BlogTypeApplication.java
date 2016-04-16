package com.dong.service;

import java.math.BigInteger;

import org.dayatang.utils.Page;

import com.dong.application.dto.BlogTypeDTO;

public interface BlogTypeApplication extends BaseApplication<BlogTypeDTO, Long> {
	
	Page<BlogTypeDTO> getPage(BlogTypeDTO dto, int currentPage, int pageSize);
	
	BigInteger getTotal();

}
