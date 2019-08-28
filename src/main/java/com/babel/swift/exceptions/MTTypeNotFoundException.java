package com.babel.swift.exceptions;

public class MTTypeNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public MTTypeNotFoundException( String mtMessageType ) {
		super( "MT type [ " + mtMessageType + " ] not found" );
	}
	
}