package com.babel.swift;

import java.io.IOException;
import java.text.ParseException;
import java.util.GregorianCalendar;

import com.babel.swift.converters.ConverterFactory;
import com.babel.swift.converters.MT_Converters.I_MT_Converter;
import com.babel.swift.converters.MX_Converters.I_MX_Converter;
import com.babel.swift.exceptions.*;
import com.babel.swift.messages.ConfirmationOfDebitMessage;
import com.babel.swift.messages.SwiftMessage;
import com.prowidesoftware.swift.model.field.Field32A;
import com.prowidesoftware.swift.model.mt.mt1xx.MT103;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import org.apache.log4j.Logger;
import com.prowidesoftware.swift.model.mt.AbstractMT;

public class SWIFT_Message_Converter {

	Logger log = Logger.getLogger( SWIFT_Message_Converter.class );
	I_MT_Converter mtConverter;
	I_MX_Converter mxConverter;
	
	public SWIFT_Message_Converter() { }

	/**
	 * Devuelve la traducción de mensaje mt a mx
	 * @param mtMessage
	 * @return
	 * @throws MTPreconditionException 
	 * @throws ParseException 
	 */
	public String mt_to_mx( String mtMessage ) throws MTTypeNotFoundException, MTParsingException, MTConversionException, MTPreconditionException {
		AbstractMT mt;
		try {
			mt = AbstractMT.parse( mtMessage );
		} catch (IOException e) {
			throw new MTParsingException();
		}
		this.mtConverter = ConverterFactory.getConverter(mt);
		return this.mtConverter.mt_to_mx(mt);
	}

	/**
	 * Devuelve la traducción de mensaje mx a mt
	 * @param mxMessage
	 * @return
	 * @throws ParseException
	 */
	public String mx_to_mt( String mxMessage ) throws MXTypeNotFoundException, MXConversionException {
		AbstractMX mx = AbstractMX.parse(mxMessage, null);
		this.mxConverter = ConverterFactory.getConverter(mx);
		return this.mxConverter.mx_to_mt(mx);
	}

	public String generateMessage (MT103 mt) {
		Field32A field32A = new Field32A();
		field32A.setAmount(123213.213);
		field32A.setDate();
		mt.append(field32A);
		// check if this would print in mt format...
		return mt.getSwiftMessage().toString();
	}
	
}