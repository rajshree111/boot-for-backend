package com.cots.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="reboot")
public class PerformReboot {
	
	public PerformReboot() {
		
	}
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer bladeId;
	
	private String actionName;
	
	public Integer getBladeId() {
		return bladeId;
	}

	public void setBladeId(Integer bladeId) {
		this.bladeId = bladeId;
	}

	public String getActionName() {
		return actionName;
	}

	public void setActionName(String actionName) {
		this.actionName = actionName;
	}


}
