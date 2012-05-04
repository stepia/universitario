package entry;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Employee {

    private int stateid;
    private Long id;
    private Long personid;
    private int recordbook;
    private Date created;
    private Date modified;
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
    
    public int getRecordbook() {
        return recordbook;
    }

    public void setRecordbook(int recordbook) {
        this.recordbook = recordbook;
    }

    public List<Emp2Team> getEmpTeams() {
        return empTeams;
    }

    public void setEmpTeams(List<Emp2Team> empTeams) {
        this.empTeams = empTeams;
    }
    
    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

}
