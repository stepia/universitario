package user;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import org.primefaces.event.SelectEvent;
import org.primefaces.event.data.SortEvent;

import service.IEmployeeManager;
import entry.Employee;

@ManagedBean
@SessionScoped
public class EmployeeViewBean {

    @ManagedProperty(value = "#{employeeManager}")
    private IEmployeeManager employeeManager;
    private Employee selectedEmployee;
    private List<Employee> employees = new ArrayList<Employee>();
    private boolean editible;
    private boolean sortOrder;
    private String sortBy;
    private SelectItem[] enabledOptions = new SelectItem[3];

    public SelectItem[] getEnabledOptions() {
        return enabledOptions;
    }

    public void setEnabledOptions(SelectItem[] enabledOptions) {
        this.enabledOptions = enabledOptions;
    }

    public EmployeeViewBean() {
        enabledOptions[0] = new SelectItem("", "Select");
        enabledOptions[1] = new SelectItem("true", "Active");
        enabledOptions[2] = new SelectItem("false", "Not active");
    }

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public IEmployeeManager getEmployeeManager() {
        return employeeManager;
    }

    public void setEmployeeManager(IEmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

    public List<Employee> getEmployees() {
        if (sortBy == null) {
            employees = getEmployeeManager().getEmployees();
        } else {
            if (!sortBy.equals("person")) {
                employees = getEmployeeManager().getEmployees(sortBy, sortOrder);
            }
        }
        this.length = employees.size();
        return employees;
    }

    public Employee getSelectedEmployee() {
        return selectedEmployee;
    }

    public void setSelectedEmployee(Employee selectedEmployee) {
        this.selectedEmployee = selectedEmployee;
    }

    public void onRowSelect(SelectEvent event) throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("employeeDetail.xhtml");
        setEditible(true);
    }

    public void init() throws IOException {
        setSelectedEmployee(null);
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
                getEmployeeManager().deleteEmployee(getSelectedEmployee());
                break;
            case CREATE:
                setSelectedEmployee(new Employee());
                break;
            case SAVE:
                if (getSelectedEmployee().getCreated() != null) {
                    getEmployeeManager().saveOrUpdate(getSelectedEmployee());
                } else {
                    getEmployeeManager().saveEmployee(getSelectedEmployee());
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
