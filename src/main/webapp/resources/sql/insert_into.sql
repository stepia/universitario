INSERT INTO person (id) VALUES ('1');
INSERT INTO employee (id) VALUES ('1');
INSERT INTO users (perid,empid,id,username,password,enabled) VALUES ('1','1','1','admin','123','1');
INSERT INTO authorities (username, authority) VALUES ('admin','ROLE_ADMIN');

--manual employee inserting(temporarily),to check one-to-many works correctly 
-- org.hibernate.TransientObjectException: object references an
--      unsaved transient instance - save the transient instance before flushing: entry.Employee
--been fixed
INSERT INTO users (perid,empid,id,username,password,enabled) VALUES ('2','2','1','xxx','xxx','1');
INSERT INTO employee (id,userid,state) VALUES ('2','2','aa');
INSERT INTO employee (id,userid,state) VALUES ('3','2','bbb');