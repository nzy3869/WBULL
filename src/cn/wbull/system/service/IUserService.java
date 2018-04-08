package cn.wbull.system.service;

import java.util.List;

import cn.wbull.system.model.User;
/**
 * 用户逻辑层
 * @author WBULL
 *
 */
public interface IUserService {
	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	public int insertUser(User user);
	/**
	 * 查询所有用户
	 * @return
	 */
	public List<User> getAllUsers();
	/**
	 * 根据uid查询用户
	 * @param uid
	 * @return
	 */
	public User getUserByUid(String uid);
	/**
	 * 通过ID删除用户
	 * @param id
	 * @return
	 */
	public int deleteUserById(int id);
	/**
	 * 修改用户信息
	 * @param user
	 * @return
	 */
	public int updateUser(User user);
}
