package com.dong.application.dto;

import java.util.Date;

/**
 * 评论实体
 * @author Administrator
 *
 */
public class CommentDTO {

	private Long id; // 编号
	private String userIp; // 用户IP
	private String content; // 评论内容
	private Long blogId; // 被评论的博客
	private Date commentDate; // 评论日期
	private Integer state; // 审核状态  0 待审核 1 审核通过 2 审核未通过
	
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
	public Long getBlogId() {
		return blogId;
	}
	public void setBlogId(Long blogId) {
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
