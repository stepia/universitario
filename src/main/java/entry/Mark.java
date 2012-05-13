package entry;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Mark {

	private Long id;
	private String pmark;
	private String nmark;
	private String wmark;
	private String vmark;
    private Date created;
    private Date modified;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPmark() {
        return pmark;
    }

    public void setPmark(String pmark) {
        this.pmark = pmark;
    }
    
    public String getNmark() {
        return nmark;
    }

    public void setNmark(String nmark) {
        this.nmark = nmark;
    }
    
    public String getWmark() {
        return wmark;
    }

    public void setWmark(String wmark) {
        this.wmark = wmark;
    }
    
    public String getVmark() {
        return vmark;
    }

    public void setVmark(String vmark) {
        this.vmark = vmark;
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
