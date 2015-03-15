package org.db.mp.dao;

import java.util.List;

import org.db.mp.model.Country;
import org.hibernate.SessionFactory;

public interface CountryDAO {
	public void setSessionFactory(SessionFactory sessionFactory);
	public void save(Country country);
	public List<Country> list();
}
