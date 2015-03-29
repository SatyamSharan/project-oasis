drop database omp;
create database omp;
use omp;

create table CountryMaster(
	`code` INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`value` VARCHAR(255) NOT NULL
);

create table BloodGroupMaster(
	`code` INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`value` VARCHAR(255) NOT NULL
);

create table OccupationMaster(
	`code` INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`value` VARCHAR(255) NOT NULL
);

create table ApprovalStatusMaster(
	`code` INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`value` VARCHAR(255) NOT NULL
);

create table FormStatusMaster(
	`code` INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`value` VARCHAR(255) NOT NULL
);

create table SelectionDecisionMaster(
	`code` INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`value` VARCHAR(255) NOT NULL
);

create table MaritalStatusMaster(
	`code` INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`value` VARCHAR(255) NOT NULL
);

create table BranchMaster(
	`code` INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(255) NOT NULL,
	city VARCHAR(255) NOT NULL,
	state VARCHAR(255) NOT NULL,
	countryCode int NOT NULL,
	secretaryName VARCHAR(255) NOT NULL,
	mobile VARCHAR(50),
	email VARCHAR(255),
	FOREIGN KEY (countryCode) REFERENCES CountryMaster (`code`)
);


CREATE TABLE Form(	
	formNum INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	dateCreated DATETIME NOT NULL,
	dateSubmitted DATETIME,
	formStatus INT NOT NULL,
	
	name VARCHAR(255) NOT NULL,
	dateOfBirth DATETIME NOT NULL,
	initiatedStatus CHAR(1) NOT NULL,
	dateOfInitiation DATETIME NOT NULL,
	nationality INT NOT NULL,
	health VARCHAR(255),
	height INT,
	weight INT,
	educationalQualification VARCHAR(255) NOT NULL,
	gender CHAR(1) NOT NULL,
	bloodGroup INT,
	occupation INT NOT NULL,
	nameOfEmployer VARCHAR(255),
	dateOfJoining DATETIME,
	designation VARCHAR(255),
	emoluments INT,
	businessDetails VARCHAR(255),
	businessIncome INT,
	
	officeBuildingNumber VARCHAR(255),
	officeStreet VARCHAR(255),
	officeLocality VARCHAR(255),
	officeCity VARCHAR(255),
	officeDistrict VARCHAR(255),
	officeState VARCHAR(255), 
	officeCountryCode INT,
	
	completionOfEducation DATETIME,
	
	dBResident CHAR(1) NOT NULL,
	dateOfLastDBVisit DATETIME NOT NULL,
	attendSatsang CHAR(1) NOT NULL,
	participateInSeva CHAR(1) NOT NULL,
	sevaDetails VARCHAR(255),
	
	vegetarian CHAR(1) NOT NULL,
	teetotaler CHAR(1) NOT NULL,
	
	
	
	fathersName VARCHAR(255) NOT NULL,
	paternalGrandFathersName VARCHAR(255) NOT NULL,
	paternalGrandFatherInitiated CHAR(1),
	paternalGrandMothersName VARCHAR(255),
	paternalGrandMotherInitiated CHAR(1),
	fathersOccupation INT,
	fathersDesignation VARCHAR(255),
	fathersDepartment VARCHAR(255),
	fathersPlace VARCHAR(255),
	fathersMonthlyIncome INT,
	fathersAssetDetails VARCHAR(255),
	fathersInitiated CHAR(1) NOT NULL,
	fathersUid VARCHAR(255),
	fathersPlaceOfInitiation VARCHAR(255),
	fathersDateOfFirstInitiation DATETIME,
	fathersDateOfSecondInitiation DATETIME,
	fathersNationality INT  NOT NULL,
	fathersEmail VARCHAR(255),
	fathersMobile VARCHAR(255),
	
	fathersSatsangSevaDetails VARCHAR(255) NOT NULL,
	fathersLastZonalAttended VARCHAR(255) NOT NULL,
	fathersOtherInfo VARCHAR(255),
	fathersInitiationPostCard VARCHAR(255),
	
	
	mothersName VARCHAR(255) NOT NULL,
	maternalGrandFathersName VARCHAR(255) NOT NULL,
	maternalGrandFatherInitiated CHAR(1),
	maternalGrandMothersName VARCHAR(255),
	maternalGrandMotherInitiated CHAR(1),
	mothersOccupation INT,
	mothersDesignation VARCHAR(255),
	mothersDepartment VARCHAR(255),
	mothersPlace VARCHAR(255),
	mothersMonthlyIncome INT,
	mothersAssetDetails VARCHAR(255),
	mothersInitiated CHAR(1) NOT NULL,
	mothersUid VARCHAR(255),
	mothersPlaceOfInitiation VARCHAR(255),
	mothersDateOfFirstInitiation DATETIME,
	mothersDateOfSecondInitiation DATETIME,
	mothersNationality INT NOT NULL,
	mothersEmail VARCHAR(255),
	mothersMobile VARCHAR(255),
	
	mothersSatsangSevaDetails VARCHAR(255) NOT NULL,
	mothersLastZonalAttended VARCHAR(255) NOT NULL,
	mothersOtherInfo VARCHAR(255),
	mothersInitiationPostCard VARCHAR(255),
	
	
	parentsBuildingNumber VARCHAR(255) NOT NULL,
	parentsStreet VARCHAR(255) NOT NULL,
	parentsLocality VARCHAR(255) NOT NULL,
	parentsCity VARCHAR(255) NOT NULL,
	parentsDistrict VARCHAR(255) NOT NULL,
	parentsState VARCHAR(255) NOT NULL, 
	parentsCountryCode INT NOT NULL,
	
	
	preferedSpouseDOB DATETIME,
	preferedSpouseQualification VARCHAR(255),
	preferedSpouseOccupation VARCHAR(255),
	preferedSpousePersonality VARCHAR(255),
	preferedTimeScheduleForMarriage DATETIME,
	selectionDecision INT,
	maritalStatus INT,
	
	candidateBranchAttendance INT,
	candidateBranchAttendanceTotal INT,
	candidateSevaDetails  VARCHAR(255),
	
	candidateDateOfSignature DATETIME,
	candidateNameOfSignatory VARCHAR(255),
	
	candidateBranch INT,
	candidateSecretaryApproval INT,
	candidateSecretaryName VARCHAR(255),
	candidateSecretaryEmail VARCHAR(255),
	candidateSecretaryMobile VARCHAR(50),
	candidateSecretaryRemarks VARCHAR(1000),
	
	
	fathersBranchAttendance INT,
	fathersBranchAttendanceTotal INT,
	fathersSevaDetails VARCHAR(255),
	
	mothersBranchAttendance INT,
	mothersBranchAttendanceTotal INT,
	mothersSevaDetails VARCHAR(255),
	
	parentsDateOfSignature DATETIME,
	parentsNameOfSignatory VARCHAR(255),
	
	parentsBranch INT,
	parentsNOC VARCHAR(255),

	parentsSecretaryApproval INT,
	parentsSecretaryName VARCHAR(255),
	parentsSecretaryEmail VARCHAR(255),
	parentsSecretaryMobile VARCHAR(50),
	parentsSecretaryRemarks VARCHAR(1000),

	FOREIGN KEY (formStatus) REFERENCES FormStatusMaster (`code`),
	FOREIGN KEY (bloodGroup) REFERENCES BloodGroupMaster (`code`),
	FOREIGN KEY (occupation) REFERENCES OccupationMaster (`code`),
	FOREIGN KEY (fathersOccupation) REFERENCES OccupationMaster (`code`),
	FOREIGN KEY (mothersOccupation) REFERENCES OccupationMaster (`code`),
	FOREIGN KEY (selectionDecision) REFERENCES SelectionDecisionMaster (`code`),
	FOREIGN KEY (maritalStatus) REFERENCES MaritalStatusMaster (`code`),
	
	FOREIGN KEY (candidateSecretaryApproval) REFERENCES ApprovalStatusMaster (`code`),
	FOREIGN KEY (parentsSecretaryApproval) REFERENCES ApprovalStatusMaster (`code`),
	
	
	FOREIGN KEY (nationality) REFERENCES CountryMaster (`code`),
	FOREIGN KEY (fathersNationality) REFERENCES CountryMaster (`code`),
	FOREIGN KEY (mothersNationality) REFERENCES CountryMaster (`code`),
	FOREIGN KEY (officeCountryCode) REFERENCES CountryMaster (`code`),
	FOREIGN KEY (parentsCountryCode) REFERENCES CountryMaster (`code`),
	
	FOREIGN KEY (parentsBranch) REFERENCES BranchMaster (`code`),
	FOREIGN KEY (candidateBranch) REFERENCES BranchMaster (`code`)
);

create table Sibling(
	siblingId INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	formNum INT NOT NULL,
	`type` CHAR(1) NOT NULL,
	dateOfBirth DATETIME NOT NULL,
	maritalStatus int NOT NULL,
	dateOfMarriage DATETIME,
	throughMarriagePanchayat CHAR(1),
	registeredInMarriagePanchayat CHAR(1),
	satsangiFamily CHAR(1),
	reasons VARCHAR(255),
	name VARCHAR(255) NOT NULL,
	initiatedStatus CHAR(1) NOT NULL,
	occupation int NOT NULL,
	FOREIGN KEY (formNum) REFERENCES Form (formNum),
	FOREIGN KEY (maritalStatus) REFERENCES MaritalStatusMaster (`code`),
	FOREIGN KEY (occupation) REFERENCES OccupationMaster (`code`)
);
