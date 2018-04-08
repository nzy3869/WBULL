package cn.wbull.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.wbull.system.dao.IUserMapper;
import cn.wbull.system.model.User;
import cn.wbull.system.service.IUserService;
@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private IUserMapper userMapper;
	@Override
	public int insertUser(User user) {
		return userMapper.addUser(user);
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userMapper.getAllUsers();
	}

	@Override
	public User getUserByUid(String uid) {
		// TODO Auto-generated method stub
		return userMapper.getUserByUid(uid);
	}

	@Override
	public int deleteUserById(int id) {
		// TODO Auto-generated method stub
		return userMapper.deleteUser(id);
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.updateUser(user);
	}


}
