CREATE TABLE `english_quiz`.`word_part_of_speech` (
  `word_part_of_speech_id` INT NOT NULL AUTO_INCREMENT,
  `word_part_of_speech_name_eng` VARCHAR(50) NOT NULL,
  `word_part_of_speech_name_rus` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`word_part_of_speech_id`),
  UNIQUE INDEX `word_part_of_speech_name_eng_UNIQUE` (`word_part_of_speech_name_eng` ASC),
  UNIQUE INDEX `word_part_of_speech_name_rus_UNIQUE` (`word_part_of_speech_name_rus` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_unicode_ci;
