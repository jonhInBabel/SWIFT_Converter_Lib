package com.babel.swift.exceptions;

public class MTParsingException extends Exception {

    private static final long serialVersionUID = 1L;

    public MTParsingException() {
        super( "An exception has happend parsing MT message" );
    }
}
