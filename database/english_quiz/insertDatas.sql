call insert_word_part_of_speech('Имя существительное', 'Noun');
call insert_word_part_of_speech('Местоимение', 'Pronoun');
call insert_word_part_of_speech('Имя прилагательное', 'Adjective');
call insert_word_part_of_speech('Глагол', 'Verb');
call insert_word_part_of_speech('Наречие', 'Adverb');
call insert_word_part_of_speech('Предлог', 'Preposition');
call insert_word_part_of_speech('Союз', 'Conjunction');
call insert_word_part_of_speech('Междометие', 'Interjection');
call insert_word_part_of_speech('Артикль', 'Article');

/*select *
from word_part_of_speech
*/

call insertEnglish_word('hello', 1);
call insertEnglish_word('hi', 1);
call insertEnglish_word('good day', 1);