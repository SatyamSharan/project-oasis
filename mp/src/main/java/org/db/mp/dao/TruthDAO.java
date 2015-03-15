package org.db.mp.dao;

import java.util.List;

import org.db.mp.model.Truth;
import org.hibernate.SessionFactory;

public interface TruthDAO {
	public void setSessionFactory(SessionFactory sessionFactory);
	public void save(Truth truth);
	public List<Truth> list();
}
