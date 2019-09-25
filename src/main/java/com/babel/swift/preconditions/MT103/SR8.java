package com.babel.swift.preconditions.MT103;

import org.springframework.util.StringUtils;

import com.babel.swift.exceptions.MTPreconditionException;
import com.babel.swift.preconditions.IMTPrecondition;
import com.babel.swift.support.Constants;
import com.prowidesoftware.swift.model.field.Field53B;
import com.prowidesoftware.swift.model.field.Field54A;
import com.prowidesoftware.swift.model.field.Field54B;
import com.prowidesoftware.swift.model.field.Field54D;
import com.prowidesoftware.swift.model.mt.mt1xx.MT103;


public class SR8 implements IMTPrecondition {
    
    @Override
    public void apply( MT103 mt103) throws MTPreconditionException {
    	
    	Field53B field53B = mt103.getField53B();
    	Field54A field54A = mt103.getField54A();
    	Field54B field54B = mt103.getField54B();
    	Field54D field54D = mt103.getField54D();
		
		if( !StringUtils.isEmpty( field53B ) && 
			( !StringUtils.isEmpty( field54A ) ||
			  !StringUtils.isEmpty( field54B ) ||
			  !StringUtils.isEmpty( field54D ) ) ) {
			
            throw new MTPreconditionException( Constants.SR8);
            
		}
            
    }
    
}