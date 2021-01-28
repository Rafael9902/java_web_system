CREATE TABLE identifications(
	id INT AUTO_INCREMENT,
	name VARCHAR(255) NOT NULL,
	PRIMARY KEY(id)
);

CREATE TABLE eps(
	id INT AUTO_INCREMENT,
	name VARCHAR(255) NOT NULL,
	PRIMARY KEY(id)
);

CREATE TABLE patients(
	id INT AUTO_INCREMENT,
	name Varchar(255) NOT NULL,
	birthdate DATE NOT NULL,
	identification_type INT NOT NULL,
	identification VARCHAR(50) NOT NULL,
	eps INT DEFAULT NULL,
	clinical_history TEXT NOT NULL,
	PRIMARY KEY(id),
	FOREIGN KEY(identification_type) REFERENCES identifications(id),
	FOREIGN KEY(eps) REFERENCES eps(id)
);

CREATE TABLE doctors(
	id INT AUTO_INCREMENT,
	name VARCHAR(255) NOT NULL,
	identification_type INT NOT NULL,
	identification VARCHAR(50) NOT NULL,
	professional_card VARCHAR(20) UNIQUE NOT NULL,
	experience_years INT NOT NULL,
	speciality VARCHAR(100) NOT NULL,
	start_time VARCHAR(50) NOT NULL,
	end_time VARCHAR(50) NOT NULL,
	PRIMARY KEY(id),
	FOREIGN KEY(identification_type) REFERENCES identifications(id)
);

-- Identifications
INSERT INTO identifications (name) VALUES ('Cedula de Ciudadanía');
INSERT INTO identifications (name) VALUES ('Cedula de Extranjería');
INSERT INTO identifications (name) VALUES ('Tarjeta de Identidad');
INSERT INTO identifications (name) VALUES ('Pasaporte');

-- EPS
INSERT INTO eps (name) VALUES('Compensar');
INSERT INTO eps (name) VALUES('Sanitas');
INSERT INTO eps (name) VALUES('Famisanar');
INSERT INTO eps (name) VALUES('Salud Total');
INSERT INTO eps (name) VALUES('Sura');
INSERT INTO eps (name) VALUES('Nueva EPS');
INSERT INTO eps (name) VALUES('Coomeva');
INSERT INTO eps (name) VALUES('Cruz Blanca');
INSERT INTO eps (name) VALUES('Cofenalco Valle');
INSERT INTO eps (name) VALUES('Medimás');


