package com.babel.swift.rules.MT900.MTRules;

import com.babel.swift.exceptions.MTFieldParsingException;
import com.babel.swift.rules.IMTRule;
import com.prowidesoftware.swift.model.field.Field21;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.model.mt.mt9xx.MT900;

import iso.std.iso._20022.tech.xsd.camt_054_001_02.TransactionReferences2;
import org.springframework.util.StringUtils;

public class EndToEndIdFromField21 implements IMTRule {
    @Override
    public Object apply(AbstractMT mt) throws MTFieldParsingException {
       
    	MT900 mt900 = (MT900) mt;
        TransactionReferences2 transactionReferences2 = null;
        if( !StringUtils.isEmpty( mt900.getField21()) ) {

            transactionReferences2 = new TransactionReferences2();
            transactionReferences2.setEndToEndId( mt900.getField21().getValue());

        }

        return transactionReferences2;
    }
}
