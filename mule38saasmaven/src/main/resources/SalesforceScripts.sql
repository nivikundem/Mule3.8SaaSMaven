DROP TABLE IF EXISTS `salesforce`.`accounts`;
CREATE TABLE  `salesforce`.`accounts` (
  `accountID` varchar(45) NOT NULL DEFAULT '',
  `name` varchar(45) DEFAULT NULL,
  `street` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  `postal` varchar(45) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`accountID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `salesforce`.`logfailure`;
CREATE TABLE  `salesforce`.`logfailure` (
  `LogFailureId` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Process` varchar(45) NOT NULL DEFAULT '',
  `Message` varchar(45) NOT NULL DEFAULT '',
  `AdditionalText` varchar(45) NOT NULL DEFAULT '',
  `servername` varchar(45) NOT NULL DEFAULT '',
  PRIMARY KEY (`LogFailureId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;