package com.babel.swift.rules.MT900.MTRules;

import com.babel.swift.exceptions.MTFieldParsingException;
import com.babel.swift.rules.IMTRule;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.FinancialInstitutionIdentification7;
import org.springframework.util.StringUtils;

public class BranchAndFinancialInstId4FromLTA implements IMTRule {

	/*
	public static String getBIC( String logicalTerminalAddress ) {

		String value = null;
		if( logicalTerminalAddress != null && logicalTerminalAddress.length() >= 10 ) {
//TODO			if( isBIC( logicalTerminalAddress.substring(0, 8) + logicalTerminalAddress.substring(9) ) ) {
				value = logicalTerminalAddress.substring(0, 8) + logicalTerminalAddress.substring(9);
//			}
		}

		return value;

	}
	*/

	@Override
	public Object apply(Object mtField) throws MTFieldParsingException {
		String logicalTerminalAddress = (String) mtField;

		//Svcr
		FinancialInstitutionIdentification7 financialInstitutionIdentification7 = null;
		if( !StringUtils.isEmpty( logicalTerminalAddress ) ){

			String value = null;
			if( logicalTerminalAddress != null && logicalTerminalAddress.length() >= 10 ) {
//TODO			if( isBIC( logicalTerminalAddress.substring(0, 8) + logicalTerminalAddress.substring(9) ) ) {
				value = logicalTerminalAddress.substring(0, 8) + logicalTerminalAddress.substring(9);
//			}
			}

			financialInstitutionIdentification7= new FinancialInstitutionIdentification7();
			financialInstitutionIdentification7.setBIC( value );

		}

		return financialInstitutionIdentification7;
	}
	
}