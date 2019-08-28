package com.babel.swift.converters;

import java.text.ParseException;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;

import org.apache.log4j.Logger;

import com.babel.swift.constructors.Camt054V00102_From_MT900_Constructor;
import com.babel.swift.exceptions.MXVersionNotFoundException;
import com.babel.swift.mappingfields.Camt054V00102_From_MT900_Mapping;
import com.babel.swift.support.EnumCamt054Version;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.model.mt.mt9xx.MT900;


public class MT900_Camt054_Converter implements I_MT_MX_Converter {

	Logger log = Logger.getLogger( MT900_Camt054_Converter.class );
	
	public String mt_to_mx( AbstractMT mt, String mxVersion ) 
			throws MXVersionNotFoundException, ParseException, JAXBException, DatatypeConfigurationException {
		
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
				
				Camt054V00102_From_MT900_Mapping camt054_001_02_m 		= new Camt054V00102_From_MT900_Mapping( mt900 );
				Camt054V00102_From_MT900_Constructor camt054_001_02_c 	= new Camt054V00102_From_MT900_Constructor( camt054_001_02_m );
				
				return camt054_001_02_c.xmlGenerator();
		default:
				throw new MXVersionNotFoundException( mxVersion );
		}
		
	}

	public void mx_to_mt( String mxMessage ) {
		// TODO
		
	}
	
}