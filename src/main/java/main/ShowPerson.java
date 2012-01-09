package main;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ShowPerson {

    @ManagedProperty(value = "#{universityManager}")
    private UniversityManager universityManager;

    public UniversityManager getUniversityManager() {
        return universityManager;
    }

    public void setUniversityManager(UniversityManager universityManager) {
        this.universityManager = universityManager;
    }

    private List<Decane> decanes;

    public List<Decane> getDecanes() {
        decanes = this.getUniversityManager().getDecanes();
        return decanes;
    }

}
