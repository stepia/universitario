package entry;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Emp2Team {

    private Long id;
    private Long personid;
    private Long teamid;
    private Long positionid;
    private Long occupationid;
    private Long recordbook;
    private Long stateid;
    private Date created;
    private Date modified;
    private List<Emp2Team> employees = new ArrayList<Emp2Team>();
    private List<Emp2Team> teams = new ArrayList<Emp2Team>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPersonid() {
        return personid;
    }

    public void setPersonid(Long personid) {
        this.personid = personid;
    }

    public Long getTeamid() {
        return teamid;
    }

    public void setTeamid(Long teamid) {
        this.teamid = teamid;
    }

    public Long getPositionid() {
        return positionid;
    }

    public void setPositionid(Long positionid) {
        this.positionid = positionid;
    }

    public Long getOccupationid() {
        return occupationid;
    }

    public void setOccupationid(Long occupationid) {
        this.occupationid = occupationid;
    }
    
    public Long getRecordbook() {
        return recordbook;
    }

    public void setRecordbook(Long recordbook) {
        this.recordbook = recordbook;
    }

    public Long getStateid() {
        return stateid;
    }

    public void setStateid(Long stateid) {
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

    public List<Emp2Team> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Emp2Team> employees) {
        this.employees = employees;
    }

    public List<Emp2Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Emp2Team> teams) {
        this.teams = teams;
    }

}