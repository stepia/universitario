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
    	Long id = Long.valueOf(rowKey);

        @SuppressWarnings("unchecked")
        List<Person> persons = (List<Person>) getWrappedData();

        for (Person person : persons) {
            if (person.getId().equals(id))
                return person;
        }

        return null;
    }

    public Long getRowKey(Person person) {
        return person.getId();
    }
}
