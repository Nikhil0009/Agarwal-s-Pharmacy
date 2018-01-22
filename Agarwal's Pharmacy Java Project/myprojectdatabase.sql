/*
SQLyog Enterprise - MySQL GUI v7.02 
MySQL - 5.0.67-community-nt : Database - pharmacy
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`pharmacy` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `pharmacy`;

/*Table structure for table `contact` */

DROP TABLE IF EXISTS `contact`;

CREATE TABLE `contact` (
  `NAME` varchar(50) NOT NULL,
  `YOUR EMAIL` varchar(50) NOT NULL,
  `MESSAGE` varchar(500) NOT NULL,
  PRIMARY KEY  (`YOUR EMAIL`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `contact` */

insert  into `contact`(`NAME`,`YOUR EMAIL`,`MESSAGE`) values ('deepakkumar','deepalzb vz ','Ffffagfagagag'),('Nikhil Garg','garg26nikhil@gmail.com','Nothing');

/*Table structure for table `medicine` */

DROP TABLE IF EXISTS `medicine`;

CREATE TABLE `medicine` (
  `MEDICINENAME` varchar(90) NOT NULL,
  `AMOUNT` varchar(40) NOT NULL,
  PRIMARY KEY  (`MEDICINENAME`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `medicine` */

insert  into `medicine`(`MEDICINENAME`,`AMOUNT`) values ('Bgr-34 Tablet (Rs.500/100 Tablet pack.)','12'),('Cartigen Tablet(Rs.280/10tablet pack.)','hy'),('Endura Mass(Rs.5500/500gm box)','122'),('Heptral 400mg tablet(Rs.200/10tablet pack)','4'),('Himalya Gaxes Tablet (Rs.90/100 Tablet pack.)','1'),('Nutrilite Alfala Calcium Tablet(Rs700/90tablet pack)','123'),('Rejoint Tablet(Rs 300/10tablet pack)','12'),('Voloini Gel (Rs.180/75gm tube)','12');

/*Table structure for table `payment` */

DROP TABLE IF EXISTS `payment`;

CREATE TABLE `payment` (
  `Name` varchar(50) NOT NULL,
  `CITY` varchar(50) NOT NULL,
  `ADDRESS` varchar(70) NOT NULL,
  `LANDMARK` varchar(50) NOT NULL,
  `LOCALITY` varchar(50) NOT NULL,
  `PIN CODE` varchar(50) NOT NULL,
  `CONTACT` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `payment` */

insert  into `payment`(`Name`,`CITY`,`ADDRESS`,`LANDMARK`,`LOCALITY`,`PIN CODE`,`CONTACT`) values ('Nikhil Garg','jaipur','svikash Niketan Hosetl','sitapura','india gate','302022','7791900859');

/*Table structure for table `signup` */

DROP TABLE IF EXISTS `signup`;

CREATE TABLE `signup` (
  `FULLNAME` varchar(50) NOT NULL,
  `USERNAME` varchar(50) NOT NULL,
  `PASSWORD` varchar(50) NOT NULL,
  `CONTACT` varchar(12) NOT NULL,
  `ADDRESS` varchar(100) NOT NULL,
  PRIMARY KEY  (`USERNAME`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `signup` */

insert  into `signup`(`FULLNAME`,`USERNAME`,`PASSWORD`,`CONTACT`,`ADDRESS`) values ('Deepak Kumar Badodhia','Deepakkumar','97721060','9772106010','Gadli ,Manka Jaipur'),('Nikhil Garg','Nikhil0009','my first name','7791900859','Sangaria');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
