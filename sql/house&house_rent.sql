-- create database happyhouse_final;

use happyhouse_final;

CREATE TABLE `house` (
  `dealid` varchar(50) NOT NULL,
  `sigungucode` varchar(20) NOT NULL,
  `sigungu` varchar(20) NOT NULL,
  `dongcode` varchar(40) NOT NULL,
  `dong` varchar(20) NOT NULL,
  `area` float NOT NULL,
  `floor` varchar(5),
  `typecode` int NOT NULL,
  `type` varchar(20) NOT NULL,
  `price` bigint NOT NULL,
  `buildyear` varchar(10),
  `name` varchar(40),
  PRIMARY KEY (`dealid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;




CREATE TABLE `house_rent` (
  `dealid` varchar(50) NOT NULL,
  `sigungucode` varchar(20) NOT NULL,
  `sigungu` varchar(20) NOT NULL,
  `dongcode` varchar(40) NOT NULL,
  `dong` varchar(20) NOT NULL,
  `name` varchar(40),
  `floor` varchar(5),
  `typecode` int NOT NULL,
  `type` varchar(20) NOT NULL,
  `area` float NOT NULL,
  `renttypecode` int NOT NULL,
  `renttype` varchar(20) NOT NULL,
  `rentprice1` int NOT NULL,
  `rentprice2` int NOT NULL,
  PRIMARY KEY (`dealid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


load data infile 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/house.csv'
into table house
fields terminated by ','
lines terminated by '\n';

load data infile 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/house_rent.csv'
into table house_rent
fields terminated by ','
lines terminated by '\n';

