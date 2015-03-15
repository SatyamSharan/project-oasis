/**
 * 
 */
package org.db.mp.controller.api;

import java.util.List;

import org.apache.log4j.Logger;
import org.db.mp.dao.FormDAO;
import org.db.mp.model.Form;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Satyam Sharan <satyam.sharan@hotmail.com>
 *
 */

@RestController
@RequestMapping("/api/form")
public class FormController {
static Logger logger = Logger.getLogger("mp");
	
	@Autowired
	FormDAO formDAO;
	
	@RequestMapping(value="{formNum}", method = RequestMethod.GET)
	public @ResponseBody Form getFormInJSON(@PathVariable String formNum) {
		//FormUtils formUtils = new FormUtils();
		
		List<Form> forms=formDAO.get(Integer.parseInt(formNum));
		logger.info("FormNum: "+formNum);
		return forms.get(0);
	}
}
