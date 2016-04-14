package com.dong.realm;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.dong.application.BloggerService;
import com.dong.application.dto.BloggerDTO;
import com.dong.entity.Blogger;
import com.dong.service.BloggerApplication;

/**
 * �Զ���Realm
 * @author java1234_С��
 *
 */
public class MyRealm extends AuthorizingRealm{

	
	//private BloggerService bloggerService;
	@Resource
	private BloggerApplication bloggerApplication;
	
	/**
	 * Ϊ����ǰ��¼���û������ɫ��Ȩ
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		return null;
	}

	/**
	 * ��֤��ǰ��¼���û�
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String userName=(String)token.getPrincipal();
		BloggerDTO bloggerDTO = bloggerApplication.findByUsername(userName);
		if (bloggerDTO != null) {
			SecurityUtils.getSubject().getSession().setAttribute("currentUser", bloggerDTO); // ��ǰ�û���Ϣ�浽session��
			AuthenticationInfo authcInfo=new SimpleAuthenticationInfo(bloggerDTO.getUserName(),bloggerDTO.getPassword(),"xx");
			return authcInfo;
		} else {
			return null;
		}
		/*Blogger blogger=bloggerService.getByUserName(userName);
		if(blogger!=null){
			SecurityUtils.getSubject().getSession().setAttribute("currentUser", blogger); // ��ǰ�û���Ϣ�浽session��
			AuthenticationInfo authcInfo=new SimpleAuthenticationInfo(blogger.getUserName(),blogger.getPassword(),"xx");
			return authcInfo;
		}else{
			return null;				
		}*/
	}

}
