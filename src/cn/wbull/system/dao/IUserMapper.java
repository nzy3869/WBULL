package cn.wbull.system.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;

import cn.wbull.system.model.User;
/**
 * 用户持久层
 * @author WBULL
 *
 */
public interface IUserMapper {
	/**
	 * 插入用户
	 * @param user
	 * @return
	 */
	//@Insert("INSERT INTO t_s_user (uid,uname,sex,tel,enabled,password,create_date,remark) VALUES (#{uid},#{uname},#{sex},#{tel},#{enabled},#{password},#{createDate},#{remark})")
	public int addUser(User user);
	/**
	 * 获取所有用户
	 * @return
	 */
	public List<User> getAllUsers();
	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
	public int deleteUser(int id);
	/**
	 * 修改用户信息
	 * @param user
	 * @return
	 */
	public int updateUser(User user);
	/**
	 * 用过用户名查找用户
	 * @param uid
	 * @return
	 */
	public User getUserByUid(String uid);
}
