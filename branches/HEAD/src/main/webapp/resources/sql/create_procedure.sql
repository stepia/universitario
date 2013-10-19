DELIMITER $$
CREATE PROCEDURE getSubTeams(IN base INT UNSIGNED,IN teamtype VARCHAR(64))
BEGIN
    DECLARE ids TEXT DEFAULT '';
    SET @parents = base;
    SET @teamType = teamtype;
    SET ids = base;
    loop1: LOOP
        SET @stm = CONCAT('SELECT GROUP_CONCAT(id) INTO @parents FROM team',' WHERE rootid IN (', @parents, ')');
        PREPARE fetch_childs FROM @stm;
        EXECUTE fetch_childs;
        DROP PREPARE fetch_childs;
        IF @parents IS NULL THEN LEAVE loop1; END IF;
        SET ids = CONCAT(ids, ',', @parents);
    END LOOP;
    IF @teamtype IS NULL THEN
        SET @stm = CONCAT('SELECT * FROM team WHERE id IN (', ids, ')');
        PREPARE fetch_childs FROM @stm;
        EXECUTE fetch_childs;
    ELSE
        SET @stm = CONCAT('SELECT * FROM team WHERE id IN (', ids, ') AND teamtypeid = (SELECT id from teamtype where name = ?)');
        PREPARE fetch_childs FROM @stm;
        EXECUTE fetch_childs USING @teamtype;
    END IF;
    DROP PREPARE fetch_childs;
END;


DELIMITER $$
CREATE PROCEDURE getParentTeams(IN base INT UNSIGNED,IN teamtype VARCHAR(64))
BEGIN
    DECLARE ids TEXT DEFAULT '';
    SET @parent = base;
    SET @teamType = teamtype;
    SET @stm = CONCAT('SELECT rootid INTO @parent FROM team WHERE id = ?');
    PREPARE fetch_parent FROM @stm;
    loop1: LOOP
        EXECUTE fetch_parent USING @parent;
        SET ids = CONCAT(ids, IF(LENGTH(ids), ',', ''), @parent);
        IF NOT @parent THEN LEAVE loop1; END IF;
    END LOOP;
    DROP PREPARE fetch_parent;
    IF @teamtype IS NULL THEN
        SET @stm = CONCAT('SELECT * FROM team WHERE id IN (', ids, ')');
        PREPARE fetch_parents FROM @stm;
        EXECUTE fetch_parents;
    ELSE
        SET @stm = CONCAT('SELECT * FROM team WHERE id IN (', ids, ') AND teamtypeid = (SELECT id from teamtype where name = ?)');
        PREPARE fetch_parents FROM @stm;
        EXECUTE fetch_parents USING @teamtype;
    END IF;
    DROP PREPARE fetch_parents;
END;