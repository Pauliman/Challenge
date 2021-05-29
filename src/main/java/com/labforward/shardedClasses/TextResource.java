package com.labforward.shardedClasses;

/**
 * The object described by this interface offers a simple iteration method over a list of Strings with an end indicator. This way any text could be filled in via the a ResourceProvider.
 */
public interface TextResource {
	
	String nextWord();
	
	void reset();

}
