/*
 1965. Employees With Missing Information
 https://leetcode.com/problems/employees-with-missing-information/

 Table: Employees
 +-------------+---------+
 | Column Name | Type    |
 +-------------+---------+
 | employee_id | int     |
 | name        | varchar |
 +-------------+---------+
 employee_id is the primary key for this table.
 Each row of this table indicates the name of the employee whose ID is employee_id.


 Table: Salaries
 +-------------+---------+
 | Column Name | Type    |
 +-------------+---------+
 | employee_id | int     |
 | salary      | int     |
 +-------------+---------+
 employee_id is the primary key for this table.
 Each row of this table indicates the salary of the employee whose ID is employee_id.


 Write an SQL query to report the IDs of all the employees with missing information.
 The information of an employee is missing if:

 The employee's name is missing, or
 The employee's salary is missing.
 Return the result table ordered by employee_id in ascending order.

 The query result format is in the following example.
 */

SELECT e.employee_id
FROM Employees e
LEFT JOIN salaries s on e.employee_id = s.employee_id
WHERE salary IS NUll

   union

SELECT s.employee_id
FROM salaries s
LEFT JOIN employees e on s.employee_id = e.employee_id
WHERE name IS NUll

ORDER BY employee_id