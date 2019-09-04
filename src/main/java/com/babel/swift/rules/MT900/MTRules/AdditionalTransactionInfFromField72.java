package com.babel.swift.rules.MT900.MTRules;

import com.babel.swift.exceptions.MTFieldParsingException;
import com.babel.swift.rules.IMTRule;
import com.prowidesoftware.swift.model.field.Field72;
import org.springframework.util.StringUtils;


public class AdditionalTransactionInfFromField72 implements IMTRule {

	/*
	public static String getField20Value( Field72 field72 ) {
		if( field72 != null) {
			return field72.getNarrative();
		}
		return null;
	}
	*/

	@Override
	public Object apply(Object mtField) throws MTFieldParsingException {
		
		String narrative= null;
		
		if ( !StringUtils.isEmpty( mtField ) ) {
			Field72 field72 = (Field72) mtField;
			narrative= field72.getNarrative();
		}

		return narrative;
	}
	
}