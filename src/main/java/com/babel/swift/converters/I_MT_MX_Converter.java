package com.babel.swift.converters;

import com.babel.swift.exceptions.MTConversionException;
import com.babel.swift.exceptions.MXConversionException;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.model.mx.AbstractMX;


public interface I_MT_MX_Converter {

	String mt_to_mx( AbstractMT mt, String mxVersion ) throws MTConversionException;
	
	String mx_to_mt( AbstractMX mx ) throws MXConversionException;
	
}