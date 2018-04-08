package cn.wbull.system.dao;

import java.util.List;

import cn.wbull.system.model.Resource;
/**
 * 资源持久层
 * @author WBULL
 *
 */
public interface IResourceMapper {
	/**
	 * 添加一个资源
	 * @param resource
	 * @return
	 */
	public int addResource(Resource resource);
	/**
	 * 根据资源id删除一个资源
	 * @param reid
	 * @return
	 */
	public int deleteResourceByReid(String reid);
	/**
	 * 获取该用户的所有资源
	 * @param uid
	 * @return
	 */
	public List<Resource> getResourceByRoid(int roid);
	/**
	 * 获取所有资源
	 * @return
	 */
	public List<Resource> getAllResources();
	/**
	 * 修改资源
	 * @param resource
	 * @return
	 */
	public int updateResource(Resource resource);
}
