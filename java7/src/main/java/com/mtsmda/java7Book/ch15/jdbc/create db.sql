create DATABASE football;

CREATE TABLE `countries` (
  `country_id` int(11) NOT NULL AUTO_INCREMENT,
  `country_name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`country_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


CREATE TABLE `cities` (
  `city_id` int(11) NOT NULL AUTO_INCREMENT,
  `city_name` varchar(100) NOT NULL,
  `country_id` int(11) NOT NULL,
  PRIMARY KEY (`city_id`),
  KEY `country_id` (`country_id`),
  CONSTRAINT `cities_ibfk_1` FOREIGN KEY (`country_id`) REFERENCES `countries` (`country_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


CREATE TABLE `football_club` (
  `fc_id` int(11) NOT NULL AUTO_INCREMENT,
  `fc_name` varchar(100) NOT NULL,
  `fc_city_id` int(11) NOT NULL,
  PRIMARY KEY (`fc_id`),
  KEY `fc_city_id` (`fc_city_id`),
  CONSTRAINT `football_club_ibfk_1` FOREIGN KEY (`fc_city_id`) REFERENCES `cities` (`city_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


CREATE TABLE `f_player` (
  `fp_id` int(11) NOT NULL AUTO_INCREMENT,
  `fp_lastname` varchar(50) NOT NULL,
  `fp_firstname` varchar(50) NOT NULL,
  `fc_id` int(11) NOT NULL,
  PRIMARY KEY (`fp_id`),
  KEY `fc_id` (`fc_id`),
  CONSTRAINT `f_player_ibfk_1` FOREIGN KEY (`fc_id`) REFERENCES `football_club` (`fc_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;