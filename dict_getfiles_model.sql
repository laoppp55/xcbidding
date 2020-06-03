/*
Navicat MySQL Data Transfer

Source Server         : xccg
Source Server Version : 50726
Source Host           : rm-2zeymooa33002b23iwo.mysql.rds.aliyuncs.com:3306
Source Database       : zl30

Target Server Type    : MYSQL
Target Server Version : 50726
File Encoding         : 65001

Date: 2020-05-28 11:50:09
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for dict_getfiles_model
-- ----------------------------
DROP TABLE IF EXISTS `dict_getfiles_model`;
CREATE TABLE `dict_getfiles_model` (
  `uuid` char(32) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of dict_getfiles_model
-- ----------------------------
INSERT INTO `dict_getfiles_model` VALUES ('1', '网站下载');
INSERT INTO `dict_getfiles_model` VALUES ('2', '现场获取');
INSERT INTO `dict_getfiles_model` VALUES ('3', '网站下载或现场获取');
