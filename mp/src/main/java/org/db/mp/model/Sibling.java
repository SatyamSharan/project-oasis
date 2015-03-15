/**
 * 
 */
package org.db.mp.model;

import java.util.Date;

import javax.persistence.Id;

/**
 * @author Satyam Sharan <satyam.sharan@hotmail.com>
 *
 */
public class Sibling {

	private int siblingId;
	private int type;
	private Date dateOfBirth;
	private boolean maritalStatus;
	private Date dateOfMarriage;
	private boolean throughMarriagePanchayat;
	private boolean registeredInMarriagePanchayat;
	private boolean satsangiFamily;
	private String reasons;
	private String name;
	private boolean initiatedStatus;
	private String occupation;
	
	@Id
	public int getSiblingId() {
		return siblingId;
	}
	public void setSiblingId(int siblingId) {
		this.siblingId = siblingId;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public boolean isMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(boolean maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public Date getDateOfMarriage() {
		return dateOfMarriage;
	}
	public void setDateOfMarriage(Date dateOfMarriage) {
		this.dateOfMarriage = dateOfMarriage;
	}
	public boolean isThroughMarriagePanchayat () {
		return throughMarriagePanchayat;
	}
	public void setThroughMarriagePanchayat (boolean throughMarriagePanchayat) {
		this.throughMarriagePanchayat = throughMarriagePanchayat;
	}
	public boolean isRegisteredInMarriagePanchayat() {
		return registeredInMarriagePanchayat;
	}
	public void setRegisteredInMarriagePanchayat(boolean registeredInMarriagePanchayat) {
		this.registeredInMarriagePanchayat = registeredInMarriagePanchayat;
	}
	public boolean isSatsangiFamily() {
		return satsangiFamily;
	}
	public void setSatsangiFamily(boolean satsangiFamily) {
		this.satsangiFamily = satsangiFamily;
	}
	public String getReasons() {
		return reasons;
	}
	public void setReasons(String reasons) {
		this.reasons = reasons;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isInitiatedStatus() {
		return initiatedStatus;
	}
	public void setInitiatedStatus(boolean initiatedStatus) {
		this.initiatedStatus = initiatedStatus;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
}
