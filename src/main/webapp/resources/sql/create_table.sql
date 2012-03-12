create table users(
      usaa int not null AUTO_INCREMENT primary key,
      username varchar(50) not null ,
      password varchar(100) not null,
      enabled boolean not null);
      
create table authorities (
      authorityaa int not null AUTO_INCREMENT primary key,
      username varchar(50) not null,
      authority varchar(50) not null);
      /*foreign key(username) references users(username));*/
      create unique index ix_auth_username on authorities (username,authority);
      
     
create table employee (
      /*empaa numeric not null primary key,*/  
      empid int not null AUTO_INCREMENT primary key,
      faculty varchar(50) not null,
      state varchar(50) not null);
     /* constraint fk_person foreign key(emp_id) references users(username));*/

create table person (
      /*peraa numeric not null primary key,*/
      perid int not null AUTO_INCREMENT primary key,
      dob date not null,
      firstname varchar(50) not null,
      lastname varchar(50) not null,
      middlename varchar(50) not null);
      /*constraint fk_employee foreign key(perid) references employee(empid));*/