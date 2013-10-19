CREATE TABLE attachment (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	postId INT,
	prMsgId INT,
	userId INT NOT NULL,
	modified datetime,
	created datetime,
	INDEX attachment_postId(postId),
	INDEX attachment_prMsgId(prMsgId),
	INDEX attachment_userId(userId)
);

CREATE TABLE attachmentInfo (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	attachmentId INT NOT NULL,
	physicalFileName VARCHAR(255) NOT NULL,
	realFileName VARCHAR(255) NOT NULL,
	downloadCount INT,
	description VARCHAR(255),
	mimeType VARCHAR(50),
	fileSize INT,
	uploadTime DATETIME,
	thumb TINYINT(1) DEFAULT '0',
	extensionId INT,
	modified datetime,
	created datetime,
	INDEX attachmentType_attachId(attachmentId),
	INDEX attachmentType_exensionId(extensionId)
);

CREATE TABLE attachmentQuota (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	groupId INT NOT NULL,
	quotaId INT NOT NULL,
	modified datetime,
	created datetime,
	KEY(groupId)
);

CREATE TABLE banlist (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	userId INT,
	ip varchar(15),
	email varchar(255),
	modified datetime,
	created datetime,
	INDEX banlist_userID (userId),
	INDEX banlist_ip (ip),
	INDEX banlist_email (email)
);

CREATE TABLE banner (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(90),
	placement INT NOT NULL DEFAULT '0',
	description VARCHAR(250),
	clickCount INT NOT NULL DEFAULT '0',
	viewCount INT NOT NULL DEFAULT '0',
	url VARCHAR(250),
	weight TINYINT(1) NOT NULL DEFAULT '50',
	active TINYINT(1) NOT NULL DEFAULT '0',
	comment VARCHAR(250),
	type INT NOT NULL DEFAULT '0',
	width INT NOT NULL DEFAULT '0',
	height INT NOT NULL DEFAULT '0',
	modified datetime,
	created datetime,
	KEY(id)
);

CREATE TABLE bookmark (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	userId INT NOT NULL,
	relationId INT NOT NULL,
	relationType INT NOT NULL,
	publicVisible INT DEFAULT '1',
	title varchar(255),
	description varchar(255),
	modified datetime,
	created datetime,
	INDEX bookmark_relationId (relationId),
	KEY(userId)
);


CREATE TABLE category (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	title varchar(100) NOT NULL default '',
	displayOrder INT NOT NULL default '0',
	moderated TINYINT(1) DEFAULT '0',
	modified datetime,
	created datetime
);

CREATE TABLE config (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	name varchar(255) NOT NULL default '',
	value varchar(255) NOT NULL default '',
	modified datetime,
	created datetime
);

CREATE TABLE extension (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	groupId INT NOT NULL,
	description VARCHAR(100),
	uploadIcon VARCHAR(100),
	extension VARCHAR(10),
	allow TINYINT(1) DEFAULT '1',
	modified datetime,
	created datetime,
	KEY(groupId),
	INDEX extension_extension(extension)
);

CREATE TABLE extensionGroup (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(100) NOT NULL,
	allow TINYINT(1) DEFAULT '1', 
	uploadIcon VARCHAR(100),
	downloadMode TINYINT(1) DEFAULT '1',
	modified datetime,
	created datetime
);


CREATE TABLE forum (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	categoryId INT NOT NULL default '1',
	name varchar(150) NOT NULL default '',
	description varchar(255) default NULL,
	forumOrder INT default '1',
	topicCount INT NOT NULL default '0',
	lastPostId INT NOT NULL default '0',
	moderated TINYINT(1) DEFAULT '0',
	modified datetime,
	created datetime,
	KEY (categoryId),
	INDEX forum_categoryId (categoryId)
);

CREATE TABLE forumWatch (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	forumId INT NOT NULL,
	userId INT NOT NULL,
	modified datetime,
	created datetime,
	INDEX forumsWatch_forumId (forumId),
	INDEX forumsWatch_userId (userId)
);

CREATE TABLE groupType (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	name varchar(40) NOT NULL default '',
	description varchar(255) default NULL,
	parentId INT default '0',
	modified datetime,
	created datetime
);

CREATE TABLE karma (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	postId INT NOT NULL,
	topicId INT NOT NULL,
	postUserId INT NOT NULL,
	fromUserId INT NOT NULL,
	pointCount INT NOT NULL,
	rateDate datetime NULL,
	modified datetime,
	created datetime,
	KEY(postId),
	KEY(topicId),
	KEY(postUserId),
	KEY(fromUserId)
);

