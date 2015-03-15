package org.db.mp.dao;

import java.util.List;

import org.db.mp.model.Branch;
import org.hibernate.SessionFactory;

public interface BranchDAO {
	public void setSessionFactory(SessionFactory sessionFactory);
	public void save(Branch branch);
	public List<Branch> list();
}
