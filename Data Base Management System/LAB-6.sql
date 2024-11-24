--Math functions
--Part – A:

--1. Display the result of 5 multiply by 30.
SELECT 5*30

--2. Find out the absolute value of -25, 25, -50 and 50.
SELECT ABS(-25),ABS(25),ABS(-50),ABS(50)

--3. Find smallest integer value that is greater than or equal to 25.2, 25.7 and -25.2.
SELECT CEILING(25.2),CEILING(25.7),CEILING(-25.2)

--4. Find largest integer value that is smaller than or equal to 25.2, 25.7 and -25.2.
SELECT FLOOR(25.2),FLOOR(25.7),FLOOR(-25.2)

--5. Find out remainder of 5 divided 2 and 5 divided by 3.
SELECT 5%2,5%3

--6. Find out value of 3 raised to 2nd power and 4 raised 3rd power.
SELECT POWER(3,2),POWER(4,3)

--7. Find out the square root of 25, 30 and 50.
SELECT SQRT(25),SQRT(30),SQRT(50)

--8. Find out the square of 5, 15, and 25.
SELECT SQUARE(5),SQUARE(15),SQUARE(25)

--9. Find out the value of PI.
SELECT PI()

--10. Find out round value of 157.732 for 2, 0 and -2 decimal points.
SELECT ROUND(157.732,2),ROUND(157.732,0),ROUND(157.732,-2)

--11. Find out exponential value of 2 and 3.
SELECT EXP(2),EXP(3)

--12. Find out logarithm having base e of 10 and 2.
SELECT LOG(10),LOG(2)

--13. Find out logarithm having base b having value 10 of 5 and 100.
SELECT LOG10(5),LOG10(100)

--14. Find sine, cosine and tangent of 3.1415.
SELECT SIN(3.1415),COS(3.1415),TAN(3.1415)

--15. Find sign of -25, 0 and 25.
SELECT SIGN(-25),SIGN(0),SIGN(25)

--16. Generate random number using function.
SELECT RAND()

--Part - B:
CREATE TABLE EMP_MASTER(
EMPNO INT,
EMPNAME VARCHAR(25),
JOININGDATE DATETIME,
SALARY DECIMAL(8,2),
COMMISSION INT,
CITY VARCHAR(25),
DEPT_CODE VARCHAR(20))

INSERT INTO EMP_MASTER VALUES 
(101,'KEYUR','02-1-5',12000,4500,'RAJKOT','3@G'),
(102,'HARDIK','04-2-15',14000,2500,'AHMEDABAD','3@'),
(103,'KAJAL','06-3-14',15000,3000,'BARODA','3-GD'),
(104,'BHOOMI','05-6-23',12500,1000,'AHMEDABAD','1A3D'),
(105,'HARMIT','04-2-15',14000,2000,'RAJKOT','312A')

SELECT * FROM EMP_MASTER

--1. Display the result of Salary plus Commission.
SELECT ROUND(SALARY + COMMISSION,0) AS TOTAL_AMOUNT FROM EMP_MASTER

--2. Find smallest integer value that is greater than or equal to 55.2, 35.7 and -55.2.
SELECT FLOOR(55.2),FLOOR(35.7),FLOOR(-55.2)

--3. Find largest integer value that is smaller than or equal to 55.2, 35.7 and -55.2.
SELECT CEILING(55.2),CEILING(35.7),CEILING(-55.2)

--4. Find out remainder of 55 divided 2 and 55 divided by 3.
SELECT 55%2,55%3

--5. Find out value of 23 raised to 2nd power and 14 raised 3rd power.SELECT POWER(23,2),POWER(14,3)

--Part – C:

--1. Find out the square root of 36, 49 and 81.
SELECT SQRT(36),SQRT(49),SQRT(81)

--2. Find out the square of 3, 9, and 12.
SELECT SQUARE(3),SQUARE(9),SQUARE(12)

--3. Find out round value of 280.8952 for 2, 0 and -2 decimal points.
SELECT ROUND(280.8952,2),ROUND(280.8952,0),ROUND(280.8952,-2)

