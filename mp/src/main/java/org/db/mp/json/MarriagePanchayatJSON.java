/**
 * 
 */
package org.db.mp.json;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.db.mp.model.ApprovalStatus;
import org.db.mp.model.Branch;
import org.db.mp.model.Country;
import org.db.mp.model.Form;
import org.db.mp.model.FormStatus;
import org.db.mp.model.Occupation;
import org.db.mp.model.Sibling;
import org.springframework.beans.BeanUtils;

/**
 * @author Satyam Sharan <satyam.sharan@hotmail.com>
 *
 */
public class MarriagePanchayatJSON {

	public MarriagePanchayatJSON() {
		super();
	}
	
	public MarriagePanchayatJSON(Form form) {
		BeanUtils.copyProperties(form, this);
	}

	private int formNum;
	private Date dateCreated=new Date();

	// Many to One
	private FormStatus formStatus= new FormStatus();

	private String name;
	private Date dateOfBirth;
	private boolean initiatedStatus;
	private Date dateOfInitiation;

	// Many to One
	private Country nationality;

	private String educationalQualification;

	// Many to one
	private boolean gender;

	// Many to one
	private Occupation occupation;

	private String nameOfEmployer;
	private Date dateOfJoining;
	private String designation;
	private int emoluments;
	private String businessDetails;
	private int businessIncome;

	private String officeBuildingNumber;
	private String officeStreet;
	private String officeLocality;
	private String officeCity;
	private String officeDistrict;
	private String officeState;

	// Many to one
	private Country officeCountry;

	// Many to one
	private boolean dBResident;

	// Many to one
	private boolean attendSatsang;

	// Many to one
	private boolean participateInSeva;
	private String sevaDetails;

	private Date dateOfLastDBVisit;

	// Many to one
	private boolean vegetarian;

	// Many to one
	private boolean teetotaler;

	// Many to one
	private Branch candidateBranch;

	private Date candidateDateOfSignature;
	private String candidateNameOfSignatory;

	private List<Sibling> siblings;

	private String fathersName;
	private String paternalGrandFathersName;
	// Many to one
	private boolean fathersInitiated;
	private Date fathersDateOfFirstInitiation;
	private String fathersUid;
	// Many to one
	private Country fathersNationality;

	private String fathersEmail;
	private String fathersMobile;

	private String fathersSatsangSevaDetails;
	private String fathersLastZonalAttended;
	private String fathersOtherInfo;
	private String fathersInitiationPostCard;

	private String mothersName;
	private String maternalGrandFathersName;
	// Many to one
	private boolean mothersInitiated;
	private Date mothersDateOfFirstInitiation;
	private String mothersUid;
	// Many to one
	private Country mothersNationality;

	private String mothersEmail;
	private String mothersMobile;

	private String mothersSatsangSevaDetails;
	private String mothersLastZonalAttended;
	private String mothersOtherInfo;
	private String mothersInitiationPostCard;

	private String parentsBuildingNumber;
	private String parentsStreet;
	private String parentsLocality;
	private String parentsCity;
	private String parentsDistrict;
	private String parentsState;

	// Many to one
	private Country parentsCountry;

	// Many to one
	private Branch parentsBranch;

	private String parentsNOC;

	private Date parentsDateOfSignature;
	private String parentsNameOfSignatory;
	
	
	private ApprovalStatus candidateSecretaryApproval;
	private String candidateSecretaryName;
	private String candidateSecretaryEmail;
	private String candidateSecretaryMobile;

	
	// Many to one
	private ApprovalStatus parentsSecretaryApproval;

	private String parentsSecretaryName;
	private String parentsSecretaryEmail;
	private String parentsSecretaryMobile;

	public int getFormNum() {
		return formNum;
	}

