package entry;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Authority {

    private int authorityAA;

    private String username;

    private String authority;

    public int getAuthorityaa() {
        return authorityAA;
    }

    public void setAuthorityaa(int authorityAA) {
        this.authorityAA = authorityAA;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

}
