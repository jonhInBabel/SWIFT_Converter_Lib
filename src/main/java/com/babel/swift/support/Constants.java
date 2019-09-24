package com.babel.swift.support;

public class Constants {
	
	// document xlmns
	public static final String PACS008_XMLNS = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.02";
	public static final String PACS009_XMLNS = "urn:iso:std:iso:20022:tech:xsd:camt.009.001.02";
	public static final String CAMT053_XMLNS = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.02";
	public static final String CAMT054_XMLNS = "urn:iso:std:iso:20022:tech:xsd:camt.054.001.02";
	
	// date formats
	public static final String YYMMDD 				= "yyMMdd"; 
	public static final String YYYY_MM_DD 			= "yyyy-MM-dd";
	public static final String YYYY_MM_DDTHH_MM_SS 	= "yyyy-MM-dd'T'HH:mm:ss";

	// mt103 preconditions messages
	public static final String FIELD57_PRECONDITION	= "Fail ('01006', 'Field 57a must not be used with option B.', 57a Account With Institution)";

    public static final String FIELD53B_PRECONDITION = "Fail ('01002', 'If field 53a is present with option B, then PartyIdentifier must be present.', 53a Sender's Correspondent\\53B\\Party Identifier, 53a Sender's Correspondent)";
    public static final String FIELD54B_PRECONDITION = "Fail ('01003', 'Field 54a must not be used with option B.', 54a Receiver's Correspondent)";
	public static final String FIELD56C_PRECONDITION = "Fail ('01005', 'If field 56a is present with option C, then it must start with // and must be followed by the clearing code of the intermediary institution. If 56C starts with //RT, then it must start with //RT// followed by the clearing code of the intermediary institution.', 56a Intermediary Institution\\56C)";
	public static final String FIELD55B_PRECONDITION = "Fail ('01004', 'Field 55a must not be used with option B.', 55a Third Reimbursement Institution)";
	public static final String FIELD53A_PRECONDITION = "Fail ('01004', 'Field 55a must not be used with option B.', 55a Third Reimbursement Institution)";
	public static final String FIELD71F_PRECONDITION = "Fail ('01000', 'The currency code in fields 71F and 32A must be the same.', ., ..\\32A Value Date/Currency/Interbank Settled Amount)";
}