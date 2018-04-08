package cn.wbull.system.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.wbull.system.model.User;
import cn.wbull.system.service.IUserService;

	
	
@Controller
public class SystemController {
	@Autowired
	private IUserService userService;

	/**
	 * 登录认证
	 * @param username
	 * @param password
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/login")
	public String login(@RequestParam("username") String username, @RequestParam("password") String password)
			throws Exception {

		Subject subject = SecurityUtils.getSubject();

		if (!subject.isAuthenticated()) {
			// 把用户名和密码封装为 UsernamePasswordToken 对象
			UsernamePasswordToken token = new UsernamePasswordToken(username, password);
			// rememberme
			token.setRememberMe(false);
			try {
				// 执行登录.
				subject.login(token);
			}
			// 所有认证时异常的父类.
			catch (AuthenticationException ae) {
				// unexpected condition? error?
				System.out.println("登录失败" + ae.getMessage());
				return "login";
			}
		}
		return "index";

	}
	@RequestMapping("/register")
	public String register(User user) {
		user.setEnable("Y");
		int i = userService.insertUser(user);
		if(i!=0) {
			return "login";
		}else {
			System.out.println("注册失败");
			return "register";
		}
		
		
	}
	/**
	 * 进入首页
	 * @return
	 */
	@RequestMapping("/index")
	public String index() {
		return "login";
	}
	
	/**
	 * 进入注册页面
	 * @return
	 */
	@RequestMapping("/toRegister")
	public String toRegister() {
		return "register";
	}
	@RequestMapping("/test")
	public String testMethod() {
		System.out.println("这里是test方法");
		return "success";
	}
	
}
