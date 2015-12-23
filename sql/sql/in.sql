select b.book_name, b.book_count_of_pages, b.book_publish_year, (CONVERT(varchar(50), b.book_file_size) + ' MB') as fileFormat 
from books b
where b.book_count_of_pages IN(206, 720) or b.book_publish_year in(2013);