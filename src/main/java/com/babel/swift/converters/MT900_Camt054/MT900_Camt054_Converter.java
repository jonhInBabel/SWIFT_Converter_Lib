package com.babel.swift.converters.MT900_Camt054;

import com.babel.swift.converters.I_MT_MX_Converter;
import com.babel.swift.exceptions.MTConversionException;
import com.babel.swift.exceptions.MXConversionException;
import com.babel.swift.exceptions.MXVersionNotFoundException;
import com.babel.swift.mappers.AMapper;
import com.babel.swift.mappers.MT900.MT900_Mapper;
import com.babel.swift.support.EnumMTVersion;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.model.mt.mt9xx.MT900;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import org.apache.log4j.Logger;

import java.text.ParseException;

public class MT900_Camt054_Converter implements I_MT_MX_Converter {

	Logger log = Logger.getLogger( MT900_Camt054_Converter.class );
	AMapper mapper;

	public MT900_Camt054_Converter() {
		this.mapper =  new MT900_Mapper();
	}
	
	public String mt_to_mx( AbstractMT mt, String mxVersion ) throws MTConversionException, ParseException {
		
		MT900 mt900 = ( MT900 ) mt;
		EnumMTVersion enumMXVersion = EnumMTVersion.fromString( mxVersion );
    	
    	switch( enumMXVersion ) {
//			case V001_01:
//				log.debug( "MX version 001.01 found" );
//				return "X";
			case V001_02:
				log.debug( "MX version 001.02 found" );
				return mapper.convert2MX(mt900);
			default:
				throw new MXVersionNotFoundException( mxVersion );
		}
		
	}

	public String mx_to_mt( AbstractMX mx ) throws MXConversionException {
		return this.mapper.convert2MT(mx);
	}
	
}