package org.db.mp.dao;

import java.util.List;

import org.db.mp.model.Form;
import org.hibernate.SessionFactory;

public interface FormDAO {
	public void setSessionFactory(SessionFactory sessionFactory);
	public void save(Form form);
	public void update(Form form);
	public List<Form> list();
	public List<Form> get(int formNum);
}
