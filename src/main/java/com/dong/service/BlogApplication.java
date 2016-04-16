package com.dong.service;


import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import org.dayatang.utils.Page;

import com.dong.application.dto.BlogDTO;

public interface BlogApplication extends BaseApplication<BlogDTO, Long> {
	
	BigInteger getTotal(Map<String, Object> params); //�������Ĳ�ѯ��¼����
	
	Page<BlogDTO> pageQuery (BlogDTO dto, int currentPage, int pageSize);
	
	Page<BlogDTO> pageQuery (Map<String, Object> map, int currentPage, int pageSize);
	
	BlogDTO getLastBlog(Long id); //������һƪ����
	
	BlogDTO getNextBlog(Long id); //������һƪ����
	
	List<BlogDTO> getBlogByTypeId(Long typeId);
}
