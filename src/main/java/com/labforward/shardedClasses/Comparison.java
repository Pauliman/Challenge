package com.labforward.shardedClasses;

/**
 * The object described by this interface executes comparative processes on a list of words. The type of comparison is determined by the WordPredicate-method used.
 * Here the actual logic is brought together.
 */

public interface Comparison {	
	
	Result compare();

}
