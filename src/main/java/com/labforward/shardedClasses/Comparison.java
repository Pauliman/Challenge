package com.labforward.shardedClasses;

/**
 * The object described by this interface executes comparative processes on a list of words. The type of comparison is determined by the WordPredicate-method used.
 * Here the actual logic is brought together.
 */

public interface Comparison {	
	
	Result compare();
	
	public static final class ComparisonFactoryException extends Exception{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public ComparisonFactoryException(String message, Throwable cause) {
			super(message, cause);
			
		}

		public ComparisonFactoryException(String message) {
			super(message);
			
		}
		
		
	}

}
