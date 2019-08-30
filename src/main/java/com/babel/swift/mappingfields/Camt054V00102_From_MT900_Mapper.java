package com.babel.swift.mappingfields;

import java.util.List;
import com.babel.swift.exceptions.MTFieldParsingException;
import com.babel.swift.rules.*;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.model.mt.mt9xx.MT900;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.ActiveOrHistoricCurrencyAndAmount;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.DateAndDateTimeChoice;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.Document;

public class Camt054V00102_From_MT900_Mapper extends AMapper {

	public Camt054V00102_From_MT900_Mapper(IXMLGenerator xmlGen) {
		super(xmlGen);
	}

	@Override
	protected void convert(AbstractMT mtMessage) throws MTFieldParsingException{
		MT900 mt900 = (MT900) mtMessage;
		this.mxObject = new Document();
		/*
			aqui componemos el objeto root de la clase obtenida a partir del xsd usando las reglas específicas
		 */
		String 			bic;
		String 			bicOrBei;
		String 			messageId;
		String 			identification;
		String 			endToEndIdentification;
		String 			iban;
		String 			otherId;
		String 			debtorBicOrBei;
		List<String> 	nameAndAddress;
		String 			additionalTransactionInfo;

		bic 						= LogicalTerminalAddress_Rules.getBIC( mt900.getLogicalTerminal() );
		bicOrBei 					= InputDestinationAddress_Rules.getBICOrBEI( mt900.getReceiver() );
		messageId					= Field20_Rules.getField20Value( mt900.getField20() );
		identification 				= Field20_Rules.getField20Value( mt900.getField20() );
		endToEndIdentification 		= Field21_Rules.getField21Value( mt900.getField21() );
		iban						= Field25_Rules.getIBAN( mt900.getField25() );
		otherId						= Field25_Rules.getOtherIdentification( mt900.getField25() );
		DateAndDateTimeChoice dateAndDateTimeChoice = (DateAndDateTimeChoice) new DateFromField32A().apply( mt900.getField32A() );
		ActiveOrHistoricCurrencyAndAmount activeOrHistoricCurrencyAndAmount  = (ActiveOrHistoricCurrencyAndAmount) new CurrencyAndAmountFromField32A().apply(mt900.getField32A());
		debtorBicOrBei				= Field52A_Rules.getField20Value( mt900.getField52A() );
		nameAndAddress				= Field52D_Rules.getField20Value( mt900.getField52D() );
		additionalTransactionInfo	= Field72_Rules.getField20Value( mt900.getField72() );
	}

}