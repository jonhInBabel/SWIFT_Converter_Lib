package com.babel.swift.constructors;

import java.io.StringWriter;
import java.io.Writer;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.namespace.QName;

import org.springframework.util.StringUtils;

import com.babel.swift.mappingfields.Camt054V00102_From_MT900_Mapping;
import com.babel.swift.support.Constants;
import com.babel.swift.support.Utils;

import iso.std.iso._20022.tech.xsd.camt_054_001_02.AccountIdentification4Choice;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.AccountNotification2;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.ActiveOrHistoricCurrencyAndAmount;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.BankToCustomerDebitCreditNotificationV02;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.BranchAndFinancialInstitutionIdentification4;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.CashAccount20;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.DateAndDateTimeChoice;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.Document;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.EntryDetails1;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.EntryTransaction2;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.FinancialInstitutionIdentification7;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.GenericAccountIdentification1;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.GroupHeader42;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.OrganisationIdentification4;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.Party6Choice;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.PartyIdentification32;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.PostalAddress6;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.ReportEntry2;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.TransactionParty2;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.TransactionReferences2;


public class Camt054V00102_From_MT900_Constructor {

	private Camt054V00102_From_MT900_Mapping camt054V00102_from_mt900_mapping;
	
	public Camt054V00102_From_MT900_Constructor( Camt054V00102_From_MT900_Mapping mapping ) {
		camt054V00102_from_mt900_mapping = mapping;
	}
	
	public String xmlGenerator() 
			throws JAXBException, DatatypeConfigurationException, ParseException {
		
		JAXBContext contextObj = JAXBContext.newInstance(Document.class);  
		  
	    Marshaller marshallerObj = contextObj.createMarshaller();  
	    marshallerObj.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, true );  
	    
	    Document document = new Document();
	    
	    document.setBkToCstmrDbtCdtNtfctn( bkToCstmrDbtCdtNtfctn() );
	    
	    /* este codigo es por si las clases no tienen la anotacion de @XmlRootElement
	     * en el Qname se le pone el xmlns del document sino pone esto antes de cada etiqueta :ns2....example:
	     * 
	     * <root xmlns:ns2="http://www.something.com/something">
	     *	<ns2:food>steak</ns2:food>
	     */  
	    JAXBElement<Document> jaxbElement = new JAXBElement<Document>( new QName( Constants.CAMT054_XMLNS, "Document"),
	            									Document.class,
	            									document);
	    
	    // output string writer
	    Writer sw = new StringWriter();
	    
	    // si @XmlRootElement viene en las clases, entonces:
	    marshallerObj.marshal(jaxbElement, sw);
	    
