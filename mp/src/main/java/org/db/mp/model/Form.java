/**
 * 
 */
package org.db.mp.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.log4j.Logger;

/**
 * @author Satyam Sharan <satyam.sharan@hotmail.com>
 *
 */
@Entity
public class Form {
	static Logger logger = Logger.getLogger("mp");
	public Form() {
		super();
	}
	
	private int formNum;
	private Date dateCreated;
	
	//Many to One
	private FormStatus formStatus;

	private String name;
	private Date dateOfBirth;
	private Truth initiatedStatus;
	private Date dateOfInitiation;
	
	//Many to One
	private Country nationality;
	
	
	private String health;
	private int height;
	private int weight;
	private String educationalQualification;
	
	//Many to one
	private Gender gender;
	
	//Many to one
	private BloodGroup bloodGroup;
	
	//Many to one
	private RHFactor rhFactor;
	
	//Many to one
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
	
	//Many to one
	private Country officeCountry;

	private Date completionOfEducation;

	//Many to one
	private Truth dBResident;
	private Date dateOfLastDBVisit;
	
	//Many to one
	private Truth attendSatsang;
	
	//Many to one
	private Truth participateInSeva;
	private String sevaDetails;

	//Many to one
	private Truth vegetarian;
	
	//Many to one
	private Truth teetotaler;

	private String fathersName;
	private String paternalGrandFathersName;
	
	//Many to one
	private Truth paternalGrandFatherInitiated;
	private String paternalGrandMothersName;
	
	//Many to one
	private Truth paternalGrandMotherInitiated;
	
	//Many to one
	private Occupation fathersOccupation;
	
	private String fathersDesignation;
	private String fathersDepartment;
	private String fathersPlace;
	private int fathersMonthlyIncome;
	private String fathersAssetDetails;
	
	//Many to one
	private Truth fathersInitiated;
	
	private String fathersUid;
	private String fathersPlaceOfInitiation;
	private Date fathersDateOfFirstInitiation;
	private Date fathersDateOfSecondInitiation;
	
	//Many to one
	private Country fathersNationality;
	private String fathersEmail;
	private String fathersMobile;

	private String fathersSatsangSevaDetails;
	private String fathersLastZonalAttended;
	private String fathersOtherInfo;
	private String fathersInitiationPostCard;

	private String mothersName;
	private String maternalGrandFathersName;
	
	//Many to one
	private Truth maternalGrandFatherInitiated;
	private String maternalGrandMothersName;
	
	//Many to one
	private Truth maternalGeandMotherInitiated;
	
	//Many to one
	private Occupation mothersOccupation;
	private String mothersDesignation;
	private String mothersDepartment;
	private String mothersPlace;
	private int mothersMonthlyIncome;
	private String mothersAssetDetails;
	
	//Many to one
	private Truth mothersInitiated;
	private String mothersUid;
	private String mothersPlaceOfInitiation;
	private Date mothersDateOfFirstInitiation;
	private Date mothersDateOfSecondInitiation;
	
	
	//Many to one
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
	
	//Many to one
	private Country parentsCountry;

	private int preferedSpouseAge;
	private String preferedSpouseQualification;
	private String preferedSpouseOccupation;
	private String preferedSpousePersonality;
	private Date preferedTimeScheduleForMarriage;
	
	//Many to one
	private SelectionDecision selectionDecision;

	private int candidateBranchAttendance;
	private int candidateBranchAttendanceTotal;
	private String candidateSevaDetails;

	private Date candidateDateOfSignature;
	private String candidateNameOfSignatory;

	private Branch candidateBranch;
	private ApprovalStatus candidateSecretaryApproval;
	private String candidateSecretaryName;
	private String candidateSecretaryEmail;
	private String candidateSecretaryMobile;

	private int fathersBranchAttendance;
	private int fathersBranchAttendanceTotal;
	private String fathersSevaDetails;

