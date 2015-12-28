select b.book_id, b.book_name, b.book_isbn, b.book_count_of_pages, b.book_publish_year, b.book_file_size, ff.file_format_name, p.publisher_name, 
		l.language_name, bs.book_subcategory_name, bc.book_category_name, c.city_name, cc.country_name
from books b inner join file_formats ff on b.book_file_format_id = ff.file_format_id
inner join publishers p on b.book_publisher_id = p.publisher_id
inner join languages l on b.book_language_id = l.language_id
inner join book_subcategories bs on b.book_subcategory_id = bs.book_subcategory_id
inner join book_categories bc on bs.book_category_id = bc.book_category_id
inner join cities c on p.publisher_city_id = c.city_id
inner join countries cc on c.city_country_id = cc.country_id
order by b.book_count_of_pages desc;