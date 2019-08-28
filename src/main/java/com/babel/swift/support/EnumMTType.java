package com.babel.swift.support;

public enum EnumMTType {

	MT( "" ),
	
	MT103( "103" ),
	MT202( "202" ),
	MT900( "900" ),
	MT910( "910" ),
	MT940( "940" )
	;
	
	private final String type;
	
	EnumMTType( final String type ) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
	
	public static EnumMTType fromString( String type ) {
        for ( EnumMTType mt : EnumMTType.values() ) {
            if (mt.type.equalsIgnoreCase( type )) {
                return mt;
            }
        }
        return MT;
    }
	
}