package cn.wbull.system.model;

import java.beans.Transient;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * 角色模型
 * @author WBULL
 *
 */
public class Role implements Serializable {

	private int id;
	 /**
     * 角色名
     */
	private String roid;
	 /**
     * 角色中文名
     */
	private String roname;
	 /**
     * 状态
     */
	private String enabled;
    /**
     * 创建时间
     */
	private String createDate;
    /**
     * 修改时间
     */
	private String updateDate;
    /**
     * 备注
     */
	private String remark;

	private List<User> users = new ArrayList<User>();
	
	private List<Resource> resources = new ArrayList<Resource>();


	public Role(int id, String roid, String roname, String enabled, String createDate, String updateDate, String remark,
			List<User> users, List<Resource> resources) {
		super();
		this.id = id;
		this.roid = roid;
		this.roname = roname;
		this.enabled = enabled;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.remark = remark;
		this.users = users;
		this.resources = resources;
	}

	public List<Resource> getResources() {
		return resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}

	public Role() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRoid() {
		return roid;
	}

	public void setRoid(String roid) {
		this.roid = roid;
	}

	public String getRoname() {
		return roname;
	}

	public void setRoname(String roname) {
		this.roname = roname;
	}

	public String getEnabled() {
		return enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	
}
