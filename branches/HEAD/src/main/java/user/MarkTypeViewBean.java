package user;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;

import service.IMarkTypeManager;
import entry.MarkType;

@ManagedBean
@SessionScoped
public class MarkTypeViewBean {

    @ManagedProperty(value = "#{markTypeManager}")
    private IMarkTypeManager markTypeManager;
    private MarkType selectedMarkType;
    private MarkType[] selectedMarkTypes;
    private List<MarkType> markTypes = new ArrayList<MarkType>();
    private boolean editible;

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public MarkType[] getSelectedMarkTypes() {
        return selectedMarkTypes;
    }

    public void setSelectedMarkTypes(MarkType[] selectedMarkTypes) {
        this.selectedMarkTypes = selectedMarkTypes;
    }

    public IMarkTypeManager getMarkTypeManager() {
        return markTypeManager;
    }

    public void setMarkTypeManager(IMarkTypeManager markTypeManager) {
        this.markTypeManager = markTypeManager;
    }

    public List<MarkType> getMarkTypes() {
    	markTypes = markTypeManager.getMarkTypes();
        this.length = markTypes.size();
        return markTypes;
    }

    public MarkType getSelectedMarkType() {
        return selectedMarkType;
    }

    public void setSelectedMarkType(MarkType selectedMarkType) {
        this.selectedMarkType = selectedMarkType;
    }

    public void onRowSelect(SelectEvent event) throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("marktypeDetail.xhtml");
        setEditible(true);
    }

    public void init() throws IOException {
        setSelectedMarkType(null);
        setEditible(false);
    }

    public boolean isEditible() {
        return editible;
    }

    public void setEditible(boolean editible) {
        this.editible = editible;
    }

    public String doAction(String action) {
        return action;
    }

}
