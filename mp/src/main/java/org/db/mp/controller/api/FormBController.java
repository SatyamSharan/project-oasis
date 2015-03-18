/**
 * 
 */
package org.db.mp.controller.api;


import org.apache.log4j.Logger;
import org.db.mp.dao.FormDAO;
import org.db.mp.json.FormBJSON;
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
@RequestMapping("/api/formb")
public class FormBController {
static Logger logger = Logger.getLogger("mp");
	
	@Autowired
	FormDAO formDAO;
	
	@RequestMapping(value="{formNum}", method = RequestMethod.GET)
	public @ResponseBody FormBJSON getFormB(@PathVariable int formNum) {
		Form form=formDAO.get(formNum);
		logger.info("FormNum: "+formNum);
		FormBJSON formBJSON = new FormBJSON(form);
		return formBJSON;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody FormBJSON saveFormB(@RequestBody FormBJSON formBJSON) {
		logger.info("JSON received for saving ");
		Form form=new Form(formBJSON);
		form=formDAO.update(form);
		FormBJSON updatedFormBJSON=new FormBJSON(form);
		return updatedFormBJSON;
	}
}
