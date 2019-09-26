package com.babel.swift.preconditions.MT103;

import org.springframework.util.StringUtils;

import com.babel.swift.exceptions.MTPreconditionException;
import com.babel.swift.preconditions.IMTPrecondition;
import com.babel.swift.support.Constants;
import com.prowidesoftware.swift.model.field.Field56C;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.model.mt.mt1xx.MT103;


public class SR3 implements IMTPrecondition {
    
    @Override
    public void apply( AbstractMT mt ) throws MTPreconditionException {
    	
    	MT103 mt103 = (MT103) mt;
    	
    	Field56C field56C = mt103.getField56C();
    	
        if( !StringUtils.isEmpty( field56C ) ) {
            
            String field56CS = field56C.getValue();
            
            if ( !field56CS.substring(0, 2).equals("//")
                    || field56CS.substring(0, 4).equals("//RT")
                    && !field56CS.substring(0, 6).equals("//RT//")
                    || field56CS.substring(0, 6).equals("//RT//")
                    && field56CS.length() < 10 ) {
            	
                throw new MTPreconditionException( Constants.SR3);
                
            }
        }
    }
}