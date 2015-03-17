package org.db.mp.dao.impl;

import java.util.List;

import org.db.mp.dao.GenderDAO;
import org.db.mp.model.Gender;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class GenderDAOImpl implements GenderDAO{
	private SessionFactory sessionFactory;
	
	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void save(Gender gender) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(gender);
		tx.commit();
		session.close();
	}

	@Override
	public List<Gender> list() {
		Session session = this.sessionFactory.openSession();
		Criteria cr = session.createCriteria(Gender.class);
		@SuppressWarnings("unchecked")
		List<Gender> genderList = cr.list();
		session.close();
		return genderList;
	}

}
