package org.db.mp.dao.impl;

import java.util.List;

import org.db.mp.dao.RHFactorDAO;
import org.db.mp.model.RHFactor;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class RHFactorDAOImpl implements RHFactorDAO{
	private SessionFactory sessionFactory;
	
	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void save(RHFactor rhFactor) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(rhFactor);
		tx.commit();
		session.close();
	}

	@Override
	public List<RHFactor> list() {
		Session session = this.sessionFactory.openSession();
		Criteria cr = session.createCriteria(RHFactor.class);
		cr.add(Restrictions.eq("type","RH_FACTOR"));
		@SuppressWarnings("unchecked")
		List<RHFactor> rHFactorList = cr.list();
		session.close();
		return rHFactorList;
	}

}
