package com.babel.swift.rules.MT900.MTRules;

import com.babel.swift.exceptions.MTFieldParsingException;
import com.babel.swift.rules.IMTRule;
import com.prowidesoftware.swift.model.field.Field20;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.AccountNotification2;
import org.springframework.util.StringUtils;

public class IdentificationFromField20 implements IMTRule {
    @Override
    public Object apply(Object mtField) throws MTFieldParsingException {
        Field20 field20 = (Field20) mtField;

        if (!StringUtils.isEmpty(field20.getValue())) {

            return field20.getValue();
        }

        return null;
    }
}
