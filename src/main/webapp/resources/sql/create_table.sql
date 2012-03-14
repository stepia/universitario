create table users(
      usaa int not null primary key,    
      perid int not null,
      empid int not null,
      username varchar(50) not null ,
      password varchar(100) not null,
      enabled boolean not null,
      constraint pers_user foreign key(perid) references person(perid),
      constraint emp_user foreign key(empid) references employee(empid));
      
      
create table authorities (
      authorityaa int not null AUTO_INCREMENT primary key,
      username varchar(50) not null,
      authority varchar(50) not null);
      create unique index ix_auth_username on authorities (username,authority);

create table employee (
      empid int not null primary key,
      faculty varchar(50),
      state varchar(50));
      
create table person (
      perid int not null primary key,
      dob date,
      firstname varchar(50),
      lastname varchar(50),
      middlename varchar(50));
