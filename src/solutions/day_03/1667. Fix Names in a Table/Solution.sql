 /*
 1667. Fix Names in a Table
 https://leetcode.com/problems/fix-names-in-a-table/

 Table: Users
 +----------------+---------+
 | Column Name    | Type    |
 +----------------+---------+
 | user_id        | int     |
 | name           | varchar |
 +----------------+---------+
 user_id is the primary key for this table.
 This table contains the ID and the name of the user. The name consists of only lowercase and uppercase characters.


 Write an SQL query to fix the names so that only the first character is uppercase and the rest are lowercase.
 Return the result table ordered by user_id.

 The query result format is in the following example.
 */

/* Postgres Solution */
SELECT user_id, INITCAP (name) as name
FROM Users
ORDER BY user_id;

/* MySQL Solution */
SELECT user_id, CONCAT(UPPER(SUBSTR(name, 1, 1)), LOWER(SUBSTR(name, 2))) as name
FROM Users
ORDER BY user_id;
