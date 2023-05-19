package com.ust.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Vendor {
	@Id
	private String v_id;
	public String getV_id() {
		return v_id;
	}
	public void setV_id(String v_id) {
		this.v_id = v_id;
	}
	public String getV_name() {
		return v_name;
	}
	public void setV_name(String v_name) {
		this.v_name = v_name;
	}
	public String getV_mob() {
		return v_mob;
	}
	public void setV_mob(String v_mob) {
		this.v_mob = v_mob;
	}
	public String getV_location() {
		return v_location;
	}
	public void setV_location(String v_location) {
		this.v_location = v_location;
	}
	public String getE_id() {
		return e_id;
	}
	public void setE_id(String e_id) {
		this.e_id = e_id;
	}
	public Long getE_idrate() {
		return e_idrate;
	}
	public void setE_idrate(Long e_idrate) {
		this.e_idrate = e_idrate;
	}
	private String v_name;
	private String v_mob;
	private String v_location;
	private String e_id;
	private Long e_idrate;
	

}
