CREATE DATABASE jfinal_demo;

USE jfinal_demo;

CREATE TABLE `member` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(40) NOT NULL,
  `signature` mediumtext NOT NULL,
   `password` varchar(20) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `member` VALUES ('1', 'yy', 'im yy','password');
INSERT INTO `member` VALUES ('2', 'yyy', 'i am yyy','password');
INSERT INTO `member` VALUES ('3', 'yangyang', 'wo shi yangyang','password');
INSERT INTO `member` VALUES ('4', 'haha', 'lalala','password');
INSERT INTO `member` VALUES ('5', 'socute', 'hahahah','password');

CREATE TABLE `todo` (
  `id` int(11) NOT NULL auto_increment,
  `title` varchar(200) NOT NULL,
  `content` mediumtext NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO `todo` VALUES ('1', 'todo Title here', 'toto Content here');
INSERT INTO `todo` VALUES ('2', 'todo 1', 'todo 1');
INSERT INTO `todo` VALUES ('3', 'todo 2', 'todo 2');
INSERT INTO `todo` VALUES ('4', 'todo 3', 'todo 3');
INSERT INTO `todo` VALUES ('5', 'todo 4', 'todo 4');

CREATE TABLE `blog` (
  `id` int(11) NOT NULL auto_increment,
  `title` varchar(200) NOT NULL,
  `content` mediumtext NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO `blog` VALUES ('1', 'JFinal Demo Title here', 'JFinal Demo Content here');
INSERT INTO `blog` VALUES ('2', 'test 1', 'test 1');
INSERT INTO `blog` VALUES ('3', 'test 2', 'test 2');
INSERT INTO `blog` VALUES ('4', 'test 3', 'test 3');
INSERT INTO `blog` VALUES ('5', 'test 4', 'test 4');