package user;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;

import service.IOccupationManager;
import entry.Occupation;

@ManagedBean
@SessionScoped
public class OccupationViewBean {

    @ManagedProperty(value = "#{occupationManager}")
    private IOccupationManager occupationManager;
    private Occupation selectedOccupation;
    private Occupation[] selectedOccupations;
    private List<Occupation> occupations = new ArrayList<Occupation>();

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Occupation[] getSelectedOccupations() {
        return selectedOccupations;
    }

    public void setSelectedOccupations(Occupation[] selectedOccupations) {
        this.selectedOccupations = selectedOccupations;
    }

    public IOccupationManager getOccupationManager() {
        return occupationManager;
    }

    public void setOccupationManager(IOccupationManager occupationManager) {
        this.occupationManager = occupationManager;
    }

    public List<Occupation> getOccupations() {
    	occupations = occupationManager.getOccupations();
        this.length = occupations.size();
        return occupations;
    }

    public Occupation getSelectedOccupation() {
        return selectedOccupation;
    }

    public void setSelectedOccupation(Occupation selectedOccupation) {
        this.selectedOccupation = selectedOccupation;
    }

    public void onRowSelect(SelectEvent event) throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("occupationDetail.xhtml");
    }

    public void init() throws IOException {
        setSelectedOccupation(null);
    }

}
