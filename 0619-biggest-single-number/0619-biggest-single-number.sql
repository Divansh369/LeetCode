# Write your MySQL query statement below
select max(num) as num from (
SELECT num
FROM MyNumbers
GROUP BY num
HAVING count(*) = 1) as sub;
