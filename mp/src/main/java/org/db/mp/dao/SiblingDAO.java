package org.db.mp.dao;

import java.util.List;

import org.db.mp.model.Sibling;
import org.hibernate.SessionFactory;

public interface SiblingDAO {
	public void setSessionFactory(SessionFactory sessionFactory);
	public void save(Sibling sibling);
	public List<Sibling> list();
	public void save(List<Sibling> siblings);
}
