SET FOREIGN_KEY_CHECKS = 0;
drop table if exists authorities;
drop table if exists users;
drop table if exists decane;
drop table if exists employee;
drop table if exists person;
SET FOREIGN_KEY_CHECKS = 1;

create table users(
      username varchar(50) not null primary key,
      password varchar(100) not null,
      enabled boolean not null);
      
create table authorities (
      username varchar(50) not null,
      authority varchar(50) not null,
      constraint fk_authorities_users foreign key(username) references users(username));
      create unique index ix_auth_username on authorities (username,authority);
      
     
create table employee (  
        emp_id varchar(50) not null,
        faculty varchar(50) not null,
        state varchar(50) not null, 
        constraint fk_person foreign key(emp_id) references users(username)
);

create table person (
		pers_id varchar(50) not null,
		dob date not null,
		firstname varchar(50) not null,
		lastname varchar(50) not null,
		middlename varchar(50) not null,
		constraint fk_employee foreign key(pers_id) references employee(emp_id)
);      

create table decane (
	  id varchar(20) NOT NULL,
	  firstname varchar(30) NOT NULL DEFAULT '',
	  lastname varchar(30) NOT NULL DEFAULT '',
	  faculty varchar(50) NOT NULL DEFAULT '',
	  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


insert into decane(id,firstname,lastname,faculty) values ('rff1','valeriy','dolgov','rff');
insert into decane(id,firstname,lastname,faculty) values ('fti1','artur','pirozhkov','fti');

