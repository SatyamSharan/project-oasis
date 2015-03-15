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
@Table(name = "CommonMaster")
public class Truth {
	public Truth() {
		super();
	}

	private int commonCode=24;
	private String value;
	private String type = "TRUTH";

	@Id
	public int getCommonCode() {
		return commonCode;
	}

	public void setCommonCode(int commonCode) {
		this.commonCode = commonCode;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
