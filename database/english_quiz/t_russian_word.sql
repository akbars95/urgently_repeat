CREATE TABLE `english_quiz`.`russian_word` (
  `russian_word_id` INT NOT NULL AUTO_INCREMENT,
  `russian_word` VARCHAR(100) NULL,
  `word_part_of_speech_id` INT NULL,
  PRIMARY KEY (`russian_word_id`),
  UNIQUE INDEX `russian_word_UNIQUE` (`russian_word` ASC),
  INDEX `russian_word_id_word_part_of_speech_id_idx` (`word_part_of_speech_id` ASC),
  CONSTRAINT `russian_word_id_word_part_of_speech_id`
    FOREIGN KEY (`word_part_of_speech_id`)
    REFERENCES `english_quiz`.`word_part_of_speech` (`word_part_of_speech_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_unicode_ci;
