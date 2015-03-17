/**
 * 
 */
package org.db.mp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Satyam Sharan <satyam.sharan@hotmail.com>
 *
 */
@Entity
@Table(name = "BloodGroupMaster")
public class BloodGroup {
	public BloodGroup() {
		super();
	}
	public BloodGroup(int code) {
		this.code=code;
	}
	
	private int code=1;
	private String value;
	
	@Id
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
