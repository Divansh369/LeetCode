# Write your MySQL query statement below
select(SELECT
     distinct salary 
FROM
    Employee
ORDER BY
    salary  desc
LIMIT 1 OFFSET 1) as SecondHighestSalary;