
INSERT INTO person (id) VALUES ('1');
INSERT INTO users (personid,id,username,password,enabled) VALUES ('1','1','admin','123','1');
INSERT INTO authorities (username, authority) VALUES ('admin','ROLE_ADMIN');

/*state*/
INSERT INTO state (id,name) VALUES (1,'Active');
INSERT INTO state (id,name) VALUES (2,'Not active');

/*role*/
INSERT INTO role (id,name) VALUES (1,'ROLE_PRORECTOR');
INSERT INTO role (id,name) VALUES (2,'ROLE_DEAN');
INSERT INTO role (id,name) VALUES (3,'ROLE_DEANSOFFICE');
INSERT INTO role (id,name) VALUES (4,'ROLE_CHAIRHEAD');
INSERT INTO role (id,name) VALUES (5,'ROLE_STUDENT');
INSERT INTO role (id,name) VALUES (6,'ROLE_TEACHER');

/*occupation*/
INSERT INTO occupation (id,name) VALUES (1,'Декан факультету');
INSERT INTO occupation (id,name) VALUES (2,'Заступники декана з навчальної роботи');
INSERT INTO occupation (id,name) VALUES (3,'Заступник декана з наукової роботи');
INSERT INTO occupation (id,name) VALUES (4,'Заступник декана з організаційно-виховної роботи');
INSERT INTO occupation (id,name) VALUES (5,'Заступник декана з міжнародного співробітництва');
INSERT INTO occupation (id,name) VALUES (6,'Заступник декана з виховної роботи');
INSERT INTO occupation (id,name) VALUES (7,'Директор центра');
INSERT INTO occupation (id,name) VALUES (8,'Керівник');
INSERT INTO occupation (id,name) VALUES (9,'Aспірант');
INSERT INTO occupation (id,name) VALUES (10,'Завідувач кафедри');

/*positions*/
INSERT INTO positions (id,name) VALUES (1,'Вчитель');
INSERT INTO positions (id,name) VALUES (2,'Студент');
INSERT INTO positions (id,name) VALUES (3,'Секретарь');
INSERT INTO positions (id,name) VALUES (4,'Servicer');

/*lessontype*/
INSERT INTO lessontype (id,name) VALUES (1, 'Лекцiя');
INSERT INTO lessontype (id,name) VALUES (2, 'Практика');
INSERT INTO lessontype (id,name) VALUES (3, 'Екзамен');
INSERT INTO lessontype (id,name) VALUES (4, 'Консультацiя');

/*reporttype*/
INSERT INTO reporttype (id,name) VALUES (1, 'Екзаменацiйна');
INSERT INTO reporttype (id,name) VALUES (2, 'Модульна');
INSERT INTO reporttype (id,name) VALUES (3, 'Зведена');


