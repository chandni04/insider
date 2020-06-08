a> Write an SQL query to find nth largest salary along with employee name.

SELECT E.EmpName, S.Salary FROM Employee E JOIN Salary S ON E.EmpId = S.EmpId
WHERE S.Salary = (SELECT DISTINCT Salary FROM Salary ORDER BY Salary DESC LIMIT n-1, 1);

-- here we need to replace n with the value we are interestsed in.

b> Write a query to update salary of employees to 5000 whose age is 30+

UPDATE Salary SET Salary = 5000 
WHERE EmpId IN (SELECT EmpId FROM Employee WHERE DATEDIFF(NOW(), Date_of_Birth) / 365.25 > 30);