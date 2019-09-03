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

        AccountNotification2 accountNotification2 = null;
//      List<AccountNotification2> accountNotification2s= null;

        if(/*account20 != null || reportEntry2s != null || */!StringUtils.isEmpty( field20.getValue()) ) {

            accountNotification2 = new AccountNotification2();
            accountNotification2.setId( field20.getValue() );
//            accountNotification2.setAcct(account20);
//            accountNotification2.getNtry().addAll(reportEntry2s);

//            accountNotification2s= new ArrayList<AccountNotification2>();
//            accountNotification2s.add(accountNotification2);

        }

        return accountNotification2;
    }
}
