INSERT INTO person (id) VALUES ('1');
INSERT INTO employee (id,userid) VALUES ('1','1');
INSERT INTO users (perid,empid,id,username,password,enabled) VALUES ('1','1','1','admin','123','1');
INSERT INTO authorities (username, authority) VALUES ('admin','ROLE_ADMIN');

/*university*/
INSERT INTO university (name,accreditation) VALUES ('Дніпропетровський національний університет імені Олеся Гончара','4');
/*faculty*/
INSERT INTO faculty (id,name,universityid,dean,initialdeputy,scientificdeputy,educationaldeputy,address,phone) VALUES (1,'Факультет української й іноземної філології та мистецтвознавства',1,1,1,1,1,'просп. Гагаріна,  72.', '(056) 374-98-81');
INSERT INTO faculty (id,name,universityid,dean,initialdeputy,scientificdeputy,educationaldeputy,address,phone) VALUES (2,'Факультет суспільних наук і міжнародних відносин',1,1,1,1,1,'пр. Гагаріна,  72.','(056) 374-98-66'); 
INSERT INTO faculty (id,name,universityid,dean,initialdeputy,scientificdeputy,educationaldeputy,address,phone) VALUES (3,'Факультет систем та засобів масової комунікації',1,1,1,1,1,'вул. Наукова, 13, корп. 9','(056) 776-82-01');
INSERT INTO faculty (id,name,universityid,dean,initialdeputy,scientificdeputy,educationaldeputy,address,phone,email) VALUES (4,'Факультет міжнародної економіки',1,1,1,1,1,'вул. Наукова, 13, 9 корпус ДНУ, кімн. 421','(056) 373-12-73','dekanat_fme@mail.ru');
INSERT INTO faculty (id,name,universityid,dean,initialdeputy,scientificdeputy,educationaldeputy,address,phone,email) VALUES (5,'Економічний факультет',1,1,1,1,1,'пр. К.Маркса, 35,корпус ДНУ № 5','(056) 744-86-37','inec.dnu@smirnov.dp.ua');
INSERT INTO faculty (id,name,universityid,dean,initialdeputy,scientificdeputy,educationaldeputy,address,phone) VALUES (6,'Історичний факультет',1,1,1,1,1,'просп. Гагаріна,  72.','(056) 374-98-60.');
INSERT INTO faculty (id,name,universityid,dean,initialdeputy,scientificdeputy,educationaldeputy,address,phone,email) VALUES (7,'Факультет психології',1,1,1,1,1,'пр. Карла Маркса, 36, 2-й корпус ДНУ','(056) 744-86-11','dec_fps@mail.dsu.dp.ua');
INSERT INTO faculty (id,name,universityid,dean,initialdeputy,scientificdeputy,educationaldeputy,address,phone,email) VALUES (8,'Юридичний факультет',1,1,1,1,1,'вул. Наукова, 13, корп. №9.','(056) 374–97–12','DNU_pravo@mail.ru, DNU_pravo@i.ua');
INSERT INTO faculty (id,name,universityid,dean,initialdeputy,scientificdeputy,educationaldeputy,address,phone) VALUES (9,'Факультет фізики, електроніки та комп''ютерних систем',1,1,1,1,1,'м. Дніпропетровськ, вул. Наукова, 9, навчальні корпуси №12, №15','(056) 373-12-63, (056) 776-90-92');
INSERT INTO faculty (id,name,universityid,dean,initialdeputy,scientificdeputy,educationaldeputy,address,phone,site) VALUES (10,'Хімічний факультет',1,1,1,1,1,'вул. Козакова, 22, 16–й корпус ДНУ.','(056) 776-82-48.','cf.dnu.dp.ua');
INSERT INTO faculty (id,name,universityid,dean,initialdeputy,scientificdeputy,educationaldeputy,address,phone,email) VALUES (11,'Факультет біології, екології та медицини',1,1,1,1,1,'вул. Казакова, 24, 17-й корпус ДНУ,вул. Наукова, 10, 11 корпус ДНУ.','(0562)46-92-43','dekanat.bef.dnu@i.ua');
INSERT INTO faculty (id,name,universityid,dean,initialdeputy,scientificdeputy,educationaldeputy,address,phone,site,email) VALUES (12,'Геолого-географічний факультет',1,1,1,1,1,'пр. Карла Маркса, 36, корп. № 2','(056) 744-82-65','www.ggf-dnu.at.ua','zelenskili@mail.ru');
INSERT INTO faculty (id,name,universityid,dean,initialdeputy,scientificdeputy,educationaldeputy,address,phone,site) VALUES (13,'Факультет прикладної математики',1,1,1,1,1,'просп. Карла Маркса, 35, 3 і 4 корпуси ДНУ.','(0562) 745-24-83','fpm.dnu.dp.ua, primat.dp.ua');
INSERT INTO faculty (id,name,universityid,dean,initialdeputy,scientificdeputy,educationaldeputy,address,phone,site) VALUES (14,'Механіко-математичний факультет',1,1,1,1,1,'вул. Козакова 18 , корпус № 14.','(056) 776-82-41','mmf.dsu.dp.ua');
INSERT INTO faculty (id,name,universityid,dean,initialdeputy,scientificdeputy,educationaldeputy,address,phone) VALUES (15,'Фізико-технічний факультет',1,1,1,1,1,'вул. Наукова, 11, 13, корпуси 10, 9','(056) 760-94-62');
INSERT INTO faculty (id,name,universityid,dean,initialdeputy,scientificdeputy,educationaldeputy,address,phone) VALUES (16,'Центр заочної та вечірньої форм навчання',1,1,1,1,1,'вул. Казакова, 22, корпус 16.','(056) 373-58-32.');
/*chair*/
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (1,'Кафедра української мови.',1,1,'374-98-85.');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (2,'Кафедра англійської філології.',1,1,'374-98-73');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (3,'Кафедра германської філології.',1,1,'374-98-75');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (4,'Кафедра романської філології.',1,1,'374-98-74');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (5,'Кафедра порівняльної філології східних та англомовних країн.',1,1,'374-98-79');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (6,'Кафедра загального та російського мовознавства.',1,1,'374-98-80');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (7,'Кафедра української літератури.',1,1,'374-98-72');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (8,'Кафедра зарубіжної літератури.',1,1,'374-98-78');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (9,'Кафедра іноземних мов для гуманітарних факультетів.',1,1,'374-98-82');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (10,'Кафедра образотворчого мистецтва та дизайну.',1,1,'374-98-08');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (11,'Кафедра перекладу та лінгвістичної підготовки іноземців.',1,1,'374-98-86');

INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (12,'Кафедра філософії.',2,1,'374-98-71');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (13,'Кафедра соціології',2,1,'374-98-65');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (14,'Кафедра політології.',2,1,'374-98-67');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (15,'Кафедра міжнародних відносин. ',2,1,'374-98-69');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (16,'Кафедра соціальної роботи. ',2,1,'374-98-70');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (17,'Кафедра масової та міжнародної комунікації. ',3,1,'776-57-16');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (18,'Кафедра лінгвістичної та країнознавчої підготовки журналістів.',3,1,'760-94-52');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (19,'Кафедра видавничої справи та міжкультурної комунікації.',3,1,'776-57-16');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (20,'Кафедра реклами та зв’язків з громадськістю.',3,1,'776-82-01');

INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (21,'Кафедра міжнародних фінансів.',4,1,'373-12-21');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (22,'Кафедра економіки та управління національним господарством.',4,1,'373-12-14');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (23,'Кафедра менеджменту та туризму',4,1,'373-12-16');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (24,'Кафедра іноземних мов.',4,1,'373-12-73');

INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (25,'Кафедра фінансів.',5,1,'745-24-50');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (26,'Кафедра банківської справи.',5,1,'46-04-03.');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (27,'Кафедра обліку і аудиту.',5,1,'744-30-56');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (28,'Кафедра економіки і управління підприємством.',5,1,'744-24-97');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (29,'Кафедра економічної інформатики та статистики.',5,1,'745-43-24');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (30,'Кафедра маркетингу та менеджменту.',5,1,'744-86-68');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (31,'Кафедра економічної теорії.',5,1,'744-86-38');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (32,'Кафедра економічної кібернетики. ',5,1,'745-12-85.');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (33,'Кафедра комп''ютерної обробки фінансово-економічної інформації.',5,1,'744-01-83');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (34,'Кафедра іноземних мов для економічних спеціальностей',5,1,'744-32-24');

INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (35,'Кафедра всесвітньої історії.',6,1,'374–98–59');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (36,'Кафедра історії України.',6,1,'374–98–64');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (37,'Кафедра історіографії, джерелознавства та архівознавства.',6,1,'374–98–62');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (38,'Кафедра російської історії',6,1,'374-98-61');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (39,'Кафедра української історії та етнополітики.',6,1,'374–98–63');


INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (40,'Кафедра педагогічної та вікової психології.',7,1,'745-51-34');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (41,'Кафедра загальної та медичної психології.',7,1,'745-40-60');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (42,'Кафедра соціальної психології та психології управління.',7,1,' 745-23-39');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (43,'Кафедра педагогіки та корекційної освіти.',7,1,'745-31-10');

INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (44,'Кафедра міжнародного права',8,1,'377–81–79');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (45,'Кафедра теорії держави і права, конституційного права та державного управління.',8,1,'(056) 377-81-93');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (46,'Кафедра цивільного, трудового та господарського права',8,1,'(056) 373–12–68');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (47,'Кафедра адміністративного та кримінального права',8,1,'(056) 373–12–19');

INSERT INTO chair (id,name,facultyid,chairhead) VALUES (48,'Кафедра електронних засобів телекомунікацій.',9,1);
INSERT INTO chair (id,name,facultyid,chairhead) VALUES (49,'Кафедра прикладної і комп''ютерної радіофізики.',9,1);
INSERT INTO chair (id,name,facultyid,chairhead) VALUES (50,'Кафедра електронних обчислювальних машин.',9,1);
INSERT INTO chair (id,name,facultyid,chairhead) VALUES (51,'Кафедра автоматизованих систем обробки інформації.',9,1);
INSERT INTO chair (id,name,facultyid,chairhead) VALUES (52,'Кафедра теоретичної фізики.',9,1);
INSERT INTO chair (id,name,facultyid,chairhead) VALUES (53,'Кафедра квантової макрофізики.',9,1);
INSERT INTO chair (id,name,facultyid,chairhead) VALUES (54,'Кафедра радіоелектроніки.',9,1);
INSERT INTO chair (id,name,facultyid,chairhead) VALUES (55,'Кафедра експериментальної фізики.',9,1);
INSERT INTO chair (id,name,facultyid,chairhead) VALUES (56,'Кафедра металофізики.',9,1);
INSERT INTO chair (id,name,facultyid,chairhead) VALUES (57,'Кафедра фізики твердого тіла та оптоелектроніки.',9,1);

INSERT INTO chair (id,name,facultyid,chairhead) VALUES (58,'Кафедра харчових технологій.',10,1);
INSERT INTO chair (id,name,facultyid,chairhead) VALUES (59,'Кафедра фізичної та неорганічної хімії.',10,1);
INSERT INTO chair (id,name,facultyid,chairhead) VALUES (60,'Кафедра аналітичної хімії.',10,1);
INSERT INTO chair (id,name,facultyid,chairhead) VALUES (61,'Кафедра органічної хімії.',10,1);
INSERT INTO chair (id,name,facultyid,chairhead) VALUES (62,'Кафедра хімії та хімічної технології високомолекулярних сполук.',10,1);
INSERT INTO chair (id,name,facultyid,chairhead) VALUES (63,'Науково-дослідна лабораторія електроосадження металів.',10,1);

INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (64,'Кафедра фізіології людини і тварин',11,1,'(0562)46-92-17');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (65,'Кафедра фізіології рослин та інтродукції',11,1,'(0562) 46-92-44');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (66,'Кафедра біофізики та біохімії',11,1,'(056)373-12-49');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (67,'Кафедра іхтіології та гідробіології',11,1,'(0562)46-92-81');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (68,'Кафедра мікробіології та вірусології',11,1,'(056)373-12-66');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (69,'Кафедра зоології та екології',11,1,'(056)7768253');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (70,'Кафедра геоботаніки, ґрунтознавства та екології',11,1,'(0562) 46-92-63.');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (71,'Кафедра клінічної лабораторної діагностики',11,1,'47-36-10');

INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (72,'Кафедра геології та гідрогеології.',12,1,'744–86–03');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (73,'Кафедра гідрометеорологіїї і геоекології.',12,1,'31-86-98');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (74,'Кафедра фізичної та економічної географії.',12,1,'744–86–03');

INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (75,'Кафедра обчислювальної математики та математичної кібернетики.',13,1,'745-14-11');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (76,'Кафедра математичного забезпечення електронних обчислювальних машин.',13,1,'744-76-83');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (77,'Кафедра математичного моделювання.',13,1,'744-51-18');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (78,'Кафедра комп''ютерних технологій.',13,1,'744-86-38');

INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (79,'Кафедра математичного аналізу і теорії функцій.',14,1,'776-82-41 ');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (80,'федра геометрії та алгебри.',14,1,'776-82-41');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (81,'Кафедра диференціальних рівнянь',14,1,'374-98-00, 776-82-41');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (82,'Кафедра статистики й теорії ймовірностей.',14,1,'776-82-41');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (83,'Кафедра теоретичної та прикладної механіки.',14,1,'776-82-41');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (84,'Кафедра аерогідромеханіки та енергомасопереносу.',14,1,'374-98-02; 776-82-41');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (85,'Кафедра обчислювальної механіки та міцності конструкцій.',14,1,'745-00-85');

INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (86,'Кафедра проектування і конструкцій літальних апаратів.',15,1,'776–82–26');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (87,'Кафедра двигунобудування',15,1,'46–30–26');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (88,'Кафедра энергетики',15,1,'374–23–47');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (89,'Кафедра систем автоматизованого управління.',15,1,'776–57–27');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (90,'Кафедра радіоелектронної автоматики.',15,1,'46–57–81');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (91,'Кафедра робототехнічних систем.',15,1,'46–92–10');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (92,'Кафедра технології виробництва літальних апаратів.',15,1,' 776–83–79');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (93,'Кафедра технічної механіки.',15,1,'776–58–49');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (94,'Кафедра безпеки життєдіяльності.',15,1,'776–58–85');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (95,'Кафедра іноземних мов для технічних та природознавчих специальностей.',15,1,'46–92–89');

INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (96,'Відділення вечірньої форми навчання',16,1,'(056) 373-58-32');
INSERT INTO chair (id,name,facultyid,chairhead,phone) VALUES (97,'Відділення заочної форми навчання',16,1,'(056) 760-86-83');




/*profession*/
/*Факультет української й іноземної філології та мистецтвознавства*/ 
INSERT INTO profession (id,code,name,chairid) VALUES (1,'6.020205','Образотворче мистецтво',1);
INSERT INTO profession (id,code,name,chairid) VALUES (2,'6.020207','Дизайн',1);
INSERT INTO profession (id,code,name,chairid) VALUES (3,'6.020303','Філологія (українська мова та література)',1);
INSERT INTO profession (id,code,name,chairid) VALUES (4,'6.020303','Філологія (російська мова та література)',1);
INSERT INTO profession (id,code,name,chairid) VALUES (5,'6.020303','Переклад',1);
INSERT INTO profession (id,code,name,chairid) VALUES (6,'6.020303','Філологія (англійська мова та література)',1);
INSERT INTO profession (id,code,name,chairid) VALUES (7,'6.020303','Філологія (китайська мова та література)',1);
INSERT INTO profession (id,code,name,chairid) VALUES (8,'6.020303','Філологія (японська мова та література)',1);
INSERT INTO profession (id,code,name,chairid) VALUES (9,'6.020303','Філологія (німецька мова та література)',1);
INSERT INTO profession (id,code,name,chairid) VALUES (10,'6.020303','Філологія (французька мова та література)',1);


