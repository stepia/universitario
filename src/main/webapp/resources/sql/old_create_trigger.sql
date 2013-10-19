delimiter //
CREATE TRIGGER attachment_OnInsert BEFORE INSERT ON `attachment`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER attachment_OnUpdate BEFORE UPDATE ON `attachment`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER attachmentInfo_OnInsert BEFORE INSERT ON `attachmentInfo`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER attachmentInfo_OnUpdate BEFORE UPDATE ON `attachmentInfo`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER attachmentQuota_OnInsert BEFORE INSERT ON `attachmentQuota`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER attachmentQuota_OnUpdate BEFORE UPDATE ON `attachmentQuota`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER banlist_OnInsert BEFORE INSERT ON `banlist`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER banlist_OnUpdate BEFORE UPDATE ON `banlist`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER banner_OnInsert BEFORE INSERT ON `banner`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER banner_OnUpdate BEFORE UPDATE ON `banner`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER bookmark_OnInsert BEFORE INSERT ON `bookmark`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER bookmark_OnUpdate BEFORE UPDATE ON `bookmark`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER category_OnInsert BEFORE INSERT ON `category`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER category_OnUpdate BEFORE UPDATE ON `category`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER config_OnInsert BEFORE INSERT ON `config`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER config_OnUpdate BEFORE UPDATE ON `config`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER extension_OnInsert BEFORE INSERT ON `extension`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER extension_OnUpdate BEFORE UPDATE ON `extension`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER extensionGroup_OnInsert BEFORE INSERT ON `extensionGroup`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER extensionGroup_OnUpdate BEFORE UPDATE ON `extensionGroup`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER forum_OnInsert BEFORE INSERT ON `forum`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER forum_OnUpdate BEFORE UPDATE ON `forum`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER forumWatch_OnInsert BEFORE INSERT ON `forumWatch`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER forumWatch_OnUpdate BEFORE UPDATE ON `forumWatch`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER groupType_OnInsert BEFORE INSERT ON `groupType`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER groupType_OnUpdate BEFORE UPDATE ON `groupType`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER karma_OnInsert BEFORE INSERT ON `karma`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER karma_OnUpdate BEFORE UPDATE ON `karma`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER log_OnInsert BEFORE INSERT ON `log`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER log_OnUpdate BEFORE UPDATE ON `log`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER mail_OnInsert BEFORE INSERT ON `mail`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER mail_OnUpdate BEFORE UPDATE ON `mail`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
    
END;//
delimiter ;

delimiter //
CREATE TRIGGER post_OnInsert BEFORE INSERT ON `post`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER post_OnUpdate BEFORE UPDATE ON `post`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;      

delimiter //
CREATE TRIGGER privateMessage_OnInsert BEFORE INSERT ON `privateMessage`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER privateMessage_OnUpdate BEFORE UPDATE ON `privateMessage`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;  

delimiter //
CREATE TRIGGER privateMessageText_OnInsert BEFORE INSERT ON `privateMessageText`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER privateMessageText_OnUpdate BEFORE UPDATE ON `privateMessageText`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;  

delimiter //
CREATE TRIGGER quota_OnInsert BEFORE INSERT ON `quota`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER quota_OnUpdate BEFORE UPDATE ON `quota`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;  

delimiter //
CREATE TRIGGER rank_OnInsert BEFORE INSERT ON `rank`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER rank_OnUpdate BEFORE UPDATE ON `rank`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;  

delimiter //
CREATE TRIGGER role_OnInsert BEFORE INSERT ON `role`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER role_OnUpdate BEFORE UPDATE ON `role`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER roleType_OnInsert BEFORE INSERT ON `roleType`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER roleType_OnUpdate BEFORE UPDATE ON `roleType`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER session_OnInsert BEFORE INSERT ON `session`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER session_OnUpdate BEFORE UPDATE ON `session`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER smile_OnInsert BEFORE INSERT ON `smile`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER smile_OnUpdate BEFORE UPDATE ON `smile`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER themes_OnInsert BEFORE INSERT ON `themes`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER themes_OnUpdate BEFORE UPDATE ON `themes`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER topic_OnInsert BEFORE INSERT ON `topic`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER topic_OnUpdate BEFORE UPDATE ON `topic`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER topicWatch_OnInsert BEFORE INSERT ON `topicWatch`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER topicWatch_OnUpdate BEFORE UPDATE ON `topicWatch`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER user_OnInsert BEFORE INSERT ON `user`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER user_OnUpdate BEFORE UPDATE ON `user`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER userGroup_OnInsert BEFORE INSERT ON `userGroup`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER userGroup_OnUpdate BEFORE UPDATE ON `userGroup`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER vote_OnInsert BEFORE INSERT ON `vote`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER vote_OnUpdate BEFORE UPDATE ON `vote`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER voter_OnInsert BEFORE INSERT ON `voter`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER voter_OnUpdate BEFORE UPDATE ON `voter`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER voteResult_OnInsert BEFORE INSERT ON `voteResult`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER voteResult_OnUpdate BEFORE UPDATE ON `voteResult`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER word_OnInsert BEFORE INSERT ON `word`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER word_OnUpdate BEFORE UPDATE ON `word`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER users_OnInsert BEFORE INSERT ON `users`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER users_OnUpdate BEFORE UPDATE ON `users`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER person_OnInsert BEFORE INSERT ON `person`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER person_OnUpdate BEFORE UPDATE ON `person`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER authorities_OnInsert BEFORE INSERT ON `authorities`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER authorities_OnUpdate BEFORE UPDATE ON `authorities`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;