	public void setFormNum(int formNum) {
		this.formNum = formNum;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public FormStatus getFormStatus() {
		return formStatus;
	}

	public void setFormStatus(FormStatus formStatus) {
		this.formStatus = formStatus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public boolean isInitiatedStatus() {
		return initiatedStatus;
	}

	public void setInitiatedStatus(boolean initiatedStatus) {
		this.initiatedStatus = initiatedStatus;
	}

	public Date getDateOfInitiation() {
		return dateOfInitiation;
	}

	public void setDateOfInitiation(Date dateOfInitiation) {
		this.dateOfInitiation = dateOfInitiation;
	}

	public Country getNationality() {
		return nationality;
	}

	public void setNationality(Country nationality) {
		this.nationality = nationality;
	}

	public String getEducationalQualification() {
		return educationalQualification;
	}

	public void setEducationalQualification(String educationalQualification) {
		this.educationalQualification = educationalQualification;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public Occupation getOccupation() {
		return occupation;
	}

	public void setOccupation(Occupation occupation) {
		this.occupation = occupation;
	}

	public String getNameOfEmployer() {
		return nameOfEmployer;
	}

	public void setNameOfEmployer(String nameOfEmployer) {
		this.nameOfEmployer = nameOfEmployer;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getEmoluments() {
		return emoluments;
	}

	public void setEmoluments(int emoluments) {
		this.emoluments = emoluments;
	}

	public String getBusinessDetails() {
		return businessDetails;
	}

	public void setBusinessDetails(String businessDetails) {
		this.businessDetails = businessDetails;
	}

	public int getBusinessIncome() {
		return businessIncome;
	}

	public void setBusinessIncome(int businessIncome) {
		this.businessIncome = businessIncome;
	}

	public String getOfficeBuildingNumber() {
		return officeBuildingNumber;
	}

	public void setOfficeBuildingNumber(String officeBuildingNumber) {
		this.officeBuildingNumber = officeBuildingNumber;
	}

	public String getOfficeStreet() {
		return officeStreet;
	}

	public void setOfficeStreet(String officeStreet) {
		this.officeStreet = officeStreet;
	}

	public String getOfficeLocality() {
		return officeLocality;
	}

	public void setOfficeLocality(String officeLocality) {
		this.officeLocality = officeLocality;
	}

	public String getOfficeCity() {
		return officeCity;
	}

	public void setOfficeCity(String officeCity) {
		this.officeCity = officeCity;
	}

	public String getOfficeDistrict() {
		return officeDistrict;
	}

	public void setOfficeDistrict(String officeDistrict) {
		this.officeDistrict = officeDistrict;
	}

	public String getOfficeState() {
		return officeState;
	}

	public void setOfficeState(String officeState) {
		this.officeState = officeState;
	}

	public Country getOfficeCountry() {
		return officeCountry;
	}

	public void setOfficeCountry(Country officeCountry) {
		this.officeCountry = officeCountry;
	}

	public boolean isdBResident() {
		return dBResident;
	}

	public void setdBResident(boolean dBResident) {
		this.dBResident = dBResident;
	}

	public boolean isAttendSatsang() {
		return attendSatsang;
	}

	public void setAttendSatsang(boolean attendSatsang) {
		this.attendSatsang = attendSatsang;
	}

	public boolean isParticipateInSeva() {
		return participateInSeva;
	}

	public void setParticipateInSeva(boolean participateInSeva) {
		this.participateInSeva = participateInSeva;
	}

	public String getSevaDetails() {
		return sevaDetails;
	}

	public void setSevaDetails(String sevaDetails) {
		this.sevaDetails = sevaDetails;
	}

	public Date getDateOfLastDBVisit() {
		return dateOfLastDBVisit;
	}

	public void setDateOfLastDBVisit(Date dateOfLastDBVisit) {
		this.dateOfLastDBVisit = dateOfLastDBVisit;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	public boolean isTeetotaler() {
		return teetotaler;
	}

	public void setTeetotaler(boolean teetotaler) {
		this.teetotaler = teetotaler;
	}

	public Branch getCandidateBranch() {
		return candidateBranch;
	}

	public void setCandidateBranch(Branch candidateBranch) {
		this.candidateBranch = candidateBranch;
	}

	public Date getCandidateDateOfSignature() {
		return candidateDateOfSignature;
	}

	public void setCandidateDateOfSignature(Date candidateDateOfSignature) {
		this.candidateDateOfSignature = candidateDateOfSignature;
	}

	public String getCandidateNameOfSignatory() {
		return candidateNameOfSignatory;
	}

	public void setCandidateNameOfSignatory(String candidateNameOfSignatory) {
		this.candidateNameOfSignatory = candidateNameOfSignatory;
	}

	public List<Sibling> getSiblings() {
		return siblings;
	}

	public void setSiblings(List<Sibling> siblings) {
		this.siblings = siblings;
	}

	public String getFathersName() {
		return fathersName;
	}

	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}

	public String getPaternalGrandFathersName() {
		return paternalGrandFathersName;
	}

	public void setPaternalGrandFathersName(String paternalGrandFathersName) {
		this.paternalGrandFathersName = paternalGrandFathersName;
	}

	public boolean isFathersInitiated() {
		return fathersInitiated;
	}

	public void setFathersInitiated(boolean fathersInitiated) {
		this.fathersInitiated = fathersInitiated;
	}

	public Date getFathersDateOfFirstInitiation() {
		return fathersDateOfFirstInitiation;
	}

	public void setFathersDateOfFirstInitiation(Date fathersDateOfFirstInitiation) {
		this.fathersDateOfFirstInitiation = fathersDateOfFirstInitiation;
	}

	public String getFathersUid() {
		return fathersUid;
	}

	public void setFathersUid(String fathersUid) {
		this.fathersUid = fathersUid;
	}

	public Country getFathersNationality() {
		return fathersNationality;
	}

	public void setFathersNationality(Country fathersNationality) {
		this.fathersNationality = fathersNationality;
	}

	public String getFathersEmail() {
		return fathersEmail;
	}

	public void setFathersEmail(String fathersEmail) {
		this.fathersEmail = fathersEmail;
	}

	public String getFathersMobile() {
		return fathersMobile;
	}

	public void setFathersMobile(String fathersMobile) {
		this.fathersMobile = fathersMobile;
	}

	public String getFathersSatsangSevaDetails() {
		return fathersSatsangSevaDetails;
	}

	public void setFathersSatsangSevaDetails(String fathersSatsangSevaDetails) {
		this.fathersSatsangSevaDetails = fathersSatsangSevaDetails;
	}

	public String getFathersLastZonalAttended() {
		return fathersLastZonalAttended;
	}

	public void setFathersLastZonalAttended(String fathersLastZonalAttended) {
		this.fathersLastZonalAttended = fathersLastZonalAttended;
	}

	public String getFathersOtherInfo() {
		return fathersOtherInfo;
	}

	public void setFathersOtherInfo(String fathersOtherInfo) {
		this.fathersOtherInfo = fathersOtherInfo;
	}

	public String getFathersInitiationPostCard() {
		return fathersInitiationPostCard;
	}

	public void setFathersInitiationPostCard(String fathersInitiationPostCard) {
		this.fathersInitiationPostCard = fathersInitiationPostCard;
	}

	public String getMothersName() {
		return mothersName;
	}

	public void setMothersName(String mothersName) {
		this.mothersName = mothersName;
	}

	public String getMaternalGrandFathersName() {
		return maternalGrandFathersName;
	}

	public void setMaternalGrandFathersName(String maternalGrandFathersName) {
		this.maternalGrandFathersName = maternalGrandFathersName;
	}

	public boolean isMothersInitiated() {
		return mothersInitiated;
	}

	public void setMothersInitiated(boolean mothersInitiated) {
		this.mothersInitiated = mothersInitiated;
	}

	public Date getMothersDateOfFirstInitiation() {
		return mothersDateOfFirstInitiation;
	}

	public void setMothersDateOfFirstInitiation(Date mothersDateOfFirstInitiation) {
		this.mothersDateOfFirstInitiation = mothersDateOfFirstInitiation;
	}

	public String getMothersUid() {
		return mothersUid;
	}

	public void setMothersUid(String mothersUid) {
		this.mothersUid = mothersUid;
	}

	public Country getMothersNationality() {
		return mothersNationality;
	}

	public void setMothersNationality(Country mothersNationality) {
		this.mothersNationality = mothersNationality;
	}

	public String getMothersEmail() {
		return mothersEmail;
	}

	public void setMothersEmail(String mothersEmail) {
		this.mothersEmail = mothersEmail;
	}

	public String getMothersMobile() {
		return mothersMobile;
	}

	public void setMothersMobile(String mothersMobile) {
		this.mothersMobile = mothersMobile;
	}

	public String getMothersSatsangSevaDetails() {
		return mothersSatsangSevaDetails;
	}

	public void setMothersSatsangSevaDetails(String mothersSatsangSevaDetails) {
		this.mothersSatsangSevaDetails = mothersSatsangSevaDetails;
	}

	public String getMothersLastZonalAttended() {
		return mothersLastZonalAttended;
	}

	public void setMothersLastZonalAttended(String mothersLastZonalAttended) {
		this.mothersLastZonalAttended = mothersLastZonalAttended;
	}

	public String getMothersOtherInfo() {
		return mothersOtherInfo;
	}

	public void setMothersOtherInfo(String mothersOtherInfo) {
		this.mothersOtherInfo = mothersOtherInfo;
	}

	public String getMothersInitiationPostCard() {
		return mothersInitiationPostCard;
	}

	public void setMothersInitiationPostCard(String mothersInitiationPostCard) {
		this.mothersInitiationPostCard = mothersInitiationPostCard;
	}

	public String getParentsBuildingNumber() {
		return parentsBuildingNumber;
	}

	public void setParentsBuildingNumber(String parentsBuildingNumber) {
		this.parentsBuildingNumber = parentsBuildingNumber;
	}

	public String getParentsStreet() {
		return parentsStreet;
	}

	public void setParentsStreet(String parentsStreet) {
		this.parentsStreet = parentsStreet;
	}

	public String getParentsLocality() {
		return parentsLocality;
	}

	public void setParentsLocality(String parentsLocality) {
		this.parentsLocality = parentsLocality;
	}

	public String getParentsCity() {
		return parentsCity;
	}

	public void setParentsCity(String parentsCity) {
		this.parentsCity = parentsCity;
	}

	public String getParentsDistrict() {
		return parentsDistrict;
	}

	public void setParentsDistrict(String parentsDistrict) {
		this.parentsDistrict = parentsDistrict;
	}

	public String getParentsState() {
		return parentsState;
	}

	public void setParentsState(String parentsState) {
		this.parentsState = parentsState;
	}

	public Country getParentsCountry() {
		return parentsCountry;
	}

	public void setParentsCountry(Country parentsCountry) {
		this.parentsCountry = parentsCountry;
	}

	public Branch getParentsBranch() {
		return parentsBranch;
	}

	public void setParentsBranch(Branch parentsBranch) {
		this.parentsBranch = parentsBranch;
	}

	public String getParentsNOC() {
		return parentsNOC;
	}

	public void setParentsNOC(String parentsNOC) {
		this.parentsNOC = parentsNOC;
	}

	public Date getParentsDateOfSignature() {
		return parentsDateOfSignature;
	}

	public void setParentsDateOfSignature(Date parentsDateOfSignature) {
		this.parentsDateOfSignature = parentsDateOfSignature;
	}

	public String getParentsNameOfSignatory() {
		return parentsNameOfSignatory;
	}

	public void setParentsNameOfSignatory(String parentsNameOfSignatory) {
		this.parentsNameOfSignatory = parentsNameOfSignatory;
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

	public static MarriagePanchayatJSON getRandomCandidate() {
		int random = new Random().nextInt(1000);
		MarriagePanchayatJSON formAJSON = new MarriagePanchayatJSON();
		formAJSON.setDateCreated(new Date());
		formAJSON.setFormStatus(new FormStatus(random % 3 + 1));
		formAJSON.setName("Test Name: " + random);
		formAJSON.setDateOfBirth(new Date());
		formAJSON.setDateOfInitiation(new Date());
		formAJSON.setNationality(new Country());
		formAJSON.setEducationalQualification("Graduate");
		formAJSON.setOccupation(new Occupation(random % 5 + 1));
		formAJSON.setOfficeCountry(new Country());
		formAJSON.setCandidateBranch(new Branch(1));
		formAJSON.setParentsBranch(new Branch(1));
		formAJSON.setDateOfLastDBVisit(new Date());
		formAJSON.setFathersName("Father: " + random);
		formAJSON.setPaternalGrandFathersName("Paternal Grand Father: " + random);
		formAJSON.setFathersNationality(new Country());
		formAJSON.setFathersSatsangSevaDetails("Satsang and Seva Details: " + random);
		formAJSON.setFathersLastZonalAttended("Basnat 2015: " + random);
		formAJSON.setMothersName("Mother: " + random);
		formAJSON.setMaternalGrandFathersName("Maternal Grand Father: " + random);
		formAJSON.setMothersNationality(new Country());
		formAJSON.setMothersSatsangSevaDetails("Satsang and Seva Details: " + random);
		formAJSON.setMothersLastZonalAttended("Basnat 2015: " + random);

		formAJSON.setParentsBuildingNumber("Flat 207");
		formAJSON.setParentsStreet("Pocket 4, Sector 12");
		formAJSON.setParentsLocality("Dwarka");
		formAJSON.setParentsCity("New Delhi");
		formAJSON.setParentsDistrict("South West Delhi");
		formAJSON.setParentsState("Delhi");
		formAJSON.setParentsCountry(new Country());

		List<Sibling> siblings = new ArrayList<Sibling>();

		for (int i = 0; i < (2 + (new Random().nextInt(5))); i++) {
			siblings.add(Sibling.getRandomSibling());
		}

		formAJSON.setSiblings(siblings);
		return formAJSON;
	}
}
