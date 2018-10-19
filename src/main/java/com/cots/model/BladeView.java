package com.cots.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="bladeview")
public class BladeView {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer bladeId;
	
	
	private String powerStatus;
	private boolean appStatus;
	
	
	public BladeView() {
		
	}
	
	
//	public BladeView(int bladeId,String powerStatus,boolean appStatus,boolean operStatus) {
//		
//		this.bladeId=bladeId;
//		this.powerStatus=powerStatus;
//		this.appStatus=appStatus;
//		this.operStatus=operStatus;
//	}
//	
	public Integer getBladeId() {
		return bladeId;
	}
	public void setBladeId(int bladeId) {
		this.bladeId = bladeId;
	}
	public String getPowerStatus() {
		return powerStatus;
	}
	public void setPowerStatus(String powerStatus) {
		this.powerStatus = powerStatus;
	}
	public boolean isAppStatus() {
		return appStatus;
	}
	public void setAppStatus(boolean appStatus) {
		this.appStatus = appStatus;
	}

	}
