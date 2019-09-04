package com.babel.swift.rules.MT900.MTRules;

import com.babel.swift.rules.IMTRule;
import com.prowidesoftware.swift.model.field.Field25;

import org.springframework.util.StringUtils;


public class IbanFromField25 implements IMTRule {

    private static final Integer ACCOUNT_IDENTIFICATION_MAX_NUMBER = 34;

    @Override
    public Object apply(Object mtField)
    {
        Field25 field25 = (Field25) mtField;
        if (!StringUtils.isEmpty(field25.getValue())) {
            if (field25.getValue().length() <= ACCOUNT_IDENTIFICATION_MAX_NUMBER
//TODO					&& !( isIBAN( field25.getValue() ) )
            )
            {
                field25.getValue();
            }
        }
        return field25.getValue();
    }
}


