package entry;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Employee {

    private int stateid;
    private Long id;
    private Long personid;
    private String usrname;
    private List<Emp2Team> empTeams = new ArrayList<Emp2Team>();

    // private Long userId;

    // public Long getUserId() {
    // return userId;
    // }
    //
    // public void setUserId(Long userId) {
    // this.userId = userId;
    // }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getUsrname() {
        return usrname;
    }

    public void setUsrname(String usrname) {
        this.usrname = usrname;
    }

    public int getStateid() {
        return stateid;
    }

    public void setStateid(int stateid) {
        this.stateid = stateid;
    }

    public Long getPersonid() {
        return personid;
    }

    public void setPersonid(Long personid) {
        this.personid = personid;
    }

    public List<Emp2Team> getEmpTeams() {
        return empTeams;
    }

    public void setEmpTeams(List<Emp2Team> empTeams) {
        this.empTeams = empTeams;
    }

}
