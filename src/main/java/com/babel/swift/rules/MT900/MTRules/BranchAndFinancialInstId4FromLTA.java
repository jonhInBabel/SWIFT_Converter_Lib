package com.babel.swift.rules.MT900.MTRules;

import com.babel.swift.exceptions.MTFieldParsingException;
import com.babel.swift.rules.IMTRule;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.model.mt.mt9xx.MT900;

import iso.std.iso._20022.tech.xsd.camt_054_001_02.FinancialInstitutionIdentification7;
import org.springframework.util.StringUtils;

public class BranchAndFinancialInstId4FromLTA implements IMTRule {

	@Override
	public Object apply(AbstractMT mt) throws MTFieldParsingException {
		
		MT900 mt900 = (MT900) mt;

		//Svcr
		FinancialInstitutionIdentification7 financialInstitutionIdentification7 = null;
		if( !StringUtils.isEmpty( mt900.getLogicalTerminal() ) ){

			String value = null;
			if( mt900.getLogicalTerminal() != null && mt900.getLogicalTerminal().length() >= 10 ) {
//TODO			if( isBIC( mt900.getLogicalTerminal().substring(0, 8) + mt900.getLogicalTerminal().substring(9) ) ) {
				value = mt900.getLogicalTerminal().substring(0, 8) + mt900.getLogicalTerminal().substring(9);
//			}
			}

			financialInstitutionIdentification7= new FinancialInstitutionIdentification7();
			financialInstitutionIdentification7.setBIC( value );

		}

		return financialInstitutionIdentification7;
	}
	
}