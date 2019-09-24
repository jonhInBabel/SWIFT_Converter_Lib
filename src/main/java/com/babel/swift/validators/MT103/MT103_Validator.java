package com.babel.swift.validators.MT103;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.babel.swift.exceptions.MTPreconditionException;
import com.babel.swift.preconditions.MT103.SR2;
import com.babel.swift.preconditions.MT103.SR7;
import com.babel.swift.validators.AMTValidator;
import com.prowidesoftware.swift.model.field.Field71F;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.model.mt.mt1xx.MT103;

public class MT103_Validator extends AMTValidator {

	public MT103_Validator() {
		super();
	}

	@Override
	public void validate(AbstractMT mt) throws MTPreconditionException {
		
		MT103 mt103 = (MT103) mt;
		
		checkSR1( mt103 );
		checkSR2( mt103 );
		checkSR3( mt103 );
		checkSR4( mt103 );
		checkSR5( mt103 );
		checkSR6( mt103 );
		checkSR7( mt103 );
		checkSR8( mt103 );
		
	}
	
	private void checkSR1( MT103 mt103 ) throws MTPreconditionException {
		
	}
	
	private void checkSR2( MT103 mt103 ) throws MTPreconditionException {
		List<Object> params 	= new ArrayList<Object>();
		SR2 sr2From71FAnd32A 	= new SR2();
		params.add( mt103.getField32A() ); //32A is mandatory
		if( !StringUtils.isEmpty( mt103.getField71F() ) ) { // 71F is optional
			for( Field71F f : mt103.getField71F() ) {
				params.add( f );
			}
		}
		sr2From71FAnd32A.apply( params );
	}
	
	private void checkSR3( MT103 mt103 ) throws MTPreconditionException {
		
	}

	private void checkSR4( MT103 mt103 ) throws MTPreconditionException {
	
	}

	private void checkSR5( MT103 mt103 ) throws MTPreconditionException {
		
	}

	private void checkSR6( MT103 mt103 ) throws MTPreconditionException {
		
	}
	
	private void checkSR7( MT103 mt103 ) throws MTPreconditionException {
		List<Object> params = new ArrayList<Object>();
		SR7 sr7 			= new SR7();
		if( ! StringUtils.isEmpty( mt103.getField57B() ) ) { // 57B is optional
			params.add( mt103.getField57B() );
		}
		sr7.apply( params );
	}
	
	private void checkSR8( MT103 mt103 ) throws MTPreconditionException {

	}
	
}