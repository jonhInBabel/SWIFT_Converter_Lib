package com.babel.swift.rules.MT900.MTRules;

import com.babel.swift.exceptions.MTFieldParsingException;
import com.babel.swift.rules.IMTRule;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.OrganisationIdentification4;
import org.springframework.util.StringUtils;

public class PartyIdentification32FromIDA implements IMTRule {

	/*
	public static String getBICOrBEI( String receiver ) {

		String value = null;
		if( receiver != null && receiver.length() >= 10 ) {
//TODO			if( isBIC( receiver.substring(0, 8) + receiver.substring(9) ) ||
//TODO				isBEI( receiver.substring(0, 8) + receiver.substring(9)	) {

				value = receiver.substring(0, 8) + receiver.substring(9);
//			}
		}

		return value;

	}
	*/

	@Override
	public Object apply(Object mtField) throws MTFieldParsingException {
		String receiver = (String) mtField;

		//Ownr
		OrganisationIdentification4 organisationIdentification4 = null;

		if( !StringUtils.isEmpty( receiver ) ) {

			String value = null;
			if( receiver != null && receiver.length() >= 10 ) {
//TODO			if( isBIC( receiver.substring(0, 8) + receiver.substring(9) ) ||
//TODO				isBEI( receiver.substring(0, 8) + receiver.substring(9)	) {

				value = receiver.substring(0, 8) + receiver.substring(9);
//				}
			}

			organisationIdentification4 = new OrganisationIdentification4();
			organisationIdentification4.setBICOrBEI( value );
		}

		return organisationIdentification4;
	}
	
}