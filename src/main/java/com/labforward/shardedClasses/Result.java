package com.labforward.shardedClasses;

/**
 * The object described by this interface offers a container for all results in the shape of a list and can accommodate Strings and Integers, 
 * though the result will always be a list of Strings.
 */
import java.util.List;

public interface Result {
	
	public List<String> listOfResults();

}
