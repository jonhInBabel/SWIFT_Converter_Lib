package com.babel.swift.rules.MT103.MTRules;

import com.babel.swift.exceptions.MTFieldParsingException;
import com.babel.swift.rules.IMTRule;
import com.prowidesoftware.swift.model.field.Field20;


public class GrpHdr_MsgId implements IMTRule {

	@Override
	public Object apply( Object mtField ) throws MTFieldParsingException {
		
		Field20 field20 = (Field20) mtField;
		String  sField20 = null;
		
		if( field20 != null ) {
			sField20 = field20.getValue();
		}
		
		return sField20;
	}
	
}