/*
SQLyog Ultimate v8.32 
MySQL - 5.6.26-enterprise-commercial-advanced : Database - test
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`test` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `test`;

/*Table structure for table `comments` */

DROP TABLE IF EXISTS `comments`;

CREATE TABLE `comments` (
  `id` int(1) NOT NULL AUTO_INCREMENT,
  `newsID` int(1) NOT NULL,
  `comment` varchar(20) NOT NULL,
  `theTime` int(2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `comments` */

insert  into `comments`(`id`,`newsID`,`comment`,`theTime`) values (1,1,'aaa',11),(2,1,'bbb',12),(3,2,'ccc',12);

/*Table structure for table `devices` */

DROP TABLE IF EXISTS `devices`;

CREATE TABLE `devices` (
  `devices_id` int(18) NOT NULL COMMENT '设备id',
  `devices_name` varchar(46) DEFAULT NULL COMMENT '设备名称',
  `devices_status` char(10) DEFAULT NULL COMMENT '设备状态',
  `devices_handle_time` time DEFAULT NULL COMMENT '操作设备的时间',
  `devices_ischeck` tinyint(1) DEFAULT NULL COMMENT '设备是否被勾选',
  `devices_mac_addresses` int(6) DEFAULT NULL COMMENT '设备连接到板子上的物理地址的序号',
  `devices_relevance_house` varchar(60) DEFAULT NULL COMMENT '设备关联的仓房',
  `devices_parent_cpu` varchar(30) DEFAULT NULL COMMENT '和设备连接的板子名称',
  `devices_location` varchar(60) DEFAULT NULL COMMENT '设备的位置',
  PRIMARY KEY (`devices_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `devices` */

/*Table structure for table `pointinfo` */

DROP TABLE IF EXISTS `pointinfo`;

CREATE TABLE `pointinfo` (
  `HouseNo` int(11) NOT NULL DEFAULT '0',
  `HouseName` varchar(64) DEFAULT NULL,
  `PointNumForLength` int(11) DEFAULT NULL,
  `PointNumForWidth` int(11) DEFAULT NULL,
  `PointNumForHeight` int(11) DEFAULT NULL,
  PRIMARY KEY (`HouseNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `pointinfo` */

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `id` int(11) NOT NULL,
  `name` varchar(16) DEFAULT NULL,
  `gibm` varchar(100) DEFAULT NULL,
  `userid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `role` */

insert  into `role`(`id`,`name`,`gibm`,`userid`) values (1,'xiaozhang','yan',1),(2,'xiaoyan','zhang',3),(3,'xiaosi','chengcheng',2);

/*Table structure for table `sys_user` */

DROP TABLE IF EXISTS `sys_user`;

CREATE TABLE `sys_user` (
  `userid` int(24) NOT NULL,
  `uname` varchar(30) DEFAULT NULL,
  `uage` int(10) DEFAULT NULL,
  `usex` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sys_user` */

insert  into `sys_user`(`userid`,`uname`,`uage`,`usex`) values (1,'yan',25,'男');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `name` varchar(16) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user` */

insert  into `user`(`id`,`name`,`age`) values (1,'zhangyan',25),(2,'xiaositest',24),(3,'haha',11),(4,'haha',11);

/*Table structure for table `wareinfo` */

DROP TABLE IF EXISTS `wareinfo`;

CREATE TABLE `wareinfo` (
  `HouseNo` int(11) NOT NULL,
  `HouseName` varchar(64) DEFAULT NULL,
  `GranaryType` varchar(32) DEFAULT NULL,
  `kindcode` varchar(32) DEFAULT NULL,
  `Testmoisture` varchar(32) DEFAULT NULL,
  `Testmoisture1st` varchar(32) DEFAULT NULL,
  `Testmoisture2nd` varchar(32) DEFAULT NULL,
  `Testmoisture3rd` varchar(32) DEFAULT NULL,
  `Testmoisture4th` varchar(32) DEFAULT NULL,
  `WarnT1st` varchar(32) DEFAULT NULL,
  `WarnT2nd` varchar(32) DEFAULT NULL,
  `WarnT3rd` varchar(32) DEFAULT NULL,
  `WarnT4th` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`HouseNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `wareinfo` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
