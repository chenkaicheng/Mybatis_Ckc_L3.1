package com.ckc.mybatis.l3.condition;

import java.io.Serializable;
import java.util.Date;

public class UserGenderBirthday implements Serializable {
	private static final long serialVersionUID = 1L;
	private String gender;
	private Date birthday;

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

}
