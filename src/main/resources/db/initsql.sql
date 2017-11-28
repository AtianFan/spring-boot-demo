-- 支持多数据源, 首先创建两个数据库(master+cluster)

-- cluster
CREATE DATABASE clusterdb;

-- 创建一张city表
DROP TABLE IF EXISTS `city`;
CREATE TABLE `city` (
`id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '城市编号',
`province_id` int(10) unsigned NOT NULL COMMENT '省份编号',
`city_name` varchar(25) DEFAULT NULL COMMENT '城市名称',
`description` varchar(25) DEFAULT NULL COMMENT '描述',
PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- 初始数据
INSERT INTO `city` VALUES (1, 1, '北京', '中国的首都');
INSERT INTO `city` VALUES (2, 2, '多伦多', 'Canada\'s capital.');
INSERT INTO `city` VALUES (3, 3, '长沙', '湖南省');
INSERT INTO `city` VALUES (4, 4, '合肥', '安徽省');
INSERT INTO `city` VALUES (5, 5, '南京', '江苏省');
INSERT INTO `city` VALUES (6, 6, '青岛', '山东省');
INSERT INTO `city` VALUES (7, 7, '济南', '山东省');
INSERT INTO `city` VALUES (8, 8, '海口', '海南省');
INSERT INTO `city` VALUES (9, 9, '天津', '天津');
INSERT INTO `city` VALUES (10, 10, '武汉', '湖北省');
INSERT INTO `city` VALUES (11, 11, '南昌', '江西省');
INSERT INTO `city` VALUES (12, 12, '杭州', '浙江省');
INSERT INTO `city` VALUES (13, 13, '广州', '广东省');
INSERT INTO `city` VALUES (14, 14, '深圳', '广东省');
INSERT INTO `city` VALUES (15, 15, '福州', '福建省');
INSERT INTO `city` VALUES (16, 16, '厦门', '福建省');
INSERT INTO `city` VALUES (17, 17, '南宁', '广西省');

-- master

CREATE DATABASE masterdb;

-- 创建表user
DROP TABLE IF EXISTS `city`;
CREATE TABLE user
(
id INT(10) unsigned PRIMARY KEY NOT NULL COMMENT '用户编号' AUTO_INCREMENT,
user_name VARCHAR(25) COMMENT '用户名称',
description VARCHAR(25) COMMENT '描述'
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- 初始数据
INSERT INTO `user` VALUES (1, 'kangkang', 1, 'live in beijing');
INSERT INTO `user` VALUES (2, 'Jane', 7, 'comes from Canada');
INSERT INTO `user` VALUES (3, 'Maria', 3, 'live in Cuba');
INSERT INTO `user` VALUES (4, 'Michael', 5, 'comes from America');
INSERT INTO `user` VALUES (5, 'James', 6, 'live in America');
INSERT INTO `user` VALUES (6, 'atian', 1, 'lovely boy');

