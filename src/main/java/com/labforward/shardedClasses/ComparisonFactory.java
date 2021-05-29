package com.labforward.shardedClasses;

import com.labforward.shardedClasses.Comparison.ComparisonFactoryException;

/**
 * The object described by this interface returns one of two implementations of the Comparison interface. Depending on the numner of arguments the appropriate object is returned.
 * 
 */

public interface ComparisonFactory {
	
	 Comparison newComparison(String pattern) throws ComparisonFactoryException;
	
	Comparison newComparison(String pattern, String distance) throws ComparisonFactoryException;

}