	    // return the string from the string writer
		return sw.toString();
	}
	
	public BankToCustomerDebitCreditNotificationV02 bkToCstmrDbtCdtNtfctn() throws DatatypeConfigurationException, ParseException {
    	
    	/*
    	 * Los elementos se declaran null ya que de esa forma nos aseguramos de que sino hay valores para ese elemento
    	 * no se construya la etiqueta
    	 */
	 
    	//Svcr
    	FinancialInstitutionIdentification7 financialInstitutionIdentification7 = null;
    	BranchAndFinancialInstitutionIdentification4 branchAndFinancialInstitutionIdentification4 = null;
    	if( !StringUtils.isEmpty( camt054V00102_from_mt900_mapping.getBic() ) ){
    		
    		financialInstitutionIdentification7= new FinancialInstitutionIdentification7();
    		financialInstitutionIdentification7.setBIC( camt054V00102_from_mt900_mapping.getBic() );
    		branchAndFinancialInstitutionIdentification4 = new BranchAndFinancialInstitutionIdentification4();
        	branchAndFinancialInstitutionIdentification4.setFinInstnId(financialInstitutionIdentification7);
    		
    	} 
    		    	
    	//Ownr
    	OrganisationIdentification4 organisationIdentification4 = null;
    	Party6Choice party6Choice = null;
    	PartyIdentification32 partyIdentification32 = null;
    	
    	if( !StringUtils.isEmpty( camt054V00102_from_mt900_mapping.getBicOrBei() ) ) {
    		
    		organisationIdentification4 = new OrganisationIdentification4();
    		organisationIdentification4.setBICOrBEI( camt054V00102_from_mt900_mapping.getBicOrBei() );
    		party6Choice = new Party6Choice();
        	party6Choice.setOrgId(organisationIdentification4);
        	partyIdentification32 = new PartyIdentification32();
        	partyIdentification32.setId(party6Choice);
    		
    	}

    	//Othr
    	GenericAccountIdentification1 accountIdentification1 = null;
    	
    	if( !StringUtils.isEmpty( camt054V00102_from_mt900_mapping.getOtherId() ) ) {
    		
    		accountIdentification1 = new GenericAccountIdentification1();
    		accountIdentification1.setId( camt054V00102_from_mt900_mapping.getOtherId() );
    		
    	}
    	
    	//IdIban
    	AccountIdentification4Choice accountIdentification4Choice = null;
    	if( !StringUtils.isEmpty( camt054V00102_from_mt900_mapping.getIban() ) || accountIdentification1 != null ) {
    		
    		accountIdentification4Choice = new AccountIdentification4Choice();
        	accountIdentification4Choice.setIBAN( camt054V00102_from_mt900_mapping.getIban() );
        	accountIdentification4Choice.setOthr(accountIdentification1);
    		
    	}
    	
    	//Acct
    	CashAccount20 account20 = null;
    	if( accountIdentification4Choice!= null || partyIdentification32!= null || branchAndFinancialInstitutionIdentification4!= null ) {
    		account20 = new CashAccount20();
    		account20.setId(accountIdentification4Choice);
    		account20.setOwnr(partyIdentification32);
    		account20.setSvcr(branchAndFinancialInstitutionIdentification4);
    	}
    	
    	//Ntfctn
    	List<String> adrLine = null;
    	PostalAddress6 pstlAdr = null;
    	String nm = null;
    	
    	if( !StringUtils.isEmpty( camt054V00102_from_mt900_mapping.getNameAndAddress() ) ) {
    		
    		adrLine = new ArrayList<String>();
    		adrLine.addAll( camt054V00102_from_mt900_mapping.getNameAndAddress() );
    		nm = adrLine.get(0);
        	adrLine.remove(0);
        	if(!adrLine.isEmpty()) {
        		pstlAdr = new PostalAddress6();
	        	pstlAdr.getAdrLine().addAll(adrLine);
        	}
        	
    	}
    	 
    	//Refs
    	TransactionReferences2 transactionReferences2 = null;
    	if( !StringUtils.isEmpty( camt054V00102_from_mt900_mapping.getEndToEndIdentification() ) ) {
    		
    		transactionReferences2 = new TransactionReferences2();
    		transactionReferences2.setEndToEndId( camt054V00102_from_mt900_mapping.getEndToEndIdentification() );
    		
    	}
    	
    	//Dbtr
    	OrganisationIdentification4 organisationIdentification5 = null;
    	Party6Choice party6Choice1 = null;
    	if( !StringUtils.isEmpty( camt054V00102_from_mt900_mapping.getDebtorBicOrBei() ) ) {
    		
    		organisationIdentification5= new OrganisationIdentification4();
        	organisationIdentification5.setBICOrBEI( camt054V00102_from_mt900_mapping.getDebtorBicOrBei() );
        	party6Choice1 = new Party6Choice();
        	party6Choice.setOrgId(organisationIdentification5);    	
    		
    	}
    	
    	PartyIdentification32 partyIdentification322 = null;
    	TransactionParty2 transactionParty2 = null;
    	if( pstlAdr!=null || nm != null || party6Choice1 != null ) {
    		
    		partyIdentification322 = new PartyIdentification32();
        	partyIdentification322.setPstlAdr(pstlAdr);
        	partyIdentification322.setNm(nm);
        	partyIdentification322.setId(party6Choice1);
        	
        	//RltdPties
        	transactionParty2 = new TransactionParty2();
        	transactionParty2.setDbtr(partyIdentification322);

    	}
    	
    	//TxDtls
    	EntryTransaction2 entryTransaction2 = null;
    	List<EntryTransaction2> entryTransaction2s = null;
    	EntryDetails1 entryDetails1 = null;
    	List<EntryDetails1> entryDetails1s = null;
    	if( !StringUtils.isEmpty( camt054V00102_from_mt900_mapping.getAdditionalTransactionInfo() ) || 
    			transactionParty2 != null || transactionReferences2 !=null ) {
    		
    		entryTransaction2 = new EntryTransaction2();
        	entryTransaction2.setRltdPties( transactionParty2 );
        	entryTransaction2.setRefs( transactionReferences2 );
        	entryTransaction2.setAddtlTxInf( camt054V00102_from_mt900_mapping.getAdditionalTransactionInfo() );
        	
        	entryTransaction2s = new ArrayList<EntryTransaction2>();
        	entryTransaction2s.add(entryTransaction2);
    		
        	//NtryDtls
        	entryDetails1 = new EntryDetails1();
        	
        	entryDetails1.getTxDtls().addAll(entryTransaction2s);
        	
        	entryDetails1s = new ArrayList<EntryDetails1>();
            entryDetails1s.add(entryDetails1);
    	}
    	
    	//ValDt
    	DateAndDateTimeChoice dateAndDateTimeChoice = null;
    	if( !StringUtils.isEmpty( camt054V00102_from_mt900_mapping.getDate() ) ) {
    		
    		dateAndDateTimeChoice = new DateAndDateTimeChoice();	        	
        	
			dateAndDateTimeChoice.setDt( Utils.stringToXMLGregorianCalendar( camt054V00102_from_mt900_mapping.getDate() ) );
			
    	}
    	
    	//Amt
    	ActiveOrHistoricCurrencyAndAmount activeOrHistoricCurrencyAndAmount = null;
    	
    	if( !StringUtils.isEmpty( camt054V00102_from_mt900_mapping.getCurrency() ) && 
    			!StringUtils.isEmpty( camt054V00102_from_mt900_mapping.getAmount() ) ) {
    		 
    		activeOrHistoricCurrencyAndAmount = new ActiveOrHistoricCurrencyAndAmount();
    		activeOrHistoricCurrencyAndAmount.setCcy( camt054V00102_from_mt900_mapping.getCurrency() );
        	activeOrHistoricCurrencyAndAmount.setValue( camt054V00102_from_mt900_mapping.getAmount() );
    	}
    	  	
    	//Ntry
    	ReportEntry2 reportEntry2 = null;
    	List<ReportEntry2> reportEntry2s = null;
    	
    	if( dateAndDateTimeChoice!=null || activeOrHistoricCurrencyAndAmount!=null || entryDetails1s!=null ) {
    		
    		reportEntry2 = new ReportEntry2();
    		reportEntry2.setValDt(dateAndDateTimeChoice);
        	reportEntry2.setAmt(activeOrHistoricCurrencyAndAmount);
        	reportEntry2.getNtryDtls().addAll(entryDetails1s);
        	reportEntry2s = new ArrayList<ReportEntry2>();
        	reportEntry2s.add(reportEntry2);
    	}
    	
    	//Ntfctn
    	AccountNotification2 accountNotification2 = null;
    	List<AccountNotification2> accountNotification2s= null;
    	
    	if(account20!= null || reportEntry2s!= null || !StringUtils.isEmpty( camt054V00102_from_mt900_mapping.getIdentification() ) ) {
    		
    		accountNotification2 = new AccountNotification2();
    		accountNotification2.setId( camt054V00102_from_mt900_mapping.getIdentification() );
        	accountNotification2.setAcct(account20);
        	accountNotification2.getNtry().addAll(reportEntry2s);
        	
        	accountNotification2s= new ArrayList<AccountNotification2>();
        	accountNotification2s.add(accountNotification2);
        	
    	}
    	    	
    	//GrpHdr
    	GroupHeader42 grpHdr = null;
    	if( !StringUtils.isEmpty( camt054V00102_from_mt900_mapping.getMessageId() ) ) {
    		
    		grpHdr = new GroupHeader42();
    		grpHdr.setMsgId( camt054V00102_from_mt900_mapping.getMessageId() );
    	}
    	
    	//BkToCstmrDbtCdtNtfctn
    	BankToCustomerDebitCreditNotificationV02 bkToCstmrDbtCdtNtfctn  = new BankToCustomerDebitCreditNotificationV02();
    	bkToCstmrDbtCdtNtfctn.setGrpHdr(grpHdr);
    	bkToCstmrDbtCdtNtfctn.getNtfctn().addAll(accountNotification2s);

    	return bkToCstmrDbtCdtNtfctn;
    }

	public Camt054V00102_From_MT900_Mapping getCamt054V00102_from_mt900_mapping() {
		return camt054V00102_from_mt900_mapping;
	}

	public void setCamt054V00102_from_mt900_mapping( Camt054V00102_From_MT900_Mapping camt054v00102_from_mt900_mapping ) {
		camt054V00102_from_mt900_mapping = camt054v00102_from_mt900_mapping;
	}
	
}