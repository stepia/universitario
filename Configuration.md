### Концигурация и запуск ###
1.Eclipse с двумя плагинами:<br>
<blockquote>SVN Repository Exploring<br>
Maven plugin<br></blockquote>

2. установить maven(version:3.0.3)<br>
прописать переменные среды для maven сюда:<br>
sudo gedit /etc/environment<br>
вот так:<br>
PATH="../apache-maven-3.0.3/bin"<br>
MAVEN_HOME="../apache-maven-3.0.3"<br>


3.вычекать проект в Eclipse,т.е. добавить новый location в SVN Repository Exploring:<br>
<a href='https://universitario.googlecode.com/svn/'>https://universitario.googlecode.com/svn/</a><br>
пароль лежит здесь:<br>
Profile-->Settings<br>
если не подтягиваются сторонние библиотеки(Eclipse типа ругается):<br>
выполнить mvn eclipse:eclipse в корне проекта или<br>
Maven-->Update Dependencies из Eclipse<br>

4.База данных MySQL(у меня версия MySQL 5.1.49-1ubuntu8.1):<br>
login:<b>rff</b><br>
pwd:<b>rff</b><br>
schema:<b>rffDB</b><br>
<b>note:</b> if access denied,create user with following script:<br>
<code>GRANT ALL ON *.* TO 'rff'@'localhost' IDENTIFIED BY 'rff'</code>;<br>
<br>
5. tomcat version:7.0.12<br>
в server.xml прописать порт(любой свободный):<br>
<Connector <b>port="8099"</b> protocol="HTTP/1.1" ...<br>
дебаг для томката:<br>
set JPDA_ADDRESS=8000<br>
set JPDA_TRANSPORT=dt_socket<br>

6.инициализация БД для приложения:<br>
выполнить init.sql<br>
<br>
7.сборка приложения<br>
<code>mvn clean install -Dmaven.test.skip=true</code><br>
скопировать Universitario-0.1.war в ../apache-tomcat-7.0.12/webapps<br>

8.старт приложения в режиме дебага:<br>
sh catalina.sh jpda run<br>
<a href='http://localhost:8099/Universitario-0.1'>http://localhost:8099/Universitario-0.1</a><br>

9.останов приложения:<br>
<code>CTR-C</code> или <code>sh shutdown.sh</code>