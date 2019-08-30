package com.babel.swift;

import java.io.IOException;
import java.text.ParseException;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;

import com.babel.swift.converters.ConverterFactory;
import com.babel.swift.converters.I_MT_MX_Converter;
import com.babel.swift.exceptions.MTConversionException;
import com.babel.swift.exceptions.MTParsingException;
import org.apache.log4j.Logger;

import com.babel.swift.converters.MT900_Camt054_Converter;
import com.babel.swift.exceptions.MTTypeNotFoundException;
import com.babel.swift.exceptions.MXVersionNotFoundException;
import com.babel.swift.support.EnumMTType;
import com.babel.swift.support.EnumCamt054Version;
import com.prowidesoftware.swift.model.mt.AbstractMT;


public class SWIFT_Message_Converter {

	Logger log = Logger.getLogger( SWIFT_Message_Converter.class );

	I_MT_MX_Converter converter;
	
	public SWIFT_Message_Converter() {
		super();
	}

	/**
	 * Devuelve la traducción de mensaje mt a mx con la última versión registrada
	 * @param mtMessage
	 * @return
	 */
/*	public String mt_to_mx( String mtMessage ) {
		return mt_to_mx( mtMessage, EnumCamt054Version.getLast());
	}*/
	
	/**
	 * Devuelve la traducción de mensaje mt a mx con la última version existente?? o la ultima version que
	 * queramos??
	 * @param mtMessage
	 * @param mxVersion
	 * @return
	 */
	public String mt_to_mx( String mtMessage, String mxVersion ) throws MTTypeNotFoundException, MTParsingException, MTConversionException {
		AbstractMT mt;
		try {
			mt = AbstractMT.parse( mtMessage );
		} catch (IOException e) {
			throw new MTParsingException();
		}
		String mtMessageType = mt.getMessageType();
		ConverterFactory converterFactory = new ConverterFactory(mtMessageType);
		this.converter = converterFactory.getConverter();
		return this.converter.mt_to_mx(mt, mxVersion);
	}
	
	public void mx_to_mt( String mxMessage ) {
		// TODO
	}
	
}