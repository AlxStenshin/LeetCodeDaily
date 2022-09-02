/*
 1581. Customer Who Visited but Did Not Make Any Transactions
 https://leetcode.com/problems/customer-who-visited-but-did-not-make-any-transactions/

 Table: Visits
 +-------------+---------+
 | Column Name | Type    |
 +-------------+---------+
 | visit_id    | int     |
 | customer_id | int     |
 +-------------+---------+
 visit_id is the primary key for this table.
 This table contains information about the customers who visited the mall.

 Table: Transactions
 +----------------+---------+
 | Column Name    | Type    |
 +----------------+---------+
 | transaction_id | int     |
 | visit_id       | int     |
 | amount         | int     |
 +----------------+---------+
 transaction_id is the primary key for this table.
 This table contains information about the transactions made during the visit_id.

 Write an SQL query to find the IDs of the users who visited without making any transactions
 and the number of times they made these types of visits.

 Return the result table sorted in any order.
 */

SELECT customer_id, COUNT(visit_id) AS count_no_trans
FROM Visits
WHERE visit_id NOT IN (
    SELECT v.visit_id
    FROM Visits v JOIN Transactions t ON t.visit_id = v.visit_id
)
GROUP BY customer_id