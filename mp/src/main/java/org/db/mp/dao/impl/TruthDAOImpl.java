package org.db.mp.dao.impl;

import java.util.List;

import org.db.mp.dao.TruthDAO;
import org.db.mp.model.Truth;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TruthDAOImpl implements TruthDAO{
	private SessionFactory sessionFactory;
	
	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void save(Truth truth) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(truth);
		tx.commit();
		session.close();
	}

	@Override
	public List<Truth> list() {
		Session session = this.sessionFactory.openSession();
		Criteria cr = session.createCriteria(Truth.class);
		@SuppressWarnings("unchecked")
		List<Truth> truthList = cr.list();
		session.close();
		return truthList;
	}

}
