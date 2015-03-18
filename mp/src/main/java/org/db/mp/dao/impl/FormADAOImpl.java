package org.db.mp.dao.impl;

import java.util.List;

import org.db.mp.dao.FormADAO;
import org.db.mp.model.Form;
import org.db.mp.model.FormA;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class FormADAOImpl implements FormADAO{
	private SessionFactory sessionFactory;
	
	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void save(FormA formA) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(formA);
		tx.commit();
		session.close();
	}
	@Override
	public void update(FormA formA) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(formA);
		tx.commit();
		session.close();
	}
	@Override
	public List<FormA> list() {
		Session session = this.sessionFactory.openSession();
		Criteria cr = session.createCriteria(Form.class);
		@SuppressWarnings("unchecked")
		List<FormA> formList = cr.list();
		session.close();
		return formList;
	}
	@Override
	public List<FormA> get(int formNum) {
		Session session = this.sessionFactory.openSession();
		Criteria cr = session.createCriteria(Form.class);
		cr.add(Restrictions.eq("formNum",formNum));
		@SuppressWarnings("unchecked")
		List<FormA> formList = cr.list();
		session.close();
		return formList;
	}
	

}
