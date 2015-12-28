use op9_9;
select b.book_name, bt.book_tag_id
from book_tags bt right join books b on b.book_id = bt.book_id;