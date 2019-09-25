package com.babel.swift.validators.MT103;

import com.babel.swift.exceptions.MTPreconditionException;
import com.babel.swift.preconditions.MT103.SR1;
import com.babel.swift.preconditions.MT103.SR2;
import com.babel.swift.preconditions.MT103.SR3;
import com.babel.swift.preconditions.MT103.SR4;
import com.babel.swift.preconditions.MT103.SR5;
import com.babel.swift.preconditions.MT103.SR6;
import com.babel.swift.preconditions.MT103.SR7;
import com.babel.swift.preconditions.MT103.SR8;
import com.babel.swift.validators.AMTValidator;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.model.mt.mt1xx.MT103;


public class MT103_Validator extends AMTValidator {

	public MT103_Validator() {
		super();
	}

	@Override
	public void validate( AbstractMT mt ) throws MTPreconditionException {
		
		MT103 mt103 = ( MT103 ) mt;
		
		SR1 sr1 = new SR1();
		sr1.apply( mt103 );
		
		SR2 sr2 = new SR2();
		sr2.apply( mt103 );
		
		SR3 sr3 = new SR3();
		sr3.apply( mt103 );
		
		SR4 sr4 = new SR4();
		sr4.apply( mt103 );
		
		SR5 sr5 = new SR5();
		sr5.apply( mt103 );
		
		SR6 sr6 = new SR6();
		sr6.apply( mt103 );
		
		SR7 sr7 = new SR7();
		sr7.apply( mt103 );
		
		SR8 sr8 = new SR8();
		sr8.apply( mt103 );
		
	}
	
}