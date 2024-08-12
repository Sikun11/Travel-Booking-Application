package com.tour;
import java.io.Serializable;
@SuppressWarnings("serial")
public class Userbean implements Serializable{
private  String uname,pwd,name,mid,st,cnt,pack,dt;
private Integer dys;
private Long mobno;

public Userbean() {}

public String getUname() {
	return uname;
}

public void setUname(String uname) {
	this.uname = uname;
}

public String getPwd() {
	return pwd;
}

public void setPwd(String pwd) {
	this.pwd = pwd;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getMid() {
	return mid;
}

public void setMid(String mid) {
	this.mid = mid;
}

public String getSt() {
	return st;
}

public void setSt(String st) {
	this.st = st;
}

public String getCnt() {
	return cnt;
}

public void setCnt(String cnt) {
	this.cnt = cnt;
}

public String getPack() {
	return pack;
}

public void setPack(String pack) {
	this.pack = pack;
}

public String getDt() {
	return dt;
}

public void setDt(String dt) {
	this.dt = dt;
}

public Integer getDys() {
	return dys;
}

public void setDys(Integer dys) {
	this.dys = dys;
}

public Long getMobno() {
	return mobno;
}

public void setMobno(Long mobno) {
	this.mobno = mobno;
}

@Override
public String toString() {
	return "Userbean [uname=" + uname + ", pwd=" + pwd + ", name=" + name + ", mid=" + mid + ", st=" + st + ", cnt="
			+ cnt + ", pack=" + pack + ", dt=" + dt + ", dys=" + dys + ", mobno=" + mobno + "]";
}


 
}

