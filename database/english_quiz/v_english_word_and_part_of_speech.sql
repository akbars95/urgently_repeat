USE `english_quiz`;
CREATE  OR REPLACE VIEW `english_word_and_part_of_speech` AS

select ew.*, wpos.word_part_of_speech_name_eng
from english_word ew inner join word_part_of_speech wpos
on ew.word_part_of_speech_id = wpos.word_part_of_speech_id;
