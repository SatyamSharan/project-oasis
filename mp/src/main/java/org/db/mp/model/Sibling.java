/**
 * 
 */
package org.db.mp.model;

import java.util.Date;
import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Satyam Sharan <satyam.sharan@hotmail.com>
 *
 */

@Entity
public class Sibling {

	private int siblingId;
	private Form form;
	private boolean type;
	private Date dateOfBirth;
	private MaritalStatus maritalStatus;
	private Date dateOfMarriage;
	private boolean throughMarriagePanchayat;
	private boolean registeredInMarriagePanchayat;
	private boolean satsangiFamily;
	private String reasons;
	private String name;
	private boolean initiatedStatus;
	private Occupation occupation;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getSiblingId() {
		return siblingId;
	}
	public void setSiblingId(int siblingId) {
		this.siblingId = siblingId;
	}
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="formNum")
	public Form getForm() {
		return form;
	}
	public void setForm(Form form) {
		this.form = form;
	}
	
	@Type(type="yes_no")
	public boolean isType() {
		return type;
	}
	public void setType(boolean type) {
		this.type = type;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="maritalStatus")
	public MaritalStatus getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	public Date getDateOfMarriage() {
		return dateOfMarriage;
	}
	public void setDateOfMarriage(Date dateOfMarriage) {
		this.dateOfMarriage = dateOfMarriage;
	}
	
	@Type(type="yes_no")
	public boolean isThroughMarriagePanchayat () {
		return throughMarriagePanchayat;
	}
	public void setThroughMarriagePanchayat (boolean throughMarriagePanchayat) {
		this.throughMarriagePanchayat = throughMarriagePanchayat;
	}
	
	@Type(type="yes_no")
	public boolean isRegisteredInMarriagePanchayat() {
		return registeredInMarriagePanchayat;
	}
	public void setRegisteredInMarriagePanchayat(boolean registeredInMarriagePanchayat) {
		this.registeredInMarriagePanchayat = registeredInMarriagePanchayat;
	}
	
	@Type(type="yes_no")
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
	
	@Type(type="yes_no")
	public boolean isInitiatedStatus() {
		return initiatedStatus;
	}
	public void setInitiatedStatus(boolean initiatedStatus) {
		this.initiatedStatus = initiatedStatus;
	}
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="occupation")
	public Occupation getOccupation() {
		return occupation;
	}
	public void setOccupation(Occupation occupation) {
		this.occupation = occupation;
	}
	
	public static Sibling getRandomSibling(){
		
		int random=new Random().nextInt(1000);
		Sibling sibling = new Sibling();
		sibling.setDateOfBirth(new Date());
		sibling.setMaritalStatus(new MaritalStatus(random%2+1));
		sibling.setDateOfMarriage(new Date());
		
		sibling.setReasons("Random reason");
		sibling.setName("Test Sibling: "+random);
		sibling.setOccupation(new  Occupation(random%5+1));
		
		return sibling;
	}
}
