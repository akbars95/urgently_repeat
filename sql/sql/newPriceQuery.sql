use op9_9;
select b.book_name, b.book_price, b.book_price * 1.15 as new_price
from books b inner join book_subcategories bs on b.book_subcategory_id = bs.book_subcategory_id
inner join book_categories bc on bc.book_category_id = bs.book_category_id
where bc.book_category_name = 'programming language' and bs.[book_subcategory_name] = 'JAVA';