select b.book_name, b.book_count_of_pages, b.book_publish_year, (CONVERT(varchar(50), b.book_file_size) + ' MB') as fileFormat 
from books b
where b.book_name like 'J%' or b.book_name like '%n' or b.book_name like '__v';