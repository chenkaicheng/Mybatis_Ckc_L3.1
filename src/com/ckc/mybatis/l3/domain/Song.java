package com.ckc.mybatis.l3.domain;

import java.io.Serializable;
import java.util.Date;

public class Song implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private User singer;
	private String style;
	private Date createTime;
	private int state;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User getSinger() {
		return singer;
	}
	public void setSinger(User singer) {
		this.singer = singer;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public Song() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Song(Integer id, String name, User singer, String style, Date createTime, int state) {
		super();
		this.id = id;
		this.name = name;
		this.singer = singer;
		this.style = style;
		this.createTime = createTime;
		this.state = state;
	}
	public Song(String name, User singer, String style) {
		super();
		this.name = name;
		this.singer = singer;
		this.style = style;
	}
	@Override
	public String toString() {
		return "SongMapper [id=" + id + ", name=" + name + ", singer=" + singer + ", style=" + style + ", createTime="
				+ createTime + ", state=" + state + "]";
	}
	
}
