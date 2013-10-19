DELIMITER $$
CREATE PROCEDURE getSubTeams(IN base INT UNSIGNED,IN forumType VARCHAR(64))
BEGIN
    DECLARE ids TEXT DEFAULT '';
    SET @parents = base;
    SET @forumType = forumType;
    SET ids = base;
    loop1: LOOP
        SET @stm = CONCAT('SELECT GROUP_CONCAT(id) INTO @parents FROM phpbb_forums',' WHERE parent_id IN (', @parents, ')');
        PREPARE fetch_childs FROM @stm;
        EXECUTE fetch_childs;
        DROP PREPARE fetch_childs;
        IF @parents IS NULL THEN LEAVE loop1; END IF;
        SET ids = CONCAT(ids, ',', @parents);
    END LOOP;
    IF @forumType IS NULL THEN
        SET @stm = CONCAT('SELECT * FROM phpbb_forums WHERE id IN (', ids, ')');
        PREPARE fetch_childs FROM @stm;
        EXECUTE fetch_childs;
    ELSE
        SET @stm = CONCAT('SELECT * FROM phpbb_forums WHERE id IN (', ids, ') AND forum_type = (SELECT id from forumType where name = ?)');
        PREPARE fetch_childs FROM @stm;
        EXECUTE fetch_childs USING @forumtype;
    END IF;
    DROP PREPARE fetch_childs;
END;


DELIMITER $$
CREATE PROCEDURE getParentTeams(IN base INT UNSIGNED,IN forumType VARCHAR(64))
BEGIN
    DECLARE ids TEXT DEFAULT '';
    SET @parent = base;
    SET @forumType = forumType;
    SET @stm = CONCAT('SELECT parent_id INTO @parent FROM phpbb_forums WHERE id = ?');
    PREPARE fetch_parent FROM @stm;
    loop1: LOOP
        EXECUTE fetch_parent USING @parent;
        SET ids = CONCAT(ids, IF(LENGTH(ids), ',', ''), @parent);
        IF NOT @parent THEN LEAVE loop1; END IF;
    END LOOP;
    DROP PREPARE fetch_parent;
    IF @forumType IS NULL THEN
        SET @stm = CONCAT('SELECT * FROM phpbb_forums WHERE id IN (', ids, ')');
        PREPARE fetch_parents FROM @stm;
        EXECUTE fetch_parents;
    ELSE
        SET @stm = CONCAT('SELECT * FROM phpbb_forums WHERE id IN (', ids, ') AND forum_type = (SELECT id from forumType where name = ?)');
        PREPARE fetch_parents FROM @stm;
        EXECUTE fetch_parents USING @forumType;
    END IF;
    DROP PREPARE fetch_parents;
END;