SELECT * FROM PERSON

SELECT * FROM DEPT

---------------------------------------PART A-----------------------------------

--1. Find all persons with their department name & code.
SELECT P.PersonName,D.DepartmentName,D.DepartmentCode
FROM PERSON AS P 
JOIN DEPT AS D
ON P.DepartmentID=D.DepartmentID

--2.Find the person's name whose department is in C-Block.
SELECT P.Personname,D.Location
FROM PERSON AS P
JOIN DEPT AS D
ON P.DepartmentID=D.DepartmentID
WHERE D.Location='C-Block'

--3. Retrieve person name, salary & department name who belongs to Jamnagar city.SELECT P.Personname,P.Salary,D.DepartmentNameFROM PERSON AS P
JOIN DEPT AS D
ON P.DepartmentID=D.DepartmentID
WHERE P.City='Jamnagar' or P.City='Jamnager'

--4. Retrieve person name, salary & department name who does not belong to Rajkot city.
SELECT P.Personname,P.Salary,D.DepartmentNameFROM PERSON AS P
JOIN DEPT AS D
ON P.DepartmentID=D.DepartmentID
WHERE P.City != 'Rajkot' and P.City != 'rajkot'

--5.Retrieve person’s name of the person who joined the Civil department after 1-Aug-2001.
SELECT P.Personname,D.DepartmentNameFROM PERSON AS P
JOIN DEPT AS D
ON P.DepartmentID=D.DepartmentID
WHERE D.departmentName='Civil' and P.joiningDate>'1-aug-2001'

--6.Find details of all persons who belong to the computer department.
SELECT P.PersonnameFROM PERSON AS P
JOIN DEPT AS D
ON P.DepartmentID=D.DepartmentID
WHERE d.departmentName='computer'

--7. Display all the person's name with the department whose joining date difference with the current date is more than 365 days.Select P.PersonName,D.DepartmentNameFROM PERSON AS P
JOIN DEPT AS D
ON P.DepartmentID=D.DepartmentIDwhere DATEDIFF(day,joiningdate,GETdate())>365--8.Find department wise person counts.SELECT D.departmentName,count(P.personid)FROM PERSON AS P
JOIN DEPT AS D
ON P.DepartmentID=D.DepartmentIDgroup by  D.departmentName--9. Give department wise maximum & minimum salary with department name.SELECT D.departmentName,max(P.Salary) AS Max_salary ,min(P.Salary) AS Min_salaryFROM PERSON AS P
JOIN DEPT AS D
ON P.DepartmentID=D.DepartmentID
group by  D.departmentName

--10. Find city wise total, average, maximum and minimum salary.
SELECT P.city,sum(P.salary) AS total_salary,AVG(P.salary) AS avg_salary,max(P.Salary) AS Max_salary ,min(P.Salary) AS Min_salaryFROM PERSON AS P
JOIN DEPT AS D
ON P.DepartmentID=D.DepartmentID
group by  P.city

--11. Find the average salary of a person who belongs to Ahmedabad city.
SELECT P.PersonName,P.City ,Avg(P.Salary) AS Avg_salary
FROM PERSON AS P
JOIN DEPT AS D
ON P.DepartmentID=D.DepartmentID
WHERE P.City='Ahmedabad'
Group by P.City,P.PersonName

--12.Produce Output Like: <PersonName> lives in <City> and works in <DepartmentName> Department. (In single column)
SELECT P.PersonName + '  lives in '+P.City+'  and works in '+D.DepartmentName +' Department  '
FROM PERSON AS P
JOIN DEPT AS D
ON P.DepartmentID=D.DepartmentID

-----------------------------------------PART B-------------------------------------------------

--1. Produce Output Like: <PersonName> earns <Salary> from <DepartmentName> department monthly. (In single column)
SELECT P.PersonName +' earns '+Convert(varchar,P.Salary)+ ' from '+ D.DepartmentName +' department monthly '
FROM PERSON AS P
JOIN DEPT AS D
ON P.DepartmentID=D.DepartmentID

--2.Find city & department wise total, average & maximum salaries.
SELECT P.City , D.DepartmentName,Sum(P.Salary) as Total_salary , avg(P.Salary) as avg_salary , min(P.Salary) as min_Salary
FROM PERSON AS P
JOIN DEPT AS D
ON P.DepartmentID=D.DepartmentID
Group by  P.City , D.DepartmentName

--3. Find all persons who do not belong to any department.
Select P.PersonName 
FROM PERSON AS P
left outer JOIN DEPT AS D
ON P.DepartmentID=D.DepartmentID
Where  D.DepartmentName is null


--4. Find all departments whose total salary is exceeding 100000.
Select D.DepartmentName,sum(P.Salary)
FROM PERSON AS P
JOIN DEPT AS D
ON P.DepartmentID=D.DepartmentID
Group by  D.DepartmentName
Having sum(P.Salary)>100000



----------------------------------PART C---------------------------------------

--1. List all departments who have no person.
Select P.PersonName
FROM PERSON AS P
left outer JOIN DEPT AS D
ON P.DepartmentID=D.DepartmentID
Where P.PersonName is null

--2. List out department names in which more than two persons are working.
Select  D.DepartmentName ,count(P.PersonName)
FROM PERSON AS P
JOIN DEPT AS D
ON P.DepartmentID=D.DepartmentID
Group by D.DepartmentName
Having count(P.PersonName)>2

--3.Give a 10% increment in the computer department employee’s salary. (Use Update)
update PERSON
set PERSON.Salary=(PERSON.Salary*0.1)+ PERSON.Salary
FROM PERSON
JOIN DEPT 
ON PERSON.DepartmentID=DEPT.DepartmentID
where DEPT.DepartmentName='computer'