	private int mothersBranchAttendance;
	private int mothersBranchAttendanceTotal;
	private String mothersSevaDetails;

	private Date parentsDateOfSignature;
	private String parentsNameOfSignatory;

	//Many to one
	private Branch parentsBranch;
	
	private String parentsNOC;
	
	//Many to one
	private ApprovalStatus parentsSecretaryApproval;
	
	private String parentsSecretaryName;
	private String parentsSecretaryEmail;
	private String parentsSecretaryMobile;

	private List<Sibling> siblings;

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getFormNum() {
		return formNum;
	}

	public void setFormNum(int formNum) {
		this.formNum = formNum;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="formStatus")
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

	@Temporal(TemporalType.TIMESTAMP)
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="initiatedStatus")
	public Truth getInitiatedStatus() {
		return initiatedStatus;
	}

	public void setInitiatedStatus(Truth initiatedStatus) {
		this.initiatedStatus = initiatedStatus;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getDateOfInitiation() {
		return dateOfInitiation;
	}

	public void setDateOfInitiation(Date dateOfInitiation) {
		this.dateOfInitiation = dateOfInitiation;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="nationality")
	public Country getNationality() {
		return nationality;
	}

	public void setNationality(Country nationality) {
		this.nationality = nationality;
	}

	public String getHealth() {
		return health;
	}

	public void setHealth(String health) {
		this.health = health;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getEducationalQualification() {
		return educationalQualification;
	}

	public void setEducationalQualification(String educationalQualification) {
		this.educationalQualification = educationalQualification;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="gender")
	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="bloodGroup")
	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="rhFactor")
	public RHFactor getRhFactor() {
		return rhFactor;
	}

	public void setRhFactor(RHFactor rhFactor) {
		this.rhFactor = rhFactor;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="occupation")
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

	@Temporal(TemporalType.TIMESTAMP)
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

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="officeCountryCode")
	public Country getOfficeCountry() {
		return officeCountry;
	}

	public void setOfficeCountry(Country officeCountry) {
		this.officeCountry = officeCountry;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getCompletionOfEducation() {
		return completionOfEducation;
	}

	public void setCompletionOfEducation(Date completionOfEducation) {
		this.completionOfEducation = completionOfEducation;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="dBResident")
	public Truth getdBResident() {
		return dBResident;
	}

	public void setdBResident(Truth dBResident) {
		this.dBResident = dBResident;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getDateOfLastDBVisit() {
		return dateOfLastDBVisit;
	}

	public void setDateOfLastDBVisit(Date dateOfLastDBVisit) {
		this.dateOfLastDBVisit = dateOfLastDBVisit;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="attendSatsang")
	public Truth getAttendSatsang() {
		return attendSatsang;
	}

	public void setAttendSatsang(Truth attendSatsang) {
		this.attendSatsang = attendSatsang;
	}
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="participateInSeva")
	public Truth getParticipateInSeva() {
		return participateInSeva;
	}

	public void setParticipateInSeva(Truth participateInSeva) {
		this.participateInSeva = participateInSeva;
	}

	public String getSevaDetails() {
		return sevaDetails;
	}

	public void setSevaDetails(String sevaDetails) {
		this.sevaDetails = sevaDetails;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="vegetarian")
	public Truth getVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(Truth vegetarian) {
		this.vegetarian = vegetarian;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="teetotaler")
	public Truth getTeetotaler() {
		return teetotaler;
	}

	public void setTeetotaler(Truth teetotaler) {
		this.teetotaler = teetotaler;
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

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="paternalGrandFatherInitiated")
	public Truth getPaternalGrandFatherInitiated() {
		return paternalGrandFatherInitiated;
	}

	public void setPaternalGrandFatherInitiated(Truth paternalGrandFatherInitiated) {
		this.paternalGrandFatherInitiated = paternalGrandFatherInitiated;
	}

	public String getPaternalGrandMothersName() {
		return paternalGrandMothersName;
	}

	public void setPaternalGrandMothersName(String paternalGrandMothersName) {
		this.paternalGrandMothersName = paternalGrandMothersName;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="paternalGrandMotherInitiated")
	public Truth getPaternalGrandMotherInitiated() {
		return paternalGrandMotherInitiated;
	}

	public void setPaternalGrandMotherInitiated(Truth paternalGrandMotherInitiated) {
		this.paternalGrandMotherInitiated = paternalGrandMotherInitiated;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="fathersOccupation")
	public Occupation getFathersOccupation() {
		return fathersOccupation;
	}

	public void setFathersOccupation(Occupation fathersOccupation) {
		this.fathersOccupation = fathersOccupation;
	}

	public String getFathersDesignation() {
		return fathersDesignation;
	}

	public void setFathersDesignation(String fathersDesignation) {
		this.fathersDesignation = fathersDesignation;
	}

	public String getFathersDepartment() {
		return fathersDepartment;
	}

	public void setFathersDepartment(String fathersDepartment) {
		this.fathersDepartment = fathersDepartment;
	}

	public String getFathersPlace() {
		return fathersPlace;
	}

	public void setFathersPlace(String fathersPlace) {
		this.fathersPlace = fathersPlace;
	}

	public int getFathersMonthlyIncome() {
		return fathersMonthlyIncome;
	}

	public void setFathersMonthlyIncome(int fathersMonthlyIncome) {
		this.fathersMonthlyIncome = fathersMonthlyIncome;
	}

	public String getFathersAssetDetails() {
		return fathersAssetDetails;
	}

	public void setFathersAssetDetails(String fathersAssetDetails) {
		this.fathersAssetDetails = fathersAssetDetails;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="fathersInitiated")
	public Truth getFathersInitiated() {
		return fathersInitiated;
	}

	public void setFathersInitiated(Truth fathersInitiated) {
		this.fathersInitiated = fathersInitiated;
	}

	public String getFathersUid() {
		return fathersUid;
	}

	public void setFathersUid(String fathersUid) {
		this.fathersUid = fathersUid;
	}

	public String getFathersPlaceOfInitiation() {
		return fathersPlaceOfInitiation;
	}

	public void setFathersPlaceOfInitiation(String fathersPlaceOfInitiation) {
		this.fathersPlaceOfInitiation = fathersPlaceOfInitiation;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getFathersDateOfFirstInitiation() {
		return fathersDateOfFirstInitiation;
	}

	public void setFathersDateOfFirstInitiation(Date fathersDateOfFirstInitiation) {
		this.fathersDateOfFirstInitiation = fathersDateOfFirstInitiation;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getFathersDateOfSecondInitiation() {
		return fathersDateOfSecondInitiation;
	}

	public void setFathersDateOfSecondInitiation(Date fathersDateOfSecondInitiation) {
		this.fathersDateOfSecondInitiation = fathersDateOfSecondInitiation;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="fathersNationality")
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

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="maternalGrandFatherInitiated")
	public Truth getMaternalGrandFatherInitiated() {
		return maternalGrandFatherInitiated;
	}

	public void setMaternalGrandFatherInitiated(Truth maternalGrandFatherInitiated) {
		this.maternalGrandFatherInitiated = maternalGrandFatherInitiated;
	}

	public String getMaternalGrandMothersName() {
		return maternalGrandMothersName;
	}

	public void setMaternalGrandMothersName(String maternalGrandMothersName) {
		this.maternalGrandMothersName = maternalGrandMothersName;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="maternalGeandMotherInitiated")
	public Truth getMaternalGeandMotherInitiated() {
		return maternalGeandMotherInitiated;
	}

	public void setMaternalGeandMotherInitiated(Truth maternalGeandMotherInitiated) {
		this.maternalGeandMotherInitiated = maternalGeandMotherInitiated;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="mothersOccupation")
	public Occupation getMothersOccupation() {
		return mothersOccupation;
	}

	public void setMothersOccupation(Occupation mothersOccupation) {
		this.mothersOccupation = mothersOccupation;
	}

	public String getMothersDesignation() {
		return mothersDesignation;
	}

	public void setMothersDesignation(String mothersDesignation) {
		this.mothersDesignation = mothersDesignation;
	}

	public String getMothersDepartment() {
		return mothersDepartment;
	}

	public void setMothersDepartment(String mothersDepartment) {
		this.mothersDepartment = mothersDepartment;
	}

	public String getMothersPlace() {
		return mothersPlace;
	}

	public void setMothersPlace(String mothersPlace) {
		this.mothersPlace = mothersPlace;
	}

	public int getMothersMonthlyIncome() {
		return mothersMonthlyIncome;
	}

	public void setMothersMonthlyIncome(int mothersMonthlyIncome) {
		this.mothersMonthlyIncome = mothersMonthlyIncome;
	}

	public String getMothersAssetDetails() {
		return mothersAssetDetails;
	}

	public void setMothersAssetDetails(String mothersAssetDetails) {
		this.mothersAssetDetails = mothersAssetDetails;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="mothersInitiated")
	public Truth getMothersInitiated() {
		return mothersInitiated;
	}

	public void setMothersInitiated(Truth mothersInitiated) {
		this.mothersInitiated = mothersInitiated;
	}

	public String getMothersUid() {
		return mothersUid;
	}

	public void setMothersUid(String mothersUid) {
		this.mothersUid = mothersUid;
	}

	public String getMothersPlaceOfInitiation() {
		return mothersPlaceOfInitiation;
	}

	public void setMothersPlaceOfInitiation(String mothersPlaceOfInitiation) {
		this.mothersPlaceOfInitiation = mothersPlaceOfInitiation;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getMothersDateOfFirstInitiation() {
		return mothersDateOfFirstInitiation;
	}

	public void setMothersDateOfFirstInitiation(Date mothersDateOfFirstInitiation) {
		this.mothersDateOfFirstInitiation = mothersDateOfFirstInitiation;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getMothersDateOfSecondInitiation() {
		return mothersDateOfSecondInitiation;
	}

	public void setMothersDateOfSecondInitiation(Date mothersDateOfSecondInitiation) {
		this.mothersDateOfSecondInitiation = mothersDateOfSecondInitiation;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="mothersNationality")
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

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="parentsCountryCode")
	public Country getParentsCountry() {
		return parentsCountry;
	}

	public void setParentsCountry(Country parentsCountry) {
		this.parentsCountry = parentsCountry;
	}

	public int getPreferedSpouseAge() {
		return preferedSpouseAge;
	}

	public void setPreferedSpouseAge(int preferedSpouseAge) {
		this.preferedSpouseAge = preferedSpouseAge;
	}

	public String getPreferedSpouseQualification() {
		return preferedSpouseQualification;
	}

	public void setPreferedSpouseQualification(String preferedSpouseQualification) {
		this.preferedSpouseQualification = preferedSpouseQualification;
	}

	public String getPreferedSpouseOccupation() {
		return preferedSpouseOccupation;
	}

	public void setPreferedSpouseOccupation(String preferedSpouseOccupation) {
		this.preferedSpouseOccupation = preferedSpouseOccupation;
	}

	public String getPreferedSpousePersonality() {
		return preferedSpousePersonality;
	}

	public void setPreferedSpousePersonality(String preferedSpousePersonality) {
		this.preferedSpousePersonality = preferedSpousePersonality;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getPreferedTimeScheduleForMarriage() {
		return preferedTimeScheduleForMarriage;
	}

	public void setPreferedTimeScheduleForMarriage(Date preferedTimeScheduleForMarriage) {
		this.preferedTimeScheduleForMarriage = preferedTimeScheduleForMarriage;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="selectionDecision")
	public SelectionDecision getSelectionDecision() {
		return selectionDecision;
	}

	public void setSelectionDecision(SelectionDecision selectionDecision) {
		this.selectionDecision = selectionDecision;
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

	@Temporal(TemporalType.TIMESTAMP)
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

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="candidateBranch")
	public Branch getCandidateBranch() {
		return candidateBranch;
	}

	public void setCandidateBranch(Branch candidateBranch) {
		this.candidateBranch = candidateBranch;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="candidateSecretaryApproval")
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

	@Temporal(TemporalType.TIMESTAMP)
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

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="parentsBranch")
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

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="parentsSecretaryApproval")
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
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "form")
	public List<Sibling> getSiblings() {
		return siblings;
	}

	public void setSiblings(List<Sibling> siblings) {
		this.siblings = siblings;
	}
	

	public static Form getRandomForm(){
		int random=new Random().nextInt(1000);
		Form form = new Form();
		form.setDateCreated(new Date());
		form.setFormStatus(new FormStatus(random%3+1));
		form.setInitiatedStatus(new Truth(random%2+1));
		form.setName("Test Name: "+ random);
		form.setDateOfBirth(new Date());
		form.setDateOfInitiation(new Date());
		form.setNationality(new Country());
		form.setEducationalQualification("Graduate");
		form.setGender(new Gender(random%2+1));
		form.setBloodGroup(new BloodGroup(random%3+1));
		form.setRhFactor(new RHFactor(random%2+1));
		form.setOccupation(new Occupation(random%5+1));
		form.setdBResident(new Truth(random%2+1));
		form.setOfficeCountry(new Country());
		form.setFathersOccupation(new Occupation(random%5+1));
		form.setMothersOccupation(new Occupation(random%5+1));
		form.setSelectionDecision(new SelectionDecision(random%3+1));
		form.setCandidateBranch(new Branch(1));
		form.setCandidateSecretaryApproval(new ApprovalStatus(random%3+1));
		form.setParentsBranch(new Branch(1));
		form.setParentsSecretaryApproval(new ApprovalStatus(random%3+1));
		form.setDateOfLastDBVisit(new Date());
		form.setAttendSatsang(new Truth(random%2+1));
		form.setParticipateInSeva(new Truth(random%2+1));
		form.setVegetarian(new Truth(random%2+1));
		form.setTeetotaler(new Truth(random%2+1));
		form.setFathersName("Father: "+random);
		form.setPaternalGrandFathersName("Paternal Grand Father: "+random);
		form.setFathersInitiated(new Truth(random%2+1));
		form.setFathersNationality(new Country());
		form.setFathersSatsangSevaDetails("Satsang and Seva Details: "+random);
		form.setFathersLastZonalAttended("Basnat 2015: "+random);
		form.setMothersName("Mother: "+random);
		form.setMaternalGrandFathersName("Maternal Grand Father: "+random);
		form.setMothersInitiated(new Truth(random%2+1));
		form.setMothersNationality(new Country());
		form.setMothersSatsangSevaDetails("Satsang and Seva Details: "+random);
		form.setMothersLastZonalAttended("Basnat 2015: "+random);
		
		form.setParentsBuildingNumber("Flat 207");
		form.setParentsStreet("Pocket 4, Sector 12");
		form.setParentsLocality("Dwarka");
		form.setParentsCity("New Delhi");
		form.setParentsDistrict("South West Delhi");
		form.setParentsState("Delhi");
		form.setParentsCountry(new Country());
		
		List<Sibling> siblings = new ArrayList<Sibling>();
		
		for(int i=0;i<(2+(new Random().nextInt(5)));i++){
			siblings.add(Sibling.getRandomSibling());
		}
		
		form.setSiblings(siblings);
		logger.info("Number of Siblings: " + siblings.size());
		return form;
	}
	
}
