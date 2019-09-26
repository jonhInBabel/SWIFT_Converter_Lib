package com.babel.swift.rules.MT900.MTRules;


import org.springframework.util.StringUtils;

import com.babel.swift.rules.IMTRule;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.model.mt.mt9xx.MT900;

import iso.std.iso._20022.tech.xsd.camt_054_001_02.OrganisationIdentification4;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.Party6Choice;


public class OrganisationFromField52A implements IMTRule {


	@Override
	public Object apply(AbstractMT mt)
	{
		MT900 mt900 = (MT900) mt;
		Party6Choice party6Choice1 = null;
		if(!StringUtils.isEmpty(mt900.getField52A())) {
			
			OrganisationIdentification4 organisationIdentification4 = null;
			
		    	organisationIdentification4 = new OrganisationIdentification4();
				organisationIdentification4.setBICOrBEI( mt900.getField52A().getValue());
				party6Choice1 = new Party6Choice();
				party6Choice1.setOrgId(organisationIdentification4);
			
		}
		
	 return party6Choice1;
	}








					}