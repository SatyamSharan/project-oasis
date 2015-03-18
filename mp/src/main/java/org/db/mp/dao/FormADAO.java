package org.db.mp.dao;

import java.util.List;

import org.db.mp.model.FormA;
import org.hibernate.SessionFactory;

public interface FormADAO {
	public void setSessionFactory(SessionFactory sessionFactory);
	public void save(FormA formA);
	public void update(FormA formA);
	public List<FormA> list();
	public List<FormA> get(int formNum);
}
