package org.anservices.bean;

public class Buyer {
	private Integer buyerId;
	private Integer userId;
	private String phone;
	private String buyType;
	private String buySubType;
	private String address;
	private String tillDate;
	private Integer active;
	public Integer getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(Integer buyerId) {
		this.buyerId = buyerId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBuyType() {
		return buyType;
	}
	public void setBuyType(String buyType) {
		this.buyType = buyType;
	}
	public String getBuySubType() {
		return buySubType;
	}
	public void setBuySubType(String buySubType) {
		this.buySubType = buySubType;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTillDate() {
		return tillDate;
	}
	public void setTillDate(String tillDate) {
		this.tillDate = tillDate;
	}
	public Integer getActive() {
		return active;
	}
	public void setActive(Integer active) {
		this.active = active;
	}
}
