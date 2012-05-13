package dao;

import java.util.List;

import entry.UserIPerson;

public interface UserIPersonDao {

    public List<UserIPerson> getUserIPersons();

    public List<UserIPerson> getUserIPersons(String sortBy, boolean sortOrder);

    public void saveUserIPerson(UserIPerson userIPerson);

    public void editUserIPerson(UserIPerson userIPerson);

    public UserIPerson getUserIPerson(Long id);

    public void deleteUserIPerson(UserIPerson userIPerson);

    public void saveOrUpdate(UserIPerson userIPerson);

}
