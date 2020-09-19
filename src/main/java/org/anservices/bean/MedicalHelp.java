package org.anservices.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "help")
public class MedicalHelp {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="szhelpId")
	private Integer helpId;
	@Column(name="szuserId")
	private Integer userId;
	@Column(name="szpname")
	private String pname;
	@Column(name="szrname")
	private String rname;
	@Column(name="szphone")
	private String phone;
	@Column(name="szrequirement")
	private String requirement;
	@Column(name="szrequirementdesc")
	private String descreq;
	@Column(name="szaddress")
	private String address;
	@Column(name="szstate")
	private String state;
	@Column(name="szdistrict")
	private String district;
	@Column(name="sztaluka")
	private String taluka;
	@Column(name="szcity")
	private String city;
	@Column(name="szpincode")
	private String pincode;
	public MedicalHelp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getHelpId() {
		return helpId;
	}
	public void setHelpId(Integer helpId) {
		this.helpId = helpId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRequirement() {
		return requirement;
	}
	public void setRequirement(String requirement) {
		this.requirement = requirement;
	}
	public String getDescreq() {
		return descreq;
	}
	public void setDescreq(String descreq) {
		this.descreq = descreq;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getTaluka() {
		return taluka;
	}
	public void setTaluka(String taluka) {
		this.taluka = taluka;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
}
