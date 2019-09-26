package com.babel.swift.rules.MT900.MTRules;

import com.babel.swift.exceptions.MTFieldParsingException;
import com.babel.swift.rules.IMTRule;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.model.mt.mt9xx.MT900;

import org.springframework.util.StringUtils;

public class IdentificationFromField20 implements IMTRule {
    @Override
    public Object apply(AbstractMT mt) throws MTFieldParsingException {
        
    	MT900 mt900 = (MT900) mt;
    	String identification = null;

        if (!StringUtils.isEmpty(mt900.getField20())) {
            identification =  mt900.getField20().getValue();
        }

        return identification;
    }
}
