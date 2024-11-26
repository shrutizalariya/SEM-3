Create table SALES_DATA(
	Region varchar(50),
	Product varchar(25),
	Sales_Amount decimal(8,2),
	Year int
);

insert into SALES_DATA (Region , Product , Sales_Amount , Year ) values
('North America','Watch',1500,2023),
('Europe','Mobile',1200,2023),
('Asia','Watch',1800,2023),
('North America','TV',900,2024),
('Europe','Watch',2000,2024),
('Asia','Mobile',1000,2024),
('North America','Mobile',1600,2023),
('Europe','TV',1500,2023),
('Asia','TV',1100,2024),
('North America','Watch',1700,2024)

select * from SALES_DATA;

--Part � A: 

--1. Display Total Sales Amount by Region. 
	select 
		Region , 
		sum(Sales_Amount) 
	from SALES_DATA 
	group by Region;

--2. Display Average Sales Amount by Product 
	select 
		Product ,
		avg(Sales_Amount) 
	from SALES_DATA 
	group by Product;

--3. Display Maximum Sales Amount by Year 
	select 
		Year , 
		max(Sales_Amount) 
	from SALES_DATA 
	group by Year;

--4. Display Minimum Sales Amount by Region and Year 
	select 
		Region , 
		Year , 
		min(Sales_Amount) 
	from SALES_DATA 
	group by Region , Year;

--5. Count of Products Sold by Region 
	select 
		Region , 
		count(Product) 
	from SALES_DATA 
	group by Region;

--6. Display Sales Amount by Year and Product 
	select 
		Year , 
		Product , 
		sum(Sales_Amount) 
	from SALES_DATA 
	group by Year , Product;

--7. Display Regions with Total Sales Greater Than 5000 
	select 
		Region , 
		sum(Sales_Amount) 
	from SALES_DATA 
	group by Region 
	having sum(Sales_Amount) > 5000;

--8. Display Products with Average Sales Less Than 10000
	select 
		Product , 
		avg(Sales_Amount) 
	from SALES_DATA 
	group by Product 
	having avg(Sales_Amount) < 10000;

--9. Display Years with Maximum Sales Exceeding 500 
	select 
		Year , 
		max(Sales_Amount) 
	from SALES_DATA 
	group by Year 
	having max(Sales_Amount) > 500;
	
--10. Display Regions with at Least 3 Distinct Products Sold.
	select 
		Region , 
		COUNT(distinct Product) 
	from SALES_DATA 
	group by Region 
	having COUNT(distinct Product) >= 3;

--11. Display Years with Minimum Sales Less Than 1000 
	select 
		Year , 
		MIN(Sales_Amount) 
	from SALES_DATA 
	group by Year 
	having MIN(Sales_Amount) < 1000;

--12. Display Total Sales Amount by Region for Year 2023, Sorted by Total Amount
	select 
		Region , 
		sum(Sales_Amount) 
	from SALES_DATA 
	where Year = 2023 
	group by Region 
	order by SUM(Sales_Amount);

--Part � B: 

--1. Display Count of Orders by Year and Region, Sorted by Year and Region 
	select 
		Year , 
		Region , 
		count(Product) 
	from SALES_DATA 
	group by Year , Region 
	order by Year , Region;

--2. Display Regions with Maximum Sales Amount Exceeding 1000 in Any Year, Sorted by Region 
	select 
		Region , 
		Year , 
		max(Sales_Amount) 
	from SALES_DATA 
	group by Region , Year 
	having  max(Sales_Amount) > 1000 
	order by Region;

--3. Display Years with Total Sales Amount Less Than 1000, Sorted by Year Descending
	select 
		Year , 
		sum(Sales_Amount) 
	from SALES_DATA 
	group by Year 
	having sum(Sales_Amount) < 1000 
	order by Year 
	desc;

--4. Display Top 3 Regions by Total Sales Amount in Year 2024 
	select 
		Top 3 Region , 
		sum(Sales_Amount)
	from SALES_DATA
	where Year = 2024
	group by Region;

--Part � C: 
--1. Display Products with Average Sales Amount Between 1000 and 2000, Ordered by Product Name
	select
		Product ,
		avg(Sales_Amount)
	from SALES_DATA
	group by Product
	having avg(Sales_Amount) between 1000 and 2000 
	order by Product;

--2. Display Years with More Than 5 Orders from Each Region 
	select 
		Year
		Region,
		COUNT(Product)
	from SALES_DATA
	group by Region , Year
	having COUNT(Product) > 5

--3. Display Regions with Average Sales Amount Above 1500 in Year 2023 sort by amount in descending.
	select 
		Region,
		avg(Sales_Amount)
	from SALES_DATA 
	where Year = 2023
	Group by Region
	having avg(Sales_Amount) > 1500
	order by avg(Sales_Amount) 
	desc;

--4. Find out region wise duplicate product. 
	select 
		Region ,
		Product ,
		COUNT(Product)
	from SALES_DATA
	group by Region , Product 
	having COUNT(Product) > 1;
		
--5. Find out region wise highest sales amount.
	select 
		Region ,
		max(Sales_Amount) as Highest_Amount 
	from SALES_DATA
	group by Region;
