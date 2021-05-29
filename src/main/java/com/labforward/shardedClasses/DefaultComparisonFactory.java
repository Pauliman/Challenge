package com.labforward.shardedClasses;

import com.labforward.counterModule.CountComparison;
import com.labforward.matcherModule.MatchComparison;
import com.labforward.resourceProvider.ResourceProvider;

public class DefaultComparisonFactory implements ComparisonFactory{

	@Override
	public  Comparison newComparison(String pattern) {		
		return new CountComparison(new DefaultTextResource(new ResourceProvider.Fake().getResource()), new DefaultWordPredicate(pattern));
	}

	@Override
	public Comparison newComparison(String pattern, String distance) {		
		return new MatchComparison(new DefaultTextResource(new ResourceProvider.Fake().getResource()), new DefaultWordPredicate(pattern), Integer.parseInt(distance));
	}

}
