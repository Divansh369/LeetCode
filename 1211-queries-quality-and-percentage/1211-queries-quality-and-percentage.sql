# Write your MySQL query statement below
select query_name, round(sum(rating/position)/count(*),2) as quality, round(count(case when rating<3 then 1 else null end)*100/count(rating),2) as poor_query_percentage from Queries WHERE query_name IS NOT NULL 
group by query_name;