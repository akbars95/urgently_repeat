use op9_9;
-----select books only pdf
select *
from books b
where b.book_file_format_id IN (
	select ff.file_format_id
	from file_formats ff
	where ff.file_format_name = '.pdf' or ff.file_format_name = '.doc'
)
order by b.book_file_format_id;

select *
from books b
where b.book_publisher_id in (
	select p.publisher_id
	from publishers p inner join cities c on p.publisher_city_id = c.city_id
	inner join countries cc on c.city_country_id = cc.country_id
	where cc.country_name = 'Russia'
);


select c.city_name, count(b.book_id)
from books b inner join publishers p on b.book_publisher_id = p.publisher_id
inner join cities c on p.publisher_city_id = c.city_id
group by c.city_name
having count(b.book_id) > (
	10
);

