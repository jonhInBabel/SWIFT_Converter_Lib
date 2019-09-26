package com.babel.swift.rules.MT103.MTRules;

import java.util.Map;

import org.springframework.util.StringUtils;

import com.babel.swift.exceptions.MTFieldParsingException;
import com.babel.swift.rules.IMTComplexRule;
import com.prowidesoftware.swift.model.field.Field23B;
import com.prowidesoftware.swift.model.field.Field23E;
import com.prowidesoftware.swift.model.field.Field56A;
import com.prowidesoftware.swift.model.field.Field56C;
import com.prowidesoftware.swift.model.field.Field56D;
import com.prowidesoftware.swift.model.field.Field57A;
import com.prowidesoftware.swift.model.field.Field57C;
import com.prowidesoftware.swift.model.field.Field57D;
import com.prowidesoftware.swift.model.field.Field77B;

import iso.std.iso._20022.tech.xsd.pacs_008_001_02.ClearingChannel2Code;
import iso.std.iso._20022.tech.xsd.pacs_008_001_02.PaymentTypeInformation21;


public class PmtTpInf_ClrChanl implements IMTComplexRule {

	@Override
	public Object apply( Map<String, Object> mtFields ) throws MTFieldParsingException {
		
		Field23E field23E = (Field23E) mtFields.get("23E");
		Field23B field23B = (Field23B) mtFields.get("23B");
		Field56A field56A = (Field56A) mtFields.get("56A");
		Field56C field56C = (Field56C) mtFields.get("56C");
		Field56D field56D = (Field56D) mtFields.get("56D");
		Field57A field57A = (Field57A) mtFields.get("57A");
		Field57C field57C = (Field57C) mtFields.get("57C");
		Field57D field57D = (Field57D) mtFields.get("57D");
		
		ClearingChannel2Code clearingChannel2Code = null;
		
		if( field23E != null && ( field23E.getCode() ) ) {
			if(  ) {
				return clearingChannel2Code.fromValue("RTGS");
			} else if(  ) {
				return clearingChannel2Code.fromValue("RTGS");
			} else if(  ) {
				return clearingChannel2Code.fromValue("RTGS");
			} else if(  ) {
				return clearingChannel2Code.fromValue("RTGS");
			} else if(  ) {
				return clearingChannel2Code.fromValue("RTGS");
			} else if(  ) {
				return clearingChannel2Code.fromValue("RTGS");
			}
		}
		
	}
	
}