select b.book_name, count(bt.book_id)
from books b, book_tags bt
where b.book_id = bt.book_id
group by b.book_name;