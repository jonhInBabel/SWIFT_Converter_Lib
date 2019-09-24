package com.babel.swift.validators;

import com.babel.swift.exceptions.MTPreconditionException;
import com.prowidesoftware.swift.model.mt.AbstractMT;

public abstract class AMTValidator {

	public abstract void validate( AbstractMT mt ) throws MTPreconditionException;
	
}