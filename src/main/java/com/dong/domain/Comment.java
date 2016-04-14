package com.dong.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.dayatang.domain.AbstractEntity;

/**
 * ����ʵ��
 * @author Administrator
 *
 */
@Entity
@Table(name="t_comment")
public class Comment extends AbstractEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column
	private String userIp; // �û�IP
	@Column
	private String content; // ��������
	@Column
	private Long blogId; // �����۵Ĳ���
	@Column
	private Date commentDate; // ��������
	@Column
	private Integer state; // ���״̬  0 ����� 1 ���ͨ�� 2 ���δͨ��
	
	
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
	public Long getBlogId() {
		return blogId;
	}
	public void setBlog(Long blogId) {
		this.blogId = blogId;
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
