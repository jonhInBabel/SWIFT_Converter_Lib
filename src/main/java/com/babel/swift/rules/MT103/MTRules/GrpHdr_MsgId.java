package com.babel.swift.rules.MT103.MTRules;

import com.babel.swift.exceptions.MTFieldParsingException;
import com.babel.swift.rules.IMTRule;
import com.prowidesoftware.swift.model.field.Field20;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.model.mt.mt1xx.MT103;


public class GrpHdr_MsgId implements IMTRule {

	@Override
	public Object apply( AbstractMT mt ) throws MTFieldParsingException {
		
		MT103 mt103 = (MT103) mt;
		
		Field20 field20 = mt103.getField20();
		String  sField20 = null;
		
		if( field20 != null ) {
			sField20 = field20.getValue();
		}
		
		return sField20;
	}
	
}