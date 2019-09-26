package com.babel.swift.rules.MT900.MTRules;

import com.babel.swift.exceptions.MTFieldParsingException;
import com.babel.swift.rules.IMTRule;
import com.prowidesoftware.swift.model.field.Field52D;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.model.mt.mt9xx.MT900;

import org.springframework.util.StringUtils;

public class NameFromField52D implements IMTRule {

	
	@Override
	public Object apply(AbstractMT mt) throws MTFieldParsingException {
		
		MT900 mt900 = (MT900) mt;
		String name = null;
		
		if( !StringUtils.isEmpty( mt900.getField52D() ) ) {
			name = mt900.getField52D().getNameAndAddressLine1();
		}

		return name;
	}
	
}