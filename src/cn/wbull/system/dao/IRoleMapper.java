package cn.wbull.system.dao;

import java.util.List;

import cn.wbull.system.model.Role;
/**
 * 角色持久层
 * @author WBULL
 *
 */
public interface IRoleMapper {
	/**
	 * 获取所有角色
	 * @return
	 */
	public List<Role> getAllRoles();
	/**
	 * 根据用户uid获取角色
	 * @param uid
	 * @return
	 */
	public List<Role> getRoleByUid(int uid);
	/**
	 * 删除角色
	 * @param roid
	 * @return
	 */
	public int deleteRoleByRoid(int roid);
	/**
	 * 添加新角色
	 * @param role
	 * @return
	 */
	public int addRole(Role role);
	/**
	 * 修改角色
	 * @param role
	 * @return
	 */
	public int updateRole(Role role);
}
