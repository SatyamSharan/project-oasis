package org.db.mp.dao.impl;

import java.util.List;

import org.db.mp.dao.SiblingDAO;
import org.db.mp.model.Sibling;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class SiblingDAOImpl implements SiblingDAO{
	private SessionFactory sessionFactory;
	
	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void save(Sibling sibling) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(sibling);
		tx.commit();
		session.close();
	}

	@Override
	public List<Sibling> list() {
		Session session = this.sessionFactory.openSession();
		Criteria cr = session.createCriteria(Sibling.class);
		@SuppressWarnings("unchecked")
		List<Sibling> siblingList = cr.list();
		session.close();
		return siblingList;
	}
	@Override
	public void save(List<Sibling> siblings) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		for(Sibling sibling:siblings)session.persist(sibling);
		tx.commit();
		session.close();
	}

}
