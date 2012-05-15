package user;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;
import org.primefaces.event.data.SortEvent;

import dao.PersonDao;
import entry.Person;

@ManagedBean
@SessionScoped
public class PersonViewBean {

    @ManagedProperty(value = "#{personManager}")
    private PersonDao personManager;
    private Person selectedPerson;
    private List<Person> persons = new ArrayList<Person>();
    private boolean editible;
    private boolean sortOrder;
    private String sortBy;

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public PersonDao getPersonManager() {
        return personManager;
    }

    public void setPersonManager(PersonDao personManager) {
        this.personManager = personManager;
    }

    public List<Person> getPersons() {
        if (sortBy == null) {
            persons = getPersonManager().getPersons();
        } else {
            persons = getPersonManager().getPersons(sortBy, sortOrder);
        }
        this.length = persons.size();
        return persons;
    }

    public Person getSelectedPerson() {
        return selectedPerson;
    }

    public void setSelectedPerson(Person selectedPerson) {
        this.selectedPerson = selectedPerson;
    }

    public void onRowSelect(SelectEvent event) throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("personDetail.xhtml");
        setEditible(true);
    }

    public void init() throws IOException {
        setSelectedPerson(null);
        setEditible(false);
    }

    public boolean isEditible() {
        return editible;
    }

    public void setEditible(boolean editible) {
        this.editible = editible;
    }

    public String doAction(String action) throws UnsupportedEncodingException {
        Action act = Action.fromString(action);
        switch (act)
            {
            case DELETE:
                getPersonManager().deletePerson(getSelectedPerson());
                break;
            case CREATE:
                setSelectedPerson(new Person());
                break;
            case SAVE:
                if (getSelectedPerson().getCreated() != null) {
                    getPersonManager().saveOrUpdate(getSelectedPerson());
                } else {
                    getPersonManager().savePerson(getSelectedPerson());
                }
                break;
            }
        return action;
    }

    public void caseListSortListner(SortEvent sortEvent) {
        setSortBy(sortEvent.getSortColumn().getId());
        if (sortEvent.isAscending()) {
            setSortOrder(true);
        } else {
            setSortOrder(false);
        }
    }

    public boolean isSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(boolean sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

}