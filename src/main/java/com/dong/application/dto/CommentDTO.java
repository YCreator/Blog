package com.dong.application.dto;

import java.util.Date;

/**
 * ����ʵ��
 * @author Administrator
 *
 */
public class CommentDTO {

	private Long id; // ���
	private String userIp; // �û�IP
	private String content; // ��������
	private BlogDTO blog; // �����۵Ĳ���
	private Date commentDate; // ��������
	private Integer state; // ���״̬  0 ����� 1 ���ͨ�� 2 ���δͨ��
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserIp() {
		return userIp;
	}
	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public BlogDTO getBlog() {
		return blog;
	}
	public void setBlog(BlogDTO blog) {
		this.blog = blog;
	}
	public Date getCommentDate() {
		return commentDate;
	}
	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	
	
}
