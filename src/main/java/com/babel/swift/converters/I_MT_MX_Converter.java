package com.babel.swift.converters;

import com.babel.swift.exceptions.MTConversionException;
import com.babel.swift.exceptions.MXConversionException;
import com.prowidesoftware.swift.model.mt.AbstractMT;


public interface I_MT_MX_Converter {

	public String mt_to_mx( AbstractMT mt, String mxVersion ) throws MTConversionException;
	
	public String mx_to_mt( String mxMessage ) throws MXConversionException;
	
}