package cn.wbull.system.service;

import java.util.List;

import cn.wbull.system.model.Resource;
/**
 * 资源持久层
 * @author WBULL
 *
 */
public interface IResourceService {
	/**
	 * 添加一个资源
	 * @param resource
	 * @return
	 */
	public int addResource(Resource resource);
	/**
	 * 删除一个资源
	 * @param reid
	 * @return
	 */
	public int deleteResource(String reid);
	/**
	 * 获取所有资源
	 * @return
	 */
	public List<Resource> getAllResources();
	/**
	 * 根据角色id获取资源
	 * @param roid
	 * @return
	 */
	public List<Resource> getResourceByRole(int roid);
	/**
	 * 修改资源
	 * @param resource
	 * @return
	 */
	public int updateResource(Resource resource);
}
