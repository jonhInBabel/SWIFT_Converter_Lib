package com.babel.swift.rules.MT900.MTRules;

import com.babel.swift.exceptions.MTFieldParsingException;
import com.babel.swift.rules.IMTRule;
import com.prowidesoftware.swift.model.field.Field20;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.model.mt.mt9xx.MT900;

import iso.std.iso._20022.tech.xsd.camt_054_001_02.GroupHeader42;
import org.springframework.util.StringUtils;

public class MessageIdFromField20 implements IMTRule {

    @Override
    public Object apply(AbstractMT mt) throws MTFieldParsingException {
        
    	MT900 mt900 = (MT900) mt;
        GroupHeader42 grpHdr = null;
        
        if (!StringUtils.isEmpty(mt900.getField20())) {
            grpHdr = new GroupHeader42();
            grpHdr.setMsgId(mt900.getField20().getValue());
        }

        return grpHdr;
    }
}
