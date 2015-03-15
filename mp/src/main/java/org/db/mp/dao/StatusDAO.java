package org.db.mp.dao;

import java.util.List;

import org.db.mp.model.Status;
import org.hibernate.SessionFactory;

public interface StatusDAO {
	public void setSessionFactory(SessionFactory sessionFactory);
	public void save(Status status);
	public List<Status> list();
}
