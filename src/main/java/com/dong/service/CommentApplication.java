package com.dong.service;

import java.math.BigInteger;
import java.util.Map;

import org.dayatang.utils.Page;

import com.dong.application.dto.CommentDTO;

public interface CommentApplication extends BaseApplication<CommentDTO, Long> {
	
	/**
	 * �������Ĳ�ѯ��¼����
	 * @param params
	 * @return
	 */
	BigInteger getTotal(Map<String, Object> params);
	
	Page<CommentDTO> getPage(CommentDTO dto, int currentPage, int pageSize);

}
