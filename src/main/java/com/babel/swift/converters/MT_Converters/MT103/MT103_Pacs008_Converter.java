package com.babel.swift.converters.MT_Converters.MT103;

import com.babel.swift.converters.MT_Converters.I_MT_Converter;
import com.babel.swift.exceptions.MTConversionException;
import com.babel.swift.mappers.MT_Mappers.AMTMapper;
import com.babel.swift.mappers.MT_Mappers.MT103.MT103_Mapper;
import com.babel.swift.validators.AMTValidator;
import com.babel.swift.validators.MT103.MT103_Validator;
import com.prowidesoftware.swift.model.mt.AbstractMT;

public class MT103_Pacs008_Converter implements I_MT_Converter {
	
	AMTMapper mapper;
	AMTValidator validator;
	
	public MT103_Pacs008_Converter() {
	
		this.mapper 	= new MT103_Mapper();
		this.validator 	= new MT103_Validator();
		
	}
	
	@Override
	public String mt_to_mx(AbstractMT mt) throws MTConversionException {

		this.validator.validate( mt );
		return mapper.convert2MX( mt );
		
	}
	
}