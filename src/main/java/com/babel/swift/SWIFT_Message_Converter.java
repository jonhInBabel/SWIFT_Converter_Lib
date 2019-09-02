package com.babel.swift;

import java.io.IOException;

import com.babel.swift.converters.ConverterFactory;
import com.babel.swift.converters.I_MT_MX_Converter;
import com.babel.swift.exceptions.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import org.apache.log4j.Logger;
import com.prowidesoftware.swift.model.mt.AbstractMT;

public class SWIFT_Message_Converter {

	Logger log = Logger.getLogger( SWIFT_Message_Converter.class );
	I_MT_MX_Converter converter;
	ConverterFactory converterFactory;
	
	public SWIFT_Message_Converter() {
		this.converterFactory = new ConverterFactory();
	}

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
		this.converter = this.converterFactory.getConverter(mt);
		return this.converter.mt_to_mx(mt, mxVersion);
	}
	
	public String mx_to_mt( String mxMessage ) throws MXTypeNotFoundException, MXConversionException {
		AbstractMX mx = AbstractMX.parse(mxMessage, null);
		this.converter = this.converterFactory.getConverter(mx);
		return this.converter.mx_to_mt(mx);
	}
	
}