package com.babel.swift.rules.MT900.MTRules;

import com.babel.swift.exceptions.MTFieldParsingException;
import com.babel.swift.rules.IMTRule;
import com.prowidesoftware.swift.model.field.Field52D;
import org.springframework.util.StringUtils;

public class NameFromField52D implements IMTRule {

	
	@Override
	public Object apply(Object mtField) throws MTFieldParsingException {
		

		String name = null;
		if( !StringUtils.isEmpty( mtField ) ) {
			Field52D field52D = (Field52D) mtField;
			name = field52D.getNameAndAddressLine1();
		}

		return name;
	}
	
}