package com.babel.swift.rules.MT900.MTRules;

import com.babel.swift.exceptions.MTFieldParsingException;
import com.babel.swift.rules.IMTRule;
import com.prowidesoftware.swift.model.field.Field21;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.TransactionReferences2;
import org.springframework.util.StringUtils;

public class EndToEndIdFromField21 implements IMTRule {
    @Override
    public Object apply(Object mtField) throws MTFieldParsingException {
       
        TransactionReferences2 transactionReferences2 = null;
        if( !StringUtils.isEmpty( mtField) ) {

        	 Field21 field21 = (Field21) mtField;

            transactionReferences2 = new TransactionReferences2();
            transactionReferences2.setEndToEndId( field21.getValue());

        }

        return transactionReferences2;
    }
}
