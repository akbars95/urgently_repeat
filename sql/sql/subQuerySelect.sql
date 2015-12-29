select a.author_firstname, a.author_lastname, (
	select max(b.book_price) as max_book_price
	from books b inner join book_author ba on b.book_id = ba.book_id
	inner join authors a on ba.author_id = a.author_id
) as max_book_name
from authors a;


select a.author_firstname, a.author_lastname, max(b.book_price) as max_book_price
	from books b inner join book_author ba on b.book_id = ba.book_id
	inner join authors a on ba.author_id = a.author_id
	group by a.author_firstname, a.author_lastname
	order by max_book_price;