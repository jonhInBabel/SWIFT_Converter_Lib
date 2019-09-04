package com.babel.swift.rules.MT900.MTRules;
import com.babel.swift.rules.IMTRule;
import com.prowidesoftware.swift.model.field.Field25;

import iso.std.iso._20022.tech.xsd.camt_054_001_02.GenericAccountIdentification1;
import org.springframework.util.StringUtils;


public class OtherIdentificationFromField25 implements IMTRule {

    @Override
    public Object apply(Object mtField)
    {
        Field25 field25 = (Field25) mtField;
        GenericAccountIdentification1 accountIdentification1 = null;
        if( !StringUtils.isEmpty( field25.getValue() ) )
        {

            accountIdentification1 = new GenericAccountIdentification1();
            accountIdentification1.setId( field25.getValue() );

        }
        return accountIdentification1;
    }


}
