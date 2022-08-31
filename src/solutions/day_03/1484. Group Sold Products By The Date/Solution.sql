/*
 1484. Group Sold Products By The Date
 https://leetcode.com/problems/group-sold-products-by-the-date/

 Table Activities:
 +-------------+---------+
 | Column Name | Type    |
 +-------------+---------+
 | sell_date   | date    |
 | product     | varchar |
 +-------------+---------+
 There is no primary key for this table, it may contain duplicates.
 Each row of this table contains the product name and the date it was sold in a market.

 Write an SQL query to find for each date the number of different products sold and their names.
 The sold products names for each date should be sorted lexicographically.
 Return the result table ordered by sell_date.
 */

/* MySQL solution */
/*
SELECT sell_date, count(distinct(product)) as num_sold,
GROUP_CONCAT(DISTINCT product ORDER BY product SEPARATOR ',') AS products
FROM activities
GROUP BY sell_date
ORDER BY sell_date;
*/

/* Postgres solution */
SELECT sell_date,
       COUNT(distinct(product)) as num_sold,
       ARRAY_TO_STRING(ARRAY_AGG(DISTINCT product ORDER BY product), ',') AS products
FROM Activities
GROUP BY sell_date
ORDER BY sell_date;