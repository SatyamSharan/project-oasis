package org.db.mp.dao.impl;

import java.util.List;

import org.db.mp.dao.OccupationDAO;
import org.db.mp.model.Occupation;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class OccupationDAOImpl implements OccupationDAO{
	private SessionFactory sessionFactory;
	
	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void save(Occupation occupation) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(occupation);
		tx.commit();
		session.close();
	}

	@Override
	public List<Occupation> list() {
		Session session = this.sessionFactory.openSession();
		Criteria cr = session.createCriteria(Occupation.class);
		cr.add(Restrictions.eq("type","OCCUPATION"));
		@SuppressWarnings("unchecked")
		List<Occupation> occupationList = cr.list();
		session.close();
		return occupationList;
	}

}
