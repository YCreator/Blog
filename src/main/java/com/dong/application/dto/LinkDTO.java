package com.dong.application.dto;

/**
 * 友情链接实体
 * @author Administrator
 *
 */
public class LinkDTO {

	private Long id; // 编号
	private String linkName; // 链接名称
	private String linkUrl; // 链接地址
	private Integer orderNo; // 排序序号 从小到大排序
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLinkName() {
		return linkName;
	}
	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}
	public String getLinkUrl() {
		return linkUrl;
	}
	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}
	public Integer getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}
	
	
}
