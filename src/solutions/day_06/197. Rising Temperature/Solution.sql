/*
 197. Rising Temperature
 https://leetcode.com/problems/rising-temperature/

 Table: Weather
 +---------------+---------+
 | Column Name   | Type    |
 +---------------+---------+
 | id            | int     |
 | recordDate    | date    |
 | temperature   | int     |
 +---------------+---------+
 id is the primary key for this table.
 This table contains information about the temperature on a certain day.

 Write an SQL query to find all dates' Id with higher temperatures compared to its previous dates (yesterday).

 Return the result table in any order.
 */

SELECT t1.id AS id FROM weather t1
INNER JOIN weather t2
WHERE t1.temperature > t2.temperature
  AND datediff(t1.recorddate, t2.recorddate) = 1;