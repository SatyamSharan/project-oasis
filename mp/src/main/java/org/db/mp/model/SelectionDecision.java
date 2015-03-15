/**
 * 
 */
package org.db.mp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

/**
 * @author Satyam Sharan <satyam.sharan@hotmail.com>
 *
 */
@Entity
@Table(name = "CommonMaster")
@DynamicUpdate
public class SelectionDecision {
	public SelectionDecision() {
		super();
	}
	
	public SelectionDecision(int commonCode) {
		this.commonCode=commonCode;
	}

	private int commonCode;
	private String value;
	private String type = "SELECTION_DECISION";

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
