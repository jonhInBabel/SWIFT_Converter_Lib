package com.babel.swift.validators.MT103;

import com.babel.swift.validators.AMTValidator;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.model.mt.mt1xx.MT103;

public class MT103_Validator extends AMTValidator {

	public MT103_Validator() {
		super();
	}

	@Override
	public void validate(AbstractMT mt) {
		
		MT103 mt103 = (MT103) mt;
		
		// TODO llamar a las reglas de precondicion
		
	}
	
}