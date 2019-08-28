package com.babel.swift.rules;

public class InputDestinationAddress_Rules {

	public static String getBICOrBEI( String receiver ) {
		
		String value = null;
		if( receiver != null && receiver.length() >= 10 ) {
//TODO			if( isBIC( receiver.substring(0, 8) + receiver.substring(9) ) || 
//TODO				isBEI( receiver.substring(0, 8) + receiver.substring(9)	) {
				
				value = receiver.substring(0, 8) + receiver.substring(9);
//			}
		}
		
		return value;
		
	}
	
}