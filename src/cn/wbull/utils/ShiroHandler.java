package cn.wbull.utils;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequestMapping("/shiro")
public class ShiroHandler {
	@RequestMapping("/login")
	public String login(@RequestParam("username") String username,
			@RequestParam("password") String password) {
		
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
                //unexpected condition?  error? 
            	
            	System.out.println("登录失败"+ae.getMessage());
            	return "index";
            }
        }
		
		return "success";
	}
	
}
