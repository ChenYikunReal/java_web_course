/*
Navicat MySQL Data Transfer

Source Server         : test1
Source Server Version : 50147
Source Host           : localhost:3306
Source Database       : fwtest

Target Server Type    : MYSQL
Target Server Version : 50147
File Encoding         : 65001

Date: 2020-06-07 12:34:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for house
-- ----------------------------
DROP TABLE IF EXISTS `house`;
CREATE TABLE `house` (
  `houseid` int(50) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) NOT NULL,
  `area` double(25,0) DEFAULT NULL,
  `price` double(25,0) DEFAULT NULL,
  `info` varchar(255) DEFAULT NULL,
  `typeid` int(50) NOT NULL,
  PRIMARY KEY (`houseid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of house
-- ----------------------------
INSERT INTO `house` VALUES ('1', '热门学区房', '45', '450000', '热门', '1');
INSERT INTO `house` VALUES ('2', '婚装房', '70', '500000', '装修好', '2');
INSERT INTO `house` VALUES ('3', '急卖房屋', '100', '600000', '好房子', '3');
