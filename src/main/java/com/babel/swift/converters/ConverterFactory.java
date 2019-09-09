package com.babel.swift.converters;

import com.babel.swift.converters.MT_Converters.I_MT_Converter;
import com.babel.swift.converters.MT_Converters.MT103.MT103_Pacs008_Converter;
import com.babel.swift.converters.MT_Converters.MT202.MT202_Pacs009_Converter;
import com.babel.swift.converters.MT_Converters.MT900.MT900_Camt054v2_Converter;
import com.babel.swift.converters.MT_Converters.MT910.MT910_Camt054_Converter;
import com.babel.swift.converters.MT_Converters.MT940.MT940_Camt053_Converter;
import com.babel.swift.converters.MX_Converters.I_MX_Converter;
import com.babel.swift.converters.MX_Converters.cam054.Cam054_002_Converter;
import com.babel.swift.converters.MX_Converters.pacs008.Pacs008_001_08_Converter;
import com.babel.swift.converters.MX_Converters.pacs009.Pacs009_001_08_Converter;
import com.babel.swift.exceptions.MTTypeNotFoundException;
import com.babel.swift.exceptions.MXTypeNotFoundException;
import com.babel.swift.support.EnumMTType;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.model.mx.AbstractMX;

public class ConverterFactory {

    public static I_MT_Converter getConverter(AbstractMT mt) throws MTTypeNotFoundException{
        String messageType = mt.getMessageType();
        EnumMTType enumMTType = EnumMTType.fromString( messageType );
        switch  ( enumMTType ) {
            case MT103:
                return new MT103_Pacs008_Converter();
            case MT202:
                return new MT202_Pacs009_Converter();
            case MT900:
                return new MT900_Camt054v2_Converter();
            case MT910:
                return new MT910_Camt054_Converter();
            case MT940:
                return new MT940_Camt053_Converter();
            default:
                throw new MTTypeNotFoundException( messageType );
        }
    }

    public static I_MX_Converter getConverter(AbstractMX mx) throws MXTypeNotFoundException {
        // TODO: implement logic here to select the correct converter based on MX message version
        // and MT type to be converted (one MX type might be related to n MT type)

        int version = mx.getVersion();

        switch (version) {
            case 123213:
                return new Cam054_002_Converter();
            case 8:
                return new Pacs008_001_08_Converter();
            case 9:
                return new Pacs009_001_08_Converter();
            default:
                throw new MXTypeNotFoundException("Invalid version of mx found: " + version);
        }

    }

}
