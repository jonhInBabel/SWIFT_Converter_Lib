package com.babel.swift.rules.MT900.MTRules;

import com.babel.swift.exceptions.MTFieldParsingException;
import com.babel.swift.rules.IMTRule;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.model.mt.mt9xx.MT900;

import iso.std.iso._20022.tech.xsd.camt_054_001_02.ActiveOrHistoricCurrencyAndAmount;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;

public class CurrencyAndAmountFromField32A implements IMTRule {

	@Override
	public Object apply(AbstractMT mt) throws MTFieldParsingException {
		MT900 mt900 = (MT900) mt;
		ActiveOrHistoricCurrencyAndAmount activeOrHistoricCurrencyAndAmount = null;
        
        if(!StringUtils.isEmpty(mt900.getField32A())) {

            if( !StringUtils.isEmpty( mt900.getField32A().getCurrency() ) &&
                    !StringUtils.isEmpty( mt900.getField32A().getAmount() ) ) {

                activeOrHistoricCurrencyAndAmount = new ActiveOrHistoricCurrencyAndAmount();
                activeOrHistoricCurrencyAndAmount.setCcy( mt900.getField32A().getCurrency() );
                BigDecimal amount = mt900.getField32A().getAmountBigDecimal();
                activeOrHistoricCurrencyAndAmount.setValue( amount );
            }
        	
        }
        

        return activeOrHistoricCurrencyAndAmount;
	}
}
