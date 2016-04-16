package com.dong.service;

import java.io.Serializable;
import java.util.List;

public interface BaseApplication<T, PK extends Serializable> {
	
	/**
	 * ���ҵ�������
	 * @param pk
	 * @return
	 */
	T get(PK pk);
	
	/**
	 * ������������
	 * @return
	 */
	List<T> findAll();
	
	/**
	 * ��������
	 * @param t
	 * @return
	 */
	T save(T t);
	
	/**
	 * �޸�����
	 * @param t
	 */
	boolean update(T t);
	
	/**
	 * ɾ����������
	 * @param pk
	 */
	void remove(PK pk);
	
	/**
	 * ����ɾ���������
	 * @param pks
	 */
	void removes(PK[] pks);
	
}
