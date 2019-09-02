package com.babel.swift.converters;

import com.babel.swift.converters.MT103_Pac008.MT103_Pacs008_Converter;
import com.babel.swift.converters.MT202_Pac009.MT202_Pacs009_Converter;
import com.babel.swift.converters.MT900.MT900Converter;
import com.babel.swift.converters.MT910_Cam054.MT910_Camt054_Converter;
import com.babel.swift.converters.MT940_Cam053.MT940_Camt053_Converter;
import com.babel.swift.exceptions.MTTypeNotFoundException;
import com.babel.swift.exceptions.MXTypeNotFoundException;
import com.babel.swift.support.EnumMTType;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.model.mx.AbstractMX;

public class ConverterFactory {

    public static I_MT_MX_Converter getConverter(AbstractMT mt) throws MTTypeNotFoundException{
        String messageType = mt.getMessageType();
        EnumMTType enumMTType = EnumMTType.fromString( messageType );
        switch  ( enumMTType ) {
            case MT103:
                return new MT103_Pacs008_Converter();
            case MT202:
                return new MT202_Pacs009_Converter();
            case MT900:
                return new MT900Converter();
            case MT910:
                return new MT910_Camt054_Converter();
            case MT940:
                return new MT940_Camt053_Converter();
            default:
                throw new MTTypeNotFoundException( messageType );
        }
    }

    public static I_MT_MX_Converter getConverter(AbstractMX mx) throws MXTypeNotFoundException {
        // TODO: implement logic here to select the correct converter based on AbstractMX message
        return new MT900Converter();
    }



}
