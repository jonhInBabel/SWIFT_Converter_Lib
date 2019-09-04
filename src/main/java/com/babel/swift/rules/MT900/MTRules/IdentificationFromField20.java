package com.babel.swift.rules.MT900.MTRules;

import com.babel.swift.exceptions.MTFieldParsingException;
import com.babel.swift.rules.IMTRule;
import com.prowidesoftware.swift.model.field.Field20;
import org.springframework.util.StringUtils;

public class IdentificationFromField20 implements IMTRule {
    @Override
    public Object apply(Object mtField) throws MTFieldParsingException {
        
    	String identification = null;
    	

        if (!StringUtils.isEmpty(mtField)) {

        	Field20 field20 = (Field20) mtField;
            identification =  field20.getValue();
        }

        return identification;
    }
}
