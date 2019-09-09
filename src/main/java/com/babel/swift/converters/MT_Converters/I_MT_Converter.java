package com.babel.swift.converters.MT_Converters;

import com.babel.swift.exceptions.MTConversionException;
import com.prowidesoftware.swift.model.mt.AbstractMT;

public interface I_MT_Converter {

	String mt_to_mx( AbstractMT mt ) throws MTConversionException;
	
}