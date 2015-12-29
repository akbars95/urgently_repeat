select b.book_name, books_author_count.book_authors_count
from books b, (
select ba.book_id, count(ba.book_id) as book_authors_count
from book_author ba inner join authors a on ba.author_id = a.author_id
group by ba.book_id
) as books_author_count
where b.book_id = books_author_count.book_id;


select b.book_name, publishersFromMoscowAndSaintPetersburg.publisher_name, publishersFromMoscowAndSaintPetersburg.city_name
from books b inner join (
	select * 
	from publishers p inner join cities c on p.publisher_city_id = c.city_id
	where c.city_name = 'Moscow' or c.city_name = 'Saint Petersburg'
) as publishersFromMoscowAndSaintPetersburg on b.book_publisher_id = publishersFromMoscowAndSaintPetersburg.publisher_id
where b.book_publish_year > 2002;


select publishersFromMoscowAndSaintPetersburg.city_name, count(b.book_id), AVG(b.book_count_of_pages), SUM(b.book_count_of_pages)
from books b inner join (
	select * 
	from publishers p inner join cities c on p.publisher_city_id = c.city_id
	where c.city_name = 'Moscow' or c.city_name = 'Saint Petersburg'
) as publishersFromMoscowAndSaintPetersburg on b.book_publisher_id = publishersFromMoscowAndSaintPetersburg.publisher_id
where b.book_publish_year > 2002
group by publishersFromMoscowAndSaintPetersburg.city_name;