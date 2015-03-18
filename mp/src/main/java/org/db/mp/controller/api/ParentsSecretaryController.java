/**
 * 
 */
package org.db.mp.controller.api;

import org.apache.log4j.Logger;
import org.db.mp.dao.FormDAO;
import org.db.mp.json.ParentsSecretaryJSON;
import org.db.mp.model.Form;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Satyam Sharan <satyam.sharan@hotmail.com>
 *
 */

@RestController
@RequestMapping("/api/parentsecretary")
public class ParentsSecretaryController {
	static Logger logger = Logger.getLogger("mp");

	@Autowired
	FormDAO formDAO;

	@RequestMapping(value = "{formNum}", method = RequestMethod.GET)
	public @ResponseBody ParentsSecretaryJSON getParentsSecretaryData(@PathVariable int formNum) {
		Form form = formDAO.get(formNum);
		logger.info("FormNum: " + formNum);
		ParentsSecretaryJSON parentsSecretaryJSON = new ParentsSecretaryJSON(form);
		return parentsSecretaryJSON;
	}

	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody ParentsSecretaryJSON saveParentsSecretaryData(@RequestBody ParentsSecretaryJSON parentsSecretaryJSON) {
		logger.info("JSON received for saving ");
		int formNum = parentsSecretaryJSON.getFormAJSON().getFormNum();
		Form form = formDAO.get(formNum);
		Form updatedForm = parentsSecretaryJSON.updateForm(form);
		Form savedUpdatedForm = formDAO.update(updatedForm);
		ParentsSecretaryJSON updatedParentsSecretaryJSON = new ParentsSecretaryJSON(savedUpdatedForm);
		return updatedParentsSecretaryJSON;
	}
}
