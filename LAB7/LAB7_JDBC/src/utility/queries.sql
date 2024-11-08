SHOW databases;
CREATE database medicaldb;
USE medicaldb;
CREATE TABLE patiant(
    id INT PRIMARY KEY AUTO_INCREMENT,
    firstname VARCHAR(50),
    lastname VARCHAR(50),
	age  VARCHAR(50),
	email VARCHAR(100),
	telephone VARCHAR(10),
	gender VARCHAR(10),
	patiantType VARCHAR(50)
);
SHOW tables;
SELECT * FROM patiant;

INSERT INTO patiant(firstname , lastname, age  , email, telephone, gender,patiantType) 
VALUES  ('John', 'Doe', 34, 'John.DOE@Northeastern.com', 4324291023,'Male','Apointment'),
	('George','Annim', 36, 'George.Annim@Northeastern.com', 4624291024,'Male','Appointment'),
    ('Ezekiel','Nyame', 45, 'Ezekiel.nyame@gmail.com', 4224291051,'Male','Walkin');
    

	