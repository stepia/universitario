### MYSQL INSTALL(ARCHLINUX) ###

1.Programm installation<br>
<blockquote>sudo pacman -S mysql(or yaourt mysql)<br></blockquote>

2.Program configuration<br>
<blockquote>2.1 run in console <br>
<blockquote>sudo /etc/rc.d/mysqld start && mysql_secure_installation<br>
</blockquote>2.2 Enter current password for root (enter for none): - <br>
<br>
<Enter><br>
<br>
<br>
<blockquote>Remove anonymous users? [Y/n] - нажимем Y или enter<br>
</blockquote>2.3 New password: - вводим новый пароль нажимаем enter<br>
<blockquote>re-enter new password: повторяем введенный пароль и enter<br>
Remove anonymous users? [Y/n] Y<br>
</blockquote>2.4 Disallow root login remotely? [Y/n] Y<br>
<blockquote>Remove test database and access to it? [Y/n] Y<br>
</blockquote>2.5 Reload privilege tables now? [Y/n] Y<br>
2.6 restart mysql<br>
<blockquote>/etc/rc.d/mysqld restart</blockquote></blockquote>

3.Product configuration<br>

4. Program run<br>
<blockquote>4.1 Подключение<br>
<ol><li>mysql -u root -p<br>
</li></ol><blockquote>Enter password:<пароль><br>
</blockquote>4.2 перезагрузка<br>
<blockquote>/etc/rc.d/mysqld restart<br></blockquote></blockquote>



5. Создаем сервер<br>
<blockquote>5.1 запустить MySql workbench<br>
5.2 кликаем по New server Instance<br>
5.3 выбираем Next<br>
5.4. выбираем connection Methiod: Local Socket/Pipe и жмем Next<br>
5.5 выбираем operating system Linux, Mysql installation Type ArchLinux и next<br>
5.6 next<br>
5.7 continie<br></blockquote>

6. Создание подключения(при необходимости, п5 помоему создает его автоматически)<br>
<blockquote>6.1. запустить MySql workbench<br>
6.2. Кликнуть по "New connection" (нижний левый угол приложения)<br>
6.3. В открывшемся окне "Setup New Connection" ввести данные:<br>
<blockquote>Connection Name: произвольное(я назвал Stepo)<br>
connection Methiod: Local Socket/Pipe<br>
Username: root<br>
нажимаем "Store in Keychain..." и в открывшемся окне вводим пароль     для root(администратора базы данных)) и нажимаем "Ok".<br>
</blockquote>6.4.Чтобы проверить правильность настроек подключения- нажимаем на "Test connection" кнопку.Если настройки правильные появиться "Connection parameters are correct" сообщение, нажимаем "ОК".(в противном случае будет сообщение об ошибке)<br>
6.5.Если все "ОК", нажимаем "Ок" кнопку (правее "Test connection" кнопки).<br>
6.6. Подключение сохранено, чтобы открыть подключение к базе данных<br>
<blockquote>Поключение созданно. <br>
в "Open connection to Start Querying" новая запись с именем подключения введенного ранее.<br></blockquote></blockquote>

7.Подключение к серверу<br>
<blockquote>7.1. запустить MySql workbench<br>
7.2. дважды кликнуть по созданному подлючении в "Open connection to Start Querying".<br></blockquote>

8. Создать схему<br>
<blockquote>8.1. Поключиться к серверу<br>
8.2. Кликнуть на "Add Schema"<br>
8.3. В "Name" поле ввести "rffDB"<br>
8.4. нажать Apply кнопку в "Schema" окне<br>
8.5. нажать Apply кнопку в "Apply Sql Script to Database" окне <br>
8.6. нажать Close кнопку в "Apply Sql Script to Database" окне <br>
8.7. нажать Close кнопку в "Schema" окне<br></blockquote>

Смема создана позключиться к схеме можно кликнув на треугольнике напротив схемы в Shemas поле(слевого сбоку)<br>

9. создание таблицы<br>
<blockquote>9.1. запустить MySql workbench<br>
9.2. подключиться к серверу<br>
9.3 подключится к схеме<br>
9.4 скопировать содержимое init.sql в Query1 поле(MySql workbench) <br>
9.5. нажимаем на молнию(executeSql Script in Connected Server)<br>
9.6. Кликаем по "toggle auto-commit mode" кнопке(молния + зеленый кружок с галочкой)<br>
9.7. кликаем по Commit кнопке(зеленый кружок с галочкой)<br>