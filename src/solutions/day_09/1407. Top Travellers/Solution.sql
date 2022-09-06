/*
 1407. Top Travellers
 https://leetcode.com/problems/top-travellers/

 Table: Users
 +---------------+---------+
 | Column Name   | Type    |
 +---------------+---------+
 | id            | int     |
 | name          | varchar |
 +---------------+---------+
 id is the primary key for this table.
 name is the name of the user.

 Table: Rides
 +---------------+---------+
 | Column Name   | Type    |
 +---------------+---------+
 | id            | int     |
 | user_id       | int     |
 | distance      | int     |
 +---------------+---------+
 id is the primary key for this table.
 user_id is the id of the user who traveled the distance "distance".

 Write an SQL query to report the distance traveled by each user.

 Return the result table ordered by travelled_distance in descending order,
 if two or more users traveled the same distance,
 order them by their name in ascending order.
 */

SELECT name, IFNULL(SUM(distance), 0) AS travelled_distance
FROM users
LEFT JOIN Rides on users.id = rides.user_id
GROUP BY users.id
ORDER BY travelled_distance DESC, name;
