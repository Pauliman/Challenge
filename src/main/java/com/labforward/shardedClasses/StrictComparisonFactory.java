package com.labforward.shardedClasses;

import com.labforward.shardedClasses.Comparison.ComparisonFactoryException;

public class StrictComparisonFactory implements ComparisonFactory{
	
	private final ComparisonFactory localFactory;
	
	public StrictComparisonFactory(ComparisonFactory incomingFactory) {
		this.localFactory = incomingFactory;
	}

	@Override
	public Comparison newComparison(String pattern) throws ComparisonFactoryException {
		if(pattern == null) {
			throw new ComparisonFactoryException("The parameter was null.");
		} else {
			return this.localFactory.newComparison(pattern);
		}		
	}

	@Override
	public Comparison newComparison(String pattern, String distance) throws ComparisonFactoryException{
		if(pattern == null || distance == null ) {
			throw new ComparisonFactoryException("One of two parameters was null.");
		}else {
			return this.localFactory.newComparison(pattern,distance);
		}		
	}
}
