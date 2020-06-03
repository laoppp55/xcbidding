/*
Navicat MySQL Data Transfer

Source Server         : xccg
Source Server Version : 50726
Source Host           : rm-2zeymooa33002b23iwo.mysql.rds.aliyuncs.com:3306
Source Database       : zl30

Target Server Type    : MYSQL
Target Server Version : 50726
File Encoding         : 65001

Date: 2020-06-02 23:26:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bbs_column
-- ----------------------------
DROP TABLE IF EXISTS `bbs_column`;
CREATE TABLE `bbs_column` (
  `id` int(11) NOT NULL,
  `lyhid` int(11) DEFAULT NULL,
  `bbsname` varchar(500) DEFAULT NULL,
  `bbsdesc` varchar(500) DEFAULT NULL,
  `manager` varchar(500) DEFAULT NULL,
  `managerpass` varchar(500) DEFAULT NULL,
  `postman` varchar(500) DEFAULT NULL,
  `postdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `lastposter` varchar(500) DEFAULT NULL,
  `lasttopic` varchar(500) DEFAULT NULL,
  `lastposttime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `pic` varchar(500) DEFAULT NULL,
  `creationdate` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `threadnum` int(11) DEFAULT NULL,
  `topicnum` int(11) DEFAULT NULL,
  `siteid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bbs_column
-- ----------------------------

-- ----------------------------
-- Table structure for bbs_friend
-- ----------------------------
DROP TABLE IF EXISTS `bbs_friend`;
CREATE TABLE `bbs_friend` (
  `userid` varchar(500) DEFAULT NULL,
  `lyhid` int(11) DEFAULT NULL,
  `friend` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bbs_friend
-- ----------------------------

-- ----------------------------
-- Table structure for bbs_online
-- ----------------------------
DROP TABLE IF EXISTS `bbs_online`;
CREATE TABLE `bbs_online` (
  `id` varchar(500) NOT NULL,
  `lyhid` int(11) DEFAULT NULL,
  `username` varchar(500) DEFAULT NULL,
  `logintime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `loginnum` int(11) DEFAULT NULL,
  `loginstatus` int(11) DEFAULT NULL,
  `lastactivetime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `ipaddress` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bbs_online
-- ----------------------------
INSERT INTO `bbs_online` VALUES ('8', '0', 'xccgadmin', '2020-05-20 16:16:11', '1', '1', '2020-05-20 16:16:11', '43.228.36.242');
INSERT INTO `bbs_online` VALUES ('9', '0', 'xccgadmin', '2020-05-20 21:37:35', '1', '1', '2020-05-20 21:37:35', '120.244.26.109');
INSERT INTO `bbs_online` VALUES ('10', '0', 'xccgadmin', '2020-05-21 11:42:23', '1', '1', '2020-05-21 11:42:23', '120.244.26.94');
INSERT INTO `bbs_online` VALUES ('11', '0', 'xccgadmin', '2020-05-21 11:45:01', '1', '1', '2020-05-21 11:45:01', '120.244.26.94');
INSERT INTO `bbs_online` VALUES ('12', '0', 'xccgadmin', '2020-05-21 14:41:46', '1', '1', '2020-05-21 14:41:46', '120.244.26.94');

-- ----------------------------
-- Table structure for bbs_thread
-- ----------------------------
DROP TABLE IF EXISTS `bbs_thread`;
CREATE TABLE `bbs_thread` (
  `threadid` int(11) NOT NULL,
  `lyhid` int(11) DEFAULT NULL,
  `forumid` int(11) DEFAULT NULL,
  `answerid` int(11) DEFAULT '0',
  `threadname` varchar(500) DEFAULT NULL,
  `threadcontent` varchar(500) DEFAULT NULL,
  `posttime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `author` varchar(500) DEFAULT NULL,
  `ipaddress` varchar(500) DEFAULT NULL,
  `answeruser` varchar(500) DEFAULT NULL,
  `answertime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `hitnum` int(11) DEFAULT NULL,
  `answernum` int(11) DEFAULT NULL,
  `gotop` int(11) DEFAULT '0',
  `typeflag` int(11) DEFAULT NULL,
  `hiddenflag` int(11) DEFAULT '0',
  `lockflag` int(11) DEFAULT NULL,
  PRIMARY KEY (`threadid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bbs_thread
-- ----------------------------
