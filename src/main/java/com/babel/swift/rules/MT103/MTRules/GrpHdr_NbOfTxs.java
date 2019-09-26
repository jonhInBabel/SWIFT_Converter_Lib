package com.babel.swift.rules.MT103.MTRules;

import com.babel.swift.exceptions.MTFieldParsingException;
import com.babel.swift.rules.IMTRule;


public class GrpHdr_NbOfTxs implements IMTRule {

	@Override
	public Object apply( Object mtField ) throws MTFieldParsingException {
		
		String numberOfTransactions = "1";
		
		return numberOfTransactions;
	}
	
}