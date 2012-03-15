INSERT INTO person (id) VALUES ('1');
INSERT INTO employee (id) VALUES ('1');
INSERT INTO users (perid,empid,id,username,password,enabled) VALUES ('1','1','1','admin','123','1');
INSERT INTO authorities (username, authority) VALUES ('admin','ROLE_ADMIN');