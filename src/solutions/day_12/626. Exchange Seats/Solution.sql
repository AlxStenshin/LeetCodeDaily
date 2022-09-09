/*
 626. Exchange Seats
 https://leetcode.com/problems/exchange-seats/

 Table: Seat
 +-------------+---------+
 | Column Name | Type    |
 +-------------+---------+
 | id          | int     |
 | student     | varchar |
 +-------------+---------+
 id is the primary key column for this table.
 Each row of this table indicates the name and the ID of a student.
 id is a continuous increment.


 Write an SQL query to swap the seat id of every two consecutive students.
 If the number of students is odd, the id of the last student is not swapped.

 Return the result table ordered by id in ascending order.
 */

SELECT id - 1 as id, student
FROM Seat
WHERE id MOD 2 = 0

UNION

SELECT id + 1 as id, student
FROM Seat
WHERE id MOD 2 = 1 AND id != (SELECT MAX(id) FROM Seat)

UNION

SELECT id, student
FROM Seat
WHERE id MOD 2 = 1 AND id = (SELECT MAX(id) FROM Seat)

ORDER BY id ASC;