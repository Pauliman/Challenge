package com.labforward.shardedClasses;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.text.similarity.*;

public class DefaultWordPredicate implements WordPredicate{
	
	
	private final String pattern; 
	
	
	
	public DefaultWordPredicate(String incomingPattern) {
		this.pattern = incomingPattern;
	}

	@Override
	public boolean test(String t) {
		Pattern testPattern = Pattern.compile(this.pattern);
		Matcher matcher = testPattern.matcher(t);		
		return (Boolean) matcher.matches();
	}

	@Override
	public boolean test(String word, Integer distance) {
		LevenshteinDistance levDist = new LevenshteinDistance();
		if(levDist.apply(word, this.pattern) == distance)
			return true;
		else
			return false;
	}

}
