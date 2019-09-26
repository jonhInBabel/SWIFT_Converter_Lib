package com.babel.swift.rules.MT900.MTRules;

import org.springframework.util.StringUtils;

import com.babel.swift.exceptions.MTFieldParsingException;
import com.babel.swift.rules.IMTRule;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.model.mt.mt9xx.MT900;


public class AdditionalTransactionInfFromField72 implements IMTRule {

	
	@Override
	public Object apply(AbstractMT mt) throws MTFieldParsingException {
		
		MT900 mt900 = (MT900) mt;
		String narrative= null;
		
		if ( !StringUtils.isEmpty( mt900.getField72() ) ) {
			narrative = mt900.getField72().getNarrative();
		}

		return narrative;
	}
	
}