--4. Find sine, cosine and tangent of 4.2014.
SELECT SIN(4.2014),COS(4.2014),TAN(4.2014)

--5. Find sign of -55, 0 and 95.SELECT SIGN(-55),SIGN(0),SIGN(95)

--String functions
--Part – A:

--1. Find the length of following. (I) NULL (II) ‘ hello ’ (III) Blank
SELECT LEN(NULL),LEN('HELLO'),LEN(' ')

--2. Display your name in lower & upper case.
SELECT LOWER('SHRUTI'),UPPER('SHRUTI')

--3. Display first three characters of your name.
SELECT SUBSTRING('SHRUTI',1,3)

--4. Display 3rd to 10th character of your name.
SELECT SUBSTRING('SHTRUNJAYPRATAPSHINH',3,10)

--5. Write a query to convert ‘abc123efg’ to ‘abcXYZefg’ & ‘abcabcabc’ to ‘ab5ab5ab5’ using REPLACE.
SELECT REPLACE('abc123efg','123','XYZ'),REPLACE('abcabcabc','cabcabc','5ab5ab5')

--6. Write a query to display ASCII code for ‘a’,’A’,’z’,’Z’, 0, 9.
SELECT ASCII('a'),ASCII('A'),ASCII('z'),ASCII('Z'),ASCII(0),ASCII(9)

--7. Write a query to display character based on number 97, 65,122,90,48,57.
SELECT CHAR(97),CHAR(65),CHAR(122),CHAR(90),CHAR(48),CHAR(57)

--8. Write a query to remove spaces from left of a given string ‘hello world ‘.
SELECT LTRIM('		HELLO WORLD ')

--9. Write a query to remove spaces from right of a given string ‘ hello world ‘.
SELECT RTRIM('HELLO WORLD ')

--10. Write a query to display first 4 & Last 5 characters of ‘SQL Server’.
SELECT LEFT('SQL Server',4),RIGHT('SQL Server',5)

--11. Write a query to convert a string ‘1234.56’ to number (Use cast and convert function).
SELECT CONVERT(DECIMAL(6,2),'1234.56')
SELECT CAST('1234.56' AS DECIMAL(6,2))

--12. Write a query to convert a float 10.58 to integer (Use cast and convert function).
SELECT CONVERT(INT,10.58)
SELECT CAST(10.58 AS INT)

--13. Put 10 space before your name using function.
SELECT SPACE(10) + 'SHRUTI'

--14. Combine two strings using + sign as well as CONCAT ().
SELECT 'DARSHAN' + ' ' + 'UNIVERSITY'
SELECT CONCAT('DARSHAN',' ','UNIVERSITY')

--15. Find reverse of “Darshan”.
SELECT REVERSE('Darshan')

--16. Repeat your name 3 times.
SELECT REPLICATE('SHRUTI',3)

--Part – B: 
	--Perform following queries on Student table of practical no 5.

--1. Find the length of FirstName and LastName columns.
SELECT LEN(FIRSTNAME) AS LEN_FNAME,LEN(LASTNAME) AS LEN_LNAME FROM STUDENT

--2. Display FirstName and LastName columns in lower & upper case.
SELECT LOWER(FIRSTNAME) AS LOW_FNAME,LOWER(LASTNAME) AS LOW_LNAME FROM STUDENT
SELECT UPPER(FIRSTNAME) AS UPP_FNAME,UPPER(LASTNAME) AS UPP_LNAME FROM STUDENT

--3. Display first three characters of FirstName column.
SELECT SUBSTRING(FIRSTNAME,1,3) AS [SUBSTRING] FROM STUDENT

--4. Display 3rd to 10th character of Website column.
SELECT SUBSTRING(WEBSITE,3,10) AS 'SUBSTRING' FROM STUDENT

--5. Write a query to display first 4 & Last 5 characters of Website column.
SELECT LEFT(WEBSITE,4) AS FIRST_4_CHAR,RIGHT(WEBSITE,5) AS LAST_5_CHAR FROM STUDENT

--Part – C: 
	--Perform following queries on Student table of practical no 5.

