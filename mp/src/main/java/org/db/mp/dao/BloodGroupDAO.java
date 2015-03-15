package org.db.mp.dao;

import java.util.List;

import org.db.mp.model.BloodGroup;
import org.hibernate.SessionFactory;

public interface BloodGroupDAO {
	public void setSessionFactory(SessionFactory sessionFactory);
	public void save(BloodGroup bloodGroup);
	public List<BloodGroup> list();
}
