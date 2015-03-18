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
public class CandidateSecretaryJSON {
	public CandidateSecretaryJSON() {
		super();
	}

	public CandidateSecretaryJSON(Form form) {
		this.setFormAJSON(new FormAJSON(form));

		this.setCandidateBranchAttendance(form.getCandidateBranchAttendance());
		this.setCandidateBranchAttendanceTotal(form.getCandidateBranchAttendanceTotal());
		this.setCandidateSevaDetails(form.getCandidateSevaDetails());

		this.setCandidateSecretaryApproval(form.getCandidateSecretaryApproval());
		this.setCandidateSecretaryName(form.getCandidateSecretaryName());
		this.setCandidateSecretaryEmail(form.getCandidateSecretaryEmail());
		this.setCandidateSecretaryMobile(form.getCandidateSecretaryMobile());
		this.setCandidateSecretaryRemarks(form.getCandidateSecretaryRemarks());
	}

	private FormAJSON formAJSON;

	private int candidateBranchAttendance;
	private int candidateBranchAttendanceTotal;
	private String candidateSevaDetails;

	private ApprovalStatus candidateSecretaryApproval;
	private String candidateSecretaryName;
	private String candidateSecretaryEmail;
	private String candidateSecretaryMobile;
	private String candidateSecretaryRemarks;

	public FormAJSON getFormAJSON() {
		return formAJSON;
	}

	public void setFormAJSON(FormAJSON formAJSON) {
		this.formAJSON = formAJSON;
	}

	public int getCandidateBranchAttendance() {
		return candidateBranchAttendance;
	}

	public void setCandidateBranchAttendance(int candidateBranchAttendance) {
		this.candidateBranchAttendance = candidateBranchAttendance;
	}

	public int getCandidateBranchAttendanceTotal() {
		return candidateBranchAttendanceTotal;
	}

	public void setCandidateBranchAttendanceTotal(int candidateBranchAttendanceTotal) {
		this.candidateBranchAttendanceTotal = candidateBranchAttendanceTotal;
	}

	public String getCandidateSevaDetails() {
		return candidateSevaDetails;
	}

	public void setCandidateSevaDetails(String candidateSevaDetails) {
		this.candidateSevaDetails = candidateSevaDetails;
	}

	public ApprovalStatus getCandidateSecretaryApproval() {
		return candidateSecretaryApproval;
	}

	public void setCandidateSecretaryApproval(ApprovalStatus candidateSecretaryApproval) {
		this.candidateSecretaryApproval = candidateSecretaryApproval;
	}

	public String getCandidateSecretaryName() {
		return candidateSecretaryName;
	}

	public void setCandidateSecretaryName(String candidateSecretaryName) {
		this.candidateSecretaryName = candidateSecretaryName;
	}

	public String getCandidateSecretaryEmail() {
		return candidateSecretaryEmail;
	}

	public void setCandidateSecretaryEmail(String candidateSecretaryEmail) {
		this.candidateSecretaryEmail = candidateSecretaryEmail;
	}

	public String getCandidateSecretaryMobile() {
		return candidateSecretaryMobile;
	}

	public void setCandidateSecretaryMobile(String candidateSecretaryMobile) {
		this.candidateSecretaryMobile = candidateSecretaryMobile;
	}

	public String getCandidateSecretaryRemarks() {
		return candidateSecretaryRemarks;
	}

	public void setCandidateSecretaryRemarks(String candidateSecretaryRemarks) {
		this.candidateSecretaryRemarks = candidateSecretaryRemarks;
	}

	public Form updateForm(Form form) {

		form.setCandidateBranchAttendance(this.getCandidateBranchAttendance());
		form.setCandidateBranchAttendanceTotal(this.getCandidateBranchAttendanceTotal());
		form.setCandidateSevaDetails(this.getCandidateSevaDetails());

		form.setCandidateSecretaryApproval(this.getCandidateSecretaryApproval());
		form.setCandidateSecretaryName(this.getCandidateSecretaryName());
		form.setCandidateSecretaryEmail(this.getCandidateSecretaryEmail());
		form.setCandidateSecretaryMobile(this.getCandidateSecretaryMobile());
		form.setCandidateSecretaryRemarks(this.getCandidateSecretaryRemarks());
		
		return form;
	}

}
