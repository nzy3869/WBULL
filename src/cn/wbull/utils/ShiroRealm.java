package cn.wbull.utils;

import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import cn.wbull.system.model.Resource;
import cn.wbull.system.model.Role;
import cn.wbull.system.model.User;
import cn.wbull.system.service.IResourceService;
import cn.wbull.system.service.IRoleService;
import cn.wbull.system.service.IUserService;

public class ShiroRealm extends AuthorizingRealm {
	@Autowired
	private IUserService userService;
	@Autowired
	private IRoleService roleService;
	@Autowired
	private IResourceService resourceService;
	/**
	 * 认证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		
		UsernamePasswordToken upToken = (UsernamePasswordToken)token;
		
		String username = upToken.getUsername();
		
		//从数据库中获取username 
		//System.out.println("从数据库中获取username :"+username+"所对应用户信息");
		User user = userService.getUserByUid(username);
		if(user==null) {
			throw new UnknownAccountException("用户不存在");
		}
		if(user.getEnabled().equals("N")) {
			throw new LockedAccountException("用户被锁定");
		}
		//以下信息是从数据库中获取的
		//1).principal:认证的实体信息，可以是username
		Object principal = user;
		//2).credentials:密码
		Object credentials = user.getPassword();
		//当前realm对象的name，调用父类getName()方法即可
		String realmName = getName();
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(principal, credentials, realmName);
		return info;
	}
	/**
	 * 授权
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// TODO Auto-generated method stub
		User user = (User)principals.getPrimaryPrincipal();
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		//User user = userService.getUserByUid(user.getUid());
		System.out.println("测试是否被调用");
		List<Role> roles = roleService.getRoleByUid(user.getId());
			for (Role role : roles) {
			info.addRole(role.getRoid());
			List<Resource> resources = resourceService.getResourceByRole(role.getId());
			
			for (Resource resource : resources) {
				if(resource.getRevalue()!=null&&!resource.getRevalue().equals(""))
				info.addStringPermission(resource.getRevalue());
			}
		}
		//return info;
		System.out.println("授权");
		return info;
	}

}
