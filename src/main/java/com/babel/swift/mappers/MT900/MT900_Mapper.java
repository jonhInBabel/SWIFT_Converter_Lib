package com.babel.swift.mappers.MT900;

import com.babel.swift.exceptions.MTFieldParsingException;
import com.babel.swift.exceptions.MXFieldParsingException;
import com.babel.swift.mappers.AMapper;
import com.babel.swift.rules.MT900.MTRules.*;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.model.mt.mt9xx.MT900;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.*;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class MT900_Mapper extends AMapper {

    MT900 mt900;

    public MT900_Mapper() {
        super(new MT900XMLGenerator());
    }

    @Override
    protected void applyMTRules(AbstractMT mtMessage) throws MTFieldParsingException {
        mt900 = (MT900) mtMessage;
        Document document = new Document();

        /*
         * aqui componemos el objeto root de la clase obtenida a partir del xsd usando las reglas específicas
         */
        document.setBkToCstmrDbtCdtNtfctn( bankToCustomerDebitCreditNotificationV02() );


        this.mxObject = document;
    }

    @Override
    protected void applyMXRules(AbstractMX mxMessage) throws MXFieldParsingException {
        // TODO:
    }

    //Svcr   inside Acct
    private BranchAndFinancialInstitutionIdentification4 branchAndFinancialInstitutionIdentification4() throws MTFieldParsingException {
        //Svcr
        BranchAndFinancialInstitutionIdentification4 branchAndFinancialInstitutionIdentification4 = null;

        //bic = LogicalTerminalAddress_Rules.getBIC( mt900.getLogicalTerminal() );
        FinancialInstitutionIdentification7 financialInstitutionIdentification7 = (FinancialInstitutionIdentification7) new BranchAndFinancialInstId4FromLTA().apply(mt900.getLogicalTerminal());



        if( financialInstitutionIdentification7!=null){

            branchAndFinancialInstitutionIdentification4 = new BranchAndFinancialInstitutionIdentification4();
            branchAndFinancialInstitutionIdentification4.setFinInstnId(financialInstitutionIdentification7);

        }
        return branchAndFinancialInstitutionIdentification4;

    }

    //Id   inside Acct
    private AccountIdentification4Choice accountIdentification4Choice() throws MTFieldParsingException{


        //Othr
        GenericAccountIdentification1 genericAccountIdentification1= (GenericAccountIdentification1) new OtherIdentificationFromField25().apply( mt900.getField25() );
        //IdIban
        String iban = (String) new IbanFromField25().apply(mt900.getField25());

        AccountIdentification4Choice accountIdentification4Choice = null;

        if( !StringUtils.isEmpty( iban) || genericAccountIdentification1 != null ) {

            accountIdentification4Choice = new AccountIdentification4Choice();
            accountIdentification4Choice.setIBAN( iban);
            accountIdentification4Choice.setOthr(genericAccountIdentification1);

        }

        return accountIdentification4Choice;

    }

    //Acct   inside Ntfctn
    private CashAccount20 cashAccount20() throws MTFieldParsingException {

        AccountIdentification4Choice accountIdentification4Choice = accountIdentification4Choice();
        PartyIdentification32 partyIdentification32 = (PartyIdentification32) new PartyIdentification32FromIDA().apply(mt900.getReceiver());
        BranchAndFinancialInstitutionIdentification4 branchAndFinancialInstitutionIdentification4 = branchAndFinancialInstitutionIdentification4();
        //Acct
        CashAccount20 account20 = null;
        if( accountIdentification4Choice!= null || partyIdentification32!= null || branchAndFinancialInstitutionIdentification4!= null ) {
            account20 = new CashAccount20();
            account20.setId(accountIdentification4Choice);
            account20.setOwnr(partyIdentification32);
            account20.setSvcr(branchAndFinancialInstitutionIdentification4);
        }
        return account20;
    }

    //RltdPties inside TxDtls
    private TransactionParty2 transactionParty2() throws MTFieldParsingException {


        PostalAddress6 postalAddress6 = (PostalAddress6) new AddressLinesFromField52D().apply(mt900.getField52D());
        String name = (String) new NameFromField52D().apply(mt900.getField52D());

        //Dbtr
        Party6Choice party6Choice	= (Party6Choice) new OrganisationFromField52A().apply( mt900.getField52A() );


        PartyIdentification32 partyIdentification322 = null;
        TransactionParty2 transactionParty2 = null;
        if( postalAddress6 !=null || name != null || party6Choice != null ) {

            partyIdentification322 = new PartyIdentification32();
            partyIdentification322.setPstlAdr(postalAddress6);
            partyIdentification322.setNm(name);
            partyIdentification322.setId(party6Choice);

            //RltdPties
            transactionParty2 = new TransactionParty2();
            transactionParty2.setDbtr(partyIdentification322);

        }

        return transactionParty2;

    }

    //TxDtls inside //NtryDtls
    private List<EntryDetails1> entryDetails1() throws MTFieldParsingException {

        //Refs
        TransactionReferences2 transactionReferences2 = (TransactionReferences2) new EndToEndIdFromField21().apply(mt900.getField21());
        TransactionParty2 transactionParty2 = transactionParty2();
        String additionalTransactionInfo = (String) new AdditionalTransactionInfFromField72().apply(mt900.getField72());


        //TxDtls
        EntryTransaction2 entryTransaction2 = null;
        List<EntryTransaction2> entryTransaction2s = null;
        EntryDetails1 entryDetails1 = null;
        List<EntryDetails1> entryDetails1s = null;
        if( !StringUtils.isEmpty( additionalTransactionInfo ) ||
                transactionParty2 != null || transactionReferences2 !=null ) {

            entryTransaction2 = new EntryTransaction2();
            entryTransaction2.setRltdPties( transactionParty2 );
            entryTransaction2.setRefs( transactionReferences2 );
            entryTransaction2.setAddtlTxInf(additionalTransactionInfo );

            entryTransaction2s = new ArrayList<EntryTransaction2>();
            entryTransaction2s.add(entryTransaction2);

            //NtryDtls
            entryDetails1 = new EntryDetails1();

            entryDetails1.getTxDtls().addAll(entryTransaction2s);

            entryDetails1s = new ArrayList<EntryDetails1>();
            entryDetails1s.add(entryDetails1);
        }

        return entryDetails1s;

    }

    private List<AccountNotification2> accountNotification2() throws MTFieldParsingException {

        //ValDt
        DateAndDateTimeChoice dateAndDateTimeChoice = (DateAndDateTimeChoice) new DateFromField32A().apply(mt900.getField32A());
        //Amt
        ActiveOrHistoricCurrencyAndAmount activeOrHistoricCurrencyAndAmount = (ActiveOrHistoricCurrencyAndAmount) new CurrencyAndAmountFromField32A().apply(mt900.getField32A());

        List<EntryDetails1> entryDetails1 = entryDetails1();

        CashAccount20 cashAccount20 = cashAccount20();
        String identification = (String) new IdentificationFromField20().apply(mt900.getField20());


        //Ntry
        ReportEntry2 reportEntry2 = null;
        List<ReportEntry2> reportEntry2s = null;

        if( dateAndDateTimeChoice!=null || activeOrHistoricCurrencyAndAmount!=null || entryDetails1!=null ) {

            reportEntry2 = new ReportEntry2();
            reportEntry2.setValDt(dateAndDateTimeChoice);
            reportEntry2.setAmt(activeOrHistoricCurrencyAndAmount);
            reportEntry2.getNtryDtls().addAll(entryDetails1);
            reportEntry2s = new ArrayList<ReportEntry2>();
            reportEntry2s.add(reportEntry2);
        }

        //Ntfctn
        AccountNotification2 accountNotification2 = null;
        List<AccountNotification2> accountNotification2s= null;

        if(cashAccount20!= null || reportEntry2s!= null || !StringUtils.isEmpty( identification ) ) {

            accountNotification2 = new AccountNotification2();
            accountNotification2.setId( identification );
            accountNotification2.setAcct(cashAccount20);
            accountNotification2.getNtry().addAll(reportEntry2s);

            accountNotification2s= new ArrayList<AccountNotification2>();
            accountNotification2s.add(accountNotification2);

        }

        return accountNotification2s;

    }

    private BankToCustomerDebitCreditNotificationV02 bankToCustomerDebitCreditNotificationV02() throws MTFieldParsingException {


        List<AccountNotification2> accountNotification2s = accountNotification2();
        //GrpHdr
        GroupHeader42 messageId = (GroupHeader42) new MessageIdFromField20().apply(mt900.getField20());

        //BkToCstmrDbtCdtNtfctn
        BankToCustomerDebitCreditNotificationV02 bankToCustomerDebitCreditNotificationV02  = new BankToCustomerDebitCreditNotificationV02();
        bankToCustomerDebitCreditNotificationV02.setGrpHdr(messageId);
        bankToCustomerDebitCreditNotificationV02.getNtfctn().addAll(accountNotification2s);

        return bankToCustomerDebitCreditNotificationV02;
    }

}