package com.jiangsu.web.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * ��̬������װ����һ�������
 * 		����ģ���붯����д��һ��
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
