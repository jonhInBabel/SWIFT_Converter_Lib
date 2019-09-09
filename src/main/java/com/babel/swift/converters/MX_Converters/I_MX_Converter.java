package com.babel.swift.converters.MX_Converters;

import com.babel.swift.exceptions.MXConversionException;
import com.prowidesoftware.swift.model.mx.AbstractMX;

public interface I_MX_Converter {

    String mx_to_mt( AbstractMX mx ) throws MXConversionException;

}
