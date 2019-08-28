package com.babel.swift.rules;

import java.util.ArrayList;
import java.util.List;

import com.prowidesoftware.swift.model.field.Field52D;


public class Field52D_Rules {

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
	
}