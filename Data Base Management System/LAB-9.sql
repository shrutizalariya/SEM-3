--Sub Queries 

CREATE TABLE STUDENT_DATA (
    Rno INT,
    Name VARCHAR(50),
    City VARCHAR(50),
    DID INT,
);

INSERT INTO STUDENT_DATA (Rno, Name, City, DID) VALUES
(101, 'Raju', 'Rajkot', 10),
(102, 'Amit', 'Ahmedabad', 20),
(103, 'Sanjay', 'Baroda', 40),
(104, 'Neha', 'Rajkot', 20),
(105, 'Meera', 'Ahmedabad', 30),
(106, 'Mahesh', 'Baroda', 10);

CREATE TABLE Academic (
    Rno INT,
    SPI DECIMAL(3, 1),
    Bklog INT
);

INSERT INTO Academic (Rno, SPI, Bklog) VALUES
(101, 8.8, 0),
(102, 9.2, 2),
(103, 7.6, 1),
(104, 8.2, 4),
(105, 7.0, 2),
(106, 8.9, 3);

CREATE TABLE Department (
    DID INT,
    DName VARCHAR(50)
);

INSERT INTO Department (DID, DName) VALUES
(10, 'Computer'),
(20, 'Electrical'),
(30, 'Mechanical'),
(40, 'Civil');

--Part – A: 

--1. Display details of students who are from computer department.
	SELECT * FROM STUDENT_DATA 
	WHERE DID = (SELECT DID FROM DEPARTMENT WHERE DNAME = 'COMPUTER');

--2. Displays name of students whose SPI is more than 8. 
	SELECT NAME FROM STUDENT_DATA 
	WHERE RNO IN (SELECT RNO FROM Academic WHERE SPI>8);

--3. Display details of students of computer department who belongs to Rajkot city. 
	SELECT * FROM STUDENT_DATA
	WHERE CITY = 'RAJKOT' AND DID = (SELECT DID FROM Department WHERE DNAME = 'COMPUTER');

--4. Find total number of students of electrical department.
	SELECT COUNT(RNO) FROM STUDENT_DATA
	WHERE DID = (SELECT DID FROM Department WHERE DNAME = 'ELECTRICAL');

--5. Display name of student who is having maximum SPI. 
	SELECT NAME FROM STUDENT_DATA
	WHERE RNO = (SELECT RNO FROM Academic 
	WHERE SPI = (SELECT MAX(SPI) FROM ACADEMIC));
	
--6. Display details of students having more than 1 backlog.
	SELECT * FROM STUDENT_DATA 
	WHERE RNO IN (SELECT RNO FROM Academic WHERE BKLOG > 1);

--Part – B: 

--1. Display name of students who are either from computer department or from mechanical department. 
	SELECT NAME FROM STUDENT_DATA
	WHERE DID IN (SELECT DID FROM Department WHERE DNAME = 'COMPUTER' OR DNAME = 'MECHANICAL');

--2. Display name of students who are in same department as 102 studying in. 
	SELECT NAME FROM STUDENT_DATA 
	WHERE DID IN (SELECT DID FROM ACADEMIC WHERE DID = 20);

--Part – C: 
--1. Display name of students whose SPI is more than 9 and who is from electrical department.
	SELECT NAME FROM STUDENT_DATA
	WHERE RNO = (SELECT RNO FROM ACADEMIC WHERE SPI > 9) 
	AND DID = (SELECT DID FROM DEPARTMENT WHERE DNAME = 'ELECTRICAL');

--2. Display name of student who is having second highest SPI. 
	SELECT NAME FROM STUDENT_DATA
	WHERE RNO = (SELECT RNO FROM ACADEMIC 
	WHERE SPI = (SELECT MAX(SPI) FROM ACADEMIC 
	WHERE SPI < (SELECT MAX(SPI) FROM ACADEMIC)));

