package com.babel.swift.rules.MT103.MTRules;

import java.util.List;

import org.springframework.util.StringUtils;

import com.babel.swift.exceptions.MTPreconditionException;
import com.babel.swift.rules.IMTPrecondition;

public class PreconditionFromField57a implements IMTPrecondition {

	@Override
	public void apply(List<Object> mtFields) throws MTPreconditionException {
		
		if( !StringUtils.isEmpty( mtFields.get(0) ) ) {
			//TODO pasar el string del mensaje a la clase Constants
			throw new MTPreconditionException( "Fail ('01006', 'Field 57a must not be used with option B.', 57a Account With Institution)" );
			
		}
		
	}

}