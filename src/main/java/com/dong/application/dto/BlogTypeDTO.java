package com.dong.application.dto;

import java.io.Serializable;

/**
 * ��������ʵ��
 * @author Administrator
 *
 */
public class BlogTypeDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;  // ���
	private String typeName; // ������������
	private Integer blogCount; // ����
	private Integer orderNo; // ����  ��С����������ʾ
	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public Integer getBlogCount() {
		return blogCount;
	}
	public void setBlogCount(Integer blogCount) {
		this.blogCount = blogCount;
	}
	public Integer getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}
	

	
	
}
