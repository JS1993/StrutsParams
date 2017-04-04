package com.jiangsu.web.action;

import com.jiangsu.domain.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 动态参数封装，第二种情况：
 * 		数据模型与动作类分开写
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
