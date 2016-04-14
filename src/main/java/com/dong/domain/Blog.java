package com.dong.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.dayatang.domain.AbstractEntity;

/**
 * ����ʵ��
 * @author Administrator
 *
 */
@Entity
@Table(name="t_blog")
public class Blog extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column
	private String title; // ���ͱ���
	@Column
	private String summary; // ժҪ
	@Column
	private Date releaseDate; // ��������
	@Column
 	private Integer clickHit; // �鿴����
	@Column
	private Integer replyHit; // �ظ�����
	@Column
	private String content; // ��������
	@JoinColumn(name="typeId",referencedColumnName="id")//���  ���ö�Ӧ���ݱ�����������õ����ݱ������
	@ManyToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH},fetch=FetchType.LAZY)
	private BlogType blogType; // ��������
	@Column
	private String keyWord; // �ؼ��� �ո����
	@Column
	private String picPath; //����ͼƬ���ܵ�ַ

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public Integer getClickHit() {
		return clickHit;
	}
	public void setClickHit(Integer clickHit) {
		this.clickHit = clickHit;
	}
	public Integer getReplyHit() {
		return replyHit;
	}
	public void setReplyHit(Integer replyHit) {
		this.replyHit = replyHit;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	/**
     * ManyToOne�����һ������
     * cascade(����)��all(����)��merge(����)��refresh(��ѯ)��persistence(����)��remove(ɾ��)
     * fetch: eager:��������  one��һ��Ĭ������������   lazy:������    many��һ��Ĭ����������
     * optional:�Ƿ��ѡ,����Ƿ�����Ϊ��
     *
     * JoinColumn:ָ�������
     *
     */
	public BlogType getBlogType() {
		return blogType;
	}
	public void setBlogType(BlogType blogType) {
		this.blogType = blogType;
	}
	public String getKeyWord() {
		return keyWord;
	}
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}
	public String getPicPath() {
		return picPath;
	}
	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}
	
}
