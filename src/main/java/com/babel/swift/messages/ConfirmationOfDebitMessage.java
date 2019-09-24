package com.babel.swift.messages;

import com.babel.swift.support.EnumMTVersion;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.BankToCustomerDebitCreditNotificationV02;

public class ConfirmationOfDebitMessage extends SwiftMessage {

    public ConfirmationOfDebitMessage(EnumMTVersion version) throws ClassNotFoundException{
        switch (version){
            case V000_00:
            case V001_02:
                this.message = new BankToCustomerDebitCreditNotificationV02();
                break;
            default:
                throw new ClassNotFoundException("Invalid version found to create a ConfirmationOfDebitMessage");
        }
    }

}
