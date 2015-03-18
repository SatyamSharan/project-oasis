/**
 * 
 */
package org.db.mp.controller.api;


import org.apache.log4j.Logger;
import org.db.mp.dao.FormDAO;
import org.db.mp.json.FormAJSON;
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
@RequestMapping("/api/forma")
public class FormAController {
static Logger logger = Logger.getLogger("mp");
	
	@Autowired
	FormDAO formDAO;
	
	@RequestMapping(value="{formNum}", method = RequestMethod.GET)
	public @ResponseBody FormAJSON getFormA(@PathVariable int formNum) {
		Form form=formDAO.get(formNum);
		logger.info("FormNum: "+formNum);
		FormAJSON formAJSON = new FormAJSON(form);
		return formAJSON;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody FormAJSON saveFormA(@RequestBody FormAJSON formAJSON) {
		logger.info("JSON received for saving ");
		Form form=new Form(formAJSON);
		form=formDAO.save(form);
		FormAJSON updatedFormAJSON=new FormAJSON(form);
		return updatedFormAJSON;
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public @ResponseBody FormAJSON updateFormA(@RequestBody FormAJSON formAJSON) {
		logger.info("JSON received for saving ");
		Form form=new Form(formAJSON);
		form=formDAO.update(form);
		FormAJSON updatedFormAJSON=new FormAJSON(form);
		return updatedFormAJSON;
	}
}
