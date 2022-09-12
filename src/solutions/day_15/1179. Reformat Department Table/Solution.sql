/*
 1179. Reformat Department Table
 https://leetcode.com/problems/reformat-department-table/

 Table: Department
 +-------------+---------+
 | Column Name | Type    |
 +-------------+---------+
 | id          | int     |
 | revenue     | int     |
 | month       | varchar |
 +-------------+---------+
 (id, month) is the primary key of this table.
 The table has information about the revenue of each department per month.
 The month has values in ["Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"].

 Write an SQL query to reformat the table such that there is a department id column and a revenue column for each month.

 Return the result table in any order.
 */

SELECT Department.id,
       sum(if(month='Jan',revenue,null)) as Jan_Revenue,
       sum(if(month='Feb',revenue,null)) as Feb_Revenue,
       sum(if(month='Mar',revenue,null)) as Mar_Revenue,
       sum(if(month='Apr',revenue,null)) as Apr_Revenue,
       sum(if(month='May',revenue,null)) as May_Revenue,
       sum(if(month='Jun',revenue,null)) as Jun_Revenue,
       sum(if(month='Jul',revenue,null)) as Jul_Revenue,
       sum(if(month='Aug',revenue,null)) as Aug_Revenue,
       sum(if(month='Sep',revenue,null)) as Sep_Revenue,
       sum(if(month='Oct',revenue,null)) as Oct_Revenue,
       sum(if(month='Nov',revenue,null)) as Nov_Revenue,
       sum(if(month='Dec',revenue,null)) as Dec_Revenue
from Department
GROUP BY id;