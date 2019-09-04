package com.babel.swift.rules.MT900.MTRules;


import com.prowidesoftware.swift.model.field.Field52A;
import com.babel.swift.exceptions.MTFieldParsingException;
import com.babel.swift.rules.IMTRule;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.AccountIdentification4Choice;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.ActiveOrHistoricCurrencyAndAmount;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.OrganisationIdentification4;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.Party6Choice;
import org.springframework.util.StringUtils;


public class OrganisationFromField52A implements IMTRule {


	@Override
	public Object apply(Object mtField)
	{
		Field52A field52A = (Field52A) mtField;
		OrganisationIdentification4 organisationIdentification4 = null;
		Party6Choice party6Choice1 = null;
		if( !StringUtils.isEmpty( field52A.getValue() ) )
		{
			organisationIdentification4= new OrganisationIdentification4();
			organisationIdentification4.setBICOrBEI( field52A.getValue());
			party6Choice1 = new Party6Choice();
			party6Choice1.setOrgId(organisationIdentification4);
		}
		return party6Choice1;
	}








					}