# Write your MySQL query statement below
select customer_id,count(*) count_no_trans
from Transactions t right join Visits v
on v.visit_id=t.visit_id
where t.visit_id is null
group by customer_id