package com.babel.swift.mappers.MT_Mappers.MT103;

import com.babel.swift.exceptions.MTFieldParsingException;
import com.babel.swift.mappers.MT_Mappers.AMTMapper;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.model.mt.mt1xx.MT103;

import iso.std.iso._20022.tech.xsd.pacs_008_001_02.Document;

public class MT103_Mapper extends AMTMapper {

	MT103 mt103;
	
	public MT103_Mapper() {
		super ( new MT103XMLGenerator());
	}

	@Override
	protected void applyMTRules(AbstractMT mtMessage) throws MTFieldParsingException {
		
		mt103 = (MT103) mtMessage;
		Document document = new Document();
		
		// TODO document.set ...
		
		this.mxObject = document;
		
	}

	// Métodos para construir el xml en base a las clases del xsd
	
}