INSERT INTO CountryMaster (`value`) VALUES('Afghanistan'),('Åland Islands'),('Albania'),('Algeria'),('American Samoa'),('Andorra'),('Angola'),('Anguilla'),('Antarctica'),('Antigua and Barbuda'),('Argentina'),('Armenia'),('Aruba'),('Australia'),('Austria'),('Azerbaijan'),('Bahamas'),('Bahrain'),('Bangladesh'),('Barbados'),('Belarus'),('Belgium'),('Belize'),('Benin'),('Bermuda'),('Bhutan'),('Bolivia, Plurinational State of'),('Bonaire, Sint Eustatius and Saba'),('Bosnia and Herzegovina'),('Botswana'),('Bouvet Island'),('Brazil'),('British Indian Ocean Territory'),('Brunei Darussalam'),('Bulgaria'),('Burkina Faso'),('Burundi'),('Cambodia'),('Cameroon'),('Canada'),('Cape Verde'),('Cayman Islands'),('Central African Republic'),('Chad'),('Chile'),('China'),('Christmas Island'),('Cocos (Keeling) Islands'),('Colombia'),('Comoros'),('Congo'),('Congo, The Democratic Republic of The'),('Cook Islands'),('Costa Rica'),('Côte D\'ivoire'),('Croatia'),('Cuba'),('Curaçao'),('Cyprus'),('Czech Republic'),('Denmark'),('Djibouti'),('Dominica'),('Dominican Republic'),('Ecuador'),('Egypt'),('El Salvador'),('Equatorial Guinea'),('Eritrea'),('Estonia'),('Ethiopia'),('Falkland Islands (Malvinas)'),('Faroe Islands'),('Fiji'),('Finland'),('France'),('French Guiana'),('French Polynesia'),('French Southern Territories'),('Gabon'),('Gambia'),('Georgia'),('Germany'),('Ghana'),('Gibraltar'),('Greece'),('Greenland'),('Grenada'),('Guadeloupe'),('Guam'),('Guatemala'),('Guernsey'),('Guinea'),('Guinea-Bissau'),('Guyana'),('Haiti'),('Heard Island and Mcdonald Islands'),('Holy See (Vatican City State)'),('Honduras'),('Hong Kong'),('Hungary'),('Iceland'),('India'),('Indonesia'),('Iran, Islamic Republic of'),('Iraq'),('Ireland'),('Isle of Man'),('Israel'),('Italy'),('Jamaica'),('Japan'),('Jersey'),('Jordan'),('Kazakhstan'),('Kenya'),('Kiribati'),('Korea, Democratic People\'s Republic of'),('Korea, Republic of'),('Kuwait'),('Kyrgyzstan'),('Lao People\'s Democratic Republic'),('Latvia'),('Lebanon'),('Lesotho'),('Liberia'),('Libya'),('Liechtenstein'),('Lithuania'),('Luxembourg'),('Macao'),('Macedonia, The Former Yugoslav Republic of'),('Madagascar'),('Malawi'),('Malaysia'),('Maldives'),('Mali'),('Malta'),('Marshall Islands'),('Martinique'),('Mauritania'),('Mauritius'),('Mayotte'),('Mexico'),('Micronesia, Federated States of'),('Moldova, Republic of'),('Monaco'),('Mongolia'),('Montenegro'),('Montserrat'),('Morocco'),('Mozambique'),('Myanmar'),('Namibia'),('Nauru'),('Nepal'),('Netherlands'),('New Caledonia'),('New Zealand'),('Nicaragua'),('Niger'),('Nigeria'),('Niue'),('Norfolk Island'),('Northern Mariana Islands'),('Norway'),('Oman'),('Pakistan'),('Palau'),('Palestine, State of'),('Panama'),('Papua New Guinea'),('Paraguay'),('Peru'),('Philippines'),('Pitcairn'),('Poland'),('Portugal'),('Puerto Rico'),('Qatar'),('Réunion'),('Romania'),('Russian Federation'),('Rwanda'),('Saint Barthélemy'),('Saint Helena, Ascension and Tristan Da Cunha'),('Saint Kitts and Nevis'),('Saint Lucia'),('Saint Martin (French Part)'),('Saint Pierre and Miquelon'),('Saint Vincent and The Grenadines'),('Samoa'),('San Marino'),('Sao Tome and Principe'),('Saudi Arabia'),('Senegal'),('Serbia'),('Seychelles'),('Sierra Leone'),('Singapore'),('Sint Maarten (Dutch Part)'),('Slovakia'),('Slovenia'),('Solomon Islands'),('Somalia'),('South Africa'),('South Georgia and The South Sandwich Islands'),('South Sudan'),('Spain'),('Sri Lanka'),('Sudan'),('Suriname'),('Svalbard and Jan Mayen'),('Swaziland'),('Sweden'),('Switzerland'),('Syrian Arab Republic'),('Taiwan, Province of China'),('Tajikistan'),('Tanzania, United Republic of'),('Thailand'),('Timor-Leste'),('Togo'),('Tokelau'),('Tonga'),('Trinidad and Tobago'),('Tunisia'),('Turkey'),('Turkmenistan'),('Turks and Caicos Islands'),('Tuvalu'),('Uganda'),('Ukraine'),('United Arab Emirates'),('United Kingdom'),('United States'),('United States Minor Outlying Islands'),('Uruguay'),('Uzbekistan'),('Vanuatu'),('Venezuela, Bolivarian Republic of'),('Vietnam'),('Virgin Islands, British'),('Virgin Islands, U.S.'),('Wallis and Futuna'),('Western Sahara'),('Yemen'),('Zambia'),('Zimbabwe');

INSERT INTO BranchMaster (name, city, state, countryCode, secretaryName, mobile, email) VALUES ('Adanbagh','Agra','Uttar Pradesh',103,'Saran Setia','9876598765, 9876543210', 'adanbaghbranch@gmail.com'),('Dehradun','Dehradun','Uttrakhand',103,'Vijay Saluja','9876598765, 9876543210', 'dehradunbranch@gmail.com'),('Janak Puri','New Delhi','Delhi',103,'Satish Verma','9876598765, 9876543210', 'delhibranch@gmail.com');

INSERT INTO BloodGroupMaster (`value`) values('A+'),('B+'),('AB+'),('O+'),('A-'),('B-'),('AB-'),('O-');

INSERT INTO OccupationMaster (`value`) values('Service'),('Profession'),('Business'),('Student'),('Homemaker'),('Unemployed');

INSERT INTO ApprovalStatusMaster (`value`) values('Waiting'),('Approved'),('Hold'),('Rejected');

INSERT INTO FormStatusMaster (`value`) values('Draft'),('Submitted'),('Approved');

INSERT INTO SelectionDecisionMaster (`value`) values('Self'),('Parents'),('Both');

INSERT INTO MaritalStatusMaster (`value`) values('Unmarried'),('Married'),('Widow'),('Widower'),('Divorcee'); 