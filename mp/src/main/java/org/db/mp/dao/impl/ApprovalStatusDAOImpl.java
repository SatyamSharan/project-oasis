package org.db.mp.dao.impl;

import java.util.List;

import org.db.mp.dao.ApprovalStatusDAO;
import org.db.mp.model.ApprovalStatus;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class ApprovalStatusDAOImpl implements ApprovalStatusDAO {
	private SessionFactory sessionFactory;

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(ApprovalStatus approval) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(approval);
		tx.commit();
		session.close();

	}

	@Override
	public List<ApprovalStatus> list() {
		Session session = this.sessionFactory.openSession();
		Criteria cr = session.createCriteria(ApprovalStatus.class);
		cr.add(Restrictions.eq("type", "APPROVAL_STATUS"));
		@SuppressWarnings("unchecked")
		List<ApprovalStatus> approvalStatusList = cr.list();
		session.close();
		return approvalStatusList;
	}
}
