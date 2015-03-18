package org.db.mp.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.db.mp.dao.FormDAO;
import org.db.mp.model.Form;
import org.db.mp.model.Sibling;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class FormDAOImpl implements FormDAO{
	static Logger logger = Logger.getLogger("mp");
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
			session.save(sibling);
		}
		//Form savedForm=(Form)session.get(Form.class, formNum);
		tx.commit();
		session.close();
		return get(formNum);
	}
	@Override
	public Form update(Form form) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		int formNum=form.getFormNum();
		logger.info("Updating Form: "+formNum);
		session.update(form);
		for(Sibling sibling:form.getSiblings()){
			sibling.setForm(form);
			session.update(sibling);
		}
		tx.commit();
		session.close();
		return get(formNum);
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
		session.close();
		return form;
	}
	

}
