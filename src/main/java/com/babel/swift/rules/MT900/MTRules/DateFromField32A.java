package com.babel.swift.rules.MT900.MTRules;

import com.babel.swift.exceptions.MTFieldParsingException;
import com.babel.swift.rules.IMTRule;
import com.babel.swift.support.Utils;
import com.prowidesoftware.swift.model.field.Field32A;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.model.mt.mt9xx.MT900;

import iso.std.iso._20022.tech.xsd.camt_054_001_02.DateAndDateTimeChoice;
import org.springframework.util.StringUtils;

import javax.xml.datatype.DatatypeConfigurationException;
import java.text.ParseException;

public class DateFromField32A implements IMTRule {

	@Override
	public Object apply(AbstractMT mt) throws MTFieldParsingException {
		MT900 mt900 = (MT900) mt;
		DateAndDateTimeChoice dateAndDateTimeChoice = null;
		
		if( !StringUtils.isEmpty( mt900.getField32A() ) ) {
			
			dateAndDateTimeChoice = new DateAndDateTimeChoice();

			try {
				String date = Utils.dateSimpleFormat(mt900.getField32A().getDate());
				dateAndDateTimeChoice.setDt( Utils.stringToXMLGregorianCalendar( date ) );
			} catch (DatatypeConfigurationException e) {
				e.printStackTrace();
				throw new MTFieldParsingException(e.getMessage());
			} catch (ParseException e) {
				e.printStackTrace();
				throw new MTFieldParsingException(e.getMessage());
			}

		}
		return dateAndDateTimeChoice;
	}
}