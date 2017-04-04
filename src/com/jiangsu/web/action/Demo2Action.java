package com.jiangsu.web.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 动态参数封装，第一种情况：
 * 		数据模型与动作类写在一起
 * @author jiangsu
 *
 */
public class Demo2Action extends ActionSupport {
	
	private String username;
	private int age;
	
	public void addUser() {
		System.out.println("username:"+username+";"+"age:"+age);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