CREATE TABLE log (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	userId INT NOT NULL,
	description TEXT NOT NULL,
	originalMessage TEXT,
	date DATETIME NOT NULL,
	type TINYINT DEFAULT 0,
	postId INT DEFAULT 0,
	topicId INT DEFAULT 0,
	postUserId INT DEFAULT 0,
	modified datetime,
	created datetime,
	KEY(userId),
	KEY(postUserId)
);

CREATE TABLE mail (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	forumId INT NOT NULL,
	forumEmail VARCHAR(100) NOT NULL,
	popUserName VARCHAR(100) NOT NULL,
	popPassword VARCHAR(100) NOT NULL,
	popHost VARCHAR(100) NOT NULL,
	popPort INT DEFAULT 110,
	popSsl TINYINT DEFAULT '0',
	modified datetime,
	created datetime,
	KEY(forumId)
);

CREATE TABLE post (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	text TEXT,
	subject VARCHAR(100),
	topicId INT NOT NULL default '0',
	forumId INT NOT NULL default '0',
	userId INT NOT NULL default '0',
	postTime datetime default NULL,
	posterIp varchar(15) default NULL,
	enableBbcode tinyint(1) NOT NULL default '1',
	enableHtml tinyint(1) NOT NULL default '1',
	enableSmile tinyint(1) NOT NULL default '1',
	enableSign tinyint(1) NOT NULL default '1',
	editTime datetime default NULL,
	editCount INT NOT NULL default '0',
	status tinyint(1) default '1',
	attach TINYINT(1) DEFAULT '0',
	needModerate TINYINT(1) DEFAULT '0',
	modified datetime,
	created datetime,
	KEY (userId),
	KEY (topicId),
	KEY (forumId),
	KEY(postTime),
	INDEX (needModerate)
);

CREATE TABLE privateMessage (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	type tinyint(4) NOT NULL default '0',
	subject varchar(255) NOT NULL default '',
	fromUserId INT NOT NULL default '0',
	toUserId INT NOT NULL default '0',
	date datetime default null,
	ip varchar(15) NOT NULL default '',
	enableBbcode tinyint(1) NOT NULL default '1',
	enableHtml tinyint(1) NOT NULL default '0',
	enableSmile tinyint(1) NOT NULL default '1',
	attachAig tinyint(1) NOT NULL default '1',
	modified datetime,
	created datetime
);

CREATE TABLE privateMessageText (
	id INT NOT NULL PRIMARY KEY,
	messageText TEXT,
	modified datetime,
	created datetime
);

CREATE TABLE quota (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	description VARCHAR(50) NOT NULL,
	limitation INT NOT NULL,
	type TINYINT(1) DEFAULT '1',
	modified datetime,
	created datetime
);

CREATE TABLE rank (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	title varchar(50) NOT NULL default '',
	min INT NOT NULL default '0',
	special tinyint(1) default NULL,
	image varchar(255) default NULL,
	modified datetime,
	created datetime
);

CREATE TABLE role (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	groupId INT default '0',
	name varchar(255) NOT NULL,
	modified datetime,
	created datetime,
	INDEX role_groupId (groupId),
	INDEX role_name (name)
);

CREATE TABLE roleType (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	roleId INT NOT NULL,
	value VARCHAR(255),
	modified datetime,
	created datetime,
	INDEX roleType_roleId(roleId)
);

CREATE TABLE session (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	sessionid varchar(150) NOT NULL default '',
	userId INT NOT NULL default '0',
	start datetime default null,
	time bigint default '0',
	ip varchar(15) NOT NULL default '',
	page int(11) NOT NULL default '0',
	loggedInt tinyint(1) default NULL,
	modified datetime,
	created datetime,
	INDEX session_userId (userId)
);


CREATE TABLE smile (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	code varchar(50) NOT NULL default '',
	url varchar(100) default NULL,
	diskName varchar(255),
	modified datetime,
	created datetime
);

CREATE TABLE themes (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	templateName varchar(30) NOT NULL default '',
	styleName varchar(30) NOT NULL default '',
	modified datetime,
	created datetime
);

CREATE TABLE topic (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	forumId INT NOT NULL default '0',
	title varchar(100) NOT NULL default '',
	userId INT NOT NULL default '0',
	viewCount INT default '1',
	replyCount INT default '0',
	status tinyint(3) default '0',
	voteId INT NOT NULL default '0',
	type tinyint(3) default '0',
	firstPostId INT default '0',
	lastPostId INT NOT NULL default '0',
	movedId INT DEFAULT 0,
	moderated TINYINT(1) DEFAULT '0',
	modified datetime,
	created datetime,
	KEY (forumId),
	KEY(userId),
	KEY(firstPostId),
	KEY(lastPostId),
	KEY(movedId)
);

