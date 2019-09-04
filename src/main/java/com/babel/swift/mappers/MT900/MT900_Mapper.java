package com.babel.swift.mappers.MT900;

import java.util.List;
import com.babel.swift.exceptions.MTFieldParsingException;
import com.babel.swift.exceptions.MXFieldParsingException;
import com.babel.swift.mappers.AMapper;
import com.babel.swift.mappers.IXMLGenerator;
import com.babel.swift.rules.MT900.MTRules.*;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.model.mt.mt9xx.MT900;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.*;
import org.springframework.util.StringUtils;

public class MT900_Mapper extends AMapper {


	public MT900_Mapper() {
		super(new MT900XMLGenerator());
	}

	@Override
	protected void applyMTRules(AbstractMT mtMessage) throws MTFieldParsingException {

	}

	@Override
	protected void applyMXRules(AbstractMX mxMessage) throws MXFieldParsingException {

	}
}