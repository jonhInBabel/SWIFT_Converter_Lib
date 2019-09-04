package com.babel.swift.rules.MT900.MTRules;

import com.babel.swift.rules.IMTRule;
import com.prowidesoftware.swift.model.field.Field32A;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.ActiveOrHistoricCurrencyAndAmount;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;

public class CurrencyAndAmountFromField32A implements IMTRule {

    @Override
    public Object apply(Object mtField) {
        
        ActiveOrHistoricCurrencyAndAmount activeOrHistoricCurrencyAndAmount = null;
        
        if(!StringUtils.isEmpty(mtField)) {
        	
        	Field32A field32A = (Field32A) mtField;

            if( !StringUtils.isEmpty( field32A.getCurrency() ) &&
                    !StringUtils.isEmpty( field32A.getAmount() ) ) {

                activeOrHistoricCurrencyAndAmount = new ActiveOrHistoricCurrencyAndAmount();
                activeOrHistoricCurrencyAndAmount.setCcy( field32A.getCurrency() );
                BigDecimal amount = field32A.getAmountBigDecimal();
                activeOrHistoricCurrencyAndAmount.setValue( amount );
            }
        	
        }
        

        return activeOrHistoricCurrencyAndAmount;
    }
}
