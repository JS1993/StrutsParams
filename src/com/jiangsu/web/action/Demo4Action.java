package com.jiangsu.web.action;

import com.jiangsu.domain.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * ��̬������װ�������������ģ������
 * 		Ҫ��ʹ��ģ����������������ģ���붯����ֿ�д
 * ʵ��ģ�������Ĳ��裺
 * 		1.ʵ��һ��ModelDriven�Ľӿ�
 * 		2.ʵ�ֽӿ��еĳ��󷽷�getModel()
 * 		3.��ʹ��ģ��������ʱ������ģ�ͱ����������Լ���ʵ����
 * 
 * ����һ��ModelDriven��������Ϊ��������
 * 
 * ʵ�ʿ����в��õķ�ʽ
 * @author jiangsu
 *
 */

public class Demo4Action extends ActionSupport implements ModelDriven<User> {
	
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

	@Override
	public User getModel() {
		
		return user;
	}
	
	
}
