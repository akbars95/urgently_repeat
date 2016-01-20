USE `english_quiz`;
DROP procedure IF EXISTS `insertEnglish_irregular_verb`;

DELIMITER $$
USE `english_quiz`$$
CREATE PROCEDURE `insertEnglish_irregular_verb` (in english_word_infinitive_idIN int, in english_irregular_verb_simple_pastIN VARCHAR(75), in english_irregular_verb_past_participleIN VARCHAR(75))
BEGIN
	insert into english_irregular_verb(english_word_infinitive_id, english_irregular_verb_simple_past, english_irregular_verb_past_participle) values(english_word_infinitive_idIN, english_irregular_verb_simple_pastIN, english_irregular_verb_past_participleIN);
END$$

DELIMITER ;