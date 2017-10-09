package com.artek.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="empTable")
public class EmployeeDto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int eid;
	@Column
private String name;
	@Column
private String mobNo;
	@OneToMany(fetch=FetchType.LAZY,targetEntity=AddressDto.class, cascade=CascadeType.ALL)
	@JoinColumn(name="eid",referencedColumnName="eid")
private List<AddressDto> listAdd;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public List<AddressDto> getListAdd() {
		return listAdd;
	}
	public void setListAdd(List<AddressDto> listAdd) {
		this.listAdd = listAdd;
	}

}
