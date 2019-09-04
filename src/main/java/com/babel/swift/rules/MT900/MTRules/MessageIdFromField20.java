package com.babel.swift.rules.MT900.MTRules;

import com.babel.swift.exceptions.MTFieldParsingException;
import com.babel.swift.rules.IMTRule;
import com.prowidesoftware.swift.model.field.Field20;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.GroupHeader42;
import org.springframework.util.StringUtils;

public class MessageIdFromField20 implements IMTRule {

    @Override
    public Object apply(Object mtField) throws MTFieldParsingException {
        

        GroupHeader42 grpHdr = null;
        if (!StringUtils.isEmpty(mtField)) {
        	Field20 field20 = (Field20) mtField;
            grpHdr = new GroupHeader42();
            grpHdr.setMsgId(field20.getValue());
        }

        return grpHdr;
    }
}
