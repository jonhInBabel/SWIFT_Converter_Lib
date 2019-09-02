package com.babel.swift.rules.MT900.MTRules;

public class LogicalTerminalAddress_Rules {
		
	public static String getBIC( String logicalTerminalAddress ) {
		
		String value = null;
		if( logicalTerminalAddress != null && logicalTerminalAddress.length() >= 10 ) {
//TODO			if( isBIC( logicalTerminalAddress.substring(0, 8) + logicalTerminalAddress.substring(9) ) ) {
				value = logicalTerminalAddress.substring(0, 8) + logicalTerminalAddress.substring(9);
//			}
		}
		
		return value;
		
	}
	
}