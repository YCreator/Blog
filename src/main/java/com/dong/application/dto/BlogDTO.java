package com.dong.application.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;


/**
 * ����ʵ��
 * @author Administrator
 *
 */
public class BlogDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1948933168416718722L;
	/**
	 * 
	 */

	private Long id; // ���
	private String title; // ���ͱ���
	private String summary; // ժҪ
	private Date releaseDate; // ��������
 	private Integer clickHit; // �鿴����
	private Integer replyHit; // �ظ�����
	private String content; // ��������
	private String contentNoTag; // �������� ����ҳ��ǩ Lucene�ִ���
	private BlogTypeDTO blogTypeDTO; // ��������
	
	private Integer blogCount; // �������� �ǲ���ʵ�����ԣ���Ҫ�� ���ݷ������ڹ鵵��ѯ����������
	private String releaseDateStr; // ���������ַ��� ֻȡ�����
	private String keyWord; // �ؼ��� �ո����
	private String picPath; //����ͼƬ���ܵ�ַ
	
	private List<String> imagesList=new LinkedList<String>(); // ��������ڵ�ͼƬ ��Ҫ�����б�չʾ��ʾ����ͼ
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public String getContentNoTag() {
		return contentNoTag;
	}
	public void setContentNoTag(String contentNoTag) {
		this.contentNoTag = contentNoTag;
	}
	/**
	 * ʹ��BeanUtils ����һ��ʵ�嵽��һ��ʵ��ʱ����Ҫʵ��get����,ͬʱ������Ҫ��get+Դʵ���Ӧ�������������������ܻ�ȡ��ֵ,����: blog.blogTypeֵע���ӦblogTypeDTO.getBlogType����
	 * @return
	 */
	public BlogTypeDTO getBlogType() {
		return blogTypeDTO;
	}
	public void setBlogTypeDTO(BlogTypeDTO blogTypeDTO) {
		this.blogTypeDTO = blogTypeDTO;
	}
	public Integer getBlogCount() {
		return blogCount;
	}
	public void setBlogCount(Integer blogCount) {
		this.blogCount = blogCount;
	}
	public String getReleaseDateStr() {
		return releaseDateStr;
	}
	public void setReleaseDateStr(String releaseDateStr) {
		this.releaseDateStr = releaseDateStr;
	}
	public String getKeyWord() {
		return keyWord;
	}
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}
	
	public List<String> getImagesList() {
		return imagesList;
	}
	public void setImagesList(List<String> imagesList) {
		this.imagesList = imagesList;
	}
	public String getPicPath() {
		return picPath;
	}
	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}
	
}
