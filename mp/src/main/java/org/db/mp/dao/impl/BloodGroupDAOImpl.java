package org.db.mp.dao.impl;

import java.util.List;

import org.db.mp.dao.BloodGroupDAO;
import org.db.mp.model.BloodGroup;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class BloodGroupDAOImpl implements BloodGroupDAO{
	private SessionFactory sessionFactory;
	
	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void save(BloodGroup bloodGroup) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(bloodGroup);
		tx.commit();
		session.close();
	}

	@Override
	public List<BloodGroup> list() {
		Session session = this.sessionFactory.openSession();
		Criteria cr = session.createCriteria(BloodGroup.class);
		cr.add(Restrictions.eq("type","BLOOD_GROUP"));
		@SuppressWarnings("unchecked")
		List<BloodGroup> bloodGroupList = cr.list();
		session.close();
		return bloodGroupList;
	}

}
