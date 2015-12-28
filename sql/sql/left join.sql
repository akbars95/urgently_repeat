use op9_9;
select b.book_name, bt.book_tag_id
from books b left join book_tags bt on b.book_id = bt.book_id;