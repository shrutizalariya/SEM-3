--Part – A: 
--Create table and inset records as per below.

Create table EMP(
	EID INT,
	EName varchar(50),
	Department varchar(50),
	Salary decimal(8,2),
	JoiningDate datetime,
	City varchar(50)
);

insert into EMP (EID,EName,Department,Salary,JoiningDate,City) values 
(101,'Rahul','Admin',56000,'1990-Jan-01','Rajkot'),
(102,'Hardik','IT',18000,'1990-Sep-25','Ahmedabad'),
(103,'Bhavin','HR',25000,'1991-May-14','Baroda'),
(104,'Bhoomi','Admin',39000,'1991-Feb-08','Rajkot'),
(105,'Rohit','IT',17000,'1990-Jul-23','Jamnagar'),
(106,'Priya','IT',9000,'1990-Oct-18','Ahmedabad'),
(107,'Bhoomi','HR',34000,'1991-Dec-25','Rajkot')

select * from EMP ;

--1. Display the Highest, Lowest, Label the columns Maximum, Minimum respectively.
	select max(Salary) as Maximum , min(Salary) as Minimum from EMP;

--2. Display Total, and Average salary of all employees. Label the columns Total_Sal and Average_Sal respectively. 
	select sum(Salary) as Total_Sal , Avg(Salary) as Average_Sal from EMP;

--3. Find total number of employees of EMPLOYEE table. 
	select count(EID) from EMP;

--4. Find highest salary from Rajkot city. 
	select max(Salary) from EMP where City = 'Rajkot';

--5. Give maximum salary from IT department.
	select max(Salary) from EMP where Department = 'IT';

--6. Count employee whose joining date is after 8-feb-91.
	select count(EID) from EMP where JoiningDate > '1991-Feb-08';

--7. Display average salary of Admin department. 
	select AVG(Salary) from EMP where Department = 'Admin';

--8. Display total salary of HR department.
	select sum(Salary) from EMP where Department = 'HR';

--9. Count total number of cities of employee without duplication.
	select count(distinct City) from EMP;

--10. Count unique departments. 
	select count(distinct Department) from EMP;

--11. Give minimum salary of employee who belongs to Ahmedabad. 
	select min(Salary) from EMP where City = 'Ahmedabad';

--12. Find city wise highest salary. 
	select City , max(Salary) from EMP group By City;

--13. Find department wise lowest salary. 
	select Department , min(Salary) from EMP Group By Department; 

--14. Display city with the total number of employees belonging to each city. 
	select City , count(EID) from EMP Group By City;

--15. Give total salary of each department of EMP table. 
	select Department , sum(Salary) from EMP Group By Department;

--16. Give average salary of each department of EMP table without displaying the respective department name.
	select avg(Salary) from EMP Group By Department;


--Part – B:

--1. Count the number of employees living in Rajkot. 
	select COUNT(EID) from EMP where City = 'Rajkot';

--2. Display the difference between the highest and lowest salaries. Label the column DIFFERENCE.
	select max(Salary) as Maximum , min(Salary) as Minimum , (max(Salary)-min(Salary)) as DIFFERENCE from EMP; 

--3. Display the total number of employees hired before 1st January, 1991. 
	select count(EID) from EMP where JoiningDate < '1991-Jan-01';


--Part – C: 

--1. Count the number of employees living in Rajkot or Baroda. 
	select count(EID) from EMP where City = 'Rajkot' or City = 'Baroda';

--2. Display the total number of employees hired before 1st January, 1991 in IT department. 
	select count(EID) from EMP where JoiningDate < '1991-Jan-01' and Department = 'IT';

--3. Find the Joining Date wise Total Salaries.
	select JoiningDate , sum(Salary) from EMP group by JoiningDate;

--4. Find the Maximum salary department & city wise in which city name starts with ‘R’. 
	select Department , City , max(Salary) from EMP where City like 'R%' group by Department , City ;