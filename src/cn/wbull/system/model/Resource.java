package cn.wbull.system.model;

import java.io.Serializable;

/**
 * 资源模型
 * @author WBULL
 *
 */
public class Resource implements Serializable{

	private int id;
	/**
	 * 资源名
	 */
	private String reid;
	/**
	 * 中文资源名
	 */
	private String rename;
	/**
	 * 类型
	 */
	private String type;
	/**
	 * 启用状态
	 */
	private String enabled;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 父id
	 */
	private int pid;
	/**
	 * 资源值
	 */
	private String revalue;
	/**
	 * 是否叶子节点
	 */
	private String leaf;
	public Resource() {
		super();
	}
	public Resource(int id, String reid, String rename, String type, String enabled, String remark, int pid,
			String revalue, String leaf) {
		super();
		this.id = id;
		this.reid = reid;
		this.rename = rename;
		this.type = type;
		this.enabled = enabled;
		this.remark = remark;
		this.pid = pid;
		this.revalue = revalue;
		this.leaf = leaf;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReid() {
		return reid;
	}
	public void setReid(String reid) {
		this.reid = reid;
	}
	public String getRename() {
		return rename;
	}
	public void setRename(String rename) {
		this.rename = rename;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEnabled() {
		return enabled;
	}
	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getRevalue() {
		return revalue;
	}
	public void setRevalue(String revalue) {
		this.revalue = revalue;
	}
	public String getLeaf() {
		return leaf;
	}
	public void setLeaf(String leaf) {
		this.leaf = leaf;
	}
	
	
	
}
