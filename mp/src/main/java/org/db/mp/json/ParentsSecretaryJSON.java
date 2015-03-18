/**
 * 
 */
package org.db.mp.json;

import org.db.mp.model.ApprovalStatus;
import org.db.mp.model.Form;

/**
 * @author Satyam Sharan <satyam.sharan@hotmail.com>
 *
 */
public class ParentsSecretaryJSON {

	public ParentsSecretaryJSON() {
		super();
	}

	public ParentsSecretaryJSON(Form form) {
		this.setFormAJSON(new FormAJSON(form));
		this.setFathersBranchAttendance(form.getFathersBranchAttendance());
		this.setFathersBranchAttendanceTotal(form.getFathersBranchAttendanceTotal());
		this.setFathersSevaDetails(form.getFathersSevaDetails());

		this.setMothersBranchAttendance(form.getMothersBranchAttendance());
		this.setMothersBranchAttendanceTotal(form.getMothersBranchAttendanceTotal());
		this.setMothersSevaDetails(form.getMothersSevaDetails());

		this.setParentsSecretaryApproval(form.getParentsSecretaryApproval());
		this.setParentsSecretaryName(form.getParentsSecretaryName());
		this.setParentsSecretaryEmail(form.getParentsSecretaryEmail());
		this.setParentsSecretaryMobile(form.getParentsSecretaryMobile());
		this.setParentsSecretaryRemarks(form.getParentsSecretaryRemarks());
	}

	private FormAJSON formAJSON;

	private int fathersBranchAttendance;
	private int fathersBranchAttendanceTotal;
	private String fathersSevaDetails;

	private int mothersBranchAttendance;
	private int mothersBranchAttendanceTotal;
	private String mothersSevaDetails;

	// Many to one
	private ApprovalStatus parentsSecretaryApproval;

	private String parentsSecretaryName;
	private String parentsSecretaryEmail;
	private String parentsSecretaryMobile;
	private String parentsSecretaryRemarks;

	public FormAJSON getFormAJSON() {
		return formAJSON;
	}

	public void setFormAJSON(FormAJSON formAJSON) {
		this.formAJSON = formAJSON;
	}

	public int getFathersBranchAttendance() {
		return fathersBranchAttendance;
	}

	public void setFathersBranchAttendance(int fathersBranchAttendance) {
		this.fathersBranchAttendance = fathersBranchAttendance;
	}

	public int getFathersBranchAttendanceTotal() {
		return fathersBranchAttendanceTotal;
	}

	public void setFathersBranchAttendanceTotal(int fathersBranchAttendanceTotal) {
		this.fathersBranchAttendanceTotal = fathersBranchAttendanceTotal;
	}

	public String getFathersSevaDetails() {
		return fathersSevaDetails;
	}

	public void setFathersSevaDetails(String fathersSevaDetails) {
		this.fathersSevaDetails = fathersSevaDetails;
	}

	public int getMothersBranchAttendance() {
		return mothersBranchAttendance;
	}

	public void setMothersBranchAttendance(int mothersBranchAttendance) {
		this.mothersBranchAttendance = mothersBranchAttendance;
	}

	public int getMothersBranchAttendanceTotal() {
		return mothersBranchAttendanceTotal;
	}

	public void setMothersBranchAttendanceTotal(int mothersBranchAttendanceTotal) {
		this.mothersBranchAttendanceTotal = mothersBranchAttendanceTotal;
	}

	public String getMothersSevaDetails() {
		return mothersSevaDetails;
	}

	public void setMothersSevaDetails(String mothersSevaDetails) {
		this.mothersSevaDetails = mothersSevaDetails;
	}

	public ApprovalStatus getParentsSecretaryApproval() {
		return parentsSecretaryApproval;
	}

	public void setParentsSecretaryApproval(ApprovalStatus parentsSecretaryApproval) {
		this.parentsSecretaryApproval = parentsSecretaryApproval;
	}

	public String getParentsSecretaryName() {
		return parentsSecretaryName;
	}

	public void setParentsSecretaryName(String parentsSecretaryName) {
		this.parentsSecretaryName = parentsSecretaryName;
	}

	public String getParentsSecretaryEmail() {
		return parentsSecretaryEmail;
	}

	public void setParentsSecretaryEmail(String parentsSecretaryEmail) {
		this.parentsSecretaryEmail = parentsSecretaryEmail;
	}

	public String getParentsSecretaryMobile() {
		return parentsSecretaryMobile;
	}

	public void setParentsSecretaryMobile(String parentsSecretaryMobile) {
		this.parentsSecretaryMobile = parentsSecretaryMobile;
	}


	public String getParentsSecretaryRemarks() {
		return parentsSecretaryRemarks;
	}

	public void setParentsSecretaryRemarks(String parentsSecretaryRemarks) {
		this.parentsSecretaryRemarks = parentsSecretaryRemarks;
	}

	
	public Form updateForm(Form form) {

		form.setFathersBranchAttendance(this.getFathersBranchAttendance());
		form.setFathersBranchAttendanceTotal(this.getFathersBranchAttendanceTotal());
		form.setFathersSevaDetails(this.getFathersSevaDetails());

		form.setMothersBranchAttendance(this.getMothersBranchAttendance());
		form.setMothersBranchAttendanceTotal(this.getMothersBranchAttendanceTotal());
		form.setMothersSevaDetails(this.getMothersSevaDetails());

		form.setParentsSecretaryApproval(this.getParentsSecretaryApproval());
		form.setParentsSecretaryName(this.getParentsSecretaryName());
		form.setParentsSecretaryEmail(this.getParentsSecretaryEmail());
		form.setParentsSecretaryMobile(this.getParentsSecretaryMobile());
		form.setParentsSecretaryRemarks(this.getParentsSecretaryRemarks());
		
		return form;
	}

}
