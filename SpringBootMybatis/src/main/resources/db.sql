CREATE DATABASE bxptest1

USE bxptest1;

DROP TABLE IF EXISTS user;
CREATE TABLE user (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `info` varchar(500) COLLATE utf8_bin DEFAULT NULL,
  `name` varchar(500) COLLATE utf8_bin DEFAULT NULL,
  `number` varchar(500) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

insert  into `user`(`id`,`info`,`name`,`number`) values (1,'a','b','c');
insert  into `user`(`id`,`info`,`name`,`number`) values (2,'d','e','f');