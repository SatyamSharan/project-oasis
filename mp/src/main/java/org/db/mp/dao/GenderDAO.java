package org.db.mp.dao;

import java.util.List;

import org.db.mp.model.Gender;
import org.hibernate.SessionFactory;

public interface GenderDAO {
	public void setSessionFactory(SessionFactory sessionFactory);
	public void save(Gender gender);
	public List<Gender> list();
}
