select bsc.[book_subcategory_name], count(b.book_id)
from books b inner join book_subcategories bsc on b.book_subcategory_id = bsc.[book_subcategory_id]
where b.book_publisher_id in (
	select p.publisher_id
	from publishers p
	where p.publisher_city_id in (
		select c.city_id
		from cities c
		where c.city_country_id = (
			select cc.country_id
			from countries cc
			where cc.country_name = 'Russia'
		)
	)
)
group by bsc.[book_subcategory_name]
having count(b.book_id) > 5;


-----
