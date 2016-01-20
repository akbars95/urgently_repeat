USE `english_quiz`;
DROP procedure IF EXISTS `insertEnglish_word`;

DELIMITER $$
USE `english_quiz`$$
CREATE PROCEDURE `insertEnglish_word` (IN english_wordIN VARCHAR(100), IN word_part_of_speech_idIN INT)
BEGIN
	INSERT into english_word (english_word, word_part_of_speech_id) values (english_wordIN, word_part_of_speech_idIN);
END$$

DELIMITER ;