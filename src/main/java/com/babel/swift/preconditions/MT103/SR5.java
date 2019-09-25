package com.babel.swift.preconditions.MT103;

import org.springframework.util.StringUtils;

import com.babel.swift.exceptions.MTPreconditionException;
import com.babel.swift.preconditions.IMTPrecondition;
import com.babel.swift.support.Constants;
import com.prowidesoftware.swift.model.field.Field54B;
import com.prowidesoftware.swift.model.mt.mt1xx.MT103;


public class SR5 implements IMTPrecondition {
    
    @Override
    public void apply( MT103 mt103 ) throws MTPreconditionException {
    	
    	Field54B field54B = mt103.getField54B();
    	
        if( !StringUtils.isEmpty( field54B ) ) {
            
        	throw new MTPreconditionException( Constants.SR5 );
                
        }
    }
}