select avg(b.book_count_of_pages) as book_count_of_pages_avg
from books b;

select count(b.book_count_of_pages) as book_count_of_pages_count
from books b;

select min(b.book_count_of_pages) as book_count_of_pages_min
from books b;

select max(b.book_count_of_pages) as book_count_of_pages_max
from books b;

select sum(b.book_count_of_pages) as book_count_of_pages_sum
from books b;