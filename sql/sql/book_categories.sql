select *
from book_subcategories bsc inner join book_categories bc on bsc.book_category_id = bc.book_category_id;