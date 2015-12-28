select a.author_firstname, author_lastname, count(b.book_name)
from authors a inner join book_author ba on a.author_id = ba.author_id
inner join books b on ba.book_id = b.book_id
group by a.author_firstname, author_lastname
having count(b.book_name) > 1;