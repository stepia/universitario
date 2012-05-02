package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import entry.ReportType;

public class ReportTypeDaoHibernate implements ReportTypeDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<ReportType> getReportTypes() {
        return sessionFactory.getCurrentSession().createCriteria(ReportType.class)
                    .list();
    }

    @Transactional
    public void createReportType(ReportType reporttype) {
        sessionFactory.getCurrentSession().save(reporttype);

    }

    @Transactional
    public void editReportType(ReportType reporttype) {
        sessionFactory.getCurrentSession().merge(reporttype);
    }

    @Transactional
    public ReportType getReportType(Long id) {
        List reporttypes = sessionFactory.getCurrentSession().createCriteria(ReportType.class)
                    .add(Restrictions.eq("id", id)).list();
        ReportType reporttype = null;
        if ((reporttypes != null) && (reporttypes.size() > 0)) {
        	reporttype = (ReportType) reporttypes.get(0);
        }
        return reporttype;
    }
}