--1. Put 10 space before FirstName using function.
SELECT SPACE(10) + FIRSTNAME AS WITH_SPACE FROM STUDENT

--2. Combine FirstName and LastName columns using + sign as well as CONCAT ().
SELECT FIRSTNAME +' '+ LASTNAME AS FULLNAME FROM STUDENT
SELECT CONCAT(FIRSTNAME,' ',LASTNAME) FROM STUDENT

--3. Combine all columns using + sign as well as CONCAT ().
SELECT * FROM STUDENT 
SELECT STUID +' '+ FIRSTNAME +' '+ LASTNAME +' '+ WEBSITE +' '+ CITY +' '+ ADDRESS AS FULL_DETAIL FROM STUDENT
SELECT CONCAT(STUID,' ',FIRSTNAME,' ',LASTNAME,' ',WEBSITE,' ',CITY,' ',ADDRESS) AS FULL_DETAIL FROM STUDENT

--4. Find reverse of FirstName column.
SELECT REVERSE(FIRSTNAME) AS REV_OF_NAME FROM STUDENT

--5. Repeat FirstName column 3 times.
SELECT REPLICATE(FIRSTNAME,3) AS REPEAT_NAME FROM STUDENT

--6. Give the Names which contains 5 characters.
SELECT FIRSTNAME FROM STUDENT WHERE FIRSTNAME LIKE '_____'

--7. Combine the result as <FirstName> Lives in <City>.
SELECT FIRSTNAME + ' LIVES IN ' + CITY FROM STUDENT 

--8. Combine the result as Student_ID of < FirstName > is <StuID>.
SELECT CONVERT(VARCHAR,'STUDENT_ID OF ' + FIRSTNAME + ' IS ' + CONVERT(VARCHAR,STUID)) FROM STUDENT


--Date Functions
--Part – A:
--1. Write a query to display the current date & time. Label the column Today_Date.
SELECT GETDATE() AS TODAY_DATE

--2. Write a query to find new date after 365 day with reference to today.
SELECT GETDATE()+365

--3. Display the current date in a format that appears as may 5 1994 12:00AM.
SELECT CONVERT(VARCHAR,GETDATE(),100)

--4. Display the current date in a format that appears as 03 Jan 1995.
SELECT CONVERT(VARCHAR,GETDATE(),106)

--5. Display the current date in a format that appears as Jan 04, 96.
SELECT CONVERT(VARCHAR,GETDATE(),7)

--6. Write a query to find out total number of months between 31-Dec-08 and 31-Mar-09.
SELECT DATEDIFF(MONTH,'31-DEC-08','31-MAR-09') AS MONTH_BETWEEN

--7. Write a query to find out total number of years between 25-Jan-12 and 14-Sep-10.
SELECT DATEDIFF(YEAR,'25-Jan-12','14-Sep-10') AS YEAR_BETWEEN

--8. Write a query to find out total number of hours between 25-Jan-12 7:00 and 26-Jan-12 10:30.
SELECT DATEDIFF(HOUR,'25-Jan-12 7:00','26-Jan-12 10:30') AS HOUR_DIFFERENCE

--9. Write a query to extract Day, Month, Year from given date 12-May-16.
SELECT DATEPART(DAY,'12-May-16') AS DATE 
SELECT DATEPART(MONTH,'12-May-16') AS MONTH 
SELECT DATEPART(YEAR,'12-May-16') AS YEAR

SELECT DATENAME(DAY,'12-May-16') AS DATE 
SELECT DATENAME(MONTH,'12-May-16') AS MONTH 
SELECT DATENAME(YEAR,'12-May-16') AS YEAR 

--10. Write a query that adds 5 years to current date.
SELECT DATEADD(YEAR,5,GETDATE()) AS YEAR_ADD
SELECT DATEADD(YY,5,GETDATE()) AS [YEAR_ADD]
SELECT DATEADD(YYYY,5,GETDATE()) AS 'YEAR_ADD'

