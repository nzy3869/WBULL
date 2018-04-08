package cn.wbull.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.wbull.system.dao.IRoleMapper;
import cn.wbull.system.model.Role;
import cn.wbull.system.service.IRoleService;
@Service
public class RoleServiceImpl implements IRoleService {
	@Autowired
	private IRoleMapper roleMapper;
	
	@Override
	public List<Role> getAllRoles() {
		// TODO Auto-generated method stub
		return roleMapper.getAllRoles();
	}

	@Override
	public List<Role> getRoleByUid(int uid) {
		// TODO Auto-generated method stub
		return roleMapper.getRoleByUid(uid);
	}



	@Override
	public int addRole(Role role) {
		// TODO Auto-generated method stub
		return roleMapper.addRole(role);
	}



	@Override
	public int deleteRoleByRoid(int roid) {
		// TODO Auto-generated method stub
		return roleMapper.deleteRoleByRoid(roid);
	}

	@Override
	public int updateRole(Role role) {
		// TODO Auto-generated method stub
		return roleMapper.updateRole(role);
	}

}
