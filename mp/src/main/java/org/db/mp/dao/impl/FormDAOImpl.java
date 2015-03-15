package org.db.mp.dao.impl;

import java.util.List;

import org.db.mp.dao.FormDAO;
import org.db.mp.model.Form;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class FormDAOImpl implements FormDAO{
	private SessionFactory sessionFactory;
	
	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void save(Form form) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(form);
		tx.commit();
		session.close();
	}
	@Override
	public void update(Form form) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(form);
		tx.commit();
		session.close();
	}
	@Override
	public List<Form> list() {
		Session session = this.sessionFactory.openSession();
		Criteria cr = session.createCriteria(Form.class);
		@SuppressWarnings("unchecked")
		List<Form> formList = cr.list();
		session.close();
		return formList;
	}
	@Override
	public List<Form> get(int formNum) {
		Session session = this.sessionFactory.openSession();
		Criteria cr = session.createCriteria(Form.class);
		cr.add(Restrictions.eq("formNum",formNum));
		@SuppressWarnings("unchecked")
		List<Form> formList = cr.list();
		session.close();
		return formList;
	}
	

}
