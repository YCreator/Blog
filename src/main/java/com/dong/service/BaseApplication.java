package com.dong.service;

import java.io.Serializable;
import java.util.List;

public interface BaseApplication<T, PK extends Serializable> {
	
	T get(PK pk);
	
	List<T> findAll();
	
	T save(T t);
	
	void update(T t);
	
	void remove(PK pk);
	
	void removes(PK[] pks);
	
}
