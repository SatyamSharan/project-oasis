package org.db.mp.dao.impl;

import java.util.List;

import org.db.mp.dao.StatusDAO;
import org.db.mp.model.Status;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class StatusDAOImpl implements StatusDAO{
	private SessionFactory sessionFactory;
	
	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void save(Status status) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(status);
		tx.commit();
		session.close();
	}

	@Override
	public List<Status> list() {
		Session session = this.sessionFactory.openSession();
		Criteria cr = session.createCriteria(Status.class);
		cr.add(Restrictions.eq("type","STATUS"));
		@SuppressWarnings("unchecked")
		List<Status> statusList = cr.list();
		session.close();
		return statusList;
	}

}