/*person*/
/*Факультет української й іноземної філології та мистецтвознавства*/
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (2,'Попова','Ірина','Степанівна','кандидат філологічних наук, професор');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (3,'Греченко-Журавська','Вікторія','Михайлівна','кандидат філологічних наук, доцент');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (4,'Онищенко','Геннадій','Анатолійович','кандидат філологічних наук, доцент');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (5,'Панченко','Олена','Іванівна','доктор  філологічних наук, професор');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (6,'Гонюк','Олександра','Валеріївна','кандидат філологічних наук, доцент');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (7,'Ковальчук','Микола','Савелійович','кандидат філологічних наук, доцент');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (8,'Анісімова','Алла','Ігорівна','кандидат філологічних наук, доцент');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (9,'Дьяконов','Георгій','Петрович','кандидат філологічних наук, доцент');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (10,'Пономарьова','Людмила','Василівна','кандидат філологічних наук, доцент');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (11,'Ліпіна','Вікторія','Іванівна','доктор філологічних наук, професор');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (12,'Пристайко','Тамара','Степанівна','доктор філологічних наук, професор, заслужений викладач ДНУ імені Олеся Гончара');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (13,'Олійник','Наталія','Петрівна','кандидат філологічних наук, доцент.');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (14,'Потніцева','Тетяна','Миколаївна','доктор філологічних наук, професор');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (15,'Рижикова','Світлана','Юріївна','кандидат філологічних наук, доцент');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (26,'Семешко','Едуард','Григорович','доцент');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (27,'Панченко','Олена','Іванівна','доктор філологічних наук, професор');
/*Факультет суспільних наук і міжнародних відносин*/ 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (28,'Токовенко','Олександр','Сергійович','доктор філософських наук, професор, академiк Української академії політичних наук');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (29,'Кривошеїн','Віталій','Володимирович','доктор політичних наук, доцент');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (30,'Шевцов','Сергій','Вікторович','доктор філософських наук, доцент');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (31,'Іщенко','Ігор','Васильович','кандидат історичних наук, доцент');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (32,'Герман','Юлія','Олександрівна','кандидат історичних наук, доцент.');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (33,'Гнатенко','Петро','Іванович','доктор філософських наук, професор, член-кореспондент Національної академії педагогічних наук України, заслужений діяч науки і техніки України, відмінник освіти України');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (34,'Ніколенко','Вадим','Вікторович','кандидат соціологічних наук, доцент');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (35,'Тупиця','Олег','Леонідович','доктор політичних наук, кандидат історичних наук, доцент, заслужений працівник освіти України, відмінник освіти України');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (36,'Шепєлєв','Максиміліан','Альбертович','доктор політичних наук, кандидат філософських наук, професор');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (37,'Осетрова','Оксана','Олександрівна','доктор філософських наук, професор');
/*Історичний факультет*/
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (38,'Світленко','Сергій','Іванович','доктор історичних наук,  професор кафедри історії України');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (39,'Святець','Юрій','Анатолійович','доктор історичних наук,  доцент, завідувач кафедри історії України');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (40,'Ващенко','Володимир','Володимирович','доктор історичних наук, професор кафедри історіографії, джерелознавства та архівознавства');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (41,'Фещенко','Євген','Леонорович','кандидат історичних наук, доцент кафедри історіографії, джерелознавства та архівознавства');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (42,'Мирончук','В''ячеслав','Дмитрович','кандидат історичних наук,  доцент кафедри російської історії');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (43,'Тесленко','Дмитро','Леонідович','кандидат історичних наук, доцент');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (44,'Святець','Юрій','Анатолійович','доктор історичних наук, доцент');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (45,'Журба','Олег','Іванович','доктор історичних наук, професор.');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (46,'Іваненко','Валентин','Васильович','доктор історичних наук, професор, проректор ДНУ');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (47,'Шляхов','Олексій','Борисович','доктор історичних наук, професор');
/*Факультет психології*/
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (48,'Мусіяка','Вольєн','Григорович','канд. фізико-математичних наук, професор, заслужений працівник освіти України'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (49,'Приходько','Тетяна','Павлівна','канд. педагог чн. наук, доцент кафедри педагогіки та корекційної освіти'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (50,'Грисенко','Наталія','Володимирівна','кандидат психологічних наук, старший викладач'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (51,'Бондаренко','Зоя','Петрівна','кандидат педагогічних наук, доцент, Відмінник освіти України'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (52,'Бондаревська','Ірина','Олегівна','кандидат психологічних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (53,'Волков','Дмитро','Сергійович','кандидат психологічних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (54,'Аршава','Ірина','Федорівна','професор, доктор психологічних наук, Заслужений працівник освіти України, член-кореспондент Академії медико-технічних наук України, член-кореспондент Академії наук соціальних технологій та місцевого самоврядування'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (55,'Батраченко','Іван','Георгійович','доктор психологічних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (56,'Коробов','Євген','кандидат педагогічних наук, доцент','Тимофійович'); 
/*Геолого-географічний факультет*/
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (57,'Богданович','Володимир','Володимирович','кандидат геолого-мінералогічних наук, професор'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (58,'Шерстюк','Наталія','Петрівна','кандидат географічних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (59,'Барг','Ігор','Мусійович','доктор геолого-мінералогічних наук, професор'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (60,'Безуглий','Віталій','Вікторович','кандидат педагогічних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (61,'Мокрицька','Тетяна','Петрівна','кандидат геологічних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (62,'Зеленська','Любов','Іванівна','доктор педагогічних наук, професор'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (63,'Шерстюк','Наталія','Петрівна','кандидат географічних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (64,'Євграшкіна','Галина','Петрівна','доктор геологічних наук, професор'); 
/*Факультет прикладної математики*/
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (65,'Кісельова','Олена','Михайлівна','доктор фізико-математичних наук, професор'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (66,'Сорокін','Володимир','Іванович','кандидат фізико-математичних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (67,'Сегеда','Надія','Євстахіївна','старший викладач'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (68,'Сірик','Світлана','Федорівна','асистент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (69,'Кісельова','Олена','Михайлівна','доктор фізико-математичних наук, професор, "Відмінник освіти України", "Заслужений діяч науки і техніки України'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (70,'Байбуз','Олег','Григорович','доктор технічних наук, професор, Відмінник освіти України'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (71,'Ламзюк','Володимир','Дмитрович','кандидат фізико-математичних наук, доцент, відмінник освіти України", заслужений викладач Дніпропетровського університету'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (72,'Хижа','Олександр','Леонідович','канд. фізико-математичних наук, доцент'); 
/*Економічний факультет*/
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (73,'Смирнов','Сергій','Олександрович','доктор фізико-математичних наук, професор, заслужений діяч науки і техніки України'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua) VALUES (74,'Шуваєва','Тетяна','Олександрівна'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (75,'Корнєєв','Максим','Валерійович','кандидат економічних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (76,'Павлов','Роман','Анатолійович','кандидат економічних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (77,'Щеньова','Віра','Борисівна','кандидат технічних наук доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (78,'Касян','Сергій','Якович','кандидат економічних наук'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua) VALUES (79,'Ус','Олена','Олександрівна'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (80,'Буряковський','Вадим','Всеволодович','кандидат економічних наук, професор'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (81,'Шевцова','Олена','Йосипівна','доктор економічних наук, професор, відмінник освіти України'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (82,'Гуня','Володимир','Олександрович','кандидат економічних наук, професор'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (83,'Коренюк','Петро','Іванович','доктор економічних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (84,'Єлісєєва','Оксана','Костянтинівна','доктор економічних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (85,'Хамініч','Світлана','Юріївна','доктор економічних наук, професор'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (86,'Дучинська','Ніна','Іванівна','доктор економічних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (87,'Яковенко','Олександр','Григорович','доктор технічних наук, професор'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (88,'Притоманова','Ольга','Михайлівна','кандидат економічних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (89,'Ваняркін','Вадим','Михайлович','кандидат філологічних наук, доцент'); 
/*Факультет міжнародної економіки*/
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (90,'Сазонець','Ігор','Леонідович','доктор економічних наук, професор, академік Академії економічних наук  України'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (91,'Литвин','Марина','Валентинівна','кандидат економічних наук, викладач'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (92,'Нямєщук','Анна','Валеріївна','кандидат економічних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (93,'Кобченко','Андрій','Андрійович','старший викладач'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (94,'Краснікова','Наталя','Олександрівна','старший викладач'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (95,'Стукало','Наталія','Вадимівна','доктор економічних наук, професор'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (96,'Тимошенко','Лідія','Михайлівна','доктор економічних наук,  професор, академік Акдемії економічних наук України'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (97,'Мешко','Наталія','Петрівна','доктор економічних наук, професор'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (98,'Пономарьова','Лілія','Федорівна','кандидат філологічних наук, доцент.'); 
/*Факультет систем і засобів масової комунікації*/
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (99,'Демченко','Володимир','Дмитрович','доктор філологічних наук,  професор, заслужений журналіст України'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (100,'Лященко','Анжела','Вадимівна','кандидат  наук із соціальних комунікацій,  доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (101,'Сухенко','Інна','Миколаївна','кандидат філологічних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (102,'Полішко','Наталя','Євгенівна','кандидат філологічних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (103,'Демченко','Сергій','Володимирович','кандидат політичних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (104,'Гончаренко','Елла','Петрівна','доктор філологічних наук, професор'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (105,'Підмогильна','Наталія','Василівна','доктор філологічних наук, професор'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (106,'Бутиріна','Марія','Валеріївна','доктор наук із соціальних комунікацій, доцент'); 
/*Юридичний факультет*/
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (107,'Поляков','Сергій','Іванович','кандидат історичних наук, доцент, професор'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (108,'Грабильніков','Анатолій','Васильович','кандидат юридичних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (109,'Саєнко','Марина','Іванівна','кандидат юридичних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (110,'Хейлик','Володимир','Володимирович','старший викладач'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (111,'Поляков','Сергій','Іванович','кандидат історичних наук, професор'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (112,'Мудриєвська','Людмила','Михайлівна','кандидат філософських наук, кандидат юридичних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (113,'Алєксєєнко','Ігор','Григорович','кандидат юридичних наук, доктор політичних наук'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (114,'СоколОлександренко','Ольга','Леонідівна','кандидат юридичних наук, доцент'); 
/*Факультет фізики, електроніки та комп’ютерних систем*/
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (115,'Долгов','Валерій','Михайлович','професор'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (116,'Пляка','Сергій','Миколайович','доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (117,'Морозов','Валентин','Михайлович','доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (118,'Бондаренко','Валерій','Прокопович','доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (119,'Морозов','Валентин','Михайлович','доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (120,'Корчинський','Володимир','Михайлович','доктор технічних наук, професор'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (121,'Дробахін','Олег','Олегович','доктор фізико-математичних наук, професор'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (122,'Хандецький','Володимир','Сергійович','доктор технічних наук, професор'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (123,'Вовк','Сергій','Михайлович','кандидат фізико-математичних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (124,'Орлянський','Олег','Юрійович','кандидат фізико-математичних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (125,'Скалозуб','Володимир','Васильович','доктор фізико-математичних наук, професор, заслужений  діяч науки і техніки України'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (126,'Коваленко','Олександр','Володимирович','доктор фізико-математичних наук, професор'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (127,'Корогод','Сергій','Михайлович','доктор біологічних наук, професор'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (128,'Башев','Валерій','Федорович','доктор фізико-математичних наук, професор'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (129,'Трубіцин','Михайло','Павлович','професор, доктор фізико-математичних наук'); 
/*Фізико-технічний факультет*/
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (130,'Петренко','Олександр','Миколайович','доктор технічних наук, професор, заслужений працівник освіти України'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (131,'Скорик','Борис','Іванович','кандидат технічних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (132,'Хащина','Олександр','Іванович','старший викладач'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (133,'Лабуткіна','Тетяна','Вікторівна','кандидат технічних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (134,'Давидов','Сергій','Олександрович','кандидат технічних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (135,'Пронь','Людмила','Володимирівна','кандидат технічних наук, професор'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (136,'Січевий','Олексій','Володимирович','доктор технічних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (137,'Кулабухов','Анатолій','Михайлович','кандидат технічних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (138,'Петренко','Олександр','Миколайович','доктор технічних наук, професор'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (139,'Шептун','Юрій','Дмитрович','доктор технічних наук, професор'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (140,'Джур','Євген','Олексійович','доктор технічних наук, професор'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (141,'Приходько','Олександр','Анатолійович','доктор фізико-математичних наук, професор'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (142,'Мелікаєв','Юрій','Миколайович','кандидат технічних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (143,'Тимошенко','Жанна','Іванівна','кандидат філологічних наук, доцент'); 
/*Механіко-математичний факультет*/
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (144,'Хамініч','Олександр','Васильович','кандидат фізико-математичних наук, професор, відмінник освіти України'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (145,'Ткаченко','Марина','Євгенівна',' кандидат фізико-математичних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (146,'Сясєв','Андрій','Валерійович','кандидат фізико-математичних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (147,'Комаров','Олександр','Вікторович','кандидат фізико-математичних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (148,'Парфінович','Наталя','Вікторівна','кандидат фізико-математичних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (149,'Курдаченко','Леонід','Андрійович','доктор фізико-математичних наук, професор, заслужений діяч науки і техніки України, відомий фахівець з алгебри, теорії груп та теорії модулів'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (150,'Поляков','Микола','Вікторович','доктор фізико-математичних наук, професор, академік Академії педагогічних наук, заслужений діяч науки і техніки України, ректор ДНУ ім. О. Гончара'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (151,'Турчин','Валерій','Миколайович','кандидат фізико-математичних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (152,'Лобода','Володимир','Васильович','доктор фізико-математичних наук, професор, заслужений працівник освіти України'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (153,'Кочубей','Олександр','Олексійович','доктор фізико-математичних наук, професор, заслужений діяч науки і техніки України, перший проректор ДНУ ім. О. Гончара'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (154,'Дзюба','Анатолій','Петрович','доктор технічних наук, професор, член-кореспондент Національної академії наук України, Заслужений діяч науки і техніки України, відмінник освіти України'); 
/*Хімічний факультет*/
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (155,'Варгалюк','Віктор','Федорович','доктор хімічних наук, професор, заслужений діяч науки і техніки України, відмінник освіти України'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (156,'Коптєва','Світлана','Дмитрівна','кандидат хімічних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (157,'Оковитий','Сергій','Іванович','доктор хімічних наук, професор, відмінник освіти України'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (158,'Шевченко','Людмила','Василівна','кандидат хімічних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (159,'Мельников','Костянтин','Олексійович','доктор технічних наук, професор'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (160,'Коробов','Віктор','Іванович','кандидат хімічних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (161,'Чмиленко','Федір','Олександрович','доктор хімічних наук, професор, заслужений діяч науки і техніки України, академік Академії наук вищої освіти України, відмінник освіти України'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (162,'Оковитий','Сергій','Іванович','доктор хімічних наук, професор, відмінник освіти України'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (163,'Нестерова','Олена','Юріївна','кандидат хімічних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (164,'Варгалюк','Віктор','Федорович','доктор хімічних наук, професор, заслужений діяч науки і техніки України'); 
/*Факультет біології, екологіroleї та медицини*/
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (165,'Пахомов','Олександр','Євгенійович','доктор біологічних наук, професор, Заслужений діяч науки і техніки України, академік Української академії наук, академік Української екологічної академії наук'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (166,'Федоненко','Олена','Вікторівна','кандидат сільськогосподарських наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (167,'Вінніков','Альберт','Іванович','доктор біологічних наук, професор, заслужений діяч науки і техніки України, академік АН Вищої Школи України'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (168,'Чаус','Тетяна','Григорівна','кандидат біологічних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (169,'Гассо','Віктор','Якович','кандидат біологічних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (170,'Бобильов','Юрій','Петрович','кандидат біологічних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (171,'Севериновська','Олена','Вікторівна','доцент, доктор біологічних наук'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (172,'Лихолат','Юрій','Васильович','доктор біологічних наук, професор'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (173,'Штеменко','Наталя','Іванівна','доктор біологічних наук, професор'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (174,'Федоненко','Олена','Вікторівна','кандидат сільськогосподарських наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (175,'Вінніков','Альберт','Іванович','заслужений діяч науки і техніки України, академік АН ВШ України, доктор біологічних наук, професор.'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (176,'Гассо','Віктор','Якович','кандидат біологічних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (177,'Мицик','Леонід','Павлович','доктор біологічних наук, професор, академік Екологічної академії наук України'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (178,'Поліон','Наталія','Миколаївна','кандидат медичних наук, доцент'); 
/*Центр заочної та вечірньої форм навчання*/
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (179,'Куземко','В','І','кандидат фізико-математичних наук, професор'); 

INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (180,'Панін','К','В','кандидат фізико-математичних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (181,'Коломоєць','Ю','І','кандидат історичних наук, доцент'); 
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (182,'Совіт','Ю','П','кандидат фізико-математичних наук, доцент'); 


/*КП-11-1, 13 студентів*/
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (183,'Васильєв','Артем','Сергійович','студент');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (184,'Глоба','Юрій','Сергійович','студент');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (185,'Голубенко','Вячеслав','Євгенійович','студент');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (186,'Двойцов','Дмитро','Володимирович','студент');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (187,'Коломоєць','Андрій','Васильович','студент');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (188,'Мороз','Станіслава','Вадимівна','студент');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (189,'Павліков','Юрій','Михайлович','студент');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (190,'Петрух','Михайло','Вікторович','студент');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (191,'Сахарова','Вікторія','Євгеніївна','студент');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (192,'Сивоконь','Олексій','Леонідович','студент');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (193,'Сопін','Дмитро','Сергійович','студент');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (194,'Усов','Дмитро','Олександрович','студент');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (195,'Фірсова','Софія','Олегівна','студент');
/*КМ-11-1, 18 студентів*/
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (196,'Бауман','Сергій','Вадимович','студент');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (197,'Гаращенко','Нікіта','Вячеславович','студент');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (198,'Гречуха','Володимир','Євгенович','студент');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (199,'Казакевич','Денис','Вікторович','студент');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (200,'Лапіцька','Анна','Олегівна','студент');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (201,'Литвиненко','Віталіна','Сергіївна','студент');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (202,'Панчішний','Артем','Сергійович','студент');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (203,'Попов','Денис','Ігорович','студент');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (204,'Савін','Костянтин','Олексійович','студент');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (205,'Салієв','Єгор','Вікторович','студент');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (206,'Свиридонов','Богдан','Євгенійович','студент');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (207,'Сімченко','Ілля','Олександрович','студент');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (208,'Скурідін','Владислав','Анатолійович','студент');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (209,'Талатік','Олег','Іванович','студент');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (210,'Фесенко','Станіслав','Євгенійович','студент');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (211,'Чорнойван','Сергій','Анатолійович','студент');
INSERT INTO person (id,lastnameua,firstnameua,middlenameua,details) VALUES (212,'Шатайло','Артур','Дмитрович','студент');

/*users*/
INSERT INTO users (id,personid,username,password,enabled) VALUES ('2','2','user2',120,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('3','3','user3',120,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('4','4','user4',120,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('5','5','user5',120,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('6','6','user6',120,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('7','7','user7',120,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('8','8','user8',120,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('9','9','user9',120,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('10','10','user10',121,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('11','11','user11',121,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('12','12','user12',121,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('13','13','user13',121,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('14','14','user14',121,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('15','15','user15',121,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('16','16','user16',121,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('17','17','user17',121,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('18','18','user18',121,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('19','19','user19',121,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('20','20','user20',122,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('21','21','user21',122,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('22','22','user22',122,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('23','23','user23',122,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('24','24','user24',122,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('25','25','user25',122,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('26','26','user26',122,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('27','27','user27',122,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('28','28','user28',122,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('29','29','user29',122,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('30','30','user30',123,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('31','31','user31',123,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('32','32','user32',123,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('33','33','user33',123,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('34','34','user34',123,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('35','35','user35',123,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('36','36','user36',123,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('37','37','user37',123,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('38','38','user38',123,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('39','39','user39',123,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('40','40','user40',124,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('41','41','user41',124,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('42','42','user42',124,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('43','43','user43',124,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('44','44','user44',124,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('45','45','user45',124,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('46','46','user46',124,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('47','47','user47',124,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('48','48','user48',124,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('49','49','user49',124,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('50','50','user50',125,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('51','51','user51',125,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('52','52','user52',125,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('53','53','user53',125,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('54','54','user54',125,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('55','55','user55',125,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('56','56','user56',125,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('57','57','user57',125,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('58','58','user58',125,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('59','59','user59',125,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('60','60','user60',126,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('61','61','user61',126,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('62','62','user62',126,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('63','63','user63',126,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('64','64','user64',126,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('65','65','user65',126,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('66','66','user66',126,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('67','67','user67',126,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('68','68','user68',126,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('69','69','user69',126,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('70','70','user70',127,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('71','71','user71',127,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('72','72','user72',127,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('73','73','user73',127,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('74','74','user74',127,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('75','75','user75',127,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('76','76','user76',127,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('77','77','user77',127,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('78','78','user78',127,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('79','79','user79',127,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('80','80','user80',128,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('81','81','user81',128,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('82','82','user82',128,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('83','83','user83',128,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('84','84','user84',128,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('85','85','user85',128,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('86','86','user86',128,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('87','87','user87',128,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('88','88','user88',128,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('89','89','user89',128,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('90','90','user90',129,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('91','91','user91',129,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('92','92','user92',129,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('93','93','user93',129,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('94','94','user94',129,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('95','95','user95',129,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('96','96','user96',129,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('97','97','user97',129,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('98','98','user98',129,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('99','99','user99',129,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('100','100','user100',1210,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('101','101','user101',1210,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('102','102','user102',1210,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('103','103','user103',1210,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('104','104','user104',1210,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('105','105','user105',1210,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('106','106','user106',1210,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('107','107','user107',1210,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('108','108','user108',1210,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('109','109','user109',1210,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('110','110','user110',1211,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('111','111','user111',1211,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('112','112','user112',1211,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('113','113','user113',1211,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('114','114','user114',1211,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('115','115','user115',1211,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('116','116','user116',1211,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('117','117','user117',1211,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('118','118','user118',1211,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('119','119','user119',1211,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('120','120','user120',1212,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('121','121','user121',1212,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('122','122','user122',1212,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('123','123','user123',1212,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('124','124','user124',1212,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('125','125','user125',1212,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('126','126','user126',1212,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('127','127','user127',1212,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('128','128','user128',1212,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('129','129','user129',1212,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('130','130','user130',1213,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('131','131','user131',1213,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('132','132','user132',1213,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('133','133','user133',1213,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('134','134','user134',1213,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('135','135','user135',1213,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('136','136','user136',1213,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('137','137','user137',1213,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('138','138','user138',1213,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('139','139','user139',1213,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('140','140','user140',1214,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('141','141','user141',1214,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('142','142','user142',1214,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('143','143','user143',1214,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('144','144','user144',1214,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('145','145','user145',1214,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('146','146','user146',1214,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('147','147','user147',1214,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('148','148','user148',1214,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('149','149','user149',1214,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('150','150','user150',1215,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('151','151','user151',1215,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('152','152','user152',1215,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('153','153','user153',1215,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('154','154','user154',1215,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('155','155','user155',1215,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('156','156','user156',1215,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('157','157','user157',1215,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('158','158','user158',1215,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('159','159','user159',1215,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('160','160','user160',1216,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('161','161','user161',1216,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('162','162','user162',1216,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('163','163','user163',1216,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('164','164','user164',1216,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('165','165','user165',1216,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('166','166','user166',1216,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('167','167','user167',1216,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('168','168','user168',1216,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('169','169','user169',1216,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('170','170','user170',1217,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('171','171','user171',1217,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('172','172','user172',1217,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('173','173','user173',1217,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('174','174','user174',1217,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('175','175','user175',1217,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('176','176','user176',1217,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('177','177','user177',1217,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('178','178','user178',1217,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('179','179','user179',1217,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('180','180','user180',1218,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('181','181','user181',1218,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('182','182','user182',1218,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('183','183','user183',1219,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('184','184','user184',1219,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('185','185','user185',1219,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('186','186','user186',1219,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('187','187','user187',1219,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('188','188','user188',1219,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('189','189','user189',1219,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('190','190','user190',1219,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('191','191','user191',1219,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('192','192','user192',1219,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('193','193','user193',1219,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('194','194','user194',1219,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('195','195','user195',1219,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('196','196','user196',1220,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('197','197','user197',1220,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('198','198','user198',1220,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('199','199','user199',1220,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('200','200','user200',1220,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('201','201','user201',1220,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('202','202','user202',1220,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('203','203','user203',1220,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('204','204','user204',1220,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('205','205','user205',1220,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('206','206','user206',1220,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('207','207','user207',1220,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('208','208','user208',1220,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('209','209','user209',1220,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('210','210','user210',1220,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('211','211','user211',1220,1);
INSERT INTO users (id,personid,username,password,enabled)  VALUES ('212','212','user212',1220,1);


/*teamtype*/
INSERT INTO teamtype (id,name,stateid) VALUES (1, 'university',1);
INSERT INTO teamtype (id,name,stateid) VALUES (2, 'faculty',1);
INSERT INTO teamtype (id,name,stateid) VALUES (3, 'chair',1);
INSERT INTO teamtype (id,name,stateid) VALUES (4, 'profession',1);
INSERT INTO teamtype (id,name,stateid) VALUES (5, 'groups',1);
INSERT INTO teamtype (id,name,stateid) VALUES (6, 'subgroup',1);


/*university*/
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (1,'Дніпропетровський національний університет імені Олеся Гончара',1,0,1);
/*faculty*/
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (2,'Факультет української й іноземної філології та мистецтвознавства',2,1,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (3,'Факультет суспільних наук і міжнародних відносин',2,1,1); 
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (4,'Факультет систем та засобів масової комунікації',2,1,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (5,'Факультет міжнародної економіки',2,1,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (6,'Економічний факультет',2,1,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (7,'Історичний факультет',2,1,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (8,'Факультет психології',2,1,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (9,'Юридичний факультет',2,1,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (10,'Факультет фізики, електроніки та комп''ютерних систем',2,1,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (11,'Хімічний факультет',2,1,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (12,'Факультет біології, екології та медицини',2,1,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (13,'Геолого-географічний факультет',2,1,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (14,'Факультет прикладної математики',2,1,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (15,'Механіко-математичний факультет',2,1,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (16,'Фізико-технічний факультет',2,1,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (17,'Центр заочної та вечірньої форм навчання',2,1,1);
/*chair*/
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (18,'Кафедра української мови.',3,2,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (19,'Кафедра англійської філології.',3,2,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (20,'Кафедра германської філології.',3,2,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (21,'Кафедра романської філології.',3,2,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (22,'Кафедра порівняльної філології східних та англомовних країн.',3,2,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (23,'Кафедра загального та російського мовознавства.',3,2,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (24,'Кафедра української літератури.',3,2,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (25,'Кафедра зарубіжної літератури.',3,2,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (26,'Кафедра іноземних мов для гуманітарних факультетів.',3,2,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (27,'Кафедра образотворчого мистецтва та дизайну.',3,2,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (28,'Кафедра перекладу та лінгвістичної підготовки іноземців.',3,2,1);

INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (29,'Кафедра філософії.',3,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (30,'Кафедра соціології',3,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (31,'Кафедра політології.',3,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (32,'Кафедра міжнародних відносин. ',3,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (33,'Кафедра соціальної роботи. ',3,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (34,'Кафедра масової та міжнародної комунікації. ',3,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (35,'Кафедра лінгвістичної та країнознавчої підготовки журналістів.',3,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (36,'Кафедра видавничої справи та міжкультурної комунікації.',3,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (37,'Кафедра реклами та зв’язків з громадськістю.',3,3,1);

INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (38,'Кафедра міжнародних фінансів.',3,4,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (39,'Кафедра економіки та управління національним господарством.',3,4,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (40,'Кафедра менеджменту та туризму',3,4,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (41,'Кафедра іноземних мов.',3,4,1);

INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (42,'Кафедра фінансів.',3,5,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (43,'Кафедра банківської справи.',3,5,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (44,'Кафедра обліку і аудиту.',3,5,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (45,'Кафедра економіки і управління підприємством.',3,5,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (46,'Кафедра економічної інформатики та статистики.',3,5,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (47,'Кафедра маркетингу та менеджменту.',3,5,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (48,'Кафедра економічної теорії.',3,5,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (49,'Кафедра економічної кібернетики. ',3,5,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (50,'Кафедра комп''ютерної обробки фінансово-економічної інформації.',3,5,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (51,'Кафедра іноземних мов для економічних спеціальностей',3,5,1);

INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (52,'Кафедра всесвітньої історії.',3,6,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (53,'Кафедра історії України.',3,6,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (54,'Кафедра історіографії, джерелознавства та архівознавства.',3,6,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (55,'Кафедра російської історії',3,6,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (56,'Кафедра української історії та етнополітики.',3,6,1);


INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (57,'Кафедра педагогічної та вікової психології.',3,7,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (58,'Кафедра загальної та медичної психології.',3,7,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (59,'Кафедра соціальної психології та психології управління.',3,7,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (60,'Кафедра педагогіки та корекційної освіти.',3,7,1);

INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (61,'Кафедра міжнародного права',3,8,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (62,'Кафедра теорії держави і права, конституційного права та державного управління.',3,8,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (63,'Кафедра цивільного, трудового та господарського права',3,8,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (64,'Кафедра адміністративного та кримінального права',3,8,1);

INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (65,'Кафедра електронних засобів телекомунікацій.',3,9,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (66,'Кафедра прикладної і комп''ютерної радіофізики.',3,9,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (67,'Кафедра електронних обчислювальних машин.',3,9,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (68,'Кафедра автоматизованих систем обробки інформації.',3,9,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (69,'Кафедра теоретичної фізики.',3,9,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (70,'Кафедра квантової макрофізики.',3,9,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (71,'Кафедра радіоелектроніки.',3,9,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (72,'Кафедра експериментальної фізики.',3,9,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (73,'Кафедра металофізики.',3,9,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (74,'Кафедра фізики твердого тіла та оптоелектроніки.',3,9,1);

INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (75,'Кафедра харчових технологій.',3,10,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (76,'Кафедра фізичної та неорганічної хімії.',3,10,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (77,'Кафедра аналітичної хімії.',3,10,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (78,'Кафедра органічної хімії.',3,10,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (79,'Кафедра хімії та хімічної технології високомолекулярних сполук.',3,10,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (80,'Науково-дослідна лабораторія електроосадження металів.',3,10,1);

INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (81,'Кафедра фізіології людини і тварин',3,11,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (82,'Кафедра фізіології рослин та інтродукції',3,11,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (83,'Кафедра біофізики та біохімії',3,11,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (84,'Кафедра іхтіології та гідробіології',3,11,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (85,'Кафедра мікробіології та вірусології',3,11,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (86,'Кафедра зоології та екології',3,11,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (87,'Кафедра геоботаніки, ґрунтознавства та екології',3,11,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (88,'Кафедра клінічної лабораторної діагностики',3,11,1);

INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (89,'Кафедра геології та гідрогеології.',3,12,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (90,'Кафедра гідрометеорологіїї і геоекології.',3,12,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (91,'Кафедра фізичної та економічної географії.',3,12,1);

INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (92,'Кафедра обчислювальної математики та математичної кібернетики.',3,13,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (93,'Кафедра математичного забезпечення електронних обчислювальних машин.',3,13,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (94,'Кафедра математичного моделювання.',3,13,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (95,'Кафедра комп''ютерних технологій.',3,13,1);

INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (96,'Кафедра математичного аналізу і теорії функцій.',3,14,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (97,'федра геометрії та алгебри.',3,14,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (98,'Кафедра диференціальних рівнянь',3,14,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (99,'Кафедра статистики й теорії ймовірностей.',3,14,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (100,'Кафедра теоретичної та прикладної механіки.',3,14,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (101,'Кафедра аерогідромеханіки та енергомасопереносу.',3,14,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (102,'Кафедра обчислювальної механіки та міцності конструкцій.',3,14,1);

INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (103,'Кафедра проектування і конструкцій літальних апаратів.',3,15,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (104,'Кафедра двигунобудування',3,15,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (105,'Кафедра энергетики',3,15,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (106,'Кафедра систем автоматизованого управління.',3,15,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (107,'Кафедра радіоелектронної автоматики.',3,15,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (108,'Кафедра робототехнічних систем.',3,15,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (109,'Кафедра технології виробництва літальних апаратів.',3,15,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (110,'Кафедра технічної механіки.',3,15,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (111,'Кафедра безпеки життєдіяльності.',3,15,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (112,'Кафедра іноземних мов для технічних та природознавчих специальностей.',3,15,1);

INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (113,'Відділення вечірньої форми навчання',3,16,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (114,'Відділення заочної форми навчання',3,16,1);


/*profession*/
/*Факультет української й іноземної філології та мистецтвознавства*/ 
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (115,'6.020205 Образотворче мистецтво',4,2,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (116,'6.020207 Дизайн',4,2,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (117,'6.020303 Філологія (українська мова та література)',4,2,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (118,'6.020303 Філологія (російська мова та література)',4,2,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (119,'6.020303 Переклад',4,2,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (120,'6.020303 Філологія (англійська мова та література)',4,2,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (121,'6.020303 Філологія (китайська мова та література)',4,2,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (122,'6.020303 Філологія (японська мова та література)',4,2,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (123,'6.020303 Філологія (німецька мова та література)',4,2,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (124,'6.020303 Філологія (французька мова та література)',4,2,1);


/*Факультет суспільних наук і міжнародних відносин*/
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (125,'6.030201 Міжнародні відносини',4,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (126,'6.030104 Політологія',4,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (127,'6.130102 Соціальна робота',4,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (128,'6.020301 Філософія',4,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (129,'6.030101 Соціологія',4,3,1);
/* Факультет систем та засобів масової комунікації*/
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (130,'6.030301 Журналістика',5,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (131,'6.030302 Реклама і зв''язки з громадськістю',5,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (132,'6.030303 Видавнича справа та редагування',5,3,1);
/* Факультет міжнародної економіки*/
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (133,'6.140103 Туризм',6,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (134,'6.030505 Управління персоналом і економіка праці',6,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (135,'6.030503 Міжнародна економіка',6,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (136,'6.030601 Менеджмент',6,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (137,'6.030203 Міжнародні економічні відносини',6,3,1);
/* Економічний факультет*/
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (138,'6.030502 Економічна кібернетика',7,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (139,'6.030504 Економіка підприємства',7,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (140,'6.030506 Прикладна статистика',7,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (141,'6.030507 Маркетинг',7,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (142,'6.030508 Фінанси і кредит',7,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (143,'6.030509 Облік і аудит',7,3,1);
/* Історичний факультет*/
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (144,'6.020302 Історія',8,3,1);
/* Факультет психології*/
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (145,'6.030102 Психологія',9,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (146,'6.010105 Корекційна освіта',9,3,1);
/* Юридичний факультет*/
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (147,'6.030402 Правознавство',10,3,1);
/* Факультет фізики, електроніки та комп''ютерних систем*/
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (148,'6.040203 Фізика',11,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (149,'6.040204 Прикладна фізика',11,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (150,'6.050801 Мікро- та наноелектроніка',11,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (151,'6.050101 Комп''ютерні науки',11,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (152,'6.050903 Телекомунікації',11,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (153,'6.050102 Комп''ютерна інженерія',11,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (154,'6.050902 Радіоелектронні апарати',11,3,1);
/*Хімічний факультет*/
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (155,'6.040101 Хімія',12,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (156,'6.051301 Хімічна технологія',12,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (157,'6.051701 Харчова технологія та інженерія',12,3,1);
/* Факультет біології, екології та медицини*/
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (158,'6.040102 Біологія',13,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (159,'6.040106 Екологія, охорона навколишнього середовища та збалансоване природокористування',13,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (160,'6.120102 Лабораторна діагностика',13,3,1);
/*Геолого-географічний факультет*/
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (161,'6.040104 Географія',14,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (162,'6.040105 Гідрометеорологія',14,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (163,'6.040103 Геологія',14,3,1);
/*Факультет прикладної математики*/
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (164,'6.040301 Прикладна математика',15,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (165,'6.040302 Інформатика',15,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (166,'6.040303 Системний аналіз',15,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (167,'6.050103 Програмна інженерія',15,3,1);
/* Механіко-математичний факультет*/
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (168,'6.040202 Механіка',16,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (169,'6.040201 Математика',16,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (170,'6.040205 Статистика',16,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (171,'6.050601 Теплоенергетика',16,3,1);
/* Фізико-технічний факультет*/
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (172,'6.050701 Електротехніка та електротехнології',17,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (173,'6.050403 Інженерне матеріалознавство',17,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (174,'6.050503 Машинобудування',17,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (175,'6.050501 Прикладна механіка',17,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (176,'6.051102 6.051102 Двигуни та енергетичні установки літальних апаратів',17,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (177,'6.051003 Приладобудування',17,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (178,'6.050901 6.050901 Радіотехніка',17,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (179,'6.051103 6.051103 Авіоніка',17,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (180,'6.051101 Авіа- і ракетобудування',17,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (181,'6.170102 Системи технічного захисту інформації',17,3,1);

/*Центр заочної та вечірньої форм навчання*/
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (182,'6.020303 Філологія (українська мова та література)',18,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (183,'6.020303 Філологія (англійська мова та література)',18,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (184,'6.030301 Журналістика',18,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (185,'6.030504 Економіка підприємства',18,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (186,'6.030508 Фінанси і кредит',18,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (187,'6.030601 Менеджмент',18,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (188,'6.020302 Історія',18,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (189,'6.030104 Політологія',18,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (190,'6.030101 Соціологія',18,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (191,'6.030102 Психологія',18,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (192,'6.030402 Правознавство',18,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (193,'6.040102 Біологія',18,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (194,'6.040104 Географія',18,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (195,'6.040201 Математика',18,3,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (196,'6.040302 Інформатика',18,3,1);

/*Групи*/
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (197,'КП-11-1',5,149,1);
INSERT INTO team (id,name,teamtypeid,rootid,stateid) VALUES (198,'КМ-11-1',5,150,1);
