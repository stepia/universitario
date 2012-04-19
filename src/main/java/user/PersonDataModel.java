package user;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import entry.Person;

public class PersonDataModel extends ListDataModel<Person> implements SelectableDataModel<Person> {

    public PersonDataModel() {
    }

    public PersonDataModel(List<Person> data) {
        super(data);
    }

    public Person getRowData(String rowKey) {

        @SuppressWarnings("unchecked")
        List<Person> persons = (List<Person>) getWrappedData();

        for (Person person : persons) {
            if (person.getLastName().equals(rowKey))
                return person;
        }

        return null;
    }

    public String getRowKey(Person person) {
        return person.getLastName();
    }
}
