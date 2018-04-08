package cn.wbull.system.model;

import java.io.Serializable;

/**
 * 用户模型
 * @author WBULL
 *
 */
public class User implements Serializable{

	/**
	 * 用户id
	 */
	private int id;
	/**
	 * 用户名
	 */
	private String uid;
	/**
	 * 中文名
	 */
	private String uname;
	/**
	 * 性别
	 */
	private String sex;
	/**
	 * 电话
	 */
	private String tel;
	/**
	 * 启用状态
	 */
	private String enabled;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 创建时间
	 */
	private String createDate;
	/**
	 * 备注
	 */
	private String remark;
	public User() {
		super();
	}
	public User(int id, String uid, String uname, String sex, String tel, String enabled, String password,
			String createDate, String remark) {
		super();
		this.id = id;
		this.uid = uid;
		this.uname = uname;
		this.sex = sex;
		this.tel = tel;
		this.enabled = enabled;
		this.password = password;
		this.createDate = createDate;
		this.remark = remark;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEnabled() {
		return enabled;
	}
	public void setEnable(String enabled) {
		this.enabled = enabled;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
