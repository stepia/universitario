SET FOREIGN_KEY_CHECKS = 0;
drop table if exists decane;
SET FOREIGN_KEY_CHECKS = 1;

CREATE TABLE `decane` (
  `id` varchar(20) NOT NULL,
  `first_name` varchar(30) NOT NULL DEFAULT '',
  `last_name` varchar(30) NOT NULL DEFAULT '',
  `faculty` varchar(50) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


insert into decane(id,first_name,last_name,faculty) values ('rff1','valeriy','dolgov','rff');
insert into decane(id,first_name,last_name,faculty) values ('fti1','artur','pirozhkov','fti');

