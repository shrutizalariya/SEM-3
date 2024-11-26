CREATE TABLE City (
    CityID INT PRIMARY KEY,
    Name VARCHAR(100) UNIQUE,
    Pincode INT NOT NULL,
    Remarks VARCHAR(255)
);

CREATE TABLE Village (
    VID INT PRIMARY KEY,
    Name VARCHAR(100) NOT NULL,
    CityID INT,
    FOREIGN KEY (CityID) REFERENCES City(CityID)
);

INSERT INTO City (CityID, Name, Pincode, Remarks) VALUES
(1, 'Rajkot', 360005, 'Good'),
(2, 'Surat', 335009, 'Very Good'),
(3, 'Baroda', 390001, 'Awesome'),
(4, 'Jamnagar', 361003, 'Smart'),
(5, 'Junagadh', 362229, 'Historic'),
(6, 'Morvi', 363641, 'Ceramic');

INSERT INTO Village (VID, Name, CityID) VALUES
(101, 'Raiya', 1),
(102, 'Madhapar', 1),
(103, 'Dodka', 3),
(104, 'Falla', 4),
(105, 'Bhesan', 5),
(106, 'Dhoraji', 5)

SELECT * FROM CITY;
SELECT * FROM VILLAGE;

--PART-A

--1. Display all the villages of Rajkot city.  
	SELECT V.NAME , C.NAME 
	FROM VILLAGE V
	INNER JOIN CITY C
	ON V.CITYID = C.CITYID
	WHERE C.NAME = 'RAJKOT' ;

--2. Display city along with their villages & pin code. 
	SELECT  C.NAME , V.NAME , C.PINCODE
	FROM VILLAGE V
	INNER JOIN CITY C
	ON V.CITYID = C.CITYID
	
--3. Display the city having more than one village. 
	SELECT C.NAME , COUNT(V.NAME)
	FROM VILLAGE V
	INNER JOIN CITY C
	ON V.CITYID = C.CITYID
	GROUP BY C.NAME
	HAVING COUNT(V.NAME) > 1 ;

--4. Display the city having no village. 
	SELECT C.NAME , COUNT(V.NAME)
	FROM VILLAGE V
	INNER JOIN CITY C
	ON V.CITYID = C.CITYID
	GROUP BY C.NAME
	HAVING COUNT(V.NAME) = 0 ;

--5. Count the total number of villages in each city. 
	SELECT C.NAME , COUNT(V.NAME)
	FROM VILLAGE V
	INNER JOIN CITY C
	ON V.CITYID = C.CITYID
	GROUP BY C.NAME

--6. Count the number of cities having more than one village. 
	SELECT COUNT(C.NAME) , COUNT(V.NAME)
	FROM VILLAGE V
	INNER JOIN CITY C
	ON V.CITYID = C.CITYID
	GROUP BY C.NAME
	HAVING COUNT(V.NAME) > 1 ;