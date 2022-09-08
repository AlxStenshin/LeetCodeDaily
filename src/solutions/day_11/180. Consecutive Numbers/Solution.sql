/*
 180. Consecutive Numbers
 https://leetcode.com/problems/consecutive-numbers/

 Table: Logs
 +-------------+---------+
 | Column Name | Type    |
 +-------------+---------+
 | id          | int     |
 | num         | varchar |
 +-------------+---------+
 id is the primary key for this table.
 id is an autoincrement column.

 Write an SQL query to find all numbers that appear at least three times consecutively.

 Return the result table in any order.
 */

SELECT DISTINCT l1.num as ConsecutiveNums
FROM Logs l1, Logs l2, Logs l3
WHERE l1.id = l2.id -1 AND l1.id = l3.id -2
  AND l1.num = l2.num AND l1.num = l3.num