/*Факультет суспільних наук і міжнародних відносин*/
INSERT INTO profession (id,code,name,chairid) VALUES (11,'6.030201','Міжнародні відносини',1);
INSERT INTO profession (id,code,name,chairid) VALUES (12,'6.030104','Політологія',1);
INSERT INTO profession (id,code,name,chairid) VALUES (13,'6.130102','Соціальна робота',1);
INSERT INTO profession (id,code,name,chairid) VALUES (14,'6.020301','Філософія',1);
INSERT INTO profession (id,code,name,chairid) VALUES (15,'6.030101','Соціологія',1);
/* Факультет систем та засобів масової комунікації*/
INSERT INTO profession (id,code,name,chairid) VALUES (16,'6.030301','Журналістика',1);
INSERT INTO profession (id,code,name,chairid) VALUES (17,'6.030302','Реклама і зв''язки з громадськістю',1);
INSERT INTO profession (id,code,name,chairid) VALUES (18,'6.030303','Видавнича справа та редагування',1);
/* Факультет міжнародної економіки*/
INSERT INTO profession (id,code,name,chairid) VALUES (19,'6.140103','Туризм',1);
INSERT INTO profession (id,code,name,chairid) VALUES (20,'6.030505','Управління персоналом і економіка праці',1);
INSERT INTO profession (id,code,name,chairid) VALUES (21,'6.030503','Міжнародна економіка',1);
INSERT INTO profession (id,code,name,chairid) VALUES (22,'6.030601','Менеджмент',1);
INSERT INTO profession (id,code,name,chairid) VALUES (23,'6.030203','Міжнародні економічні відносини',1);
/* Економічний факультет*/
INSERT INTO profession (id,code,name,chairid) VALUES (24,'6.030502','Економічна кібернетика',1);
INSERT INTO profession (id,code,name,chairid) VALUES (25,'6.030504','Економіка підприємства',1);
INSERT INTO profession (id,code,name,chairid) VALUES (26,'6.030506','Прикладна статистика',1);
INSERT INTO profession (id,code,name,chairid) VALUES (27,'6.030507','Маркетинг',1);
INSERT INTO profession (id,code,name,chairid) VALUES (28,'6.030508','Фінанси і кредит',1);
INSERT INTO profession (id,code,name,chairid) VALUES (29,'6.030509','Облік і аудит',1);
/* Історичний факультет*/
INSERT INTO profession (id,code,name,chairid) VALUES (30,'6.020302','Історія',1);
/* Факультет психології*/
INSERT INTO profession (id,code,name,chairid) VALUES (31,'6.030102','Психологія',1);
INSERT INTO profession (id,code,name,chairid) VALUES (32,'6.010105','Корекційна освіта',1);
/* Юридичний факультет*/
INSERT INTO profession (id,code,name,chairid) VALUES (33,'6.030402','Правознавство',1);
/* Факультет фізики, електроніки та комп''ютерних систем*/
INSERT INTO profession (id,code,name,chairid) VALUES (34,'6.040203','Фізика',1);
INSERT INTO profession (id,code,name,chairid) VALUES (35,'6.040204','Прикладна фізика',1);
INSERT INTO profession (id,code,name,chairid) VALUES (36,'6.050801','Мікро- та наноелектроніка',1);
INSERT INTO profession (id,code,name,chairid) VALUES (37,'6.050101','Комп''ютерні науки',1);
INSERT INTO profession (id,code,name,chairid) VALUES (38,'6.050903','Телекомунікації',1);
INSERT INTO profession (id,code,name,chairid) VALUES (39,'6.050102','Комп''ютерна інженерія',1);
INSERT INTO profession (id,code,name,chairid) VALUES (40,'6.050902','Радіоелектронні апарати',1);
/*Хімічний факультет*/
INSERT INTO profession (id,code,name,chairid) VALUES (41,'6.040101','Хімія',1);
INSERT INTO profession (id,code,name,chairid) VALUES (42,'6.051301','Хімічна технологія',1);
INSERT INTO profession (id,code,name,chairid) VALUES (43,'6.051701','Харчова технологія та інженерія',1);
/* Факультет біології, екології та медицини*/
INSERT INTO profession (id,code,name,chairid) VALUES (44,'6.040102','Біологія',1);
INSERT INTO profession (id,code,name,chairid) VALUES (45,'6.040106','Екологія, охорона навколишнього середовища та збалансоване природокористування',1);
INSERT INTO profession (id,code,name,chairid) VALUES (46,'6.120102','Лабораторна діагностика',1);
/*Геолого-географічний факультет*/
INSERT INTO profession (id,code,name,chairid) VALUES (47,'6.040104','Географія',1);
INSERT INTO profession (id,code,name,chairid) VALUES (48,'6.040105','Гідрометеорологія',1);
INSERT INTO profession (id,code,name,chairid) VALUES (49,'6.040103','Геологія',1);
/*Факультет прикладної математики*/
INSERT INTO profession (id,code,name,chairid) VALUES (50,'6.040301','Прикладна математика',1);
INSERT INTO profession (id,code,name,chairid) VALUES (51,'6.040302','Інформатика',1);
INSERT INTO profession (id,code,name,chairid) VALUES (52,'6.040303','Системний аналіз',1);
INSERT INTO profession (id,code,name,chairid) VALUES (53,'6.050103','Програмна інженерія',1);
/* Механіко-математичний факультет*/
INSERT INTO profession (id,code,name,chairid) VALUES (54,'6.040202','Механіка',1);
INSERT INTO profession (id,code,name,chairid) VALUES (55,'6.040201','Математика',1);
INSERT INTO profession (id,code,name,chairid) VALUES (56,'6.040205','Статистика',1);
INSERT INTO profession (id,code,name,chairid) VALUES (57,'6.050601','Теплоенергетика',1);
/* Фізико-технічний факультет*/
INSERT INTO profession (id,code,name,chairid) VALUES (58,'6.050701','Електротехніка та електротехнології',1);
INSERT INTO profession (id,code,name,chairid) VALUES (59,'6.050403','Інженерне матеріалознавство',1);
INSERT INTO profession (id,code,name,chairid) VALUES (60,'6.050503','Машинобудування',1);
INSERT INTO profession (id,code,name,chairid) VALUES (61,'6.050501','Прикладна механіка',1);
INSERT INTO profession (id,code,name,chairid) VALUES (62,'6.051102','6.051102 Двигуни та енергетичні установки літальних апаратів',1);
INSERT INTO profession (id,code,name,chairid) VALUES (63,'6.051003','Приладобудування',1);
INSERT INTO profession (id,code,name,chairid) VALUES (64,'6.050901','6.050901 Радіотехніка',1);
INSERT INTO profession (id,code,name,chairid) VALUES (65,'6.051103','6.051103 Авіоніка',1);
INSERT INTO profession (id,code,name,chairid) VALUES (66,'6.051101','Авіа- і ракетобудування',1);
INSERT INTO profession (id,code,name,chairid) VALUES (67,'6.170102','Системи технічного захисту інформації',1);

