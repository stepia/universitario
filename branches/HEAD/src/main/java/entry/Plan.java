package entry;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Plan {

	private Long id;
	private Long planid;
    private Long disciplineid;
    private Long lessontypeid;
    private Long empid;
    private Long periodid;
    private String hours;
    private Long marktypeid;
    private Date created;
    private Date modified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPlanid() {
        return planid;
    }

    public void setPlanid(Long planid) {
        this.planid = planid;
    }

    public Long getDisciplineid() {
        return disciplineid;
    }

    public void setDisciplineid(Long disciplineid) {
        this.disciplineid = disciplineid;
    }

    public Long getLessontypeid() {
        return lessontypeid;
    }

    public void setLessontypeid(Long lessontypeid) {
        this.lessontypeid = lessontypeid;
    }
    
    public Long getEmpid() {
        return empid;
    }

    public void setEmpid(Long empid) {
        this.empid = empid;
    }
        
    public Long getPeriodid() {
        return periodid;
    }

    public void setPeriodid(Long periodid) {
        this.periodid = periodid;
    }
    
    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }
    
    public Long getMarktypeid() {
        return marktypeid;
    }

    public void setMarktypeid(Long marktypeid) {
        this.marktypeid = marktypeid;
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
