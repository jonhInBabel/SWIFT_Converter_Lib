package com.babel.swift.mappingfields;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.List;

import com.babel.swift.rules.Field20_Rules;
import com.babel.swift.rules.Field21_Rules;
import com.babel.swift.rules.Field25_Rules;
import com.babel.swift.rules.Field32A_Rules;
import com.babel.swift.rules.Field52A_Rules;
import com.babel.swift.rules.Field52D_Rules;
import com.babel.swift.rules.Field72_Rules;
import com.babel.swift.rules.InputDestinationAddress_Rules;
import com.babel.swift.rules.LogicalTerminalAddress_Rules;
import com.prowidesoftware.swift.model.mt.mt9xx.MT900;
                                                                                  

public class Camt054V00102_From_MT900_Mapping {

	private String 			bic;
	private String 			bicOrBei;
	private String 			messageId;
	private String 			identification;
	private String 			endToEndIdentification;
	private String 			iban;
	private String 			otherId;
	private String 			date;
	private String 			currency;
	private BigDecimal		amount;
	private String 			debtorBicOrBei;
	private List<String> 	nameAndAddress;	
	private String 			additionalTransactionInfo;
	
	public Camt054V00102_From_MT900_Mapping( MT900 mt900 ) throws ParseException {
		bic 						= LogicalTerminalAddress_Rules.getBIC( mt900.getLogicalTerminal() );
		bicOrBei 					= InputDestinationAddress_Rules.getBICOrBEI( mt900.getReceiver() );
		messageId					= Field20_Rules.getField20Value( mt900.getField20() );
		identification 				= Field20_Rules.getField20Value( mt900.getField20() );
		endToEndIdentification 		= Field21_Rules.getField21Value( mt900.getField21() );
		iban						= Field25_Rules.getIBAN( mt900.getField25() );
		otherId						= Field25_Rules.getOtherIdentification( mt900.getField25() );
		date						= Field32A_Rules.getDate( mt900.getField32A() );
		currency					= Field32A_Rules.getCurrency( mt900.getField32A() );
		amount						= Field32A_Rules.getAmount( mt900.getField32A() );
		debtorBicOrBei				= Field52A_Rules.getField20Value( mt900.getField52A() );
		nameAndAddress				= Field52D_Rules.getField20Value( mt900.getField52D() );
		additionalTransactionInfo	= Field72_Rules.getField20Value( mt900.getField72() );
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	public String getBicOrBei() {
		return bicOrBei;
	}

	public void setBicOrBei(String bicOrBei) {
		this.bicOrBei = bicOrBei;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public String getEndToEndIdentification() {
		return endToEndIdentification;
	}

	public void setEndToEndIdentification(String endToEndIdentification) {
		this.endToEndIdentification = endToEndIdentification;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getOtherId() {
		return otherId;
	}

	public void setOtherId(String otherId) {
		this.otherId = otherId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getDebtorBicOrBei() {
		return debtorBicOrBei;
	}

	public void setDebtorBicOrBei(String debtorBicOrBei) {
		this.debtorBicOrBei = debtorBicOrBei;
	}

	public List<String> getNameAndAddress() {
		return nameAndAddress;
	}

	public void setNameAndAddress(List<String> nameAndAddress) {
		this.nameAndAddress = nameAndAddress;
	}

	public String getAdditionalTransactionInfo() {
		return additionalTransactionInfo;
	}

	public void setAdditionalTransactionInfo(String additionalTransactionInfo) {
		this.additionalTransactionInfo = additionalTransactionInfo;
	}
	
}