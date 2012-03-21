ALTER TABLE users DROP INDEX users_empid;
ALTER TABLE users DROP INDEX users_perid;
ALTER TABLE person DROP INDEX users_empid;
ALTER TABLE employee DROP INDEX employee_perid;
ALTER TABLE employee DROP INDEX employee_userid;
ALTER TABLE employee DROP INDEX employee_positionid;
ALTER TABLE faculty DROP INDEX faculty_universityid;
ALTER TABLE chair DROP INDEX chair_facultyid;
ALTER TABLE profession DROP INDEX profession_chairid;
ALTER TABLE groups DROP INDEX groups_professionid;
ALTER TABLE subgroup DROP INDEX subgroup_groupsid;
ALTER TABLE subgroup DROP INDEX subgroup_planid;
ALTER TABLE plan DROP INDEX plan_disciplineid;
ALTER TABLE plan DROP INDEX plan_lessontypeid;
ALTER TABLE plan DROP INDEX plan_empid;
ALTER TABLE plan DROP INDEX plan_periodid;
ALTER TABLE plan DROP INDEX plan_marktypeid;
ALTER TABLE report DROP INDEX plan_empid;
ALTER TABLE lesson DROP INDEX plan_facultyid;
ALTER TABLE lesson DROP INDEX plan_lessontimeid;