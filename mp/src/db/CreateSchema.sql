create table CountryMaster(
	countryCode INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(255)
);

create table CommonMaster(
	commonCode INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`type` VARCHAR(255) NOT NULL,
	`value` VARCHAR(255) NOT NULL
);

create table BranchMaster(
	branchCode INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(255) NOT NULL,
	city VARCHAR(255) NOT NULL,
	state VARCHAR(255) NOT NULL,
	countryCode int NOT NULL,
	secretaryName VARCHAR(255) NOT NULL,
	mobile VARCHAR(50),
	email VARCHAR(255),
	FOREIGN KEY (countryCode) REFERENCES CountryMaster (countryCode)
);

CREATE TABLE Form(	
	formNum INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	dateCreated DATETIME NOT NULL,
	formStatus INT NOT NULL,
	
	name VARCHAR(255) NOT NULL,
	dateOfBirth DATETIME NOT NULL,
	dateOfInitiation DATETIME NOT NULL,
	nationality INT NOT NULL,
	health VARCHAR(255),
	height INT,
	weight INT,
	eductionalQualification VARCHAR(255) NOT NULL,
	gender INT NOT NULL,
	bloodGroup INT,
	rhFactor INT ,
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
	
	dBResident INT NOT NULL,
	dateOfLastDBVisit DATETIME NOT NULL,
	attendSatsang INT NOT NULL,
	participateInSeva INT NOT NULL,
	sevaDetails VARCHAR(255),
	
	vegetarian INT NOT NULL,
	teetotaler INT NOT NULL,
	
	
	
	fathersName VARCHAR(255) NOT NULL,
	paternalGrandFathersName VARCHAR(255) NOT NULL,
	paternalGrandFatherInitiated INT,
	paternalGrandMothersName VARCHAR(255),
	paternalGrandMotherInitiated INT,
	fathersOccupation INT,
	fathersDesignation VARCHAR(255),
	fathersDepartment VARCHAR(255),
	fathersPlace VARCHAR(255),
	fathersMonthlyIncome INT,
	fathersAssetDetails VARCHAR(255),
	fathersInitiated INT NOT NULL,
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
	maternalGrandFatherInitiated INT,
	maternalGrandMothersName VARCHAR(255),
	maternalGeandMotherInitiated INT,
	mothersOccupation INT,
	mothersDesignation VARCHAR(255),
	mothersDepartment VARCHAR(255),
	mothersPlace VARCHAR(255),
	mothersMonthlyIncome INT,
	mothersAssetDetails VARCHAR(255),
	mothersInitiated INT NOT NULL,
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
	
	
	preferedSpouseAge INT,
	preferedSpouseQualification VARCHAR(255),
	preferedSpouseOccupation VARCHAR(255),
	preferedSpousePersonality VARCHAR(255),
	preferedTimeScheduleForMarriage DATETIME,
	selectionDecision INT,
	
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
	
	
	fathersBranchAttendance INT,
	fathersBranchAttendanceTotal INT,
	fathersSevaDetails VARCHAR(255),
	
	mothersBranchAttendance INT,
	mothersBranchAttendanceTotal INT,
	mothersSevaDetails VARCHAR(255),
	
	parentsDateOfSignature DATETIME,
	parentsNameOfSignatory VARCHAR(255),
	
	parentsBranch INT,
	parentsSecretaryApproval INT,
	parentsSecretaryName VARCHAR(255),
	parentsSecretaryEmail VARCHAR(255),
	parentsSecretaryMobile VARCHAR(50),
	FOREIGN KEY (formStatus) REFERENCES CommonMaster (commonCode),
	
	FOREIGN KEY (gender) REFERENCES CommonMaster (commonCode),
	FOREIGN KEY (bloodGroup) REFERENCES CommonMaster (commonCode),
	FOREIGN KEY (rhFactor) REFERENCES CommonMaster (commonCode),
	FOREIGN KEY (occupation) REFERENCES CommonMaster (commonCode),
	FOREIGN KEY (fathersOccupation) REFERENCES CommonMaster (commonCode),
	FOREIGN KEY (mothersOccupation) REFERENCES CommonMaster (commonCode),
	FOREIGN KEY (selectionDecision) REFERENCES CommonMaster (commonCode),
	
	FOREIGN KEY (candidateSecretaryApproval) REFERENCES CommonMaster (commonCode),
	FOREIGN KEY (parentsSecretaryApproval) REFERENCES CommonMaster (commonCode),
	
	
	FOREIGN KEY (nationality) REFERENCES CountryMaster (countryCode),
	FOREIGN KEY (fathersNationality) REFERENCES CountryMaster (countryCode),
	FOREIGN KEY (mothersNationality) REFERENCES CountryMaster (countryCode),
	FOREIGN KEY (officeCountryCode) REFERENCES CountryMaster (countryCode),
	FOREIGN KEY (parentsCountryCode) REFERENCES CountryMaster (countryCode),
	
	FOREIGN KEY (parentsBranch) REFERENCES BranchMaster (branchCode),
	FOREIGN KEY (candidateBranch) REFERENCES BranchMaster (branchCode),
	
	FOREIGN KEY (dBResident) REFERENCES CommonMaster (commonCode),
	FOREIGN KEY (attendSatsang) REFERENCES CommonMaster (commonCode),
	FOREIGN KEY (participateInSeva) REFERENCES CommonMaster (commonCode),
	FOREIGN KEY (vegetarian) REFERENCES CommonMaster (commonCode),
	FOREIGN KEY (teetotaler) REFERENCES CommonMaster (commonCode),
	FOREIGN KEY (paternalGrandFatherInitiated) REFERENCES CommonMaster (commonCode),
	FOREIGN KEY (paternalGrandMotherInitiated) REFERENCES CommonMaster (commonCode),
	FOREIGN KEY (fathersInitiated) REFERENCES CommonMaster (commonCode),
	FOREIGN KEY (maternalGrandFatherInitiated) REFERENCES CommonMaster (commonCode),
	FOREIGN KEY (maternalGeandMotherInitiated) REFERENCES CommonMaster (commonCode),
	FOREIGN KEY (mothersInitiated) REFERENCES CommonMaster (commonCode)
);
