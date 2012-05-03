package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import entry.State;

public class StateDaoHibernate implements StateDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<State> getStates() {
        return sessionFactory.getCurrentSession().createCriteria(State.class)
                    .list();
    }

    @Transactional
    public void saveState(State state) {
        sessionFactory.getCurrentSession().saveOrUpdate(state);

    }

    @Transactional
    public void editState(State state) {
        sessionFactory.getCurrentSession().merge(state);
    }

    @Transactional
    public State getState(Long id) {
        List states = sessionFactory.getCurrentSession().createCriteria(State.class)
                    .add(Restrictions.eq("id", id)).list();
        State state = null;
        if ((states != null) && (states.size() > 0)) {
            state = (State) states.get(0);
        }
        return state;
    }
}