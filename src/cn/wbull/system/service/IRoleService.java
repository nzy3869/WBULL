package cn.wbull.system.service;

import java.util.List;

import cn.wbull.system.model.Role;

/**
 * 角色逻辑层
 * @author WBULL
 *
 */
public interface IRoleService {
	/**
	 * 添加一个角色
	 * @param role
	 * @return
	 */
	public int addRole(Role role);
	/**
	 * 删除一个角色
	 * @param roid
	 * @return
	 */
	public int deleteRoleByRoid(int roid);
	/**
	 * 获取所有角色
	 * @return
	 */
	public List<Role> getAllRoles();
	/**
	 * 通过用户ID获取该用户角色
	 * @param uid
	 * @return
	 */
	public List<Role> getRoleByUid(int uid);
	/**
	 * 修改角色
	 * @param roid
	 * @return
	 */
	public int updateRole(Role role);
}
