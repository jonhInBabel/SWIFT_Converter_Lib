package com.babel.swift.converters;

import com.babel.swift.exceptions.MTConversionException;
import com.babel.swift.exceptions.MXConversionException;
import com.babel.swift.mappingfields.Cam054XMLGenerator;
import org.apache.log4j.Logger;

import com.babel.swift.exceptions.MXVersionNotFoundException;
import com.babel.swift.mappingfields.Camt054V00102_From_MT900_Mapper;
import com.babel.swift.support.EnumCamt054Version;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.model.mt.mt9xx.MT900;


public class MT900_Camt054_Converter implements I_MT_MX_Converter {

	Logger log = Logger.getLogger( MT900_Camt054_Converter.class );
	
	public String mt_to_mx( AbstractMT mt, String mxVersion ) throws MTConversionException {
		
		MT900 mt900 = ( MT900 ) mt;
			
		EnumCamt054Version enumMXVersion = EnumCamt054Version.fromString( mxVersion );
    	
    	switch( enumMXVersion ) {
//			case V001_01:
//				log.debug( "MX version 001.01 found" );
//				
//				
//				return "X";
			case V001_02:
				log.debug( "MX version 001.02 found" );
				Camt054V00102_From_MT900_Mapper camt054ToMT900_mapper = new Camt054V00102_From_MT900_Mapper( new Cam054XMLGenerator());
				return camt054ToMT900_mapper.generateXML(mt900);
		default:
				throw new MXVersionNotFoundException( mxVersion );
		}
		
	}

	public String mx_to_mt( String mxMessage ) throws MXConversionException {
		// TODO
		return null;
	}
	
}