/*
 176. Second Highest Salary
 https://leetcode.com/problems/second-highest-salary/

 Table: Employee
 +-------------+------+
 | Column Name | Type |
 +-------------+------+
 | id          | int  |
 | salary      | int  |
 +-------------+------+
 id is the primary key column for this table.
 Each row of this table contains information about the salary of an employee.

 Write an SQL query to report the second highest salary from the Employee table.
 If there is no second highest salary, the query should report null.
 */

SELECT MAX(salary) as SecondHighestSalary
FROM employee
WHERE salary <> (
                SELECT MAX(salary)
                FROM employee
                )