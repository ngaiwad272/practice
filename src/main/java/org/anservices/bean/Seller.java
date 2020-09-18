package org.anservices.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name = "sell")
public class Seller {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="szsellid")
	private Integer sellerId;
	@Column(name="szuserid")
	private Integer userId;
	@Column(name="szphone")
	private String phone;
	@Column(name="sztype")
	private String sellType;
	@Column(name="szsubtype")
	private String sellSubType;
	@Column(name="szaddress")
	private String address;
	@Column(name="sztilldate")
	private String tillDate;
	@Column(name="szactive")
	private Integer active;
	
	@Transient  
	private MultipartFile sImage; 
	
	@Column(name="szimage1") 
	private byte[] imageBytes;
	 
	
	 public byte[] getImageBytes() { 
		 return imageBytes; 
	 } 
	 public void setImageBytes(byte[] imageBytes) { 
		 this.imageBytes = imageBytes; 
	}
	 
	public Seller() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
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
	public Integer getSellerId() {
		return sellerId;
	}
	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getSellType() {
		return sellType;
	}
	public void setSellType(String sellType) {
		this.sellType = sellType;
	}
	public String getSellSubType() {
		return sellSubType;
	}
	public void setSellSubType(String sellSubType) {
		this.sellSubType = sellSubType;
	}
	
	public MultipartFile getsImage() { 
		return sImage; 
	} 
	public void setsImage(MultipartFile sImage) { 
		this.sImage = sImage; 
	}
	 
}