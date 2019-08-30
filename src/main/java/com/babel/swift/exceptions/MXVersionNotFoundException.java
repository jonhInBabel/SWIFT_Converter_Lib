package com.babel.swift.exceptions;

public class MXVersionNotFoundException extends MTConversionException {

	private static final long serialVersionUID = 1L;
	
	public MXVersionNotFoundException( String mxVersion ) {
		super( "MX version [ " + mxVersion + " ] not found" );
	}
	
}