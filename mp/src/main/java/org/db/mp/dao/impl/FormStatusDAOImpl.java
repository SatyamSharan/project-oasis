package org.db.mp.dao.impl;

import java.util.List;

import org.db.mp.dao.FormStatusDAO;
import org.db.mp.model.FormStatus;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class FormStatusDAOImpl implements FormStatusDAO{
	private SessionFactory sessionFactory;
	
	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void save(FormStatus status) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(status);
		tx.commit();
		session.close();
	}

	@Override
	public List<FormStatus> list() {
		Session session = this.sessionFactory.openSession();
		Criteria cr = session.createCriteria(FormStatus.class);
		@SuppressWarnings("unchecked")
		List<FormStatus> statusList = cr.list();
		session.close();
		return statusList;
	}

}
