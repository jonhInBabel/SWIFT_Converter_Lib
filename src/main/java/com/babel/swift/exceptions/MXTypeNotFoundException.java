package com.babel.swift.exceptions;

public class MXTypeNotFoundException extends Exception {

    private static final long serialVersionUID = 1L;

    public MXTypeNotFoundException( String mtMessageType ) {
        super( "MT type [ " + mtMessageType + " ] not found" );
    }
}
