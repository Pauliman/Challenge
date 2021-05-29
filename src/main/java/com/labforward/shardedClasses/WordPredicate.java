package com.labforward.shardedClasses;

import java.util.function.Predicate;

/**
 * The object described by this interface offers the typical test()-method to the called and returns TRUE if a match was found. In addition the test()-method is overloaded 
 * to pass the distance parameter for the LevenshteinDistance algorithm. This way the same object can be used to test more than one situation.
 *
 */

public interface WordPredicate extends Predicate<String> {
	
	boolean test(String word, Integer distance);

}
