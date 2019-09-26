package com.babel.swift.rules.MT103.MTRules;

import com.babel.swift.rules.IMTRule;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.model.mt.mt1xx.MT103;


public class PmtTpInf_ClrChanl implements IMTRule {

	@Override
	public Object apply( AbstractMT mt ) {
		
		MT103 mt103 = (MT103) mt;
		/*
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
		*/
		return null;
	}
	
}