package com.babel.swift.preconditions.MT103;

import org.springframework.util.StringUtils;

import com.babel.swift.exceptions.MTPreconditionException;
import com.babel.swift.preconditions.IMTPrecondition;
import com.babel.swift.support.Constants;
import com.prowidesoftware.swift.model.field.Field53B;
import com.prowidesoftware.swift.model.mt.mt1xx.MT103;


public class SR1 implements IMTPrecondition {
    
    @Override
    public void apply( MT103 mt103 ) throws MTPreconditionException {
    	
    	Field53B field53B = mt103.getField53B();
    	
        if( !StringUtils.isEmpty( field53B ) ) {
            if ( !StringUtils.isEmpty( field53B.getLocation() ) && 
            	StringUtils.isEmpty( field53B.getValue() ) ) {
            	
                throw new MTPreconditionException( Constants.SR1 );
                
            }
        }
    }
    
}