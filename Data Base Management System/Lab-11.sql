CREATE DATABASE  CSE_3B_310

CREATE TABLE STU_INFO
(
  RNO INT,
  NAME VARCHAR(50),
  BRANCH VARCHAR(50)
 )

 CREATE TABLE RESULT
 (
 RNO INT ,
 SPI DECIMAL(8,2)
 )

 CREATE TABLE EMPLOYEE2_MASTER
 (
 ENPLOYEENO  VARCHAR(50) ,
 NAME  VARCHAR(50),
 MANAGERNO VARCHAR(50)
 )
 DROP TABLE EMPLOYEE2_MASTER

 INSERT INTO STU_INFO(RNO,NAME,BRANCH)
 VALUES
 (101,'RAJU','CE'),
 (102,'AMIT','CE'),
 (103,'SANJAY','ME'),
 (104,'NEHA','EC'),
 (105,'MEERA','EE'),
 (106,'MAHESH','ME')

 SELECT * FROM STU_INFO


 INSERT INTO RESULT(RNO,SPI)
 VALUES
 (101,8.8),
 (102,9.2),
 (103,7.6),
 (104,8.2),
 (105,7.0),
 (107,8.9)

  SELECT * FROM RESULT

  INSERT INTO EMPLOYEE2_MASTER(ENPLOYEENO,NAME,MANAGERNO)
  VALUES
  ('E01','TARUN',NULL),
  ('E02','ROHAN','E02'),
  ('E03','PRIYA','E01'),
  ('E04','MILAN','E03'),
  ('E05','JAY','E01'),
  ('E06','ANJANA','E04')

    SELECT * FROM EMPLOYEE2_MASTER

----------------------------------PART A------------------------------------------
--1. Combine information from student and result table using cross join or Cartesian product.
SELECT * FROM STU_INFO CROSS JOIN RESULT
SELECT * FROM STU_INFO,RESULT

--2. Perform inner join on Student and Result tables.
SELECT * FROM STU_INFO INNER JOIN RESULT ON STU_INFO.RNO =RESULT.RNO

--3.Perform the left outer join on Student and Result tables.
SELECT * FROM STU_INFO LEFT OUTER JOIN RESULT ON STU_INFO.RNO =RESULT.RNO

--4. Perform the right outer join on Student and Result tables.
SELECT * FROM STU_INFO RIGHT OUTER JOIN RESULT ON STU_INFO.RNO =RESULT.RNO

--5. Perform the full outer join on Student and Result tables. 
SELECT * FROM STU_INFO FULL OUTER JOIN RESULT ON STU_INFO.RNO =RESULT.RNO

--6.Display Rno, Name, Branch and SPI of all students.SELECT STU_INFO.RNO, STU_INFO.BRANCH, STU_INFO.NAME,RESULT.SPI FROM STU_INFO FULL OUTER JOIN RESULT ON STU_INFO.RNO =RESULT.RNO

--7. Display Rno, Name, Branch and SPI of CE branch’s student only.
SELECT STU_INFO.RNO, STU_INFO.BRANCH, STU_INFO.NAME,RESULT.SPI 
FROM STU_INFO JOIN RESULT
ON STU_INFO.RNO =RESULT.RNO
WHERE  STU_INFO.BRANCH='CE'

--8. Display Rno, Name, Branch and SPI of other than EC branch’s student only.
SELECT STU_INFO.RNO, STU_INFO.BRANCH, STU_INFO.NAME,RESULT.SPI 
FROM STU_INFO JOIN RESULT
ON STU_INFO.RNO =RESULT.RNO
WHERE  STU_INFO.BRANCH<>'EC'

--9.Display average result of each branch.
SELECT  STU_INFO.BRANCH,AVG(RESULT.SPI) AS AVG_SPI
FROM STU_INFO JOIN RESULT
ON STU_INFO.RNO =RESULT.RNO
GROUP BY STU_INFO.BRANCH

--10. Display average result of CE and ME branch.
SELECT  STU_INFO.BRANCH,AVG(RESULT.SPI) AS AVG_SPI
FROM STU_INFO JOIN RESULT
ON STU_INFO.RNO =RESULT.RNO
WHERE STU_INFO.BRANCH IN('CE','ME')
GROUP BY STU_INFO.BRANCH

----------------------------------------PART B----------------------------------------

--1. Display average result of each branch and sort them in ascending order by SPI.
SELECT STU_INFO.BRANCH,AVG(RESULT.SPI) AS AVG_SPI
FROM STU_INFO JOIN RESULT
ON STU_INFO.RNO =RESULT.RNO
GROUP BY STU_INFO.BRANCH
ORDER BY  AVG_SPI

--2.Display highest SPI from each branch and sort them in descending order.
SELECT STU_INFO.BRANCH,MAX(RESULT.SPI) AS MAX_SPI
FROM STU_INFO JOIN RESULT
ON STU_INFO.RNO =RESULT.RNO
GROUP BY STU_INFO.BRANCH
ORDER BY MAX_SPI DESC

--------------------------------PART C-----------------------------------------

--1. Retrieve the names of employee along with their manager’s name from the Employee table.
SELECT E1.NAME ,E2.NAME
FROM EMPLOYEE2_MASTER AS E1 LEFT JOIN EMPLOYEE2_MASTER AS E2
ON E1.ENPLOYEENO = E2.MANAGERNO



