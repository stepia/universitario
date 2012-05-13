package service;

import java.util.List;

import dao.UserIPersonDao;
import entry.UserIPerson;

public class UserIPersonManager implements UserIPersonDao {

    private UserIPersonDao employeeDao;

    public UserIPersonDao getUserIPersonDao() {
        return employeeDao;
    }

    public void setUserIPersonDao(UserIPersonDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public void saveUserIPerson(UserIPerson employee) {
        getUserIPersonDao().saveUserIPerson(employee);
    }

    public void saveOrUpdate(UserIPerson employee) {
        getUserIPersonDao().saveOrUpdate(employee);
    }

    public void deleteUserIPerson(UserIPerson employee) {
        getUserIPersonDao().deleteUserIPerson(employee);
    }

    public List<UserIPerson> getUserIPersons() {
        return getUserIPersonDao().getUserIPersons();
    }

    public List<UserIPerson> getUserIPersons(String sortBy, boolean sortOrder) {
        return getUserIPersonDao().getUserIPersons(sortBy, sortOrder);
    }

    public void editUserIPerson(UserIPerson employee) {
        getUserIPersonDao().editUserIPerson(employee);
    }

    public UserIPerson getUserIPerson(Long id) {
        return getUserIPersonDao().getUserIPerson(id);
    }

}
