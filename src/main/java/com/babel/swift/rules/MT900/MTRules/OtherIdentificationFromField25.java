package com.babel.swift.rules.MT900.MTRules;
import org.springframework.util.StringUtils;

import com.babel.swift.exceptions.MTFieldParsingException;
import com.babel.swift.rules.IMTRule;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.model.mt.mt9xx.MT900;

import iso.std.iso._20022.tech.xsd.camt_054_001_02.GenericAccountIdentification1;


public class OtherIdentificationFromField25 implements IMTRule {

    @Override
    public Object apply(AbstractMT mt) throws MTFieldParsingException {
       
    	MT900 mt900 = (MT900) mt;
    	
        GenericAccountIdentification1 accountIdentification1 = null;
        if( !StringUtils.isEmpty( mt900.getField25() ) ) {
            accountIdentification1 = new GenericAccountIdentification1();
            accountIdentification1.setId( mt900.getField25().getValue() );

        }
        return accountIdentification1;
    }


}
