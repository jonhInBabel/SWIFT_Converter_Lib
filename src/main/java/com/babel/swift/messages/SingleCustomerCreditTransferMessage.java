package com.babel.swift.messages;

import com.babel.swift.support.EnumMTVersion;
import iso.std.iso._20022.tech.xsd.pacs_008_001_02.FIToFICustomerCreditTransferV02;

public class SingleCustomerCreditTransferMessage extends SwiftMessage {

    public SingleCustomerCreditTransferMessage(EnumMTVersion version) throws ClassNotFoundException{
        switch (version){
            case V000_00:
            case V001_02:
                this.message = new FIToFICustomerCreditTransferV02();
                break;
            default:
                throw new ClassNotFoundException("Invalid version found to create a ConfirmationOfDebitMessage");
        }
    }

}
