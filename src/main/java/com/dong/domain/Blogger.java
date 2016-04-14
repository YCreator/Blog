package com.dong.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Version;

import org.dayatang.domain.AbstractEntity;

/**
 * ����ʵ��
 * @author java1234_С��
 *
 */
@Entity
@Table(name="t_blogger")
public class Blogger extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column
	private String userName; // �û���
	@Column
	private String password; // ����
	@Column
	private String nickName; // �ǳ�
	@Column
	private String sign; // ����ǩ��
	@Column
	private String proFile; // ���˼��
	@Column
	private String imageName; // ����ͷ��
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
