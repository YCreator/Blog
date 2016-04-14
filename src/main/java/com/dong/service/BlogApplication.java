package com.dong.service;


import java.util.Map;

import org.dayatang.utils.Page;

import com.dong.application.dto.BlogDTO;

public interface BlogApplication extends BaseApplication<BlogDTO, Long> {
	
	int count(Long id);
	
	Page<BlogDTO> pageQuery (BlogDTO dto, int currentPage, int pageSize);
	
	Page<BlogDTO> pageQuery (Map<String, Object> map, int currentPage, int pageSize);
}