CREATE TABLE topicWatch (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	topicId INT NOT NULL,
	userId INT NOT NULL,
	isRead boolean DEFAULT true,
	modified datetime,
	created datetime,
	INDEX topicWatch_topicId (topicId),
	INDEX topicWatch_userId (userId)
);

CREATE TABLE user (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	active tinyint(1) default NULL,
	username varchar(50) NOT NULL default '',
	password varchar(32) NOT NULL default '',
	sessionTime bigint default 0,
	sessionPage INT NOT NULL default '0',
	lastVisit datetime default null,
	regdate datetime default null,
	level tinyint(4) default NULL,
	postCount INT NOT NULL default '0',
	timezone varchar(5) NOT NULL default '',
	style tinyint(4) default NULL,
	lang varchar(255) NOT NULL default '',
	dateformat varchar(20) NOT NULL default '%d/%M/%Y %H:%i',
	newPrMsg INT NOT NULL default '0',
	unreadPrMsg INT NOT NULL default '0',
	lastPrMsg datetime NULL,
	emailTime datetime default NULL,
	viewEmail tinyint(1) default '0',
	attachSign tinyint(1) default '1',
	allowHtml tinyint(1) default '0',
	allowBbcode tinyint(1) default '1',
	allowSmile tinyint(1) default '1',
	allowAvatar tinyint(1) default '1',
	allowPm tinyint(1) default '1',
	allowViewOnline tinyint(1) default '1',
	notify tinyint(1) default '1',
	notifyAlways tinyint(1) default '0',
	notifyText tinyint(1) default '0',
	notifyPm tinyint(1) default '1',
	popupPm tinyint(1) default '1',
	rankId INT default 0,
	avatar varchar(100) default NULL,
	avatarType tinyint(4) NOT NULL default '0',
	email varchar(255) NOT NULL default '',
	icq varchar(15) default NULL,
	website varchar(255) default NULL,
	usFrom varchar(100) default NULL,
	sign text,
	signBbcodeUid varchar(10) default NULL,
	aim varchar(255) default NULL,
	yim varchar(255) default NULL,
	msnm varchar(255) default NULL,
	occ varchar(100) default NULL,
	interests varchar(255) default NULL,
	biography text DEFAULT NULL,
	actKey varchar(32) default NULL,
	gender char(1) default NULL,
	themesId INT default NULL,
	deleted tinyint(1) default NULL,
	viewOnline tinyint(1) default '1',
	securityHash varchar(32),
	karma DOUBLE,
	authHash VARCHAR(32),
	modified datetime,
	created datetime
);

CREATE TABLE userGroup (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	groupId INT NOT NULL,
	userId INT NOT NULL,
	modified datetime,
	created datetime,
	INDEX userGroup_groupId (groupId),
	INDEX userGroup_userId (userId)
);


CREATE TABLE vote (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	topicId INT NOT NULL default '0',
	text varchar(255) NOT NULL default '',
	start datetime NOT NULL,
	length int(11) NOT NULL default '0',
	modified datetime,
	created datetime,
	INDEX vote_topicId (topicId)
);

CREATE TABLE voter (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	voteId INT NOT NULL default '0',
	userId INT NOT NULL default '0',
	userIp varchar(15) NOT NULL default '',
	modified datetime,
	created datetime,
	INDEX voter_voteId(voteId),
	INDEX voter_userId(userId)
);

CREATE TABLE voteResult (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	voteId INT NOT NULL default '0',
	optionId tinyint(4) NOT NULL default '0',
	optionText varchar(255) NOT NULL default '',
	result int(11) NOT NULL default '0',
	modified datetime,
	created datetime,
	INDEX voteResult_voteId(voteId)
);

CREATE TABLE word (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	word varchar(100) NOT NULL default '',
	replacement varchar(100) NOT NULL default '',
	modified datetime,
	created datetime
);

create table person (
      id int not null primary key,
      firstnameru varchar(50),
      lastnameru varchar(50),
      firstnameeng varchar(50),
      lastnameeng varchar(50),
      firstnameua varchar(50),
      lastnameua varchar(50),
      middlenameru varchar(50),
      middlenameua varchar(50),
      dob date,
      address varchar(250),
      details varchar(500),
      sex varchar(10),
      phone varchar(50),
      email varchar(50),
      code varchar(50),
      modified datetime,
      created datetime);
      
create table users(
      id int not null,
      personid int not null,
      username varchar(50) not null primary key,
      password varchar(100) not null,
      enabled boolean not null,
      modified datetime,
      created datetime);

create table authorities (
      id int not null AUTO_INCREMENT primary key,
      username varchar(50) not null,
      authority varchar(50) not null,
      modified datetime,
      created datetime,
      foreign key(username) references users(username));
