/**
 * 
 */
package org.db.mp.controller.api;

import org.apache.log4j.Logger;
import org.db.mp.dao.FormDAO;
import org.db.mp.json.CandidateSecretaryJSON;
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
@RequestMapping("/api/candidatesecretary")
public class CandidateSecretaryController {
	static Logger logger = Logger.getLogger("mp");

	@Autowired
	FormDAO formDAO;

	@RequestMapping(value = "{formNum}", method = RequestMethod.GET)
	public @ResponseBody CandidateSecretaryJSON getCandidateSecretaryData(@PathVariable int formNum) {
		Form form = formDAO.get(formNum);
		logger.info("FormNum: " + formNum);
		CandidateSecretaryJSON candidateSecretaryJSON = new CandidateSecretaryJSON(form);
		return candidateSecretaryJSON;
	}

	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody CandidateSecretaryJSON saveCandidateSecretaryData(@RequestBody CandidateSecretaryJSON candidateSecretaryJSON) {
		logger.info("JSON received for saving ");
		int formNum = candidateSecretaryJSON.getFormAJSON().getFormNum();
		Form form = formDAO.get(formNum);
		logger.info("Fresh record: "+form);
		Form updatedForm = candidateSecretaryJSON.updateForm(form);
		logger.info("Updated record: "+updatedForm);
		Form savedUpdatedForm = formDAO.update(updatedForm);
		logger.info("Updated & Saved record: "+savedUpdatedForm);
		CandidateSecretaryJSON updatedCandidateSecretaryJSON = new CandidateSecretaryJSON(savedUpdatedForm);
		return updatedCandidateSecretaryJSON;
	}

}
