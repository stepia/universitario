package user;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;

import service.IPersonManager;
import entry.Person;

@ManagedBean
@SessionScoped
public class PersonViewBean {

    @ManagedProperty(value = "#{personManager}")
    private IPersonManager personManager;
    private Person selectedPerson;
    private Person[] selectedPersons;
    private List<Person> persons = new ArrayList<Person>();

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Person[] getSelectedPersons() {
        return selectedPersons;
    }

    public void setSelectedPersons(Person[] selectedPersons) {
        this.selectedPersons = selectedPersons;
    }

    public IPersonManager getPersonManager() {
        return personManager;
    }

    public void setPersonManager(IPersonManager personManager) {
        this.personManager = personManager;
    }

    public List<Person> getPersons() {
        persons = personManager.getPersons();
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
    }

    public void init() throws IOException {
        setSelectedPerson(null);
    }

}
