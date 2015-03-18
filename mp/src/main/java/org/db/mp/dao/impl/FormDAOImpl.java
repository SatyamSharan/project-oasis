package org.db.mp.dao.impl;

import java.util.List;

import org.db.mp.dao.FormDAO;
import org.db.mp.model.Form;
import org.db.mp.model.Sibling;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class FormDAOImpl implements FormDAO{
	private SessionFactory sessionFactory;
	
	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public Form save(Form form) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		int formNum=(int)session.save(form);
		for(Sibling sibling:form.getSiblings()){
			sibling.setForm(form);
			session.persist(sibling);
		}
		//Form savedForm=(Form)session.get(Form.class, formNum);
		tx.commit();
		session.close();
		return get(formNum);
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
	public Form get(int formNum) {
		Session session = this.sessionFactory.openSession();
		Form form=(Form) session.get(Form.class, formNum);
		return form;
	}
	

}
