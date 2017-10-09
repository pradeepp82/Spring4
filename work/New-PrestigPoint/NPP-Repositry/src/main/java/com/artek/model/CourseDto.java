package com.artek.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="courseTable")

public class CourseDto {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer cid;
@Column
private String cName;
@Column
private String facalityName;
@Column
private String cStartDate;
@Column
private String cEndDate;
public Integer getCid() {
	return cid;
}
public void setCid(Integer cid) {
	this.cid = cid;
}
public String getcName() {
	return cName;
}
public void setcName(String cName) {
	this.cName = cName;
}
public String getFacalityName() {
	return facalityName;
}
public void setFacalityName(String facalityName) {
	this.facalityName = facalityName;
}
public String getcStartDate() {
	return cStartDate;
}
public void setcStartDate(String cStartDate) {
	this.cStartDate = cStartDate;
}
public String getcEndDate() {
	return cEndDate;
}
public void setcEndDate(String cEndDate) {
	this.cEndDate = cEndDate;
}




}
