/*
 184. Department Highest Salary
 https://leetcode.com/problems/department-highest-salary/

 Table: Employee
 +--------------+---------+
 | Column Name  | Type    |
 +--------------+---------+
 | id           | int     |
 | name         | varchar |
 | salary       | int     |
 | departmentId | int     |
 +--------------+---------+
 id is the primary key column for this table.
 departmentId is a foreign key of the ID from the Department table.
 Each row of this table indicates the ID, name, and salary of an employee. It also contains the ID of their department.

 Table: Department
 +-------------+---------+
 | Column Name | Type    |
 +-------------+---------+
 | id          | int     |
 | name        | varchar |
 +-------------+---------+
 id is the primary key column for this table.
 Each row of this table indicates the ID of a department and its name.

 Write an SQL query to find employees who have the highest salary in each of the departments.
 Return the result table in any order.
 */

SELECT  Department.name AS Department,
        Employee.name as Employee,
        Employee.salary as Salary
FROM Employee
         JOIN Department ON Employee.departmentId = Department.id
WHERE (Salary, Department.id) IN (
    SELECT MAX(Salary), DepartmentId
    FROM Employee
    GROUP BY DepartmentId);