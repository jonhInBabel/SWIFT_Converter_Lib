package com.babel.swift.converters.MT_Converters.MT900;

import com.babel.swift.converters.MT_Converters.I_MT_Converter;
import com.babel.swift.exceptions.MTConversionException;
import com.babel.swift.exceptions.MTPreconditionException;
import com.babel.swift.mappers.MT_Mappers.AMTMapper;
import com.babel.swift.mappers.MT_Mappers.MT900.MT900_Mapper;
import com.babel.swift.validators.AMTValidator;
import com.babel.swift.validators.MT900.MT900_Validator;
import com.prowidesoftware.swift.model.mt.AbstractMT;

public class MT900_Camt054v2_Converter implements I_MT_Converter {

	AMTMapper mapper;
	AMTValidator validator;

	public MT900_Camt054v2_Converter() {
		this.mapper =  new MT900_Mapper();
		this.validator = new MT900_Validator();
	}

	@Override
	public String mt_to_mx( AbstractMT mt ) throws MTConversionException, MTPreconditionException {
		this.validator.validate( mt );
		return mapper.convert2MX( mt );
	}
	
}