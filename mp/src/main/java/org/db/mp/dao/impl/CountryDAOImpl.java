package org.db.mp.dao.impl;

import java.util.List;

import org.db.mp.dao.CountryDAO;
import org.db.mp.model.Country;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CountryDAOImpl implements CountryDAO{
	private SessionFactory sessionFactory;
	
	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void save(Country country) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(country);
		tx.commit();
		session.close();
	}

	@Override
	public List<Country> list() {
		Session session = this.sessionFactory.openSession();
		Criteria cr = session.createCriteria(Country.class);
		@SuppressWarnings("unchecked")
		List<Country> countryList = cr.list();
		session.close();
		return countryList;
	}
}
