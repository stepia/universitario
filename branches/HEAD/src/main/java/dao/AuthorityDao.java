package dao;

import java.util.List;

import entry.Authority;

public interface AuthorityDao {

    public List<Authority> getAuthorities();

    public void createAuthority(Authority role);

    public void deleteAuthority(Authority role);

}
