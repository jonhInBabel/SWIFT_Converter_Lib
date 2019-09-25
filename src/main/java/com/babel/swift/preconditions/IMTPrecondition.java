package com.babel.swift.preconditions;

import com.babel.swift.exceptions.MTPreconditionException;
import com.prowidesoftware.swift.model.mt.mt1xx.MT103;


public interface IMTPrecondition {
	
	void apply( MT103 mt103 ) throws MTPreconditionException;
	
}