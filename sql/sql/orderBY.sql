select b.book_count_of_pages, *
from books b
order by  b.book_publish_year, b.book_count_of_pages desc;