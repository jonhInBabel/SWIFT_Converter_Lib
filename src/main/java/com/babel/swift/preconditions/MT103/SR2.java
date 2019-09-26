package com.babel.swift.preconditions.MT103;

import java.util.List;

import org.springframework.util.StringUtils;

import com.babel.swift.exceptions.MTPreconditionException;
import com.babel.swift.preconditions.IMTPrecondition;
import com.babel.swift.support.Constants;
import com.prowidesoftware.swift.model.field.Field32A;
import com.prowidesoftware.swift.model.field.Field71F;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.model.mt.mt1xx.MT103;


public class SR2 implements IMTPrecondition {

	@Override
	public void apply( AbstractMT mt ) throws MTPreconditionException {

		MT103 mt103 = (MT103) mt;
		
		Field32A field32A 			= mt103.getField32A();
		List<Field71F> listField71F = mt103.getField71F();
		
		if( !StringUtils.isEmpty( field32A ) ) { // el campo 32A es obligatorio, siempre debería pasar este if
			for( Field71F field71F : listField71F ) {
				if( !( field32A.getCurrency().equals(field71F.getCurrency() ) ) ) {
					
					throw new MTPreconditionException( Constants.SR2 );
					
				}
			}
		}
	}

}