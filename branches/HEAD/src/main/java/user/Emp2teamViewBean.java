package user;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import service.IEmp2teamManager;
import entry.Emp2team;

@ManagedBean
@RequestScoped
public class Emp2teamViewBean {

    private Emp2team emp2team;
    @ManagedProperty(value = "#{emp2teamManager}")
    private IEmp2teamManager emp2teamManager;
    private Emp2team selectedEmp2team;
    private Emp2team[] selectedEmp2teams;
    private List<Emp2team> emp2teams = new ArrayList<Emp2team>();

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Emp2team[] getSelectedEmp2teams() {
        return selectedEmp2teams;
    }

    public void setSelectedEmp2teams(Emp2team[] selectedEmp2teams) {
        this.selectedEmp2teams = selectedEmp2teams;
    }

    public IEmp2teamManager getEmp2teamManager() {
        return emp2teamManager;
    }

    public void setEmp2teamManager(IEmp2teamManager emp2teamManager) {
        this.emp2teamManager = emp2teamManager;
    }

    public List<Emp2team> getEmp2teams() {
    	emp2teams = emp2teamManager.getEmp2teams();
        this.length = emp2teams.size();
        return emp2teams;
    }

    public Emp2team getSelectedEmp2team() {
        return selectedEmp2team;
    }

    public void setSelectedEmp2team(Emp2team selectedEmp2team) {
        this.selectedEmp2team = selectedEmp2team;
    }

    public Emp2team getEmp2team() {
        return emp2team;
    }

    public void setEmp2team(Emp2team emp2team) {
        this.emp2team = emp2team;
    }

}