/*Центр заочної та вечірньої форм навчання*/
INSERT INTO profession (id,code,name,chairid) VALUES (68,'6.020303','Філологія (українська мова та література)',1);
INSERT INTO profession (id,code,name,chairid) VALUES (69,'6.020303','Філологія (англійська мова та література)',1);
INSERT INTO profession (id,code,name,chairid) VALUES (70,'6.030301','Журналістика',1);
INSERT INTO profession (id,code,name,chairid) VALUES (71,'6.030504','Економіка підприємства',1);
INSERT INTO profession (id,code,name,chairid) VALUES (72,'6.030508','Фінанси і кредит',1);
INSERT INTO profession (id,code,name,chairid) VALUES (73,'6.030601','Менеджмент',1);
INSERT INTO profession (id,code,name,chairid) VALUES (74,'6.020302','Історія',1);
INSERT INTO profession (id,code,name,chairid) VALUES (75,'6.030104','Політологія',1);
INSERT INTO profession (id,code,name,chairid) VALUES (76,'6.030101','Соціологія',1);
INSERT INTO profession (id,code,name,chairid) VALUES (77,'6.030102','Психологія',1);
INSERT INTO profession (id,code,name,chairid) VALUES (78,'6.030402','Правознавство',1);
INSERT INTO profession (id,code,name,chairid) VALUES (79,'6.040102','Біологія',1);
INSERT INTO profession (id,code,name,chairid) VALUES (80,'6.040104','Географія',1);
INSERT INTO profession (id,code,name,chairid) VALUES (81,'6.040201','Математика',1);
INSERT INTO profession (id,code,name,chairid) VALUES (82,'6.040302','Інформатика',1);
