select b.book_name, max(b.book_count_of_pages) as book_count_of_pages_max
from books b
group by b.book_name;


select *
from books bI
where bI.book_count_of_pages = (
	select min(b.book_count_of_pages)
	from books b);
	
	
select a.author_firstname, author_lastname, count(b.book_name)
from authors a inner join book_author ba on a.author_id = ba.author_id
inner join books b on ba.book_id = b.book_id
group by a.author_firstname, author_lastname;