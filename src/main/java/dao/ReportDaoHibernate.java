package dao;

import java.util.List;

import org.hibernate.SessionFactory;
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

    @Transactional
    public void createReport(Report report) {
        sessionFactory.getCurrentSession().save(report);

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