--11. Write a query to subtract 2 months from current date.
SELECT DATEADD(M,-2,GETDATE()) AS [MONTH_SUBTRACT]
SELECT DATEADD(MM,-2,GETDATE()) AS 'MONTH_SUBTRACT'
SELECT DATEADD(MONTH,-2,GETDATE()) AS MONTH_SUBTRACT

--12. Extract month from current date using datename () and datepart () function.
SELECT DATENAME(MONTH,GETDATE()) AS MONTH 
SELECT DATEPART(MONTH,GETDATE()) AS MONTH 

--13. Write a query to find out last date of current month.
SELECT DAY(EOMONTH(GETDATE())) AS LAST_DATE

--14. Calculate your age in years and months.SELECT DATEDIFF(YEAR,'29-JUL-2006','29-AUG-2024') AS MY_AGESELECT DATEDIFF(MONTH,'29-JULY-2006','29-AUGUST-2024') AS MY_AGE--Part – B:CREATE TABLE EMP_DETAIL(
EMPNO INT,
EMPNAME VARCHAR(25),
JOININGDATE DATETIME,
SALARY DECIMAL(8,2),
CITY VARCHAR(25))

INSERT INTO EMP_DETAIL VALUES 
(101,'KEYUR','02-1-15',12000,'RAJKOT'),
(102,'HARDIK','04-2-15',14000,'AHMEDABAD'),
(103,'KAJAL','06-3-14',15000,'BARODA'),
(104,'BHOOMI','05-6-23',12500,'AHMEDABAD'),
(105,'HARMIT','04-2-15',14000,'RAJKOT'),
(106,'JAY','07-3-12',12000,'SURAT')

SELECT * FROM EMP_DETAIL

--1. Write a query to find new date after 365 day with reference to JoiningDate.
SELECT DAY(JOININGDATE+365) AS NEWDATE FROM EMP_DETAIL--DOUBT

--2. Display the JoiningDate in a format that appears as may 5 1994 12:00AM.
SELECT CONVERT(VARCHAR,GETDATE(),100) AS UPDATED_DATE

--3. Display the JoiningDate in a format that appears as 03 Jan 1995.
SELECT CONVERT(VARCHAR,GETDATE(),106) AS UPDATED_DATE

--4. Display the JoiningDate in a format that appears as Jan 04, 96.
SELECT CONVERT(VARCHAR,GETDATE(),7) AS UPDATED_DATE

--5. Write a query to find out total number of months between JoiningDate and 31-Mar-09.
SELECT DATEDIFF(MONTH,JOININGDATE,'31-Mar-09') AS MONTH_DIFF FROM EMP_DETAIL

--Part – C: 
--1. Write a query to extract Day, Month, Year from JoiningDate.
SELECT DATEPART(DAY,JOININGDATE) AS DATE FROM EMP_DETAIL
SELECT DATEPART(MONTH,JOININGDATE) AS MONTH FROM EMP_DETAIL
SELECT DATEPART(YEAR,JOININGDATE) AS YEAR FROM EMP_DETAIL

SELECT DATENAME(DAY,JOININGDATE) AS DATE FROM EMP_DETAIL
SELECT DATENAME(MONTH,JOININGDATE) AS MONTH FROM EMP_DETAIL
SELECT DATENAME(YEAR,JOININGDATE) AS YEAR FROM EMP_DETAIL

--2. Write a query that adds 5 years to JoiningDate.
SELECT DATEADD(YY,5,JOININGDATE) AS NEWDATE FROM EMP_DETAIL

--3. Write a query to subtract 2 months from JoiningDate.
SELECT DATEADD(M,-2,JOININGDATE) AS NEWDATE FROM EMP_DETAIL

--4. Extract month from JoiningDate using datename () and datepart () function.
SELECT DATENAME(MONTH,JOININGDATE) AS MONTH FROM EMP_DETAIL
SELECT DATEPART(MONTH,JOININGDATE) AS MONTH FROM EMP_DETAIL

--5. Calculate your age in years and months
SELECT DATEDIFF(YEAR,'29-JUL-2006','29-AUG-2024') AS MY_AGESELECT DATEDIFF(MONTH,'29-JULY-2006','29-AUGUST-2024') AS MY_AGE