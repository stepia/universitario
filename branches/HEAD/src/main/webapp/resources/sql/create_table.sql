create table users(
      usaa int NOT NULL AUTO_INCREMENT primary key,
      username varchar(50) not null ,
      password varchar(100) not null,
      enabled boolean not null);
      
create table authorities (
      authorityaa int NOT NULL AUTO_INCREMENT primary key,
      username varchar(50) not null,
      authority varchar(50) not null,
      foreign key(username) references users(username));
      create unique index ix_auth_username on authorities (username,authority);
      
     
create table employee (
      empaa int NOT NULL AUTO_INCREMENT primary key,  
      empid varchar(50) not null,
      faculty varchar(50) not null,
      state varchar(50) not null, 
      constraint fk_person foreign key(emp_id) references users(username));

create table person (
      peraa int NOT NULL AUTO_INCREMENT primary key,
      perid varchar(50) not null,
      dob date not null,
      firstname varchar(50) not null,
      lastname varchar(50) not null,
      middlename varchar(50) not null,
      constraint fk_employee foreign key(perid) references employee(empid)); 
