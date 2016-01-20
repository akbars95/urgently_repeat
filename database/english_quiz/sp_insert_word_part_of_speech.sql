USE `english_quiz`;
DROP procedure IF EXISTS `insert_word_part_of_speech`;

DELIMITER $$
USE `english_quiz`$$
CREATE PROCEDURE `insert_word_part_of_speech` (IN word_part_of_speech_name_rusIN varchar(50), IN word_part_of_speech_name_engIN varchar(50))
BEGIN
	
    insert into word_part_of_speech(word_part_of_speech_name_rus, word_part_of_speech_name_eng) 
    values(word_part_of_speech_name_rusIN, word_part_of_speech_name_engIN);
    
END$$

DELIMITER ;