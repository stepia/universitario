package user;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import service.IMarkTypeManager;
import entry.MarkType;

@ManagedBean
@RequestScoped
public class MarkTypeViewBean {

    private MarkType markType;
    @ManagedProperty(value = "#{markTypeManager}")
    private IMarkTypeManager markTypeManager;
    private MarkType selectedMarkType;
    private MarkType[] selectedMarkTypes;
    private List<MarkType> markTypes = new ArrayList<MarkType>();

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

    public MarkType getMarkType() {
        return markType;
    }

    public void setMarkType(MarkType markType) {
        this.markType = markType;
    }

}
