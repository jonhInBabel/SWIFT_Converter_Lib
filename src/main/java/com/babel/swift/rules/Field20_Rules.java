package com.babel.swift.rules;

import com.prowidesoftware.swift.model.field.Field20;


public class Field20_Rules {

	public static String getField20Value( Field20 field20 ) {
		if( field20 != null) {
			return field20.getValue();
		}
		return null;
	}
	
}