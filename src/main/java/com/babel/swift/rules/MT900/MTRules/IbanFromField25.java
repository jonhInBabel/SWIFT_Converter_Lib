package com.babel.swift.rules.MT900.MTRules;

import com.babel.swift.exceptions.MTFieldParsingException;
import com.babel.swift.rules.IMTRule;
import com.prowidesoftware.swift.model.field.Field25;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.model.mt.mt9xx.MT900;

import org.springframework.util.StringUtils;


public class IbanFromField25 implements IMTRule {

    private static final Integer ACCOUNT_IDENTIFICATION_MAX_NUMBER = 34;

    @Override
    public Object apply(AbstractMT mt) throws MTFieldParsingException {
    	MT900 mt900 = (MT900) mt;
        String iban = null;
        if (!StringUtils.isEmpty(mt900.getField25())) {
            if (mt900.getField25().getValue().length() <= ACCOUNT_IDENTIFICATION_MAX_NUMBER ) {
                iban = mt900.getField25().getValue();
            }
        }
        return iban;
    }
}


