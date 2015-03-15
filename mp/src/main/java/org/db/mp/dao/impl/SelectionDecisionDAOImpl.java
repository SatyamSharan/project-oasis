package org.db.mp.dao.impl;

import java.util.List;

import org.db.mp.dao.SelectionDecisionDAO;
import org.db.mp.model.SelectionDecision;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class SelectionDecisionDAOImpl implements SelectionDecisionDAO{
	private SessionFactory sessionFactory;
	
	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void save(SelectionDecision selectionDecision) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(selectionDecision);
		tx.commit();
		session.close();
	}

	@Override
	public List<SelectionDecision> list() {
		Session session = this.sessionFactory.openSession();
		Criteria cr = session.createCriteria(SelectionDecision.class);
		cr.add(Restrictions.eq("type","SELECTION_DECISION"));
		@SuppressWarnings("unchecked")
		List<SelectionDecision> selectionDecisionList = cr.list();
		session.close();
		return selectionDecisionList;
	}

}
