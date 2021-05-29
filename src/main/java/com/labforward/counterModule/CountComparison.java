package com.labforward.counterModule;

import java.util.ArrayList;
import java.util.List;

import com.labforward.shardedClasses.Comparison;
import com.labforward.shardedClasses.DefaultResult;
import com.labforward.shardedClasses.Result;
import com.labforward.shardedClasses.TextResource;
import com.labforward.shardedClasses.WordPredicate;

public class CountComparison implements Comparison {

	protected final TextResource resource;

	protected final WordPredicate predicate;
	
	private Result result;
	
	private int counter;

	public CountComparison(TextResource incomingResource, WordPredicate incomingPredicate) {
		this.predicate = incomingPredicate;
		this.resource = incomingResource;
		this.counter = 0;
	}

	private void process() {
		String testedWord = null;		
		while ((testedWord = this.resource.nextWord()) != "*EOL*") {
			if (this.predicate.test(testedWord))
				this.counter++;
		}
		this.result = new DefaultResult(this.counter);
	}

	@Override
	public Result compare() {
		this.process();
		return this.result;
	}
}
