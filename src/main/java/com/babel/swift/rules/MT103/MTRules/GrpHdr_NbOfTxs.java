package com.babel.swift.rules.MT103.MTRules;

import com.babel.swift.exceptions.MTFieldParsingException;
import com.babel.swift.rules.IMTRule;
import com.prowidesoftware.swift.model.mt.AbstractMT;


public class GrpHdr_NbOfTxs implements IMTRule {

	@Override
	public Object apply( AbstractMT mt ) throws MTFieldParsingException {
		
		String numberOfTransactions = "1";
		
		return numberOfTransactions;
	}
	
}