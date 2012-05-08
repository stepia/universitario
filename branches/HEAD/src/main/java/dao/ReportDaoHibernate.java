package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import entry.Report;

public class ReportDaoHibernate implements ReportDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<Report> getReports() {
        return sessionFactory.getCurrentSession().createCriteria(Report.class)
                    .list();
    }
    
    @SuppressWarnings("unchecked")
    @Transactional
    public List<Report> getReports(String sortBy, boolean sortOrder) {
        if (sortOrder) {
            return sessionFactory.getCurrentSession().createCriteria(Report.class).addOrder(Order.asc(sortBy)).list();
        } else {
            return sessionFactory.getCurrentSession().createCriteria(Report.class).addOrder(Order.desc(sortBy)).list();
        }

    }

    @Transactional
    public void deleteReport(Report report) {
        sessionFactory.getCurrentSession().delete(report);

    }

    @Transactional
    public void saveReport(Report report) {
        sessionFactory.getCurrentSession().save(report);

    }

    @Transactional
    public void saveOrUpdate(Report report) {
        sessionFactory.getCurrentSession().saveOrUpdate(report);

    }

    @Transactional
    public void editReport(Report report) {
        sessionFactory.getCurrentSession().merge(report);
    }

    @Transactional
    public Report getReport(Long id) {
        List reports = sessionFactory.getCurrentSession().createCriteria(Report.class)
                    .add(Restrictions.eq("id", id)).list();
        Report report = null;
        if ((reports != null) && (reports.size() > 0)) {
        	report = (Report) reports.get(0);
        }
        return report;
    }
}