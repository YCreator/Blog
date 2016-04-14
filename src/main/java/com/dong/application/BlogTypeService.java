package com.dong.application;

import java.util.List;
import java.util.Map;

import com.dong.entity.BlogType;

/**
 * ��������Service�ӿ�
 * @author Administrator
 *
 */
public interface BlogTypeService {

	/**
	 * ��ѯ���в������� �Լ���Ӧ�Ĳ�������
	 * @return
	 */
	public List<BlogType> countList();
	
	/**
	 * ��ҳ��ѯ���������Ϣ
	 * @param map
	 * @return
	 */
	public List<BlogType> list(Map<String,Object> map);
	
	/**
	 * ��ȡ�ܼ�¼��
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
	
	/**
	 * ���Ӳ��������Ϣ
	 * @param blogType
	 * @return
	 */
	public Integer add(BlogType blogType);
	
	/**
	 * �޸Ĳ��������Ϣ
	 * @param blogType
	 * @return
	 */
	public Integer update(BlogType blogType);
	
	/**
	 * ɾ�����������Ϣ
	 * @param id
	 * @return
	 */
	public Integer delete(Integer id);
}