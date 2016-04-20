package com.dong.service;

import java.math.BigInteger;

import org.dayatang.utils.Page;

import com.dong.application.dto.LinkDTO;

public interface LinkApplication extends BaseApplication<LinkDTO, Long> {
	
	Page<LinkDTO> getPage(int currentPage, int pageSize);
	
	Long getTotal();

}
