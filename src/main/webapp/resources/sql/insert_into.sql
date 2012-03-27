INSERT INTO person (id) VALUES ('1');
INSERT INTO employee (id,userid) VALUES ('1','1');
INSERT INTO users (perid,empid,id,username,password,enabled) VALUES ('1','1','1','admin','123','1');
INSERT INTO authorities (username, authority) VALUES ('admin','ROLE_ADMIN');

/*university*/
INSERT INTO university (name,accreditation) VALUES ('Ð”Ð½Ñ–Ð¿Ñ€Ð¾Ð¿ÐµÑ‚Ñ€Ð¾Ð²Ñ�ÑŒÐºÐ¸Ð¹ Ð½Ð°Ñ†Ñ–Ð¾Ð½Ð°Ð»ÑŒÐ½Ð¸Ð¹ ÑƒÐ½Ñ–Ð²ÐµÑ€Ñ�Ð¸Ñ‚ÐµÑ‚ Ñ–Ð¼ÐµÐ½Ñ– ÐžÐ»ÐµÑ�Ñ� Ð“Ð¾Ð½Ñ‡Ð°Ñ€Ð°','4');
/*faculty*/
INSERT INTO faculty (id,name,universityid,dean,initialdeputy,scientificdeputy,educationaldeputy,address,phone) VALUES (1,'Ð¤Ð°ÐºÑƒÐ»ÑŒÑ‚ÐµÑ‚ ÑƒÐºÑ€Ð°Ñ—Ð½Ñ�ÑŒÐºÐ¾Ñ— Ð¹ Ñ–Ð½Ð¾Ð·ÐµÐ¼Ð½Ð¾Ñ— Ñ„Ñ–Ð»Ð¾Ð»Ð¾Ð³Ñ–Ñ— Ñ‚Ð° Ð¼Ð¸Ñ�Ñ‚ÐµÑ†Ñ‚Ð²Ð¾Ð·Ð½Ð°Ð²Ñ�Ñ‚Ð²Ð°',1,1,1,1,1,'Ð¿Ñ€Ð¾Ñ�Ð¿. Ð“Ð°Ð³Ð°Ñ€Ñ–Ð½Ð°,  72.', '(056) 374-98-81');
INSERT INTO faculty (id,name,universityid,dean,initialdeputy,scientificdeputy,educationaldeputy,address,phone) VALUES (2,'Ð¤Ð°ÐºÑƒÐ»ÑŒÑ‚ÐµÑ‚ Ñ�ÑƒÑ�Ð¿Ñ–Ð»ÑŒÐ½Ð¸Ñ… Ð½Ð°ÑƒÐº Ñ– Ð¼Ñ–Ð¶Ð½Ð°Ñ€Ð¾Ð´Ð½Ð¸Ñ… Ð²Ñ–Ð´Ð½Ð¾Ñ�Ð¸Ð½',1,1,1,1,1,'Ð¿Ñ€. Ð“Ð°Ð³Ð°Ñ€Ñ–Ð½Ð°,  72.','(056) 374-98-66'); 
INSERT INTO faculty (id,name,universityid,dean,initialdeputy,scientificdeputy,educationaldeputy,address,phone) VALUES (3,'Ð¤Ð°ÐºÑƒÐ»ÑŒÑ‚ÐµÑ‚ Ñ�Ð¸Ñ�Ñ‚ÐµÐ¼ Ñ‚Ð° Ð·Ð°Ñ�Ð¾Ð±Ñ–Ð² Ð¼Ð°Ñ�Ð¾Ð²Ð¾Ñ— ÐºÐ¾Ð¼ÑƒÐ½Ñ–ÐºÐ°Ñ†Ñ–Ñ—',1,1,1,1,1,'Ð²ÑƒÐ». Ð�Ð°ÑƒÐºÐ¾Ð²Ð°, 13, ÐºÐ¾Ñ€Ð¿. 9','(056) 776-82-01');
INSERT INTO faculty (id,name,universityid,dean,initialdeputy,scientificdeputy,educationaldeputy,address,phone,email) VALUES (4,'Ð¤Ð°ÐºÑƒÐ»ÑŒÑ‚ÐµÑ‚ Ð¼Ñ–Ð¶Ð½Ð°Ñ€Ð¾Ð´Ð½Ð¾Ñ— ÐµÐºÐ¾Ð½Ð¾Ð¼Ñ–ÐºÐ¸',1,1,1,1,1,'Ð²ÑƒÐ». Ð�Ð°ÑƒÐºÐ¾Ð²Ð°, 13, 9 ÐºÐ¾Ñ€Ð¿ÑƒÑ� Ð”Ð�Ð£, ÐºÑ–Ð¼Ð½. 421','(056) 373-12-73','dekanat_fme@mail.ru');
INSERT INTO faculty (id,name,universityid,dean,initialdeputy,scientificdeputy,educationaldeputy,address,phone,email) VALUES (5,'Ð•ÐºÐ¾Ð½Ð¾Ð¼Ñ–Ñ‡Ð½Ð¸Ð¹ Ñ„Ð°ÐºÑƒÐ»ÑŒÑ‚ÐµÑ‚',1,1,1,1,1,'Ð¿Ñ€. Ðš.ÐœÐ°Ñ€ÐºÑ�Ð°, 35,ÐºÐ¾Ñ€Ð¿ÑƒÑ� Ð”Ð�Ð£ â„– 5','(056) 744-86-37','inec.dnu@smirnov.dp.ua');
INSERT INTO faculty (id,name,universityid,dean,initialdeputy,scientificdeputy,educationaldeputy,address,phone) VALUES (6,'Ð†Ñ�Ñ‚Ð¾Ñ€Ð¸Ñ‡Ð½Ð¸Ð¹ Ñ„Ð°ÐºÑƒÐ»ÑŒÑ‚ÐµÑ‚',1,1,1,1,1,'Ð¿Ñ€Ð¾Ñ�Ð¿. Ð“Ð°Ð³Ð°Ñ€Ñ–Ð½Ð°,  72.','(056) 374-98-60.');
INSERT INTO faculty (id,name,universityid,dean,initialdeputy,scientificdeputy,educationaldeputy,address,phone,email) VALUES (7,'Ð¤Ð°ÐºÑƒÐ»ÑŒÑ‚ÐµÑ‚ Ð¿Ñ�Ð¸Ñ…Ð¾Ð»Ð¾Ð³Ñ–Ñ—',1,1,1,1,1,'Ð¿Ñ€. ÐšÐ°Ñ€Ð»Ð° ÐœÐ°Ñ€ÐºÑ�Ð°, 36, 2-Ð¹ ÐºÐ¾Ñ€Ð¿ÑƒÑ� Ð”Ð�Ð£','(056) 744-86-11','dec_fps@mail.dsu.dp.ua');
INSERT INTO faculty (id,name,universityid,dean,initialdeputy,scientificdeputy,educationaldeputy,address,phone,email) VALUES (8,'Ð®Ñ€Ð¸Ð´Ð¸Ñ‡Ð½Ð¸Ð¹ Ñ„Ð°ÐºÑƒÐ»ÑŒÑ‚ÐµÑ‚',1,1,1,1,1,'Ð²ÑƒÐ». Ð�Ð°ÑƒÐºÐ¾Ð²Ð°, 13, ÐºÐ¾Ñ€Ð¿. â„–9.','(056) 374â€“97â€“12','DNU_pravo@mail.ru, DNU_pravo@i.ua');
INSERT INTO faculty (id,name,universityid,dean,initialdeputy,scientificdeputy,educationaldeputy,address,phone) VALUES (9,'Ð¤Ð°ÐºÑƒÐ»ÑŒÑ‚ÐµÑ‚ Ñ„Ñ–Ð·Ð¸ÐºÐ¸, ÐµÐ»ÐµÐºÑ‚Ñ€Ð¾Ð½Ñ–ÐºÐ¸ Ñ‚Ð° ÐºÐ¾Ð¼Ð¿''ÑŽÑ‚ÐµÑ€Ð½Ð¸Ñ… Ñ�Ð¸Ñ�Ñ‚ÐµÐ¼',1,1,1,1,1,'Ð¼. Ð”Ð½Ñ–Ð¿Ñ€Ð¾Ð¿ÐµÑ‚Ñ€Ð¾Ð²Ñ�ÑŒÐº, Ð²ÑƒÐ». Ð�Ð°ÑƒÐºÐ¾Ð²Ð°, 9, Ð½Ð°Ð²Ñ‡Ð°Ð»ÑŒÐ½Ñ– ÐºÐ¾Ñ€Ð¿ÑƒÑ�Ð¸ â„–12, â„–15','(056) 373-12-63, (056) 776-90-92');
INSERT INTO faculty (id,name,universityid,dean,initialdeputy,scientificdeputy,educationaldeputy,address,phone,site) VALUES (10,'Ð¥Ñ–Ð¼Ñ–Ñ‡Ð½Ð¸Ð¹ Ñ„Ð°ÐºÑƒÐ»ÑŒÑ‚ÐµÑ‚',1,1,1,1,1,'Ð²ÑƒÐ». ÐšÐ¾Ð·Ð°ÐºÐ¾Ð²Ð°, 22, 16â€“Ð¹ ÐºÐ¾Ñ€Ð¿ÑƒÑ� Ð”Ð�Ð£.','(056) 776-82-48.','cf.dnu.dp.ua');
INSERT INTO faculty (id,name,universityid,dean,initialdeputy,scientificdeputy,educationaldeputy,address,phone,email) VALUES (11,'Ð¤Ð°ÐºÑƒÐ»ÑŒÑ‚ÐµÑ‚ Ð±Ñ–Ð¾Ð»Ð¾Ð³Ñ–Ñ—, ÐµÐºÐ¾Ð»Ð¾Ð³Ñ–Ñ— Ñ‚Ð° Ð¼ÐµÐ´Ð¸Ñ†Ð¸Ð½Ð¸',1,1,1,1,1,'Ð²ÑƒÐ». ÐšÐ°Ð·Ð°ÐºÐ¾Ð²Ð°, 24, 17-Ð¹ ÐºÐ¾Ñ€Ð¿ÑƒÑ� Ð”Ð�Ð£,Ð²ÑƒÐ». Ð�Ð°ÑƒÐºÐ¾Ð²Ð°, 10, 11 ÐºÐ¾Ñ€Ð¿ÑƒÑ� Ð”Ð�Ð£.','(0562)46-92-43','dekanat.bef.dnu@i.ua');
INSERT INTO faculty (id,name,universityid,dean,initialdeputy,scientificdeputy,educationaldeputy,address,phone,site,email) VALUES (12,'Ð“ÐµÐ¾Ð»Ð¾Ð³Ð¾-Ð³ÐµÐ¾Ð³Ñ€Ð°Ñ„Ñ–Ñ‡Ð½Ð¸Ð¹ Ñ„Ð°ÐºÑƒÐ»ÑŒÑ‚ÐµÑ‚',1,1,1,1,1,'Ð¿Ñ€. ÐšÐ°Ñ€Ð»Ð° ÐœÐ°Ñ€ÐºÑ�Ð°, 36, ÐºÐ¾Ñ€Ð¿. â„– 2','(056) 744-82-65','www.ggf-dnu.at.ua','zelenskili@mail.ru');
INSERT INTO faculty (id,name,universityid,dean,initialdeputy,scientificdeputy,educationaldeputy,address,phone,site) VALUES (13,'Ð¤Ð°ÐºÑƒÐ»ÑŒÑ‚ÐµÑ‚ Ð¿Ñ€Ð¸ÐºÐ»Ð°Ð´Ð½Ð¾Ñ— Ð¼Ð°Ñ‚ÐµÐ¼Ð°Ñ‚Ð¸ÐºÐ¸',1,1,1,1,1,'Ð¿Ñ€Ð¾Ñ�Ð¿. ÐšÐ°Ñ€Ð»Ð° ÐœÐ°Ñ€ÐºÑ�Ð°, 35, 3 Ñ– 4 ÐºÐ¾Ñ€Ð¿ÑƒÑ�Ð¸ Ð”Ð�Ð£.','(0562) 745-24-83','fpm.dnu.dp.ua, primat.dp.ua');
INSERT INTO faculty (id,name,universityid,dean,initialdeputy,scientificdeputy,educationaldeputy,address,phone,site) VALUES (14,'ÐœÐµÑ…Ð°Ð½Ñ–ÐºÐ¾-Ð¼Ð°Ñ‚ÐµÐ¼Ð°Ñ‚Ð¸Ñ‡Ð½Ð¸Ð¹ Ñ„Ð°ÐºÑƒÐ»ÑŒÑ‚ÐµÑ‚',1,1,1,1,1,'Ð²ÑƒÐ». ÐšÐ¾Ð·Ð°ÐºÐ¾Ð²Ð° 18 , ÐºÐ¾Ñ€Ð¿ÑƒÑ� â„– 14.','(056) 776-82-41','mmf.dsu.dp.ua');
INSERT INTO faculty (id,name,universityid,dean,initialdeputy,scientificdeputy,educationaldeputy,address,phone) VALUES (15,'Ð¤Ñ–Ð·Ð¸ÐºÐ¾-Ñ‚ÐµÑ…Ð½Ñ–Ñ‡Ð½Ð¸Ð¹ Ñ„Ð°ÐºÑƒÐ»ÑŒÑ‚ÐµÑ‚',1,1,1,1,1,'Ð²ÑƒÐ». Ð�Ð°ÑƒÐºÐ¾Ð²Ð°, 11, 13, ÐºÐ¾Ñ€Ð¿ÑƒÑ�Ð¸ 10, 9','(056) 760-94-62');
INSERT INTO faculty (id,name,universityid,dean,initialdeputy,scientificdeputy,educationaldeputy,address,phone) VALUES (16,'Ð¦ÐµÐ½Ñ‚Ñ€ Ð·Ð°Ð¾Ñ‡Ð½Ð¾Ñ— Ñ‚Ð° Ð²ÐµÑ‡Ñ–Ñ€Ð½ÑŒÐ¾Ñ— Ñ„Ð¾Ñ€Ð¼ Ð½Ð°Ð²Ñ‡Ð°Ð½Ð½Ñ�',1,1,1,1,1,'Ð²ÑƒÐ». ÐšÐ°Ð·Ð°ÐºÐ¾Ð²Ð°, 22, ÐºÐ¾Ñ€Ð¿ÑƒÑ� 16.','(056) 373-58-32.');
/*chair*/
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (1,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° ÑƒÐºÑ€Ð°Ñ—Ð½Ñ�ÑŒÐºÐ¾Ñ— Ð¼Ð¾Ð²Ð¸.',1,1,'374-98-85.');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (2,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð°Ð½Ð³Ð»Ñ–Ð¹Ñ�ÑŒÐºÐ¾Ñ— Ñ„Ñ–Ð»Ð¾Ð»Ð¾Ð³Ñ–Ñ—.',1,1,'374-98-73');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (3,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð³ÐµÑ€Ð¼Ð°Ð½Ñ�ÑŒÐºÐ¾Ñ— Ñ„Ñ–Ð»Ð¾Ð»Ð¾Ð³Ñ–Ñ—.',1,1,'374-98-75');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (4,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ñ€Ð¾Ð¼Ð°Ð½Ñ�ÑŒÐºÐ¾Ñ— Ñ„Ñ–Ð»Ð¾Ð»Ð¾Ð³Ñ–Ñ—.',1,1,'374-98-74');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (5,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð¿Ð¾Ñ€Ñ–Ð²Ð½Ñ�Ð»ÑŒÐ½Ð¾Ñ— Ñ„Ñ–Ð»Ð¾Ð»Ð¾Ð³Ñ–Ñ— Ñ�Ñ…Ñ–Ð´Ð½Ð¸Ñ… Ñ‚Ð° Ð°Ð½Ð³Ð»Ð¾Ð¼Ð¾Ð²Ð½Ð¸Ñ… ÐºÑ€Ð°Ñ—Ð½.',1,1,'374-98-79');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (6,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð·Ð°Ð³Ð°Ð»ÑŒÐ½Ð¾Ð³Ð¾ Ñ‚Ð° Ñ€Ð¾Ñ�Ñ–Ð¹Ñ�ÑŒÐºÐ¾Ð³Ð¾ Ð¼Ð¾Ð²Ð¾Ð·Ð½Ð°Ð²Ñ�Ñ‚Ð²Ð°.',1,1,'374-98-80');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (7,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° ÑƒÐºÑ€Ð°Ñ—Ð½Ñ�ÑŒÐºÐ¾Ñ— Ð»Ñ–Ñ‚ÐµÑ€Ð°Ñ‚ÑƒÑ€Ð¸.',1,1,'374-98-72');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (8,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð·Ð°Ñ€ÑƒÐ±Ñ–Ð¶Ð½Ð¾Ñ— Ð»Ñ–Ñ‚ÐµÑ€Ð°Ñ‚ÑƒÑ€Ð¸.',1,1,'374-98-78');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (9,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ñ–Ð½Ð¾Ð·ÐµÐ¼Ð½Ð¸Ñ… Ð¼Ð¾Ð² Ð´Ð»Ñ� Ð³ÑƒÐ¼Ð°Ð½Ñ–Ñ‚Ð°Ñ€Ð½Ð¸Ñ… Ñ„Ð°ÐºÑƒÐ»ÑŒÑ‚ÐµÑ‚Ñ–Ð².',1,1,'374-98-82');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (10,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð¾Ð±Ñ€Ð°Ð·Ð¾Ñ‚Ð²Ð¾Ñ€Ñ‡Ð¾Ð³Ð¾ Ð¼Ð¸Ñ�Ñ‚ÐµÑ†Ñ‚Ð²Ð° Ñ‚Ð° Ð´Ð¸Ð·Ð°Ð¹Ð½Ñƒ.',1,1,'374-98-08');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (11,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð¿ÐµÑ€ÐµÐºÐ»Ð°Ð´Ñƒ Ñ‚Ð° Ð»Ñ–Ð½Ð³Ð²Ñ–Ñ�Ñ‚Ð¸Ñ‡Ð½Ð¾Ñ— Ð¿Ñ–Ð´Ð³Ð¾Ñ‚Ð¾Ð²ÐºÐ¸ Ñ–Ð½Ð¾Ð·ÐµÐ¼Ñ†Ñ–Ð².',1,1,'374-98-86');

INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (12,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ñ„Ñ–Ð»Ð¾Ñ�Ð¾Ñ„Ñ–Ñ—.',2,1,'374-98-71');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (13,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ñ�Ð¾Ñ†Ñ–Ð¾Ð»Ð¾Ð³Ñ–Ñ—',2,1,'374-98-65');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (14,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð¿Ð¾Ð»Ñ–Ñ‚Ð¾Ð»Ð¾Ð³Ñ–Ñ—.',2,1,'374-98-67');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (15,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð¼Ñ–Ð¶Ð½Ð°Ñ€Ð¾Ð´Ð½Ð¸Ñ… Ð²Ñ–Ð´Ð½Ð¾Ñ�Ð¸Ð½. ',2,1,'374-98-69');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (16,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ñ�Ð¾Ñ†Ñ–Ð°Ð»ÑŒÐ½Ð¾Ñ— Ñ€Ð¾Ð±Ð¾Ñ‚Ð¸. ',2,1,'374-98-70');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (17,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð¼Ð°Ñ�Ð¾Ð²Ð¾Ñ— Ñ‚Ð° Ð¼Ñ–Ð¶Ð½Ð°Ñ€Ð¾Ð´Ð½Ð¾Ñ— ÐºÐ¾Ð¼ÑƒÐ½Ñ–ÐºÐ°Ñ†Ñ–Ñ—. ',3,1,'776-57-16');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (18,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð»Ñ–Ð½Ð³Ð²Ñ–Ñ�Ñ‚Ð¸Ñ‡Ð½Ð¾Ñ— Ñ‚Ð° ÐºÑ€Ð°Ñ—Ð½Ð¾Ð·Ð½Ð°Ð²Ñ‡Ð¾Ñ— Ð¿Ñ–Ð´Ð³Ð¾Ñ‚Ð¾Ð²ÐºÐ¸ Ð¶ÑƒÑ€Ð½Ð°Ð»Ñ–Ñ�Ñ‚Ñ–Ð².',3,1,'760-94-52');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (19,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð²Ð¸Ð´Ð°Ð²Ð½Ð¸Ñ‡Ð¾Ñ— Ñ�Ð¿Ñ€Ð°Ð²Ð¸ Ñ‚Ð° Ð¼Ñ–Ð¶ÐºÑƒÐ»ÑŒÑ‚ÑƒÑ€Ð½Ð¾Ñ— ÐºÐ¾Ð¼ÑƒÐ½Ñ–ÐºÐ°Ñ†Ñ–Ñ—.',3,1,'776-57-16');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (20,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ñ€ÐµÐºÐ»Ð°Ð¼Ð¸ Ñ‚Ð° Ð·Ð²â€™Ñ�Ð·ÐºÑ–Ð² Ð· Ð³Ñ€Ð¾Ð¼Ð°Ð´Ñ�ÑŒÐºÑ–Ñ�Ñ‚ÑŽ.',3,1,'776-82-01');

INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (21,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð¼Ñ–Ð¶Ð½Ð°Ñ€Ð¾Ð´Ð½Ð¸Ñ… Ñ„Ñ–Ð½Ð°Ð½Ñ�Ñ–Ð².',4,1,'373-12-21');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (22,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° ÐµÐºÐ¾Ð½Ð¾Ð¼Ñ–ÐºÐ¸ Ñ‚Ð° ÑƒÐ¿Ñ€Ð°Ð²Ð»Ñ–Ð½Ð½Ñ� Ð½Ð°Ñ†Ñ–Ð¾Ð½Ð°Ð»ÑŒÐ½Ð¸Ð¼ Ð³Ð¾Ñ�Ð¿Ð¾Ð´Ð°Ñ€Ñ�Ñ‚Ð²Ð¾Ð¼.',4,1,'373-12-14');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (23,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð¼ÐµÐ½ÐµÐ´Ð¶Ð¼ÐµÐ½Ñ‚Ñƒ Ñ‚Ð° Ñ‚ÑƒÑ€Ð¸Ð·Ð¼Ñƒ',4,1,'373-12-16');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (24,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ñ–Ð½Ð¾Ð·ÐµÐ¼Ð½Ð¸Ñ… Ð¼Ð¾Ð².',4,1,'373-12-73');

INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (25,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ñ„Ñ–Ð½Ð°Ð½Ñ�Ñ–Ð².',5,1,'745-24-50');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (26,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð±Ð°Ð½ÐºÑ–Ð²Ñ�ÑŒÐºÐ¾Ñ— Ñ�Ð¿Ñ€Ð°Ð²Ð¸.',5,1,'46-04-03.');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (27,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð¾Ð±Ð»Ñ–ÐºÑƒ Ñ– Ð°ÑƒÐ´Ð¸Ñ‚Ñƒ.',5,1,'744-30-56');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (28,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° ÐµÐºÐ¾Ð½Ð¾Ð¼Ñ–ÐºÐ¸ Ñ– ÑƒÐ¿Ñ€Ð°Ð²Ð»Ñ–Ð½Ð½Ñ� Ð¿Ñ–Ð´Ð¿Ñ€Ð¸Ñ”Ð¼Ñ�Ñ‚Ð²Ð¾Ð¼.',5,1,'744-24-97');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (29,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° ÐµÐºÐ¾Ð½Ð¾Ð¼Ñ–Ñ‡Ð½Ð¾Ñ— Ñ–Ð½Ñ„Ð¾Ñ€Ð¼Ð°Ñ‚Ð¸ÐºÐ¸ Ñ‚Ð° Ñ�Ñ‚Ð°Ñ‚Ð¸Ñ�Ñ‚Ð¸ÐºÐ¸.',5,1,'745-43-24');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (30,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð¼Ð°Ñ€ÐºÐµÑ‚Ð¸Ð½Ð³Ñƒ Ñ‚Ð° Ð¼ÐµÐ½ÐµÐ´Ð¶Ð¼ÐµÐ½Ñ‚Ñƒ.',5,1,'744-86-68');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (31,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° ÐµÐºÐ¾Ð½Ð¾Ð¼Ñ–Ñ‡Ð½Ð¾Ñ— Ñ‚ÐµÐ¾Ñ€Ñ–Ñ—.',5,1,'744-86-38');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (32,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° ÐµÐºÐ¾Ð½Ð¾Ð¼Ñ–Ñ‡Ð½Ð¾Ñ— ÐºÑ–Ð±ÐµÑ€Ð½ÐµÑ‚Ð¸ÐºÐ¸. ',5,1,'745-12-85.');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (33,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° ÐºÐ¾Ð¼Ð¿''ÑŽÑ‚ÐµÑ€Ð½Ð¾Ñ— Ð¾Ð±Ñ€Ð¾Ð±ÐºÐ¸ Ñ„Ñ–Ð½Ð°Ð½Ñ�Ð¾Ð²Ð¾-ÐµÐºÐ¾Ð½Ð¾Ð¼Ñ–Ñ‡Ð½Ð¾Ñ— Ñ–Ð½Ñ„Ð¾Ñ€Ð¼Ð°Ñ†Ñ–Ñ—.',5,1,'744-01-83');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (34,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ñ–Ð½Ð¾Ð·ÐµÐ¼Ð½Ð¸Ñ… Ð¼Ð¾Ð² Ð´Ð»Ñ� ÐµÐºÐ¾Ð½Ð¾Ð¼Ñ–Ñ‡Ð½Ð¸Ñ… Ñ�Ð¿ÐµÑ†Ñ–Ð°Ð»ÑŒÐ½Ð¾Ñ�Ñ‚ÐµÐ¹',5,1,'744-32-24');

INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (35,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð²Ñ�ÐµÑ�Ð²Ñ–Ñ‚Ð½ÑŒÐ¾Ñ— Ñ–Ñ�Ñ‚Ð¾Ñ€Ñ–Ñ—.',6,1,'374â€“98â€“59');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (36,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ñ–Ñ�Ñ‚Ð¾Ñ€Ñ–Ñ— Ð£ÐºÑ€Ð°Ñ—Ð½Ð¸.',6,1,'374â€“98â€“64');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (37,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ñ–Ñ�Ñ‚Ð¾Ñ€Ñ–Ð¾Ð³Ñ€Ð°Ñ„Ñ–Ñ—, Ð´Ð¶ÐµÑ€ÐµÐ»Ð¾Ð·Ð½Ð°Ð²Ñ�Ñ‚Ð²Ð° Ñ‚Ð° Ð°Ñ€Ñ…Ñ–Ð²Ð¾Ð·Ð½Ð°Ð²Ñ�Ñ‚Ð²Ð°.',6,1,'374â€“98â€“62');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (38,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ñ€Ð¾Ñ�Ñ–Ð¹Ñ�ÑŒÐºÐ¾Ñ— Ñ–Ñ�Ñ‚Ð¾Ñ€Ñ–Ñ—',6,1,'374-98-61');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (39,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° ÑƒÐºÑ€Ð°Ñ—Ð½Ñ�ÑŒÐºÐ¾Ñ— Ñ–Ñ�Ñ‚Ð¾Ñ€Ñ–Ñ— Ñ‚Ð° ÐµÑ‚Ð½Ð¾Ð¿Ð¾Ð»Ñ–Ñ‚Ð¸ÐºÐ¸.',6,1,'374â€“98â€“63');


INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (40,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð¿ÐµÐ´Ð°Ð³Ð¾Ð³Ñ–Ñ‡Ð½Ð¾Ñ— Ñ‚Ð° Ð²Ñ–ÐºÐ¾Ð²Ð¾Ñ— Ð¿Ñ�Ð¸Ñ…Ð¾Ð»Ð¾Ð³Ñ–Ñ—.',7,1,'745-51-34');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (41,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð·Ð°Ð³Ð°Ð»ÑŒÐ½Ð¾Ñ— Ñ‚Ð° Ð¼ÐµÐ´Ð¸Ñ‡Ð½Ð¾Ñ— Ð¿Ñ�Ð¸Ñ…Ð¾Ð»Ð¾Ð³Ñ–Ñ—.',7,1,'745-40-60');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (42,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ñ�Ð¾Ñ†Ñ–Ð°Ð»ÑŒÐ½Ð¾Ñ— Ð¿Ñ�Ð¸Ñ…Ð¾Ð»Ð¾Ð³Ñ–Ñ— Ñ‚Ð° Ð¿Ñ�Ð¸Ñ…Ð¾Ð»Ð¾Ð³Ñ–Ñ— ÑƒÐ¿Ñ€Ð°Ð²Ð»Ñ–Ð½Ð½Ñ�.',7,1,' 745-23-39');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (43,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð¿ÐµÐ´Ð°Ð³Ð¾Ð³Ñ–ÐºÐ¸ Ñ‚Ð° ÐºÐ¾Ñ€ÐµÐºÑ†Ñ–Ð¹Ð½Ð¾Ñ— Ð¾Ñ�Ð²Ñ–Ñ‚Ð¸.',7,1,'745-31-10');

INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (44,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð¼Ñ–Ð¶Ð½Ð°Ñ€Ð¾Ð´Ð½Ð¾Ð³Ð¾ Ð¿Ñ€Ð°Ð²Ð°',8,1,'377â€“81â€“79');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (45,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ñ‚ÐµÐ¾Ñ€Ñ–Ñ— Ð´ÐµÑ€Ð¶Ð°Ð²Ð¸ Ñ– Ð¿Ñ€Ð°Ð²Ð°, ÐºÐ¾Ð½Ñ�Ñ‚Ð¸Ñ‚ÑƒÑ†Ñ–Ð¹Ð½Ð¾Ð³Ð¾ Ð¿Ñ€Ð°Ð²Ð° Ñ‚Ð° Ð´ÐµÑ€Ð¶Ð°Ð²Ð½Ð¾Ð³Ð¾ ÑƒÐ¿Ñ€Ð°Ð²Ð»Ñ–Ð½Ð½Ñ�.',8,1,'(056) 377-81-93');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (46,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ñ†Ð¸Ð²Ñ–Ð»ÑŒÐ½Ð¾Ð³Ð¾, Ñ‚Ñ€ÑƒÐ´Ð¾Ð²Ð¾Ð³Ð¾ Ñ‚Ð° Ð³Ð¾Ñ�Ð¿Ð¾Ð´Ð°Ñ€Ñ�ÑŒÐºÐ¾Ð³Ð¾ Ð¿Ñ€Ð°Ð²Ð°',8,1,'(056) 373â€“12â€“68');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (47,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð°Ð´Ð¼Ñ–Ð½Ñ–Ñ�Ñ‚Ñ€Ð°Ñ‚Ð¸Ð²Ð½Ð¾Ð³Ð¾ Ñ‚Ð° ÐºÑ€Ð¸Ð¼Ñ–Ð½Ð°Ð»ÑŒÐ½Ð¾Ð³Ð¾ Ð¿Ñ€Ð°Ð²Ð°',8,1,'(056) 373â€“12â€“19');

INSERT INTO chair (id,name,facultyid,chairhead) VALUES (48,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° ÐµÐ»ÐµÐºÑ‚Ñ€Ð¾Ð½Ð½Ð¸Ñ… Ð·Ð°Ñ�Ð¾Ð±Ñ–Ð² Ñ‚ÐµÐ»ÐµÐºÐ¾Ð¼ÑƒÐ½Ñ–ÐºÐ°Ñ†Ñ–Ð¹.',9,1);
INSERT INTO chair (id,name,facultyid,chairhead) VALUES (49,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð¿Ñ€Ð¸ÐºÐ»Ð°Ð´Ð½Ð¾Ñ— Ñ– ÐºÐ¾Ð¼Ð¿''ÑŽÑ‚ÐµÑ€Ð½Ð¾Ñ— Ñ€Ð°Ð´Ñ–Ð¾Ñ„Ñ–Ð·Ð¸ÐºÐ¸.',9,1);
INSERT INTO chair (id,name,facultyid,chairhead) VALUES (50,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° ÐµÐ»ÐµÐºÑ‚Ñ€Ð¾Ð½Ð½Ð¸Ñ… Ð¾Ð±Ñ‡Ð¸Ñ�Ð»ÑŽÐ²Ð°Ð»ÑŒÐ½Ð¸Ñ… Ð¼Ð°ÑˆÐ¸Ð½.',9,1);
INSERT INTO chair (id,name,facultyid,chairhead) VALUES (51,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð°Ð²Ñ‚Ð¾Ð¼Ð°Ñ‚Ð¸Ð·Ð¾Ð²Ð°Ð½Ð¸Ñ… Ñ�Ð¸Ñ�Ñ‚ÐµÐ¼ Ð¾Ð±Ñ€Ð¾Ð±ÐºÐ¸ Ñ–Ð½Ñ„Ð¾Ñ€Ð¼Ð°Ñ†Ñ–Ñ—.',9,1);
INSERT INTO chair (id,name,facultyid,chairhead) VALUES (52,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ñ‚ÐµÐ¾Ñ€ÐµÑ‚Ð¸Ñ‡Ð½Ð¾Ñ— Ñ„Ñ–Ð·Ð¸ÐºÐ¸.',9,1);
INSERT INTO chair (id,name,facultyid,chairhead) VALUES (53,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° ÐºÐ²Ð°Ð½Ñ‚Ð¾Ð²Ð¾Ñ— Ð¼Ð°ÐºÑ€Ð¾Ñ„Ñ–Ð·Ð¸ÐºÐ¸.',9,1);
INSERT INTO chair (id,name,facultyid,chairhead) VALUES (54,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ñ€Ð°Ð´Ñ–Ð¾ÐµÐ»ÐµÐºÑ‚Ñ€Ð¾Ð½Ñ–ÐºÐ¸.',9,1);
INSERT INTO chair (id,name,facultyid,chairhead) VALUES (55,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° ÐµÐºÑ�Ð¿ÐµÑ€Ð¸Ð¼ÐµÐ½Ñ‚Ð°Ð»ÑŒÐ½Ð¾Ñ— Ñ„Ñ–Ð·Ð¸ÐºÐ¸.',9,1);
INSERT INTO chair (id,name,facultyid,chairhead) VALUES (56,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð¼ÐµÑ‚Ð°Ð»Ð¾Ñ„Ñ–Ð·Ð¸ÐºÐ¸.',9,1);
INSERT INTO chair (id,name,facultyid,chairhead) VALUES (57,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ñ„Ñ–Ð·Ð¸ÐºÐ¸ Ñ‚Ð²ÐµÑ€Ð´Ð¾Ð³Ð¾ Ñ‚Ñ–Ð»Ð° Ñ‚Ð° Ð¾Ð¿Ñ‚Ð¾ÐµÐ»ÐµÐºÑ‚Ñ€Ð¾Ð½Ñ–ÐºÐ¸.',9,1);

INSERT INTO chair (id,name,facultyid,chairhead) VALUES (58,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ñ…Ð°Ñ€Ñ‡Ð¾Ð²Ð¸Ñ… Ñ‚ÐµÑ…Ð½Ð¾Ð»Ð¾Ð³Ñ–Ð¹.',10,1);
INSERT INTO chair (id,name,facultyid,chairhead) VALUES (59,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ñ„Ñ–Ð·Ð¸Ñ‡Ð½Ð¾Ñ— Ñ‚Ð° Ð½ÐµÐ¾Ñ€Ð³Ð°Ð½Ñ–Ñ‡Ð½Ð¾Ñ— Ñ…Ñ–Ð¼Ñ–Ñ—.',10,1);
INSERT INTO chair (id,name,facultyid,chairhead) VALUES (60,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð°Ð½Ð°Ð»Ñ–Ñ‚Ð¸Ñ‡Ð½Ð¾Ñ— Ñ…Ñ–Ð¼Ñ–Ñ—.',10,1);
INSERT INTO chair (id,name,facultyid,chairhead) VALUES (61,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð¾Ñ€Ð³Ð°Ð½Ñ–Ñ‡Ð½Ð¾Ñ— Ñ…Ñ–Ð¼Ñ–Ñ—.',10,1);
INSERT INTO chair (id,name,facultyid,chairhead) VALUES (62,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ñ…Ñ–Ð¼Ñ–Ñ— Ñ‚Ð° Ñ…Ñ–Ð¼Ñ–Ñ‡Ð½Ð¾Ñ— Ñ‚ÐµÑ…Ð½Ð¾Ð»Ð¾Ð³Ñ–Ñ— Ð²Ð¸Ñ�Ð¾ÐºÐ¾Ð¼Ð¾Ð»ÐµÐºÑƒÐ»Ñ�Ñ€Ð½Ð¸Ñ… Ñ�Ð¿Ð¾Ð»ÑƒÐº.',10,1);
INSERT INTO chair (id,name,facultyid,chairhead) VALUES (63,'Ð�Ð°ÑƒÐºÐ¾Ð²Ð¾-Ð´Ð¾Ñ�Ð»Ñ–Ð´Ð½Ð° Ð»Ð°Ð±Ð¾Ñ€Ð°Ñ‚Ð¾Ñ€Ñ–Ñ� ÐµÐ»ÐµÐºÑ‚Ñ€Ð¾Ð¾Ñ�Ð°Ð´Ð¶ÐµÐ½Ð½Ñ� Ð¼ÐµÑ‚Ð°Ð»Ñ–Ð².',10,1);

INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (64,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ñ„Ñ–Ð·Ñ–Ð¾Ð»Ð¾Ð³Ñ–Ñ— Ð»ÑŽÐ´Ð¸Ð½Ð¸ Ñ– Ñ‚Ð²Ð°Ñ€Ð¸Ð½',11,1,'(0562)46-92-17');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (65,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ñ„Ñ–Ð·Ñ–Ð¾Ð»Ð¾Ð³Ñ–Ñ— Ñ€Ð¾Ñ�Ð»Ð¸Ð½ Ñ‚Ð° Ñ–Ð½Ñ‚Ñ€Ð¾Ð´ÑƒÐºÑ†Ñ–Ñ—',11,1,'(0562) 46-92-44');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (66,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð±Ñ–Ð¾Ñ„Ñ–Ð·Ð¸ÐºÐ¸ Ñ‚Ð° Ð±Ñ–Ð¾Ñ…Ñ–Ð¼Ñ–Ñ—',11,1,'(056)373-12-49');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (67,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ñ–Ñ…Ñ‚Ñ–Ð¾Ð»Ð¾Ð³Ñ–Ñ— Ñ‚Ð° Ð³Ñ–Ð´Ñ€Ð¾Ð±Ñ–Ð¾Ð»Ð¾Ð³Ñ–Ñ—',11,1,'(0562)46-92-81');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (68,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð¼Ñ–ÐºÑ€Ð¾Ð±Ñ–Ð¾Ð»Ð¾Ð³Ñ–Ñ— Ñ‚Ð° Ð²Ñ–Ñ€ÑƒÑ�Ð¾Ð»Ð¾Ð³Ñ–Ñ—',11,1,'(056)373-12-66');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (69,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð·Ð¾Ð¾Ð»Ð¾Ð³Ñ–Ñ— Ñ‚Ð° ÐµÐºÐ¾Ð»Ð¾Ð³Ñ–Ñ—',11,1,'(056)7768253');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (70,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð³ÐµÐ¾Ð±Ð¾Ñ‚Ð°Ð½Ñ–ÐºÐ¸, Ò‘Ñ€ÑƒÐ½Ñ‚Ð¾Ð·Ð½Ð°Ð²Ñ�Ñ‚Ð²Ð° Ñ‚Ð° ÐµÐºÐ¾Ð»Ð¾Ð³Ñ–Ñ—',11,1,'(0562) 46-92-63.');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (71,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° ÐºÐ»Ñ–Ð½Ñ–Ñ‡Ð½Ð¾Ñ— Ð»Ð°Ð±Ð¾Ñ€Ð°Ñ‚Ð¾Ñ€Ð½Ð¾Ñ— Ð´Ñ–Ð°Ð³Ð½Ð¾Ñ�Ñ‚Ð¸ÐºÐ¸',11,1,'47-36-10');

INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (72,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð³ÐµÐ¾Ð»Ð¾Ð³Ñ–Ñ— Ñ‚Ð° Ð³Ñ–Ð´Ñ€Ð¾Ð³ÐµÐ¾Ð»Ð¾Ð³Ñ–Ñ—.',12,1,'744â€“86â€“03');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (73,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð³Ñ–Ð´Ñ€Ð¾Ð¼ÐµÑ‚ÐµÐ¾Ñ€Ð¾Ð»Ð¾Ð³Ñ–Ñ—Ñ— Ñ– Ð³ÐµÐ¾ÐµÐºÐ¾Ð»Ð¾Ð³Ñ–Ñ—.',12,1,'31-86-98');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (74,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ñ„Ñ–Ð·Ð¸Ñ‡Ð½Ð¾Ñ— Ñ‚Ð° ÐµÐºÐ¾Ð½Ð¾Ð¼Ñ–Ñ‡Ð½Ð¾Ñ— Ð³ÐµÐ¾Ð³Ñ€Ð°Ñ„Ñ–Ñ—.',12,1,'744â€“86â€“03');

INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (75,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð¾Ð±Ñ‡Ð¸Ñ�Ð»ÑŽÐ²Ð°Ð»ÑŒÐ½Ð¾Ñ— Ð¼Ð°Ñ‚ÐµÐ¼Ð°Ñ‚Ð¸ÐºÐ¸ Ñ‚Ð° Ð¼Ð°Ñ‚ÐµÐ¼Ð°Ñ‚Ð¸Ñ‡Ð½Ð¾Ñ— ÐºÑ–Ð±ÐµÑ€Ð½ÐµÑ‚Ð¸ÐºÐ¸.',13,1,'745-14-11');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (76,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð¼Ð°Ñ‚ÐµÐ¼Ð°Ñ‚Ð¸Ñ‡Ð½Ð¾Ð³Ð¾ Ð·Ð°Ð±ÐµÐ·Ð¿ÐµÑ‡ÐµÐ½Ð½Ñ� ÐµÐ»ÐµÐºÑ‚Ñ€Ð¾Ð½Ð½Ð¸Ñ… Ð¾Ð±Ñ‡Ð¸Ñ�Ð»ÑŽÐ²Ð°Ð»ÑŒÐ½Ð¸Ñ… Ð¼Ð°ÑˆÐ¸Ð½.',13,1,'744-76-83');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (77,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð¼Ð°Ñ‚ÐµÐ¼Ð°Ñ‚Ð¸Ñ‡Ð½Ð¾Ð³Ð¾ Ð¼Ð¾Ð´ÐµÐ»ÑŽÐ²Ð°Ð½Ð½Ñ�.',13,1,'744-51-18');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (78,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° ÐºÐ¾Ð¼Ð¿''ÑŽÑ‚ÐµÑ€Ð½Ð¸Ñ… Ñ‚ÐµÑ…Ð½Ð¾Ð»Ð¾Ð³Ñ–Ð¹.',13,1,'744-86-38');

INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (79,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð¼Ð°Ñ‚ÐµÐ¼Ð°Ñ‚Ð¸Ñ‡Ð½Ð¾Ð³Ð¾ Ð°Ð½Ð°Ð»Ñ–Ð·Ñƒ Ñ– Ñ‚ÐµÐ¾Ñ€Ñ–Ñ— Ñ„ÑƒÐ½ÐºÑ†Ñ–Ð¹.',14,1,'776-82-41 ');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (80,'Ñ„ÐµÐ´Ñ€Ð° Ð³ÐµÐ¾Ð¼ÐµÑ‚Ñ€Ñ–Ñ— Ñ‚Ð° Ð°Ð»Ð³ÐµÐ±Ñ€Ð¸.',14,1,'776-82-41');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (81,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð´Ð¸Ñ„ÐµÑ€ÐµÐ½Ñ†Ñ–Ð°Ð»ÑŒÐ½Ð¸Ñ… Ñ€Ñ–Ð²Ð½Ñ�Ð½ÑŒ',14,1,'374-98-00, 776-82-41');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (82,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ñ�Ñ‚Ð°Ñ‚Ð¸Ñ�Ñ‚Ð¸ÐºÐ¸ Ð¹ Ñ‚ÐµÐ¾Ñ€Ñ–Ñ— Ð¹Ð¼Ð¾Ð²Ñ–Ñ€Ð½Ð¾Ñ�Ñ‚ÐµÐ¹.',14,1,'776-82-41');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (83,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ñ‚ÐµÐ¾Ñ€ÐµÑ‚Ð¸Ñ‡Ð½Ð¾Ñ— Ñ‚Ð° Ð¿Ñ€Ð¸ÐºÐ»Ð°Ð´Ð½Ð¾Ñ— Ð¼ÐµÑ…Ð°Ð½Ñ–ÐºÐ¸.',14,1,'776-82-41');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (84,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð°ÐµÑ€Ð¾Ð³Ñ–Ð´Ñ€Ð¾Ð¼ÐµÑ…Ð°Ð½Ñ–ÐºÐ¸ Ñ‚Ð° ÐµÐ½ÐµÑ€Ð³Ð¾Ð¼Ð°Ñ�Ð¾Ð¿ÐµÑ€ÐµÐ½Ð¾Ñ�Ñƒ.',14,1,'374-98-02; 776-82-41');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (85,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð¾Ð±Ñ‡Ð¸Ñ�Ð»ÑŽÐ²Ð°Ð»ÑŒÐ½Ð¾Ñ— Ð¼ÐµÑ…Ð°Ð½Ñ–ÐºÐ¸ Ñ‚Ð° Ð¼Ñ–Ñ†Ð½Ð¾Ñ�Ñ‚Ñ– ÐºÐ¾Ð½Ñ�Ñ‚Ñ€ÑƒÐºÑ†Ñ–Ð¹.',14,1,'745-00-85');

INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (86,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð¿Ñ€Ð¾ÐµÐºÑ‚ÑƒÐ²Ð°Ð½Ð½Ñ� Ñ– ÐºÐ¾Ð½Ñ�Ñ‚Ñ€ÑƒÐºÑ†Ñ–Ð¹ Ð»Ñ–Ñ‚Ð°Ð»ÑŒÐ½Ð¸Ñ… Ð°Ð¿Ð°Ñ€Ð°Ñ‚Ñ–Ð².',15,1,'776â€“82â€“26');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (87,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð´Ð²Ð¸Ð³ÑƒÐ½Ð¾Ð±ÑƒÐ´ÑƒÐ²Ð°Ð½Ð½Ñ�',15,1,'46â€“30â€“26');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (88,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ñ�Ð½ÐµÑ€Ð³ÐµÑ‚Ð¸ÐºÐ¸',15,1,'374â€“23â€“47');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (89,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ñ�Ð¸Ñ�Ñ‚ÐµÐ¼ Ð°Ð²Ñ‚Ð¾Ð¼Ð°Ñ‚Ð¸Ð·Ð¾Ð²Ð°Ð½Ð¾Ð³Ð¾ ÑƒÐ¿Ñ€Ð°Ð²Ð»Ñ–Ð½Ð½Ñ�.',15,1,'776â€“57â€“27');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (90,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ñ€Ð°Ð´Ñ–Ð¾ÐµÐ»ÐµÐºÑ‚Ñ€Ð¾Ð½Ð½Ð¾Ñ— Ð°Ð²Ñ‚Ð¾Ð¼Ð°Ñ‚Ð¸ÐºÐ¸.',15,1,'46â€“57â€“81');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (91,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ñ€Ð¾Ð±Ð¾Ñ‚Ð¾Ñ‚ÐµÑ…Ð½Ñ–Ñ‡Ð½Ð¸Ñ… Ñ�Ð¸Ñ�Ñ‚ÐµÐ¼.',15,1,'46â€“92â€“10');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (92,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ñ‚ÐµÑ…Ð½Ð¾Ð»Ð¾Ð³Ñ–Ñ— Ð²Ð¸Ñ€Ð¾Ð±Ð½Ð¸Ñ†Ñ‚Ð²Ð° Ð»Ñ–Ñ‚Ð°Ð»ÑŒÐ½Ð¸Ñ… Ð°Ð¿Ð°Ñ€Ð°Ñ‚Ñ–Ð².',15,1,' 776â€“83â€“79');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (93,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ñ‚ÐµÑ…Ð½Ñ–Ñ‡Ð½Ð¾Ñ— Ð¼ÐµÑ…Ð°Ð½Ñ–ÐºÐ¸.',15,1,'776â€“58â€“49');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (94,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ð±ÐµÐ·Ð¿ÐµÐºÐ¸ Ð¶Ð¸Ñ‚Ñ‚Ñ”Ð´Ñ–Ñ�Ð»ÑŒÐ½Ð¾Ñ�Ñ‚Ñ–.',15,1,'776â€“58â€“85');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (95,'ÐšÐ°Ñ„ÐµÐ´Ñ€Ð° Ñ–Ð½Ð¾Ð·ÐµÐ¼Ð½Ð¸Ñ… Ð¼Ð¾Ð² Ð´Ð»Ñ� Ñ‚ÐµÑ…Ð½Ñ–Ñ‡Ð½Ð¸Ñ… Ñ‚Ð° Ð¿Ñ€Ð¸Ñ€Ð¾Ð´Ð¾Ð·Ð½Ð°Ð²Ñ‡Ð¸Ñ… Ñ�Ð¿ÐµÑ†Ð¸Ð°Ð»ÑŒÐ½Ð¾Ñ�Ñ‚ÐµÐ¹.',15,1,'46â€“92â€“89');

INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (96,'Ð’Ñ–Ð´Ð´Ñ–Ð»ÐµÐ½Ð½Ñ� Ð²ÐµÑ‡Ñ–Ñ€Ð½ÑŒÐ¾Ñ— Ñ„Ð¾Ñ€Ð¼Ð¸ Ð½Ð°Ð²Ñ‡Ð°Ð½Ð½Ñ�',16,1,'(056) 373-58-32');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (97,'Ð’Ñ–Ð´Ð´Ñ–Ð»ÐµÐ½Ð½Ñ� Ð·Ð°Ð¾Ñ‡Ð½Ð¾Ñ— Ñ„Ð¾Ñ€Ð¼Ð¸ Ð½Ð°Ð²Ñ‡Ð°Ð½Ð½Ñ�',16,1,'(056) 760-86-83');




/*profession*/
/*Ð¤Ð°ÐºÑƒÐ»ÑŒÑ‚ÐµÑ‚ ÑƒÐºÑ€Ð°Ñ—Ð½Ñ�ÑŒÐºÐ¾Ñ— Ð¹ Ñ–Ð½Ð¾Ð·ÐµÐ¼Ð½Ð¾Ñ— Ñ„Ñ–Ð»Ð¾Ð»Ð¾Ð³Ñ–Ñ— Ñ‚Ð° Ð¼Ð¸Ñ�Ñ‚ÐµÑ†Ñ‚Ð²Ð¾Ð·Ð½Ð°Ð²Ñ�Ñ‚Ð²Ð°*/ 
INSERT INTO profession (id,code,name,chairid) VALUES (1,'6.020205','ÐžÐ±Ñ€Ð°Ð·Ð¾Ñ‚Ð²Ð¾Ñ€Ñ‡Ðµ Ð¼Ð¸Ñ�Ñ‚ÐµÑ†Ñ‚Ð²Ð¾',1);
INSERT INTO profession (id,code,name,chairid) VALUES (2,'6.020207','Ð”Ð¸Ð·Ð°Ð¹Ð½',1);
INSERT INTO profession (id,code,name,chairid) VALUES (3,'6.020303','Ð¤Ñ–Ð»Ð¾Ð»Ð¾Ð³Ñ–Ñ� (ÑƒÐºÑ€Ð°Ñ—Ð½Ñ�ÑŒÐºÐ° Ð¼Ð¾Ð²Ð° Ñ‚Ð° Ð»Ñ–Ñ‚ÐµÑ€Ð°Ñ‚ÑƒÑ€Ð°)',1);
INSERT INTO profession (id,code,name,chairid) VALUES (4,'6.020303','Ð¤Ñ–Ð»Ð¾Ð»Ð¾Ð³Ñ–Ñ� (Ñ€Ð¾Ñ�Ñ–Ð¹Ñ�ÑŒÐºÐ° Ð¼Ð¾Ð²Ð° Ñ‚Ð° Ð»Ñ–Ñ‚ÐµÑ€Ð°Ñ‚ÑƒÑ€Ð°)',1);
INSERT INTO profession (id,code,name,chairid) VALUES (5,'6.020303','ÐŸÐµÑ€ÐµÐºÐ»Ð°Ð´',1);
INSERT INTO profession (id,code,name,chairid) VALUES (6,'6.020303','Ð¤Ñ–Ð»Ð¾Ð»Ð¾Ð³Ñ–Ñ� (Ð°Ð½Ð³Ð»Ñ–Ð¹Ñ�ÑŒÐºÐ° Ð¼Ð¾Ð²Ð° Ñ‚Ð° Ð»Ñ–Ñ‚ÐµÑ€Ð°Ñ‚ÑƒÑ€Ð°)',1);
INSERT INTO profession (id,code,name,chairid) VALUES (7,'6.020303','Ð¤Ñ–Ð»Ð¾Ð»Ð¾Ð³Ñ–Ñ� (ÐºÐ¸Ñ‚Ð°Ð¹Ñ�ÑŒÐºÐ° Ð¼Ð¾Ð²Ð° Ñ‚Ð° Ð»Ñ–Ñ‚ÐµÑ€Ð°Ñ‚ÑƒÑ€Ð°)',1);
INSERT INTO profession (id,code,name,chairid) VALUES (8,'6.020303','Ð¤Ñ–Ð»Ð¾Ð»Ð¾Ð³Ñ–Ñ� (Ñ�Ð¿Ð¾Ð½Ñ�ÑŒÐºÐ° Ð¼Ð¾Ð²Ð° Ñ‚Ð° Ð»Ñ–Ñ‚ÐµÑ€Ð°Ñ‚ÑƒÑ€Ð°)',1);
INSERT INTO profession (id,code,name,chairid) VALUES (9,'6.020303','Ð¤Ñ–Ð»Ð¾Ð»Ð¾Ð³Ñ–Ñ� (Ð½Ñ–Ð¼ÐµÑ†ÑŒÐºÐ° Ð¼Ð¾Ð²Ð° Ñ‚Ð° Ð»Ñ–Ñ‚ÐµÑ€Ð°Ñ‚ÑƒÑ€Ð°)',1);
INSERT INTO profession (id,code,name,chairid) VALUES (10,'6.020303','Ð¤Ñ–Ð»Ð¾Ð»Ð¾Ð³Ñ–Ñ� (Ñ„Ñ€Ð°Ð½Ñ†ÑƒÐ·ÑŒÐºÐ° Ð¼Ð¾Ð²Ð° Ñ‚Ð° Ð»Ñ–Ñ‚ÐµÑ€Ð°Ñ‚ÑƒÑ€Ð°)',1);


/*Ð¤Ð°ÐºÑƒÐ»ÑŒÑ‚ÐµÑ‚ Ñ�ÑƒÑ�Ð¿Ñ–Ð»ÑŒÐ½Ð¸Ñ… Ð½Ð°ÑƒÐº Ñ– Ð¼Ñ–Ð¶Ð½Ð°Ñ€Ð¾Ð´Ð½Ð¸Ñ… Ð²Ñ–Ð´Ð½Ð¾Ñ�Ð¸Ð½*/
INSERT INTO profession (id,code,name,chairid) VALUES (11,'6.030201','ÐœÑ–Ð¶Ð½Ð°Ñ€Ð¾Ð´Ð½Ñ– Ð²Ñ–Ð´Ð½Ð¾Ñ�Ð¸Ð½Ð¸',1);
INSERT INTO profession (id,code,name,chairid) VALUES (12,'6.030104','ÐŸÐ¾Ð»Ñ–Ñ‚Ð¾Ð»Ð¾Ð³Ñ–Ñ�',1);
INSERT INTO profession (id,code,name,chairid) VALUES (13,'6.130102','Ð¡Ð¾Ñ†Ñ–Ð°Ð»ÑŒÐ½Ð° Ñ€Ð¾Ð±Ð¾Ñ‚Ð°',1);
INSERT INTO profession (id,code,name,chairid) VALUES (14,'6.020301','Ð¤Ñ–Ð»Ð¾Ñ�Ð¾Ñ„Ñ–Ñ�',1);
INSERT INTO profession (id,code,name,chairid) VALUES (15,'6.030101','Ð¡Ð¾Ñ†Ñ–Ð¾Ð»Ð¾Ð³Ñ–Ñ�',1);
/* Ð¤Ð°ÐºÑƒÐ»ÑŒÑ‚ÐµÑ‚ Ñ�Ð¸Ñ�Ñ‚ÐµÐ¼ Ñ‚Ð° Ð·Ð°Ñ�Ð¾Ð±Ñ–Ð² Ð¼Ð°Ñ�Ð¾Ð²Ð¾Ñ— ÐºÐ¾Ð¼ÑƒÐ½Ñ–ÐºÐ°Ñ†Ñ–Ñ—*/
INSERT INTO profession (id,code,name,chairid) VALUES (16,'6.030301','Ð–ÑƒÑ€Ð½Ð°Ð»Ñ–Ñ�Ñ‚Ð¸ÐºÐ°',1);
INSERT INTO profession (id,code,name,chairid) VALUES (17,'6.030302','Ð ÐµÐºÐ»Ð°Ð¼Ð° Ñ– Ð·Ð²''Ñ�Ð·ÐºÐ¸ Ð· Ð³Ñ€Ð¾Ð¼Ð°Ð´Ñ�ÑŒÐºÑ–Ñ�Ñ‚ÑŽ',1);
INSERT INTO profession (id,code,name,chairid) VALUES (18,'6.030303','Ð’Ð¸Ð´Ð°Ð²Ð½Ð¸Ñ‡Ð° Ñ�Ð¿Ñ€Ð°Ð²Ð° Ñ‚Ð° Ñ€ÐµÐ´Ð°Ð³ÑƒÐ²Ð°Ð½Ð½Ñ�',1);
/* Ð¤Ð°ÐºÑƒÐ»ÑŒÑ‚ÐµÑ‚ Ð¼Ñ–Ð¶Ð½Ð°Ñ€Ð¾Ð´Ð½Ð¾Ñ— ÐµÐºÐ¾Ð½Ð¾Ð¼Ñ–ÐºÐ¸*/
INSERT INTO profession (id,code,name,chairid) VALUES (19,'6.140103','Ð¢ÑƒÑ€Ð¸Ð·Ð¼',1);
INSERT INTO profession (id,code,name,chairid) VALUES (20,'6.030505','Ð£Ð¿Ñ€Ð°Ð²Ð»Ñ–Ð½Ð½Ñ� Ð¿ÐµÑ€Ñ�Ð¾Ð½Ð°Ð»Ð¾Ð¼ Ñ– ÐµÐºÐ¾Ð½Ð¾Ð¼Ñ–ÐºÐ° Ð¿Ñ€Ð°Ñ†Ñ–',1);
INSERT INTO profession (id,code,name,chairid) VALUES (21,'6.030503','ÐœÑ–Ð¶Ð½Ð°Ñ€Ð¾Ð´Ð½Ð° ÐµÐºÐ¾Ð½Ð¾Ð¼Ñ–ÐºÐ°',1);
INSERT INTO profession (id,code,name,chairid) VALUES (22,'6.030601','ÐœÐµÐ½ÐµÐ´Ð¶Ð¼ÐµÐ½Ñ‚',1);
INSERT INTO profession (id,code,name,chairid) VALUES (23,'6.030203','ÐœÑ–Ð¶Ð½Ð°Ñ€Ð¾Ð´Ð½Ñ– ÐµÐºÐ¾Ð½Ð¾Ð¼Ñ–Ñ‡Ð½Ñ– Ð²Ñ–Ð´Ð½Ð¾Ñ�Ð¸Ð½Ð¸',1);
/* Ð•ÐºÐ¾Ð½Ð¾Ð¼Ñ–Ñ‡Ð½Ð¸Ð¹ Ñ„Ð°ÐºÑƒÐ»ÑŒÑ‚ÐµÑ‚*/
INSERT INTO profession (id,code,name,chairid) VALUES (24,'6.030502','Ð•ÐºÐ¾Ð½Ð¾Ð¼Ñ–Ñ‡Ð½Ð° ÐºÑ–Ð±ÐµÑ€Ð½ÐµÑ‚Ð¸ÐºÐ°',1);
INSERT INTO profession (id,code,name,chairid) VALUES (25,'6.030504','Ð•ÐºÐ¾Ð½Ð¾Ð¼Ñ–ÐºÐ° Ð¿Ñ–Ð´Ð¿Ñ€Ð¸Ñ”Ð¼Ñ�Ñ‚Ð²Ð°',1);
INSERT INTO profession (id,code,name,chairid) VALUES (26,'6.030506','ÐŸÑ€Ð¸ÐºÐ»Ð°Ð´Ð½Ð° Ñ�Ñ‚Ð°Ñ‚Ð¸Ñ�Ñ‚Ð¸ÐºÐ°',1);
INSERT INTO profession (id,code,name,chairid) VALUES (27,'6.030507','ÐœÐ°Ñ€ÐºÐµÑ‚Ð¸Ð½Ð³',1);
INSERT INTO profession (id,code,name,chairid) VALUES (28,'6.030508','Ð¤Ñ–Ð½Ð°Ð½Ñ�Ð¸ Ñ– ÐºÑ€ÐµÐ´Ð¸Ñ‚',1);
INSERT INTO profession (id,code,name,chairid) VALUES (29,'6.030509','ÐžÐ±Ð»Ñ–Ðº Ñ– Ð°ÑƒÐ´Ð¸Ñ‚',1);
/* Ð†Ñ�Ñ‚Ð¾Ñ€Ð¸Ñ‡Ð½Ð¸Ð¹ Ñ„Ð°ÐºÑƒÐ»ÑŒÑ‚ÐµÑ‚*/
INSERT INTO profession (id,code,name,chairid) VALUES (30,'6.020302','Ð†Ñ�Ñ‚Ð¾Ñ€Ñ–Ñ�',1);
/* Ð¤Ð°ÐºÑƒÐ»ÑŒÑ‚ÐµÑ‚ Ð¿Ñ�Ð¸Ñ…Ð¾Ð»Ð¾Ð³Ñ–Ñ—*/
INSERT INTO profession (id,code,name,chairid) VALUES (31,'6.030102','ÐŸÑ�Ð¸Ñ…Ð¾Ð»Ð¾Ð³Ñ–Ñ�',1);
INSERT INTO profession (id,code,name,chairid) VALUES (32,'6.010105','ÐšÐ¾Ñ€ÐµÐºÑ†Ñ–Ð¹Ð½Ð° Ð¾Ñ�Ð²Ñ–Ñ‚Ð°',1);
/* Ð®Ñ€Ð¸Ð´Ð¸Ñ‡Ð½Ð¸Ð¹ Ñ„Ð°ÐºÑƒÐ»ÑŒÑ‚ÐµÑ‚*/
INSERT INTO profession (id,code,name,chairid) VALUES (33,'6.030402','ÐŸÑ€Ð°Ð²Ð¾Ð·Ð½Ð°Ð²Ñ�Ñ‚Ð²Ð¾',1);
/* Ð¤Ð°ÐºÑƒÐ»ÑŒÑ‚ÐµÑ‚ Ñ„Ñ–Ð·Ð¸ÐºÐ¸, ÐµÐ»ÐµÐºÑ‚Ñ€Ð¾Ð½Ñ–ÐºÐ¸ Ñ‚Ð° ÐºÐ¾Ð¼Ð¿''ÑŽÑ‚ÐµÑ€Ð½Ð¸Ñ… Ñ�Ð¸Ñ�Ñ‚ÐµÐ¼*/
INSERT INTO profession (id,code,name,chairid) VALUES (34,'6.040203','Ð¤Ñ–Ð·Ð¸ÐºÐ°',1);
INSERT INTO profession (id,code,name,chairid) VALUES (35,'6.040204','ÐŸÑ€Ð¸ÐºÐ»Ð°Ð´Ð½Ð° Ñ„Ñ–Ð·Ð¸ÐºÐ°',1);
INSERT INTO profession (id,code,name,chairid) VALUES (36,'6.050801','ÐœÑ–ÐºÑ€Ð¾- Ñ‚Ð° Ð½Ð°Ð½Ð¾ÐµÐ»ÐµÐºÑ‚Ñ€Ð¾Ð½Ñ–ÐºÐ°',1);
INSERT INTO profession (id,code,name,chairid) VALUES (37,'6.050101','ÐšÐ¾Ð¼Ð¿''ÑŽÑ‚ÐµÑ€Ð½Ñ– Ð½Ð°ÑƒÐºÐ¸',1);
INSERT INTO profession (id,code,name,chairid) VALUES (38,'6.050903','Ð¢ÐµÐ»ÐµÐºÐ¾Ð¼ÑƒÐ½Ñ–ÐºÐ°Ñ†Ñ–Ñ—',1);
INSERT INTO profession (id,code,name,chairid) VALUES (39,'6.050102','ÐšÐ¾Ð¼Ð¿''ÑŽÑ‚ÐµÑ€Ð½Ð° Ñ–Ð½Ð¶ÐµÐ½ÐµÑ€Ñ–Ñ�',1);
INSERT INTO profession (id,code,name,chairid) VALUES (40,'6.050902','Ð Ð°Ð´Ñ–Ð¾ÐµÐ»ÐµÐºÑ‚Ñ€Ð¾Ð½Ð½Ñ– Ð°Ð¿Ð°Ñ€Ð°Ñ‚Ð¸',1);
/*Ð¥Ñ–Ð¼Ñ–Ñ‡Ð½Ð¸Ð¹ Ñ„Ð°ÐºÑƒÐ»ÑŒÑ‚ÐµÑ‚*/
INSERT INTO profession (id,code,name,chairid) VALUES (41,'6.040101','Ð¥Ñ–Ð¼Ñ–Ñ�',1);
INSERT INTO profession (id,code,name,chairid) VALUES (42,'6.051301','Ð¥Ñ–Ð¼Ñ–Ñ‡Ð½Ð° Ñ‚ÐµÑ…Ð½Ð¾Ð»Ð¾Ð³Ñ–Ñ�',1);
INSERT INTO profession (id,code,name,chairid) VALUES (43,'6.051701','Ð¥Ð°Ñ€Ñ‡Ð¾Ð²Ð° Ñ‚ÐµÑ…Ð½Ð¾Ð»Ð¾Ð³Ñ–Ñ� Ñ‚Ð° Ñ–Ð½Ð¶ÐµÐ½ÐµÑ€Ñ–Ñ�',1);
/* Ð¤Ð°ÐºÑƒÐ»ÑŒÑ‚ÐµÑ‚ Ð±Ñ–Ð¾Ð»Ð¾Ð³Ñ–Ñ—, ÐµÐºÐ¾Ð»Ð¾Ð³Ñ–Ñ— Ñ‚Ð° Ð¼ÐµÐ´Ð¸Ñ†Ð¸Ð½Ð¸*/
INSERT INTO profession (id,code,name,chairid) VALUES (44,'6.040102','Ð‘Ñ–Ð¾Ð»Ð¾Ð³Ñ–Ñ�',1);
INSERT INTO profession (id,code,name,chairid) VALUES (45,'6.040106','Ð•ÐºÐ¾Ð»Ð¾Ð³Ñ–Ñ�, Ð¾Ñ…Ð¾Ñ€Ð¾Ð½Ð° Ð½Ð°Ð²ÐºÐ¾Ð»Ð¸ÑˆÐ½ÑŒÐ¾Ð³Ð¾ Ñ�ÐµÑ€ÐµÐ´Ð¾Ð²Ð¸Ñ‰Ð° Ñ‚Ð° Ð·Ð±Ð°Ð»Ð°Ð½Ñ�Ð¾Ð²Ð°Ð½Ðµ Ð¿Ñ€Ð¸Ñ€Ð¾Ð´Ð¾ÐºÐ¾Ñ€Ð¸Ñ�Ñ‚ÑƒÐ²Ð°Ð½Ð½Ñ�',1);
INSERT INTO profession (id,code,name,chairid) VALUES (46,'6.120102','Ð›Ð°Ð±Ð¾Ñ€Ð°Ñ‚Ð¾Ñ€Ð½Ð° Ð´Ñ–Ð°Ð³Ð½Ð¾Ñ�Ñ‚Ð¸ÐºÐ°',1);
/*Ð“ÐµÐ¾Ð»Ð¾Ð³Ð¾-Ð³ÐµÐ¾Ð³Ñ€Ð°Ñ„Ñ–Ñ‡Ð½Ð¸Ð¹ Ñ„Ð°ÐºÑƒÐ»ÑŒÑ‚ÐµÑ‚*/
INSERT INTO profession (id,code,name,chairid) VALUES (47,'6.040104','Ð“ÐµÐ¾Ð³Ñ€Ð°Ñ„Ñ–Ñ�',1);
INSERT INTO profession (id,code,name,chairid) VALUES (48,'6.040105','Ð“Ñ–Ð´Ñ€Ð¾Ð¼ÐµÑ‚ÐµÐ¾Ñ€Ð¾Ð»Ð¾Ð³Ñ–Ñ�',1);
INSERT INTO profession (id,code,name,chairid) VALUES (49,'6.040103','Ð“ÐµÐ¾Ð»Ð¾Ð³Ñ–Ñ�',1);
/*Ð¤Ð°ÐºÑƒÐ»ÑŒÑ‚ÐµÑ‚ Ð¿Ñ€Ð¸ÐºÐ»Ð°Ð´Ð½Ð¾Ñ— Ð¼Ð°Ñ‚ÐµÐ¼Ð°Ñ‚Ð¸ÐºÐ¸*/
INSERT INTO profession (id,code,name,chairid) VALUES (50,'6.040301','ÐŸÑ€Ð¸ÐºÐ»Ð°Ð´Ð½Ð° Ð¼Ð°Ñ‚ÐµÐ¼Ð°Ñ‚Ð¸ÐºÐ°',1);
INSERT INTO profession (id,code,name,chairid) VALUES (51,'6.040302','Ð†Ð½Ñ„Ð¾Ñ€Ð¼Ð°Ñ‚Ð¸ÐºÐ°',1);
INSERT INTO profession (id,code,name,chairid) VALUES (52,'6.040303','Ð¡Ð¸Ñ�Ñ‚ÐµÐ¼Ð½Ð¸Ð¹ Ð°Ð½Ð°Ð»Ñ–Ð·',1);
INSERT INTO profession (id,code,name,chairid) VALUES (53,'6.050103','ÐŸÑ€Ð¾Ð³Ñ€Ð°Ð¼Ð½Ð° Ñ–Ð½Ð¶ÐµÐ½ÐµÑ€Ñ–Ñ�',1);
/* ÐœÐµÑ…Ð°Ð½Ñ–ÐºÐ¾-Ð¼Ð°Ñ‚ÐµÐ¼Ð°Ñ‚Ð¸Ñ‡Ð½Ð¸Ð¹ Ñ„Ð°ÐºÑƒÐ»ÑŒÑ‚ÐµÑ‚*/
INSERT INTO profession (id,code,name,chairid) VALUES (54,'6.040202','ÐœÐµÑ…Ð°Ð½Ñ–ÐºÐ°',1);
INSERT INTO profession (id,code,name,chairid) VALUES (55,'6.040201','ÐœÐ°Ñ‚ÐµÐ¼Ð°Ñ‚Ð¸ÐºÐ°',1);
INSERT INTO profession (id,code,name,chairid) VALUES (56,'6.040205','Ð¡Ñ‚Ð°Ñ‚Ð¸Ñ�Ñ‚Ð¸ÐºÐ°',1);
INSERT INTO profession (id,code,name,chairid) VALUES (57,'6.050601','Ð¢ÐµÐ¿Ð»Ð¾ÐµÐ½ÐµÑ€Ð³ÐµÑ‚Ð¸ÐºÐ°',1);
/* Ð¤Ñ–Ð·Ð¸ÐºÐ¾-Ñ‚ÐµÑ…Ð½Ñ–Ñ‡Ð½Ð¸Ð¹ Ñ„Ð°ÐºÑƒÐ»ÑŒÑ‚ÐµÑ‚*/
INSERT INTO profession (id,code,name,chairid) VALUES (58,'6.050701','Ð•Ð»ÐµÐºÑ‚Ñ€Ð¾Ñ‚ÐµÑ…Ð½Ñ–ÐºÐ° Ñ‚Ð° ÐµÐ»ÐµÐºÑ‚Ñ€Ð¾Ñ‚ÐµÑ…Ð½Ð¾Ð»Ð¾Ð³Ñ–Ñ—',1);
INSERT INTO profession (id,code,name,chairid) VALUES (59,'6.050403','Ð†Ð½Ð¶ÐµÐ½ÐµÑ€Ð½Ðµ Ð¼Ð°Ñ‚ÐµÑ€Ñ–Ð°Ð»Ð¾Ð·Ð½Ð°Ð²Ñ�Ñ‚Ð²Ð¾',1);
INSERT INTO profession (id,code,name,chairid) VALUES (60,'6.050503','ÐœÐ°ÑˆÐ¸Ð½Ð¾Ð±ÑƒÐ´ÑƒÐ²Ð°Ð½Ð½Ñ�',1);
INSERT INTO profession (id,code,name,chairid) VALUES (61,'6.050501','ÐŸÑ€Ð¸ÐºÐ»Ð°Ð´Ð½Ð° Ð¼ÐµÑ…Ð°Ð½Ñ–ÐºÐ°',1);
INSERT INTO profession (id,code,name,chairid) VALUES (62,'6.051102','6.051102 Ð”Ð²Ð¸Ð³ÑƒÐ½Ð¸ Ñ‚Ð° ÐµÐ½ÐµÑ€Ð³ÐµÑ‚Ð¸Ñ‡Ð½Ñ– ÑƒÑ�Ñ‚Ð°Ð½Ð¾Ð²ÐºÐ¸ Ð»Ñ–Ñ‚Ð°Ð»ÑŒÐ½Ð¸Ñ… Ð°Ð¿Ð°Ñ€Ð°Ñ‚Ñ–Ð²',1);
INSERT INTO profession (id,code,name,chairid) VALUES (63,'6.051003','ÐŸÑ€Ð¸Ð»Ð°Ð´Ð¾Ð±ÑƒÐ´ÑƒÐ²Ð°Ð½Ð½Ñ�',1);
INSERT INTO profession (id,code,name,chairid) VALUES (64,'6.050901','6.050901 Ð Ð°Ð´Ñ–Ð¾Ñ‚ÐµÑ…Ð½Ñ–ÐºÐ°',1);
INSERT INTO profession (id,code,name,chairid) VALUES (65,'6.051103','6.051103 Ð�Ð²Ñ–Ð¾Ð½Ñ–ÐºÐ°',1);
INSERT INTO profession (id,code,name,chairid) VALUES (66,'6.051101','Ð�Ð²Ñ–Ð°- Ñ– Ñ€Ð°ÐºÐµÑ‚Ð¾Ð±ÑƒÐ´ÑƒÐ²Ð°Ð½Ð½Ñ�',1);
INSERT INTO profession (id,code,name,chairid) VALUES (67,'6.170102','Ð¡Ð¸Ñ�Ñ‚ÐµÐ¼Ð¸ Ñ‚ÐµÑ…Ð½Ñ–Ñ‡Ð½Ð¾Ð³Ð¾ Ð·Ð°Ñ…Ð¸Ñ�Ñ‚Ñƒ Ñ–Ð½Ñ„Ð¾Ñ€Ð¼Ð°Ñ†Ñ–Ñ—',1);

/*Ð¦ÐµÐ½Ñ‚Ñ€ Ð·Ð°Ð¾Ñ‡Ð½Ð¾Ñ— Ñ‚Ð° Ð²ÐµÑ‡Ñ–Ñ€Ð½ÑŒÐ¾Ñ— Ñ„Ð¾Ñ€Ð¼ Ð½Ð°Ð²Ñ‡Ð°Ð½Ð½Ñ�*/
INSERT INTO profession (id,code,name,chairid) VALUES (68,'6.020303','Ð¤Ñ–Ð»Ð¾Ð»Ð¾Ð³Ñ–Ñ� (ÑƒÐºÑ€Ð°Ñ—Ð½Ñ�ÑŒÐºÐ° Ð¼Ð¾Ð²Ð° Ñ‚Ð° Ð»Ñ–Ñ‚ÐµÑ€Ð°Ñ‚ÑƒÑ€Ð°)',1);
INSERT INTO profession (id,code,name,chairid) VALUES (69,'6.020303','Ð¤Ñ–Ð»Ð¾Ð»Ð¾Ð³Ñ–Ñ� (Ð°Ð½Ð³Ð»Ñ–Ð¹Ñ�ÑŒÐºÐ° Ð¼Ð¾Ð²Ð° Ñ‚Ð° Ð»Ñ–Ñ‚ÐµÑ€Ð°Ñ‚ÑƒÑ€Ð°)',1);
INSERT INTO profession (id,code,name,chairid) VALUES (70,'6.030301','Ð–ÑƒÑ€Ð½Ð°Ð»Ñ–Ñ�Ñ‚Ð¸ÐºÐ°',1);
INSERT INTO profession (id,code,name,chairid) VALUES (71,'6.030504','Ð•ÐºÐ¾Ð½Ð¾Ð¼Ñ–ÐºÐ° Ð¿Ñ–Ð´Ð¿Ñ€Ð¸Ñ”Ð¼Ñ�Ñ‚Ð²Ð°',1);
INSERT INTO profession (id,code,name,chairid) VALUES (72,'6.030508','Ð¤Ñ–Ð½Ð°Ð½Ñ�Ð¸ Ñ– ÐºÑ€ÐµÐ´Ð¸Ñ‚',1);
INSERT INTO profession (id,code,name,chairid) VALUES (73,'6.030601','ÐœÐµÐ½ÐµÐ´Ð¶Ð¼ÐµÐ½Ñ‚',1);
INSERT INTO profession (id,code,name,chairid) VALUES (74,'6.020302','Ð†Ñ�Ñ‚Ð¾Ñ€Ñ–Ñ�',1);
INSERT INTO profession (id,code,name,chairid) VALUES (75,'6.030104','ÐŸÐ¾Ð»Ñ–Ñ‚Ð¾Ð»Ð¾Ð³Ñ–Ñ�',1);
INSERT INTO profession (id,code,name,chairid) VALUES (76,'6.030101','Ð¡Ð¾Ñ†Ñ–Ð¾Ð»Ð¾Ð³Ñ–Ñ�',1);
INSERT INTO profession (id,code,name,chairid) VALUES (77,'6.030102','ÐŸÑ�Ð¸Ñ…Ð¾Ð»Ð¾Ð³Ñ–Ñ�',1);
INSERT INTO profession (id,code,name,chairid) VALUES (78,'6.030402','ÐŸÑ€Ð°Ð²Ð¾Ð·Ð½Ð°Ð²Ñ�Ñ‚Ð²Ð¾',1);
INSERT INTO profession (id,code,name,chairid) VALUES (79,'6.040102','Ð‘Ñ–Ð¾Ð»Ð¾Ð³Ñ–Ñ�',1);
INSERT INTO profession (id,code,name,chairid) VALUES (80,'6.040104','Ð“ÐµÐ¾Ð³Ñ€Ð°Ñ„Ñ–Ñ�',1);
INSERT INTO profession (id,code,name,chairid) VALUES (81,'6.040201','ÐœÐ°Ñ‚ÐµÐ¼Ð°Ñ‚Ð¸ÐºÐ°',1);
INSERT INTO profession (id,code,name,chairid) VALUES (82,'6.040302','Ð†Ð½Ñ„Ð¾Ñ€Ð¼Ð°Ñ‚Ð¸ÐºÐ°',1);