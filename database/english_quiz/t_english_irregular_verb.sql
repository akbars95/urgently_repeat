CREATE TABLE `english_quiz`.`english_irregular_verb` (
  `english_irregular_verb_id` INT NOT NULL AUTO_INCREMENT,
  `english_word_infinitive_id` INT NULL,
  `english_irregular_verb_simple_past` VARCHAR(75) NULL,
  `english_irregular_verb_past_participle` VARCHAR(75) NULL,
  PRIMARY KEY (`english_irregular_verb_id`),
  UNIQUE INDEX `english_irregular_verb_simple_past_UNIQUE` (`english_irregular_verb_simple_past` ASC),
  UNIQUE INDEX `english_irregular_verbcol_UNIQUE` (`english_irregular_verb_past_participle` ASC),
  INDEX `english_word_infinitive_id_english_irregular_verb_id_idx` (`english_word_infinitive_id` ASC),
  CONSTRAINT `english_word_infinitive_id_english_irregular_verb_id`
    FOREIGN KEY (`english_word_infinitive_id`)
    REFERENCES `english_quiz`.`english_word` (`english_word_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);
