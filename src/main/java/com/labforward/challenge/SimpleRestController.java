package com.labforward.challenge;

import java.util.List;



import org.json.JSONArray;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.labforward.shardedClasses.Comparison;
import com.labforward.shardedClasses.DefaultComparisonFactory;

/**
 * This controller answers to AJAX-calls so that the HTML-page does not need to be reloaded.
 */

@RestController
@RequestMapping("api/ajax")
public class SimpleRestController {
	
	@RequestMapping(value = "data",
			method = RequestMethod.POST,
			produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
	public String getData(@RequestParam(value="word", required = false) String word, @RequestParam(value = "distance", required = false) String distance) {
		System.out.println("Incoming parameters: " + word + " and " + distance);
		Comparison comparison = null;
		if(distance.equals("1")) {
			comparison = new DefaultComparisonFactory().newComparison(word,distance);
		} else {
			comparison = new DefaultComparisonFactory().newComparison(word);
		}		
		JSONArray jarray = new JSONArray(comparison.compare().listOfResults());
		System.out.println(jarray.toString());
		return jarray.toString();
	}
}
