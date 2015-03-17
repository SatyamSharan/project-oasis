/**
 * 
 */
package org.db.mp.controller.ui;

import org.apache.log4j.Logger;
import org.db.mp.dao.FormDAO;
import org.db.mp.dao.SiblingDAO;
import org.db.mp.model.Form;
import org.db.mp.model.Sibling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Satyam Sharan <satyam.sharan@hotmail.com>
 *
 */

@Controller
public class EntryController {
	static Logger logger = Logger.getLogger("mp");

	@Autowired
	FormDAO formDAO;
	
	@Autowired
	SiblingDAO siblingDAO;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(ModelMap map) {
		logger.info("Reached in the controller");
		map.put("msg", "Hello Spring 4 Web MVC!");
		Form form=Form.getRandomForm();
		formDAO.save(form);
		for(Sibling sibling:form.getSiblings())sibling.setForm(form);
		siblingDAO.save(form.getSiblings());
		return "index";
	}
}
