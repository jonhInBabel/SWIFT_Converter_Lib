package com.babel.swift.rules.MT900.MTRules;

import com.babel.swift.exceptions.MTFieldParsingException;
import com.babel.swift.rules.IMTRule;
import com.prowidesoftware.swift.model.field.Field52D;
import org.springframework.util.StringUtils;

public class NameFromField52D implements IMTRule {

	/*
	public static List<String> getField20Value( Field52D field52D ) {
		List<String> nameAndAddress_lines = new ArrayList<String>();
		if(field52D != null) {
			nameAndAddress_lines.add(field52D.getNameAndAddressLine1());
			nameAndAddress_lines.add(field52D.getNameAndAddressLine2());
			nameAndAddress_lines.add(field52D.getNameAndAddressLine3());
			nameAndAddress_lines.add(field52D.getNameAndAddressLine4());
		}

		return nameAndAddress_lines;
	}
	*/

	@Override
	public Object apply(Object mtField) throws MTFieldParsingException {
		Field52D field52D = (Field52D) mtField;

		String name = null;
		if( !StringUtils.isEmpty( field52D.getName() ) ) {
			name = field52D.getName();
		}

		return name;
	}
	
}