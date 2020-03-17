create table database_Validator_Student (
	StudentId LONG not null primary key,
	Code VARCHAR(75) null,
	Fullname VARCHAR(75) null,
	Gender BOOLEAN,
	Birthday DATE null,
	Email VARCHAR(75) null,
	Address VARCHAR(75) null,
	Blog VARCHAR(75) null,
	Mark DOUBLE
);