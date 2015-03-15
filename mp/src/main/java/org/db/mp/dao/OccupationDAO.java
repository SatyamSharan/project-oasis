package org.db.mp.dao;

import java.util.List;

import org.db.mp.model.Occupation;
import org.hibernate.SessionFactory;

public interface OccupationDAO {
	public void setSessionFactory(SessionFactory sessionFactory);
	public void save(Occupation occupation);
	public List<Occupation> list();
}
