create table university(
      id int not null AUTO_INCREMENT primary key,
      name varchar(200) not null ,
      accreditation varchar(100) not null,
      modified datetime not null,
      created datetime not null);

create table faculty(
      id int not null AUTO_INCREMENT primary key,
      name varchar(200) not null ,
      universityid int not null,
      modified datetime not null,
      created datetime not null);
      
create table chair(
      id int not null AUTO_INCREMENT primary key,
      name varchar(200) not null ,
      facultyid int not null,
      modified datetime not null,
      created datetime not null);

create table profession(
      id int not null AUTO_INCREMENT primary key,
      code varchar(200) not null ,
      name varchar(200) not null ,
      chairid int not null,
      modified datetime not null,
      created datetime not null);

create table group(
      id int not null AUTO_INCREMENT primary key,
      code varchar(200) not null ,
      professionid int not null,
      modified datetime not null,
      created datetime not null);

create table subgroup(
      id int not null AUTO_INCREMENT primary key,
      groupid int not null,
      planid int not null,
      modified datetime not null,
      created datetime not null);

create table employee(
      id int not null AUTO_INCREMENT primary key,
      positionid int not null,
      groupid int not null,
      personid int not null,
      userid int not null,
      state varchar(50) not null,
      recordbook int not null,
      academicdegree varchar(200) not null,
      modified datetime not null,
      created datetime not null);

create table position(
      id int not null AUTO_INCREMENT primary key,
      name int not null,
      modified datetime not null,
      created datetime not null);

      
create table users(
      id int not null AUTO_INCREMENT primary key,
      username varchar(50) not null ,
      password varchar(100) not null,
      modified datetime not null,
      created datetime not null);
      
create table authorities (
      id int not null AUTO_INCREMENT primary key,
      username varchar(50) not null,
      authority varchar(50) not null);
      /*foreign key(username) references users(username));*/
      create unique index ix_auth_username on authorities (username,authority);
      
create table person (
      id int not null AUTO_INCREMENT primary key,
      firstname varchar(50) not null,
      lastname varchar(50) not null,
      middlename varchar(50) not null);
      dob date not null,
      address varchar(250),
      sex varchar(10),
      phone varchar(50),
      email varchar(50),
      code varchar(50),
      modified datetime not null,
      created datetime not null);
      
      /*constraint fk_employee foreign key(perid) references employee(empid));*/
      
create table lessontype(
      id int not null AUTO_INCREMENT primary key,
      name varchar(50) not null ,
      modified datetime not null,
      created datetime not null);
      
create table marktype(
      id int not null AUTO_INCREMENT primary key,
      name varchar(50) not null ,
      modified datetime not null,
      created datetime not null);

create table period(
      id int not null AUTO_INCREMENT primary key,
      value varchar(50) not null ,
      modified datetime not null,
      created datetime not null);
      
create table plan(
      id int not null AUTO_INCREMENT primary key,
      planid int not null,
      disciplineid int not null,
      lessontypeid int not null,
      empid int not null,
      periodid int not null,
      hours varchar(50),
      marktypeid int not null,
      modified datetime not null,
      created datetime not null);

create table discipline(
      id int not null AUTO_INCREMENT primary key,
      name varchar(50) not null ,
      modified datetime not null,
      created datetime not null);
     
create table mark(
      id int not null AUTO_INCREMENT primary key,
      name varchar(50) not null ,
      modified datetime not null,
      created datetime not null);
     
create table report(
      id int not null AUTO_INCREMENT primary key,
      reportid int not null,
      empid int not null,
      name varchar(50) not null ,
      modified datetime not null,
      created datetime not null);

create table lesson (
      id int not null AUTO_INCREMENT primary key,
      planid int not null,
      facultyid int not null,
      room varchar(50) not null,
      lessontimeid int not null,
      dayid int not null,
      weekid int not null,
      modified datetime not null,
      created datetime not null);
      
create table time(
      id int not null AUTO_INCREMENT primary key,
      value varchar(50) not null ,
      modified datetime not null,
      created datetime not null);
      
create table week(
      id int not null AUTO_INCREMENT primary key,
      value varchar(50) not null ,
      modified datetime not null,
      created datetime not null);
      
