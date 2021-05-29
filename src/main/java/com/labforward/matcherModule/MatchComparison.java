package com.labforward.matcherModule;

import java.util.ArrayList;
import java.util.List;

import com.labforward.counterModule.CountComparison;
import com.labforward.shardedClasses.Comparison;
import com.labforward.shardedClasses.DefaultResult;
import com.labforward.shardedClasses.Result;
import com.labforward.shardedClasses.TextResource;
import com.labforward.shardedClasses.WordPredicate;

public class MatchComparison implements Comparison{
	
	private final TextResource resource;
	
	private final WordPredicate predicate;
	
	private Integer distance;
	
	private Result result;

	
	
	public MatchComparison(TextResource incomingResource, WordPredicate incomingPredicate, Integer incomingDistance) {
		this.resource = incomingResource;
		this.predicate = incomingPredicate;
		this.distance = incomingDistance;
	}
	
	private void process() {
		String testedWord = null;
		List<String> list = new ArrayList<>();
		while ((testedWord = this.resource.nextWord()) != "*EOL*") {
			if (this.predicate.test(testedWord,this.distance))
				list.add(testedWord);
		}
		this.result = new DefaultResult(list);
	}
	
	@Override
	public Result compare() {
		this.process();
		return this.result;
	}
}
