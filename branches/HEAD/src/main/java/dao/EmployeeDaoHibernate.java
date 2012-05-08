package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import entry.Employee;

public class EmployeeDaoHibernate implements EmployeeDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<Employee> getEmployees() {
        return sessionFactory.getCurrentSession().createCriteria(Employee.class)
                    .list();
    }
    
    @SuppressWarnings("unchecked")
    @Transactional
    public List<Employee> getEmployees(String sortBy, boolean sortOrder) {
        if (sortOrder) {
            return sessionFactory.getCurrentSession().createCriteria(Employee.class).addOrder(Order.asc(sortBy)).list();
        } else {
            return sessionFactory.getCurrentSession().createCriteria(Employee.class).addOrder(Order.desc(sortBy)).list();
        }

    }

    @Transactional
    public void deleteEmployee(Employee employee) {
        sessionFactory.getCurrentSession().delete(employee);

    }

    @Transactional
    public void saveEmployee(Employee employee) {
        sessionFactory.getCurrentSession().save(employee);

    }

    @Transactional
    public void saveOrUpdate(Employee employee) {
        sessionFactory.getCurrentSession().saveOrUpdate(employee);

    }

    @Transactional
    public void editEmployee(Employee employee) {
        sessionFactory.getCurrentSession().merge(employee);
    }

    @Transactional
    public Employee getEmployee(Long id) {
        List employees = sessionFactory.getCurrentSession().createCriteria(Employee.class)
                    .add(Restrictions.eq("id", id)).list();
        Employee employee = null;
        if ((employees != null) && (employees.size() > 0)) {
        	employee = (Employee) employees.get(0);
        }
        return employee;
    }
}