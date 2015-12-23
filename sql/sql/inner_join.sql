select b.book_name, l.language_name, ff.file_format_name
from books b inner join languages l on b.book_language_id = l.language_id 
inner join file_formats ff on b.book_file_format_id = ff.file_format_id;