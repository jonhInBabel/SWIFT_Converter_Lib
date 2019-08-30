package com.babel.swift.converters;

import com.babel.swift.exceptions.MTTypeNotFoundException;
import com.babel.swift.support.EnumMTType;

public class ConverterFactory {

    String messageType;

    public ConverterFactory(String messageType) {
        this.messageType = messageType;
    }

    public I_MT_MX_Converter getConverter() throws MTTypeNotFoundException{
        EnumMTType enumMTType = EnumMTType.fromString( this.messageType );
        switch  ( enumMTType ) {
            case MT103:
                return new MT103_Pacs008_Converter();
            case MT202:
                return new MT202_Pacs009_Converter();
            case MT900:
                return new MT900_Camt054_Converter();
            case MT910:
                return new MT910_Camt054_Converter();
            case MT940:
                return new MT940_Camt053_Converter();
            default:
                throw new MTTypeNotFoundException( this.messageType );
        }
    }



}
