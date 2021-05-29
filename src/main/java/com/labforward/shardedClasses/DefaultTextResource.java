package com.labforward.shardedClasses;

import java.util.List;

public class DefaultTextResource implements TextResource{
	
	private final List<String> listOfWords;
	
	private final String endOfLine;
	
	private int index;
	
	private int length;
	
	
	public DefaultTextResource(List<String> incomingList) {
		this.listOfWords = incomingList;
		this.endOfLine = "*EOL*";
		this.index = 0;
		this.length = this.listOfWords.size();
	}
	
	

	@Override
	public String nextWord() {
		if(this.length == this.index) {
			return this.endOfLine;
		} else {
			this.index++;
			return this.listOfWords.get(index-1);			
		}		
	}

	@Override
	public void reset() {
		this.index = 0;		
	}
}
