/*
 1873. Calculate Special Bonus
 https://leetcode.com/problems/calculate-special-bonus/

 Table: Employees
 +-------------+---------+
 | Column Name | Type    |
 +-------------+---------+
 | employee_id | int     |
 | name        | varchar |
 | salary      | int     |
 +-------------+---------+
 employee_id is the primary key for this table.
 Each row of this table indicates the employee ID, employee name, and salary.


 Write an SQL query to calculate the bonus of each employee.
 The bonus of an employee is 100% of their salary if the ID of the employee is an odd number and
 the employee name does not start with the character 'M'.
 The bonus of an employee is 0 otherwise.

 Return the result table ordered by employee_id.

 The query result format is in the following example.
 */

SELECT employee_id,
       (CASE
            WHEN MOD(e.employee_id, 2) = 0 then 0
            WHEN e.name LIKE 'M%' then 0
            ELSE e.salary
           END) AS bonus
FROM Employees e
ORDER BY e.employee_id