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

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Satyam Sharan <satyam.sharan@hotmail.com>
 *
 */

@Entity
public class Sibling {

	private int siblingId;
	private Form form;
	private SiblingType type;
	private Date dateOfBirth;
	private Truth maritalStatus;
	private Date dateOfMarriage;
	private Truth throughMarriagePanchayat;
	private Truth registeredInMarriagePanchayat;
	private Truth satsangiFamily;
	private String reasons;
	private String name;
	private Truth initiatedStatus;
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
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="type")
	public SiblingType getType() {
		return type;
	}
	public void setType(SiblingType type) {
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
	public Truth getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(Truth maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	public Date getDateOfMarriage() {
		return dateOfMarriage;
	}
	public void setDateOfMarriage(Date dateOfMarriage) {
		this.dateOfMarriage = dateOfMarriage;
	}
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="throughMarriagePanchayat")
	public Truth getThroughMarriagePanchayat () {
		return throughMarriagePanchayat;
	}
	public void setThroughMarriagePanchayat (Truth throughMarriagePanchayat) {
		this.throughMarriagePanchayat = throughMarriagePanchayat;
	}
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="registeredInMarriagePanchayat")
	public Truth getRegisteredInMarriagePanchayat() {
		return registeredInMarriagePanchayat;
	}
	public void setRegisteredInMarriagePanchayat(Truth registeredInMarriagePanchayat) {
		this.registeredInMarriagePanchayat = registeredInMarriagePanchayat;
	}
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="satsangiFamily")
	public Truth getSatsangiFamily() {
		return satsangiFamily;
	}
	public void setSatsangiFamily(Truth satsangiFamily) {
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
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="initiatedStatus")
	public Truth getInitiatedStatus() {
		return initiatedStatus;
	}
	public void setInitiatedStatus(Truth initiatedStatus) {
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
		sibling.setType(new SiblingType(random%2+1));
		sibling.setDateOfBirth(new Date());
		sibling.setMaritalStatus(new Truth(random%2+1));
		sibling.setDateOfMarriage(new Date());
		sibling.setThroughMarriagePanchayat(new Truth(random%2+1));
		sibling.setRegisteredInMarriagePanchayat(new Truth(random%2+1));
		sibling.setSatsangiFamily(new Truth(random%2+1));
		
		sibling.setReasons("Random reason");
		sibling.setName("Test Sibling: "+random);
		sibling.setInitiatedStatus(new Truth(random%2+1));
		sibling.setOccupation(new  Occupation(random%5+1));
		
		return sibling;
	}
}
