package com.ckc.mybatis.l3.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String username;
	private String password;
	private String realName;
	private String gender;
	private Date birthday;
	private String phoneNumber;
	private String address;
	private Date registTime;
	private Integer state;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getRegistTime() {
		return registTime;
	}
	public void setRegistTime(Date registTime) {
		this.registTime = registTime;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public User() {
		super();
	}
	public User(Integer id, String username, String password, String realName, String gender, Date birthday,
			String phoneNumber, String address, Date registTime, Integer state) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.realName = realName;
		this.gender = gender;
		this.birthday = birthday;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.registTime = registTime;
		this.state = state;
	}
	
	public User(String username, String password, String realName, String gender, Date birthday, String phoneNumber,
			String address) {
		super();
		this.username = username;
		this.password = password;
		this.realName = realName;
		this.gender = gender;
		this.birthday = birthday;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", realName=" + realName
				+ ", gender=" + gender + ", birthday=" + birthday + ", phoneNumber=" + phoneNumber + ", address="
				+ address + ", registTime=" + registTime + ", state=" + state + "]";
	}
	
}
