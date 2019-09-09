package com.babel.swift.converters.MX_Converters.cam054;

import com.babel.swift.converters.MX_Converters.I_MX_Converter;
import com.babel.swift.exceptions.MXConversionException;
import com.babel.swift.mappers.MX_Mappers.AMXMapper;
import com.babel.swift.mappers.MX_Mappers.cam054.Cam054_002_Mapper;
import com.prowidesoftware.swift.model.mx.AbstractMX;

public class Cam054_002_Converter implements I_MX_Converter {

    AMXMapper mxMapper;

    public Cam054_002_Converter() { this.mxMapper = new Cam054_002_Mapper(); }

    @Override
    public String mx_to_mt(AbstractMX mx) throws MXConversionException {
        return this.mxMapper.convert2MT(mx);
    }
}
