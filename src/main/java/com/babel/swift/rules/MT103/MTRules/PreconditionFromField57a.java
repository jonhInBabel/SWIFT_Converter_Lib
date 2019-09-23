package com.babel.swift.rules.MT103.MTRules;

import java.util.List;

import org.springframework.util.StringUtils;

import com.babel.swift.exceptions.MTPreconditionException;
import com.babel.swift.rules.IMTPrecondition;
import com.babel.swift.support.Constants;

/*
 * Input: 57a with option B
 */
public class PreconditionFromField57a implements IMTPrecondition {

	@Override
	public void apply(List<Object> mtFields) throws MTPreconditionException {
		
		if( !StringUtils.isEmpty( mtFields.get(0) ) ) {
			
			throw new MTPreconditionException( Constants.FIELD57_PRECONDITION );
			
		}
		
	}

}