package com.babel.swift.preconditions.MT103;

import org.springframework.util.StringUtils;

import com.babel.swift.exceptions.MTPreconditionException;
import com.babel.swift.preconditions.IMTPrecondition;
import com.babel.swift.support.Constants;
import com.prowidesoftware.swift.model.field.Field55B;
import com.prowidesoftware.swift.model.mt.mt1xx.MT103;


public class SR6 implements IMTPrecondition {
   
    @Override
    public void apply( MT103 mt103 ) throws MTPreconditionException {
    	
    	Field55B field55B = mt103.getField55B();
    	
        if(!StringUtils.isEmpty( field55B ) ) {
        	
            throw new MTPreconditionException( Constants.SR6);
            
        }
    }
}