package org.db.mp.dao;

import java.util.List;

import org.db.mp.model.Form;
import org.hibernate.SessionFactory;

public interface FormDAO {
	public void setSessionFactory(SessionFactory sessionFactory);
	public Form save(Form form);
	public Form update(Form form);
	public List<Form> list();
	public Form get(int formNum);
}
