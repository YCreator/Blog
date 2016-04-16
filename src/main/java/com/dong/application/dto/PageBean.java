package com.dong.application.dto;

/**
 * ��ҳModel��
 * @author 
 *
 */
public class PageBean {

	private int page; // �ڼ�ҳ
	private int pageSize; // ÿҳ��¼��
	private int start;  // ��ʼҳ
	
	
	public PageBean(int page, int pageSize) {
		super();
		this.page = page;
		this.pageSize = pageSize;
	}
	
	public int getPage() {
		return page > 0 ? page - 1 : 0;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getStart() {
		return (page-1)*pageSize;
	}
	
	
}
