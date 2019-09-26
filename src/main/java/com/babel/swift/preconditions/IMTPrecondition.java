package com.babel.swift.preconditions;

import com.babel.swift.exceptions.MTPreconditionException;
import com.prowidesoftware.swift.model.mt.AbstractMT;


public interface IMTPrecondition {
	
	void apply( AbstractMT mt ) throws MTPreconditionException;
	
}