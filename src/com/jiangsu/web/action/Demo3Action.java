package com.jiangsu.web.action;

import com.jiangsu.domain.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ��̬������װ���ڶ��������
 * 		����ģ���붯����ֿ�д
 * @author jiangsu
 *
 */
public class Demo3Action extends ActionSupport {
	private User user = new User();
	
	public void addUser() {
		System.out.println(user.getUsername()+user.getAge());
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
