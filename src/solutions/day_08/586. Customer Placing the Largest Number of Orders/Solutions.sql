/*
 586. Customer Placing the Largest Number of Orders
 https://leetcode.com/problems/customer-placing-the-largest-number-of-orders/

 Table: Orders
 +-----------------+----------+
 | Column Name     | Type     |
 +-----------------+----------+
 | order_number    | int      |
 | customer_number | int      |
 +-----------------+----------+
 order_number is the primary key for this table.
 This table contains information about the order ID and the customer ID.

 Write an SQL query to find the customer_number for the customer who has placed the largest number of orders.

 The test cases are generated so that exactly one customer will have placed more orders than any other customer.
 */
SELECT customer_number
FROM (
         SELECT customer_number, COUNT(order_number) AS order_count
         FROM Orders
         GROUP BY customer_number
         ORDER BY order_count DESC
         LIMIT 1
     ) as orders_count