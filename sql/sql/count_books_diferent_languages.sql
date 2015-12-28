select l.language_name_short, count(b.book_id)
from books b inner join languages l on b.book_language_id = l.language_id
group by l.language_name_short;