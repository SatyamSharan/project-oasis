package org.db.mp.dao;

import java.util.List;

import org.db.mp.model.SelectionDecision;
import org.hibernate.SessionFactory;

public interface SelectionDecisionDAO {
	public void setSessionFactory(SessionFactory sessionFactory);
	public void save(SelectionDecision selectionDecision);
	public List<SelectionDecision> list();
}
