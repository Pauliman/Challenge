package com.labforward.shardedClasses;

import java.util.ArrayList;
import java.util.List;

public class DefaultResult implements Result{
	
	private final List<String> listOfResults;
	
	public DefaultResult(List<String> incomingList) {
		this.listOfResults = incomingList;
	}
	
	public DefaultResult(Integer incomingResult) {
		this.listOfResults = new ArrayList<>();
		this.listOfResults.add(String.valueOf(incomingResult));
	}

	@Override
	public List<String> listOfResults() {
		return this.listOfResults;		
	}

}
