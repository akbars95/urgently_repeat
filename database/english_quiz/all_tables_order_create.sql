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
