package com.labforward.challenge;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * This controller delivers the starting page when localhost:8080 is called from the browser.
 */


@Controller
public class SimpleViewController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String startPage() {		
		return "index";
	}

}
