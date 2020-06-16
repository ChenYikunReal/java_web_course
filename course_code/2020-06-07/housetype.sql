/*
Navicat MySQL Data Transfer

Source Server         : test1
Source Server Version : 50147
Source Host           : localhost:3306
Source Database       : fwtest

Target Server Type    : MYSQL
Target Server Version : 50147
File Encoding         : 65001

Date: 2020-06-07 12:34:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for housetype
-- ----------------------------
DROP TABLE IF EXISTS `housetype`;
CREATE TABLE `housetype` (
  `typeid` int(10) NOT NULL AUTO_INCREMENT,
  `typename` varchar(25) NOT NULL,
  PRIMARY KEY (`typeid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of housetype
-- ----------------------------
INSERT INTO `housetype` VALUES ('1', '一室一厅');
INSERT INTO `housetype` VALUES ('2', '二室一厅');
INSERT INTO `housetype` VALUES ('3', '三室二厅');
