package com.babel.swift.rules.MT900.MTRules;

import com.prowidesoftware.swift.model.field.Field25;


public class Field25_Rules {

	private static final Integer ACCOUNT_IDENTIFICATION_MAX_NUMBER = 34;
	
	public static String getIBAN( Field25 field25 ) {
		if( field25 != null) {
			if( field25.getValue().length() <= ACCOUNT_IDENTIFICATION_MAX_NUMBER 
//TODO					&& isIBAN( field25.getValue() ) 
					) {
				return field25.getValue();
			}
			
		}
		return null;
	}
	
	public static String getOtherIdentification( Field25 field25 ) {
		if( field25 != null) {
			if( field25.getValue().length() <= ACCOUNT_IDENTIFICATION_MAX_NUMBER 
//TODO					&& !( isIBAN( field25.getValue() ) ) 
					) {
				return field25.getValue();
			}
			
		}
		return null;
	}
	
}