CREATE TABLE `english_quiz`.`english_word` (
  `english_word_id` INT NOT NULL AUTO_INCREMENT,
  `english_word` VARCHAR(100) NOT NULL,
  `word_part_of_speech_id` INT NULL,
  PRIMARY KEY (`english_word_id`),
  UNIQUE INDEX `english_word_UNIQUE` (`english_word` ASC),
  INDEX `english_word_id_word_part_of_speech_id_idx` (`word_part_of_speech_id` ASC),
  CONSTRAINT `english_word_id_word_part_of_speech_id`
    FOREIGN KEY (`word_part_of_speech_id`)
    REFERENCES `english_quiz`.`word_part_of_speech` (`word_part_of_speech_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);
