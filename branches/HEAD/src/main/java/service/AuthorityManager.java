package service;

import java.util.List;

import dao.AuthorityDao;
import entry.Authority;

public class AuthorityManager implements AuthorityDao {

    private AuthorityDao authorityDao;

    public AuthorityDao getAuthorityDao() {
        return authorityDao;
    }

    public void setAuthorityDao(AuthorityDao authorityDao) {
        this.authorityDao = authorityDao;
    }

    public void saveAuthority(Authority authority) {
        getAuthorityDao().saveAuthority(authority);
    }

    public void saveOrUpdate(Authority authority) {
        getAuthorityDao().saveOrUpdate(authority);
    }

    public void deleteAuthority(Authority authority) {
        getAuthorityDao().deleteAuthority(authority);
    }

    public List<Authority> getAuthorities() {
        return getAuthorityDao().getAuthorities();
    }

    public List<Authority> getAuthorities(String sortBy, boolean sortOrder) {
        return getAuthorityDao().getAuthorities(sortBy, sortOrder);
    }

    public void editAuthority(Authority authority) {
        getAuthorityDao().editAuthority(authority);
    }

    public Authority getAuthority(Long id) {
        return getAuthorityDao().getAuthority(id);
    }

}
