package com.dong.application.dto;

import java.io.Serializable;

/**
 * ����ʵ��
 * @author java1234_С��
 *
 */
public class BloggerDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7309038640229159183L;
	private Long id; // ���
	private String username; // �û���
	private String password; // ����
	private String nickName; // �ǳ�
	private String sign; // ����ǩ��
	private String proFile; // ���˼��
	private String imageName; // ����ͷ��
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public String getProFile() {
		return proFile;
	}
	public void setProFile(String proFile) {
		this.proFile = proFile;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	
    
	
}
