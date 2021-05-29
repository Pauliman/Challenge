package com.labforward.shardedClasses;

/**
 * The object described by this interface returns one of two implementations of the Comparison interface. Depending on the numner of arguments the appropriate object is returned.
 * 
 */

public interface ComparisonFactory {
	
	 Comparison newComparison(String pattern);
	
	Comparison newComparison(String pattern, String distance);

}
