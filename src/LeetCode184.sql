SELECT Department.name AS Department,
Employee.name AS Employee,
Employee.Salary AS Salary
FROM Department,Employee
WHERE Employee.DepartmentId = Department.Id
AND (Employee.DepartmentId,Employee.Salary) IN (
    SELECT DepartmentId,max(Salary)
    FROM Employee
    GROUP BY DepartmentId
)
