create table person (
      id int not null primary key,
      firstnameru varchar(50),
      lastnameru varchar(50),
      firstnameeng varchar(50),
      lastnameeng varchar(50),
      firstnameua varchar(50),
      lastnameua varchar(50),
      middlenameru varchar(50),
      middlenameua varchar(50),
      dob date,
      address varchar(250),
      details varchar(500),
      sex varchar(10),
      phone varchar(50),
      email varchar(50),
      code varchar(50),
      modified datetime,
      created datetime);
      
create table users(
      id int not null,
      personid int not null,
      username varchar(50) not null primary key,
      password varchar(100) not null,
      enabled boolean not null,
      modified datetime,
      created datetime);

      

create table state (
      id int not null AUTO_INCREMENT primary key,
      name varchar(50) not null,
      modified datetime,
      created datetime);

create table occupation (
      id int not null AUTO_INCREMENT primary key,
      name varchar(50) not null,
      modified datetime,
      created datetime);

create table role (
      id int not null AUTO_INCREMENT primary key,
      name varchar(50) not null,
      modified datetime,
      created datetime);
      
create table authorities (
      id int not null AUTO_INCREMENT primary key,
      username varchar(50) not null,
      authority varchar(50) not null,
      modified datetime,
      created datetime,
      foreign key(username) references users(username));
      
create table team(
      id int not null AUTO_INCREMENT primary key,
      name varchar(200) not null ,
      teamtypeid int not null,
      rootid int not null,
      details varchar(500),
      stateid int,
      modified datetime,
      created datetime);

create table teamtype(
      id int not null AUTO_INCREMENT primary key,
      name varchar(200) not null ,
      stateid int,
      modified datetime,
      created datetime);

create table emp2team(
      id int not null AUTO_INCREMENT primary key,
      personid int not null,
      teamid int not null,
      positionid int,
      occupationid int,
      recordbook int,
      stateid int,
      modified datetime,
      created datetime);



create table positions(
      id int not null AUTO_INCREMENT primary key,
      name varchar(100) not null,
      modified datetime,
      created datetime);
      
create table lessontype(
      id int not null AUTO_INCREMENT primary key,
      name varchar(50) not null ,
      modified datetime,
      created datetime);
      
create table marktype(
      id int not null AUTO_INCREMENT primary key,
      name varchar(50) not null ,
      modified datetime,
      created datetime);

create table period(
      id int not null AUTO_INCREMENT primary key,
      value varchar(50) not null ,
      modified datetime,
      created datetime);
      
create table plan(
      id int not null AUTO_INCREMENT primary key,
      teamid int not null,
      modified datetime,
      created datetime);
      
create table planDetails(      
      id int not null AUTO_INCREMENT primary key,
      planid int not null,
      disciplineid int not null,
      lessontypeid int not null,
      periodid int not null,
      hours varchar(50),
      marktypeid int not null,
      modified datetime,
      created datetime);

create table discipline(
      id int not null AUTO_INCREMENT primary key,
      name varchar(50) not null ,
      modified datetime,
      created datetime);
     
create table mark(
      id int not null AUTO_INCREMENT primary key,
      name varchar(50) not null ,
      modified datetime,
      created datetime);
     
create table report(
      id int not null AUTO_INCREMENT primary key,
      reportid int not null,
      personid int not null,
      name varchar(50) not null ,
      modified datetime,
      created datetime);

create table reporttype(
      id int not null AUTO_INCREMENT primary key,
      name varchar(50) not null ,
      modified datetime,
      created datetime);


create table lesson (
      id int not null AUTO_INCREMENT primary key,
      planid int not null,
      facultyid int not null,
      room varchar(50) not null,
      lessontimeid int not null,
      dayid int not null,
      weekid int not null,
      modified datetime,
      created datetime);
      
create table time(
      id int not null AUTO_INCREMENT primary key,
      value varchar(50) not null ,
      modified datetime,
      created datetime);
      
create table week(
      id int not null AUTO_INCREMENT primary key,
      value varchar(50) not null ,
      modified datetime,
      created datetime);
      
