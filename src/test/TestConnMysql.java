package test;

import cn.wbull.system.model.User;
import cn.wbull.system.service.IUserService;
import cn.wbull.system.service.impl.UserServiceImpl;

public class TestConnMysql {
	public static void main(String[] args) {
		User user = new User();
		user.setUid("nzy");
		user.setUname("牛志远");
		user.setPassword("nzy");
		IUserService userService = new UserServiceImpl();
		int i = userService.insertUser(user);
		System.out.println(i);
	}
	
}
