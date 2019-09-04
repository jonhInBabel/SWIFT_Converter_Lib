package com.babel.swift.mappers.MT900;

import com.babel.swift.exceptions.MTFieldParsingException;
import com.babel.swift.exceptions.MXFieldParsingException;
import com.babel.swift.mappers.AMapper;
import com.babel.swift.rules.MT900.MTRules.*;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.model.mt.mt9xx.MT900;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.*;
public class MT900_Mapper extends AMapper {

    public MT900_Mapper() {
        super(new MT900XMLGenerator());
    }

    @Override
    protected void applyMTRules(AbstractMT mtMessage) throws MTFieldParsingException {
        MT900 mt900 = (MT900) mtMessage;
        this.mxObject = new Document();
        Document document = new Document();
		
		/*
			aqui componemos el objeto root de la clase obtenida a partir del xsd usando las reglas específicas
		 */

        BranchAndFinancialInstId4FromLTA branchAndFinancialInstId4FromLTA  	= (BranchAndFinancialInstId4FromLTA) new BranchAndFinancialInstId4FromLTA().apply(mt900.getLogicalTerminal());
        PartyIdentification32FromIDA partyIdentification32FromIDA 			= (PartyIdentification32FromIDA) new PartyIdentification32FromIDA().apply(mt900.getReceiver());
        GroupHeader42 messageId 											= (GroupHeader42) new MessageIdFromField20().apply(mt900.getField20());
        String identification 												= (String) new IdentificationFromField20().apply(mt900.getField20());
        TransactionReferences2 endToEndIdentification 						= (TransactionReferences2) new EndToEndIdFromField21().apply(mt900.getField21());
        DateAndDateTimeChoice dateAndDateTimeChoice 						= (DateAndDateTimeChoice) new DateFromField32A().apply(mt900.getField32A());
        ActiveOrHistoricCurrencyAndAmount activeOrHistoricCurrencyAndAmount = (ActiveOrHistoricCurrencyAndAmount) new CurrencyAndAmountFromField32A().apply(mt900.getField32A());
        String nameAndAddress 												= (String) new NameFromField52D().apply(mt900.getField52D());
        PostalAddress6 postalAddress6 										= (PostalAddress6) new AddressLinesFromField52D().apply(mt900.getField72());
        String additionalTransactionInfo 									= (String) new AdditionalTransactionInfFromField72().apply(mt900.getField72());

        this.mxObject = document;
    }

    @Override
    protected void applyMXRules(AbstractMX mxMessage) throws MXFieldParsingException {
        // TODO:
    }

}