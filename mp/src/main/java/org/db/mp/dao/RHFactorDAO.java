package org.db.mp.dao;

import java.util.List;

import org.db.mp.model.RHFactor;
import org.hibernate.SessionFactory;

public interface RHFactorDAO {
	public void setSessionFactory(SessionFactory sessionFactory);
	public void save(RHFactor rhFactor);
	public List<RHFactor> list();
}
