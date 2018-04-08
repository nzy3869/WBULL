package cn.wbull.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.wbull.system.dao.IResourceMapper;
import cn.wbull.system.model.Resource;
import cn.wbull.system.service.IResourceService;
@Service
public class ResourceServiceImpl implements IResourceService {
	
	@Autowired
	private IResourceMapper resourceMapper;
	@Override
	public int addResource(Resource resource) {
		// TODO Auto-generated method stub
		return resourceMapper.addResource(resource);
	}

	@Override
	public int deleteResource(String reid) {
		// TODO Auto-generated method stub
		return resourceMapper.deleteResourceByReid(reid);
	}

	@Override
	public List<Resource> getAllResources() {
		// TODO Auto-generated method stub
		return resourceMapper.getAllResources();
	}

	@Override
	public List<Resource> getResourceByRole(int roid) {
		// TODO Auto-generated method stub
		return resourceMapper.getResourceByRoid(roid);
	}

	@Override
	public int updateResource(Resource resource) {
		// TODO Auto-generated method stub
		return resourceMapper.updateResource(resource);
	}

}
