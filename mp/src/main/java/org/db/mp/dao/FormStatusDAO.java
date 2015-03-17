package org.db.mp.dao;

import java.util.List;

import org.db.mp.model.FormStatus;
import org.hibernate.SessionFactory;

public interface FormStatusDAO {
	public void setSessionFactory(SessionFactory sessionFactory);
	public void save(FormStatus status);
	public List<FormStatus> list();
}
