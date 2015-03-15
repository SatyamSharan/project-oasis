package org.db.mp.dao;

import java.util.List;

import org.db.mp.model.ApprovalStatus;
import org.hibernate.SessionFactory;

public interface ApprovalStatusDAO {
	public void setSessionFactory(SessionFactory sessionFactory);
	public void save(ApprovalStatus approval);
	public List<ApprovalStatus> list();
}
