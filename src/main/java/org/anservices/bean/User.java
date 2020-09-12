package org.anservices.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="szuserid")
	private Integer userId;
	@Column(name="szname")
	private String name;
	@Column(name="szemail")
	private String email;
	@Column(name="szphone")
	private String phone;
	@Column(name="szusername")
	private String uname;
	@Column(name="szpassword")
	private String password;
	@Column(name="szcpassword")
	private String cpassword;
	@Column(name="crole")
	private Integer role;
	@Column(name="cactive")
	private Integer active;
	@Column(name="clogin")
	private Integer loginStatus;
	private Byte[] szimage1;
	@Column(name="szrollflag")
	private String rolFlag;
	
	public String getRolFlag() {
		return rolFlag;
	}
	public void setRolFlag(String rolFlag) {
		this.rolFlag = rolFlag;
	}
	public Byte[] getSzimage1() {
		return szimage1;
	}
	public void setSzimage1(Byte[] szimage1) {
		this.szimage1 = szimage1;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	public Integer getRole() {
		return role;
	}
	public void setRole(Integer role) {
		this.role = role;
	}
	public Integer getActive() {
		return active;
	}
	public void setActive(Integer active) {
		this.active = active;
	}
	public Integer getLoginStatus() {
		return loginStatus;
	}
	public void setLoginStatus(Integer loginStatus) {
		this.loginStatus = loginStatus;
	}
	
}
