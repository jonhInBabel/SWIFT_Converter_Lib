package com.babel.swift;

import java.io.IOException;
import java.text.ParseException;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;

import org.apache.log4j.Logger;

import com.babel.swift.converters.MT900_Camt054_Converter;
import com.babel.swift.exceptions.MTTypeNotFoundException;
import com.babel.swift.exceptions.MXVersionNotFoundException;
import com.babel.swift.support.EnumMTType;
import com.babel.swift.support.EnumCamt054Version;
import com.prowidesoftware.swift.model.mt.AbstractMT;


public class SWIFT_Message_Converter {

	Logger log = Logger.getLogger( SWIFT_Message_Converter.class );
	
	public SWIFT_Message_Converter() {
		super();
	}

	/**
	 * Devuelve la traducción de mensaje mt a mx con la última versión registrada
	 * @param mtMessage
	 * @return
	 */
	public String mt_to_mx( String mtMessage ) {
		return mt_to_mx( mtMessage, EnumCamt054Version.getLast());
	}
	
	/**
	 * Devuelve la traducción de mensaje mt a mx con una versión especifica registrada
	 * @param mtMessage
	 * @param mxVersion
	 * @return
	 */
	public String mt_to_mx( String mtMessage, String mxVersion ) {
		
		AbstractMT mt;
		String outputMessage = null;
		
		try {
			
			mt = AbstractMT.parse( mtMessage );
			String mtMessageType = mt.getMessageType();
		    
			EnumMTType enumMTType = EnumMTType.fromString( mtMessageType );
	    	
	    	switch  ( enumMTType ) {
				case MT103:
					log.debug( "MT103 found" );
					
					//TODO
					
					break;
				case MT202:
					log.debug( "MT202 found" );
	
					//TODO
					
					break;
				case MT900:
					log.debug( "MT900 found" );
					
					MT900_Camt054_Converter converter = new MT900_Camt054_Converter();
					outputMessage = converter.mt_to_mx( mt, mxVersion );		
					
					break;
				case MT910:
					log.debug( "MT910 found" );
	
					//TODO
					
					break;
				case MT940:
					log.debug( "MT940 found" );
	
					//TODO
					
					break;
				default:
					throw new MTTypeNotFoundException( mtMessageType );
			}
	    	
		}
		catch ( IOException | MTTypeNotFoundException | MXVersionNotFoundException | 
				ParseException | JAXBException | DatatypeConfigurationException e ) {
			outputMessage = null;
			e.printStackTrace();
		}
		
		return outputMessage;
	}
	
	public void mx_to_mt( String mxMessage ) {
		// TODO
	}
	
}