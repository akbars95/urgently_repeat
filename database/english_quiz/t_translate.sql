CREATE TABLE `english_quiz`.`translate` (
  `russian_word_id` INT NULL,
  `english_word_id` INT NULL,
  INDEX `russian_word_id_russian_word_id_idx` (`russian_word_id` ASC),
  INDEX `english_word_id_english_word_id_idx` (`english_word_id` ASC),
  CONSTRAINT `russian_word_id_russian_word_id`
    FOREIGN KEY (`russian_word_id`)
    REFERENCES `english_quiz`.`russian_word` (`russian_word_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `english_word_id_english_word_id`
    FOREIGN KEY (`english_word_id`)
    REFERENCES `english_quiz`.`english_word` (`english_word_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);