--3. Display city names whose students branch wise SPI is 9.2.
	SELECT CITY FROM STUDENT_DATA
	WHERE RNO IN (SELECT RNO FROM Academic
	WHERE SPI = 9.2) AND DID IN (SELECT DID FROM DEPARTMENT GROUP BY DID) ;


--SET Operators 

--Part – A: 

--Create below two tables as per following data.

CREATE TABLE Computer (
    RollNo INT,
    Name VARCHAR(50)
);

INSERT INTO Computer (RollNo, Name) VALUES
(101, 'Ajay'),
(109, 'Haresh'),
(115, 'Manish');

CREATE TABLE Electrical (
    RollNo INT PRIMARY KEY,
    Name VARCHAR(50)
);

INSERT INTO Electrical (RollNo, Name) VALUES
(105, 'Ajay'),
(107, 'Mahesh'),
(115, 'Manish');


--1. Display name of students who is either in Computer or in Electrical.
	SELECT Name FROM Computer
	UNION
	SELECT Name FROM Electrical

--2. Display name of students who is either in Computer or in Electrical including duplicate data.
	SELECT Name FROM Computer
	UNION ALL
	SELECT Name FROM Electrical

--3. Display name of students who is in both Computer and Electrical. 
	SELECT Name FROM Computer 
	INTERSECT 
	SELECT Name FROM Electrical  

--4. Display name of students who are in Computer but not in Electrical. 
	SELECT Name FROM Computer 
	EXCEPT 
	SELECT Name FROM Electrical 

--5. Display name of students who are in Electrical but not in Computer. 
	SELECT Name FROM Electrical 
	EXCEPT 
	SELECT Name FROM Computer 

--6. Display all the details of students who are either in Computer or in Electrical.
	SELECT * FROM Computer 
	UNION 
	SELECT * FROM Electrical 

--7. Display all the details of students who are in both Computer and Electrical. 
	SELECT * FROM Computer 
	INTERSECT  
	SELECT * FROM Electrical 

--Part – B: 

--Create below two tables as per following data.

CREATE TABLE Emp_DATA (
    EID INT,
    Name VARCHAR(50)
);

INSERT INTO Emp_DATA (EID, Name) VALUES
(1, 'Ajay'),
(9, 'Haresh'),
(5, 'Manish');

CREATE TABLE Customer (
    CID INT,
    Name VARCHAR(50)
);

INSERT INTO Customer (CID, Name) VALUES
(5, 'Ajay'),
(7, 'Mahesh'),
(5, 'Manish');

--1. Display name of persons who is either Employee or Customer. 
	SELECT Name FROM Emp_DATA 
	UNION 
	SELECT Name FROM Customer 

--2. Display name of persons who is either Employee or Customer including duplicate data. 
	SELECT Name FROM Emp_DATA 
	UNION ALL 
	SELECT Name FROM Customer

--3. Display name of persons who is both Employee as well as Customer.
	SELECT Name FROM Emp_DATA 
	INTERSECT 
	SELECT Name FROM Customer 

--4. Display name of persons who are Employee but not Customer. 
	SELECT Name FROM Emp_DATA 
	EXCEPT 
	SELECT Name FROM Customer  
	
--5. Display name of persons who are Customer but not Employee.
	SELECT Name FROM Customer 
	EXCEPT 
	SELECT Name FROM Emp_DATA

--Part – C:  

--1. Perform all the queries of Part-B but display ID and Name columns instead of Name only. 

	--1 
		SELECT EID,Name FROM Emp_DATA 
		UNION 
		SELECT CID, Name FROM Customer   
    --2 
		SELECT EID,Name FROM Emp_DATA 
		UNION ALL 
		SELECT CID,Name FROM Customer   
    --3 
		SELECT EID,Name FROM Emp_DATA 
		INTERSECT 
		SELECT CID,Name FROM Customer   
    --4 
		SELECT EID,Name FROM Emp_DATA 
		EXCEPT 
		SELECT CID,Name FROM Customer   
    --5 
		SELECT CID,Name FROM Customer 
		EXCEPT 
		SELECT EID,Name FROM Emp_DATA  