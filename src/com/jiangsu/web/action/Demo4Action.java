package com.jiangsu.web.action;

import com.jiangsu.domain.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 动态参数封装，第三种情况：模型驱动
 * 		要想使用模型驱动，必须数据模型与动作类分开写
 * 实现模型驱动的步骤：
 * 		1.实现一个ModelDriven的接口
 * 		2.实现接口中的抽象方法getModel()
 * 		3.在使用模型驱动的时候，数据模型必须由我们自己来实例化
 * 
 * 是由一个ModelDriven的拦截器为我们做的
 * 
 * 实际开发中采用的方式
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
