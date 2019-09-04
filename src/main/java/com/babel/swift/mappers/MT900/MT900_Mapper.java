package com.babel.swift.mappers.MT900;

import java.util.List;
import com.babel.swift.exceptions.MTFieldParsingException;
import com.babel.swift.exceptions.MXFieldParsingException;
import com.babel.swift.mappers.AMapper;
import com.babel.swift.rules.MT900.MTRules.*;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.model.mt.mt9xx.MT900;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.*;
import jdk.nashorn.internal.objects.Global;

public class MT900_Mapper extends AMapper {

	public MT900_Mapper() {
		super(new MT900XMLGenerator());
	}

	@Override
	protected void applyMTRules(AbstractMT mtMessage) throws MTFieldParsingException {
		MT900 mt900 = (MT900) mtMessage;
		Document document = new Document();
		/*
			aqui componemos el objeto root de la clase obtenida a partir del xsd usando las reglas específicas
		 */
		String iban = (String) new IbanFromField25().apply(mt900.getField25());
		GenericAccountIdentification1 genericAccountIdentification1= (GenericAccountIdentification1) new OtherIdentificationFromField25().apply( mt900.getField25() );
		Party6Choice party6Choice1	= (Party6Choice) new OrganisationFromField52A().apply( mt900.getField52A() );

		this.mxObject = document;
	}


	@Override
	protected void applyMXRules(AbstractMX mxMessage) throws MXFieldParsingException {
		// TODO:
	}

}