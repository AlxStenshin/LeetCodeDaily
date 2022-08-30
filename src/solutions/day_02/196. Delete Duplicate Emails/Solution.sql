/*
 196. Delete Duplicate Emails
 https://leetcode.com/problems/delete-duplicate-emails/

 Table: Person
 +-------------+---------+
 | Column Name | Type    |
 +-------------+---------+
 | id          | int     |
 | email       | varchar |
 +-------------+---------+
 id is the primary key column for this table.
 Each row of this table contains an email. The emails will not contain uppercase letters.


 Write an SQL query to delete all the duplicate emails,
 keeping only one unique email with the smallest id.
 Note that you are supposed to write a DELETE statement and not a SELECT one.

 After running your script, the answer shown is the Person table.
 The driver will first compile and run your piece of code and then show the Person table.
 The final order of the Person table does not matter.
 */

/* Postgre SQL Solution: */
DELETE FROM person p1
       USING person p2
WHERE p1.email = p2.email
  AND p1.id > p2.id



/* MySQL Solution:
DELETE a from Person a
    join Person b
where a.id > b.id and a.email = b.email;
 */
