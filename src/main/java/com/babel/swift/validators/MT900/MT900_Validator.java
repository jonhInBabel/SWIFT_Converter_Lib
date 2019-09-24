package com.babel.swift.validators.MT900;

import com.babel.swift.exceptions.MTPreconditionException;
import com.babel.swift.validators.AMTValidator;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.model.mt.mt9xx.MT900;

public class MT900_Validator extends AMTValidator {

	public MT900_Validator() {
		super();
	}

	@Override
	public void validate( AbstractMT mt ) throws MTPreconditionException {
		
		MT900 mt900 = (MT900) mt;
		
		// TODO llamar a las reglas de precondicion
		
	}
	
}