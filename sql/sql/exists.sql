select b.book_name
from books b
where exists (
	select *
	from publishers p
	where p.publisher_name like 'M%'
)


select b.book_name
from books b
where not exists (
	select *
	from publishers p
	where p.publisher_name like 'J%'
)