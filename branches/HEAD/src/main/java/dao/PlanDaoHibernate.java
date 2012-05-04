package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import entry.Plan;

public class PlanDaoHibernate implements PlanDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<Plan> getPlans() {
        return sessionFactory.getCurrentSession().createCriteria(Plan.class)
                    .list();
    }
    
    @SuppressWarnings("unchecked")
    @Transactional
    public List<Plan> getPlans(String sortBy, boolean sortOrder) {
        if (sortOrder) {
            return sessionFactory.getCurrentSession().createCriteria(Plan.class).addOrder(Order.asc(sortBy)).list();
        } else {
            return sessionFactory.getCurrentSession().createCriteria(Plan.class).addOrder(Order.desc(sortBy)).list();
        }

    }

    @Transactional
    public void savePlan(Plan plan) {
        sessionFactory.getCurrentSession().saveOrUpdate(plan);

    }

    @Transactional
    public void editPlan(Plan plan) {
        sessionFactory.getCurrentSession().merge(plan);
    }

    @Transactional
    public Plan getPlan(Long id) {
        List plans = sessionFactory.getCurrentSession().createCriteria(Plan.class)
                    .add(Restrictions.eq("id", id)).list();
        Plan plan = null;
        if ((plans != null) && (plans.size() > 0)) {
        	plan = (Plan) plans.get(0);
        }
        return plan;
    }
}