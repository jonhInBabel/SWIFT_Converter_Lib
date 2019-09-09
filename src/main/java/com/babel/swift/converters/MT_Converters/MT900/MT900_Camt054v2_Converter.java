package com.babel.swift.converters.MT_Converters.MT900;

import com.babel.swift.converters.MT_Converters.I_MT_Converter;
import com.babel.swift.exceptions.MTConversionException;
import com.babel.swift.exceptions.MXConversionException;
import com.babel.swift.mappers.MT_Mappers.AMTMapper;
import com.babel.swift.mappers.MT_Mappers.MT900.MT900_Mapper;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import org.apache.log4j.Logger;

public class MT900_Camt054v2_Converter implements I_MT_Converter {

	AMTMapper mapper;

	public MT900_Camt054v2_Converter() {
		this.mapper =  new MT900_Mapper();
	}

	@Override
	public String mt_to_mx( AbstractMT mt ) throws MTConversionException {
		return mapper.convert2MX( mt );
	}
	
}