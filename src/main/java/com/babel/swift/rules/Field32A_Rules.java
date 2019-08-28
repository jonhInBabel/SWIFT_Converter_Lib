package com.babel.swift.rules;

import java.math.BigDecimal;
import java.text.ParseException;

import com.babel.swift.support.Utils;
import com.prowidesoftware.swift.model.field.Field32A;


public class Field32A_Rules {

	public static String getDate( Field32A field32A ) throws ParseException {
		if( field32A != null) {
			return Utils.dateSimpleFormat( field32A.getDate() );
		}
		return null;
	}
	
	public static String getCurrency( Field32A field32A ) {
		if( field32A != null) {
			return field32A.getCurrency();
		}
		return null;
	}
	
	public static BigDecimal getAmount( Field32A field32A ) {
		if( field32A != null) {
			return field32A.getAmountBigDecimal();
		}
		return null;
	}
	
}