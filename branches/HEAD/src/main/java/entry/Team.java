package entry;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Team {
    private long id;
    private String name;
    private long teamtypeid;
    private long rootid;
    private String details;
    private long stateid;
    private Date created;
    private Date modified;
    private List<Emp2Team> empTeams = new ArrayList<Emp2Team>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTeamtypeid() {
        return teamtypeid;
    }

    public void setTeamtypeid(long teamtypeid) {
        this.teamtypeid = teamtypeid;
    }

    public long getRootid() {
        return rootid;
    }

    public void setRootid(long rootid) {
        this.rootid = rootid;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public long getStateid() {
        return stateid;
    }

    public void setStateid(long stateid) {
        this.stateid = stateid;
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

    public List<Emp2Team> getEmpTeams() {
        return empTeams;
    }

    public void setEmpTeams(List<Emp2Team> empTeams) {
        this.empTeams = empTeams;
    }

}
