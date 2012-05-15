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

delimiter //
CREATE TRIGGER team_OnInsert BEFORE INSERT ON `team`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER team_OnUpdate BEFORE UPDATE ON `team`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER teamtype_OnInsert BEFORE INSERT ON `teamtype`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER teamtype_OnUpdate BEFORE UPDATE ON `teamtype`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER emp2team_OnInsert BEFORE INSERT ON `emp2team`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER emp2team_OnUpdate BEFORE UPDATE ON `emp2team`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER positions_OnInsert BEFORE INSERT ON `positions`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER positions_OnUpdate BEFORE UPDATE ON `positions`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;
      
delimiter //
CREATE TRIGGER lessontype_OnInsert BEFORE INSERT ON `lessontype`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER lessontype_OnUpdate BEFORE UPDATE ON `lessontype`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;
      
delimiter //
CREATE TRIGGER marktype_OnInsert BEFORE INSERT ON `marktype`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER marktype_OnUpdate BEFORE UPDATE ON `marktype`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER period_OnInsert BEFORE INSERT ON `period`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER period_OnUpdate BEFORE UPDATE ON `period`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;
      
delimiter //
CREATE TRIGGER plan_OnInsert BEFORE INSERT ON `plan`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER plan_OnUpdate BEFORE UPDATE ON `plan`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER planDetails_OnInsert BEFORE INSERT ON `planDetails`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER planDetails_OnUpdate BEFORE UPDATE ON `planDetails`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER discipline_OnInsert BEFORE INSERT ON `discipline`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER discipline_OnUpdate BEFORE UPDATE ON `discipline`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;
     
delimiter //
CREATE TRIGGER mark_OnInsert BEFORE INSERT ON `mark`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER mark_OnUpdate BEFORE UPDATE ON `mark`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;
     
delimiter //
CREATE TRIGGER report_OnInsert BEFORE INSERT ON `report`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER report_OnUpdate BEFORE UPDATE ON `report`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER lesson_OnInsert BEFORE INSERT ON `lesson`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER lesson_OnUpdate BEFORE UPDATE ON `lesson`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
    
END;//
delimiter ;
      
delimiter //
CREATE TRIGGER time_OnInsert BEFORE INSERT ON `time`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER time_OnUpdate BEFORE UPDATE ON `time`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;      
      
delimiter //
CREATE TRIGGER week_OnInsert BEFORE INSERT ON `week`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER week_OnUpdate BEFORE UPDATE ON `week`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;    


delimiter //
CREATE TRIGGER state_OnInsert BEFORE INSERT ON `state`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER state_OnUpdate BEFORE UPDATE ON `state`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;  

delimiter //
CREATE TRIGGER occupation_OnInsert BEFORE INSERT ON `occupation`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER occupation_OnUpdate BEFORE UPDATE ON `occupation`
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
CREATE TRIGGER reporttype_OnInsert BEFORE INSERT ON `reporttype`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER reporttype_OnUpdate BEFORE UPDATE ON `reporttype`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER reportDetails_OnInsert BEFORE INSERT ON `reportDetails`
FOR EACH ROW
BEGIN
    SET NEW.created = NOW();
    SET NEW.modified = NOW();
END;//
delimiter ;

delimiter //
CREATE TRIGGER reportDetails_OnUpdate BEFORE UPDATE ON `reportDetails`
FOR EACH ROW
BEGIN
    SET NEW.modified = NOW();
END;//
delimiter ;
