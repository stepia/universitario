package dao;

import java.util.List;

import entry.Authority;

public interface AuthorityDao {

    public List<Authority> getAuthorities();

    public List<Authority> getAuthorities(String sortBy, boolean sortOrder);

    public void saveAuthority(Authority authority);

    public void editAuthority(Authority authority);

    public Authority getAuthority(Long id);

    public void deleteAuthority(Authority authority);

    public void saveOrUpdate(Authority authority);

}
