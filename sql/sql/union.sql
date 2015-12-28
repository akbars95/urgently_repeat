select c.country_name
from countries c
union
select cc.city_name
from cities cc;

select c.country_name
from countries c
union all
select cc.city_name
from cities cc;


select c.country_name as city_name
from countries c
where c.country_name = 'Russia'
union
select cc.city_name
from cities cc
order by city_name;