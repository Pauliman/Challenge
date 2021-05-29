package com.labforward.resourceProvider;

import java.util.ArrayList;
import java.util.List;


/**
 * The object described by this interface is a Dummy, Fake or Mock object, that simulates input from a dynamic source like a database. It presents an interface between two 
 * components and is therefore stored in its own package. In case of an extension the database connection would be abstracted away behind this interface.
 * 
 *
 */
public interface ResourceProvider {
	
	public List<String> getResource();
	
	public static final class Fake implements ResourceProvider{

		@Override
		public List<String> getResource() {
			List<String> resource = new ArrayList<>();
			//resource.add("Word");
			//resource.add("Words");
			//resource.add("Wor");
			//resource.add("word");
			
			// uncomment/comment to get the second list of words
			
			resource.add("Word");
			resource.add("Word");
			resource.add("Word");
			resource.add("word");			
			return resource;
		}		
	}
}
