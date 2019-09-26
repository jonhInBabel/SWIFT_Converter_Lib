package com.babel.swift.preconditions.MT103;

import org.springframework.util.StringUtils;

import com.babel.swift.exceptions.MTPreconditionException;
import com.babel.swift.preconditions.IMTPrecondition;
import com.babel.swift.support.Constants;
import com.prowidesoftware.swift.model.field.Field57B;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.model.mt.mt1xx.MT103;

/*
 * Input: 57a with option B
 */
public class SR7 implements IMTPrecondition {

	@Override
	public void apply( AbstractMT mt ) throws MTPreconditionException {
		
		MT103 mt103 = (MT103) mt;
		
		Field57B field57B = mt103.getField57B();
		
		if( !StringUtils.isEmpty( field57B ) ) {
			
			throw new MTPreconditionException( Constants.SR7 );
			
		}
		
	}

}