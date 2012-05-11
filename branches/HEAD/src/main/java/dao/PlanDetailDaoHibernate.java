package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import entry.PlanDetail;

public class PlanDetailDaoHibernate implements PlanDetailDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<PlanDetail> getPlanDetails() {
        return sessionFactory.getCurrentSession().createCriteria(PlanDetail.class)
                    .list();
    }
    
    @SuppressWarnings("unchecked")
    @Transactional
    public List<PlanDetail> getPlanDetails(String sortBy, boolean sortOrder) {
        if (sortOrder) {
            return sessionFactory.getCurrentSession().createCriteria(PlanDetail.class).addOrder(Order.asc(sortBy)).list();
        } else {
            return sessionFactory.getCurrentSession().createCriteria(PlanDetail.class).addOrder(Order.desc(sortBy)).list();
        }

    }

    @Transactional
    public void deletePlanDetail(PlanDetail planDetail) {
        sessionFactory.getCurrentSession().delete(planDetail);

    }

    @Transactional
    public void savePlanDetail(PlanDetail planDetail) {
        sessionFactory.getCurrentSession().save(planDetail);

    }

    @Transactional
    public void saveOrUpdate(PlanDetail planDetail) {
        sessionFactory.getCurrentSession().saveOrUpdate(planDetail);

    }

    @Transactional
    public void editPlanDetail(PlanDetail planDetail) {
        sessionFactory.getCurrentSession().merge(planDetail);
    }

    @Transactional
    public PlanDetail getPlanDetail(Long id) {
        List planDetails = sessionFactory.getCurrentSession().createCriteria(PlanDetail.class)
                    .add(Restrictions.eq("id", id)).list();
        PlanDetail planDetail = null;
        if ((planDetails != null) && (planDetails.size() > 0)) {
        	planDetail = (PlanDetail) planDetails.get(0);
        }
        return planDetail;
    }
}