package com.babel.swift.preconditions.MT103;

import org.springframework.util.StringUtils;

import com.babel.swift.exceptions.MTPreconditionException;
import com.babel.swift.preconditions.IMTPrecondition;
import com.babel.swift.support.Constants;
import com.prowidesoftware.swift.model.field.Field57C;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.model.mt.mt1xx.MT103;


public class SR4 implements IMTPrecondition {

	@Override
	public void apply( AbstractMT mt ) throws MTPreconditionException {
		
		MT103 mt103 = (MT103) mt;
		
		Field57C field57C 	= mt103.getField57C();
		
		if( !StringUtils.isEmpty( field57C ) ) {
		
			String sFienld57C = field57C.getValue();
			
			if( ( ( !sFienld57C.substring(0, 2).equals("//") ||
					( sFienld57C.substring(0, 4).equals("//RT") && 
					  !sFienld57C.substring(0, 6).equals("//RT//")) ) ||
				  ( sFienld57C.substring(0, 2).equals("//") &&
				  ( sFienld57C.length() < 4 ) ) ) ||
				( sFienld57C.substring(0, 6).equals("//RT//") &&
				  sFienld57C.length() < 10 ) ) {
				
				throw new MTPreconditionException( Constants.SR3);
				
			}
			
		}
		
	}
	
}