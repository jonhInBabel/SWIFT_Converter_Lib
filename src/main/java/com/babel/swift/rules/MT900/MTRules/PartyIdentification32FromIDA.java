package com.babel.swift.rules.MT900.MTRules;

import com.babel.swift.exceptions.MTFieldParsingException;
import com.babel.swift.rules.IMTRule;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.OrganisationIdentification4;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.Party6Choice;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.PartyIdentification32;
import org.springframework.util.StringUtils;

public class PartyIdentification32FromIDA implements IMTRule {

	
	@Override
	public Object apply(Object mtField) throws MTFieldParsingException {
		

		//Ownr
		Party6Choice party6Choice = null;
		PartyIdentification32 partyIdentification32 = null;
		OrganisationIdentification4 organisationIdentification4 = null;

		if( !StringUtils.isEmpty( mtField ) ) {

			String receiver = (String) mtField;
			String value = null;
			if( receiver != null && receiver.length() >= 10 ) {
//TODO			if( isBIC( receiver.substring(0, 8) + receiver.substring(9) ) ||
//TODO				isBEI( receiver.substring(0, 8) + receiver.substring(9)	) {

				value = receiver.substring(0, 8) + receiver.substring(9);

				organisationIdentification4 = new OrganisationIdentification4();
				organisationIdentification4.setBICOrBEI( value );

				party6Choice = new Party6Choice();
				party6Choice.setOrgId(organisationIdentification4);
				partyIdentification32 = new PartyIdentification32();
				partyIdentification32.setId(party6Choice);
//				}
			}

		}

		return partyIdentification32;
	}
	
}