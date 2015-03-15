package org.db.mp.dao.impl;

import java.util.List;

import org.db.mp.dao.BranchDAO;
import org.db.mp.model.Branch;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class BranchDAOImpl implements BranchDAO{

	private SessionFactory sessionFactory;
	
	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(Branch branch) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(branch);
		tx.commit();
		session.close();
	}

	@Override
	public List<Branch> list() {
		Session session = this.sessionFactory.openSession();
		Criteria cr = session.createCriteria(Branch.class);
		@SuppressWarnings("unchecked")
		List<Branch> branchList = cr.list();
		session.close();
		return branchList;
	}
}
