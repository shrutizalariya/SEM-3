Create database CSE_3B_310




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
(106, 'Dhoraji', 5);

select * from City

Select * from Village




----------------------------------------------PART A---------------------------
--1.Display all the villages of Rajkot city
Select v.Name
from City as c
join Village as v
on c.CityID=v.CityID
where c.Name='rajkot'


--2. Display city along with their villages & pin code.
Select c.name,v.name,c.pincode
from City as c
join Village as v
on c.CityID=v.CityID


--3.Display the city having more than one village.
select c.name,COUNT(c.CityID) as count_c
from City as c
join Village as v
on c.CityID=v.CityID
group by c.name
having COUNT(c.CityID)>1


--4. Display the city having no village.
Select c.name
from City as c
left join Village as v
on c.CityID=v.CityID
where v.CityID is null

--5.Count the total number of villages in each city.
Select c.name , COUNT(v.name)
from City as c
left join Village as v
on c.CityID=v.CityID
group by c.name


--6. Count the number of cities having more than one village.
Select COUNT(*) as count_one_city
from(
	   select c.name,COUNT(c.CityID) as count_c
       from City as c
       join Village as v
       on c.CityID=v.CityID
       group by c.name
       having COUNT(c.CityID)>1 ) as  count_city



CREATE TABLE STU_MASTER(
	RNO INT,
	NAME VARCHAR(50),
	BRANCH VARCHAR(50),
	SPI INT,
	BKLOG INT 
)
DROP TABLE STU_MASTER

INSERT INTO STU_MASTER(RNO,NAME,BRANCH,SPI,BKLOG)
VALUES
(101,'RAJU','CE',8.80,0),
(102,'AMIT','CE',2.20,3),
(103,'SANJAY','ME',1.50,6),
(104,'NEHA','EC',7.65,0),
(105,'MEERA','EE',5.52,2),
(106,'MAHESH',NULL,4.50,3)

SELECT * FROM STU_MASTER

--4. Try to update SPI of Raju from 8.80 to 12.--5. Try to update Bklog of Neha from 0 to -1.




-------------------------------------PART B------------------------------------------------


CREATE TABLE Dept_DETAILS (
    Did INT PRIMARY KEY,
    Dname VARCHAR(100) NOT NULL
);

CREATE TABLE City_DETAILS(
    Cid INT PRIMARY KEY,
    Cname VARCHAR(100) NOT NULL
);

CREATE TABLE Emp_DETAILS (
    Eid INT PRIMARY KEY,
    Ename VARCHAR(100) NOT NULL,
    Did INT,
    Cid INT,
    Salary DECIMAL(10, 2) CHECK (Salary > 0),
    Experience INT CHECK (Experience >= 0), 
    FOREIGN KEY (Did) REFERENCES Dept_DETAILS(Did),
    FOREIGN KEY (Cid) REFERENCES City_DETAILS(Cid)
);

INSERT INTO Dept_DETAILS(Did, Dname) VALUES
(1, 'HR'),
(2, 'Engineering'),
(3, 'Marketing');

INSERT INTO City_DETAILS(Cid, Cname) VALUES
(1, 'New York'),
(2, 'Los Angeles'),
(3, 'Chicago');

INSERT INTO Emp_DETAILS(Eid, Ename, Did, Cid, Salary, Experience) VALUES
(1, 'John Doe', 1, 1, 50000.00, 5),
(2, 'Jane Smith', 2, 2, 75000.00, 8),
(3, 'Mike Johnson', 3, 3, 60000.00, 3);





-----------------------------------------PART C-----------------------------------------------------
CREATE TABLE Country_INFO (
    Cid INT PRIMARY KEY,
    Cname VARCHAR(100) NOT NULL
);

CREATE TABLE State_INFO (
    Sid INT PRIMARY KEY,
    Sname VARCHAR(100) NOT NULL,
    Cid INT,
    FOREIGN KEY (Cid) REFERENCES Country_INFO(Cid)
);

CREATE TABLE District_INFO (
    Did INT PRIMARY KEY,
    Dname VARCHAR(100) NOT NULL,
    Sid INT,
    FOREIGN KEY (Sid) REFERENCES State_INFO(Sid)
);

CREATE TABLE Dept_INFO (
    Did INT PRIMARY KEY,
    Dname VARCHAR(100) NOT NULL
);

CREATE TABLE City_INFO (
    Cid INT PRIMARY KEY,
    Cname VARCHAR(100) NOT NULL,
    Did INT,
    FOREIGN KEY (Did) REFERENCES District_INFO(Did)
);

CREATE TABLE Emp_INFO (
    Eid INT PRIMARY KEY,
    Ename VARCHAR(100) NOT NULL,
    Did INT,
    Cid INT,
    Salary DECIMAL(10, 2) CHECK (Salary > 0), -- Salary must be positive
    Experience INT CHECK (Experience >= 0),  -- Experience cannot be negative
    FOREIGN KEY (Did) REFERENCES Dept_INFO(Did),
    FOREIGN KEY (Cid) REFERENCES City_INFO(Cid)
);

INSERT INTO Country_INFO (Cid, Cname) VALUES
(1, 'USA'),
(2, 'Canada'),
(3, 'UK'),
(4, 'Australia'),
(5, 'India');

INSERT INTO State_INFO (Sid, Sname, Cid) VALUES
(1, 'California', 1),
(2, 'Ontario', 2),
(3, 'London', 3),
(4, 'New South Wales', 4),
(5, 'Gujarat', 5);

INSERT INTO District_INFO (Did, Dname, Sid) VALUES
(1, 'Los Angeles', 1),
(2, 'Toronto', 2),
(3, 'Westminster', 3),
(4, 'Sydney', 4),
(5, 'Ahmedabad', 5);

INSERT INTO Dept_INFO (Did, Dname) VALUES
(1, 'HR'),
(2, 'Engineering'),
(3, 'Marketing'),
(4, 'Sales'),
(5, 'Finance');

INSERT INTO City_INFO (Cid, Cname, Did) VALUES
(1, 'Los Angeles City', 1),
(2, 'Toronto City', 2),
(3, 'London City', 3),
(4, 'Sydney City', 4),
(5, 'Ahmedabad City', 5);

INSERT INTO Emp_INFO (Eid, Ename, Did, Cid, Salary, Experience) VALUES
(1, 'John Doe', 1, 1, 50000.00, 5),
(2, 'Jane Smith', 2, 2, 75000.00, 8),
(3, 'Mike Johnson', 3, 3, 60000.00, 3),
(4, 'Alice Brown', 4, 4, 45000.00, 2),
(5, 'Bob Green', 5, 5, 40000.00, 4);



--3.Display employeename, departmentname, Salary, Experience, City, District, State and country of all employees.
SELECT Emp_INFO.Ename,
	   Dept_INFO.Dname,
	   Emp_INFO.SALARY,
	   Emp_INFO.Experience,
	   City_info.Cname,
	   District_INFO.Dname,
	   State_INFO.Sname,
	   Country_INFO.Cname
from Emp_INFO join Dept_INFO
on Emp_info.Did=Dept_INFO.Did
 join City_info
on Emp_INFO.Did=City_info.Did
 join District_INFO
on Emp_INFO.Did=District_INFO.Did
 join State_INFO
on Emp_INFO.cid=State_INFO.cid
join Country_INFO
on Emp_INFO.cid=Country_INFO.cid







