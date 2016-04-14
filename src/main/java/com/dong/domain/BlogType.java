package com.dong.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.dayatang.domain.AbstractEntity;

/**
 * ��������ʵ��
 * @author Administrator
 *
 */
@Entity
@Table(name="t_blogtype")
public class BlogType extends AbstractEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column
	private String typeName; // ������������
	@Column
	private Integer orderNo; // ����  ��С����������ʾ
	
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public Integer getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}
	

	
	
}
