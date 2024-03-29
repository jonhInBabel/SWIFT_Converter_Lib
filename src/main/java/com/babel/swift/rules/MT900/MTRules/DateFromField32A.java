package com.babel.swift.rules.MT900.MTRules;

import com.babel.swift.exceptions.MTFieldParsingException;
import com.babel.swift.rules.IMTRule;
import com.babel.swift.support.Utils;
import com.prowidesoftware.swift.model.field.Field32A;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.DateAndDateTimeChoice;
import org.springframework.util.StringUtils;

import javax.xml.datatype.DatatypeConfigurationException;
import java.text.ParseException;

public class DateFromField32A implements IMTRule {

	@Override
	public Object apply(Object mtField) throws MTFieldParsingException {

		DateAndDateTimeChoice dateAndDateTimeChoice = null;
		if( !StringUtils.isEmpty( mtField ) ) {

			Field32A field32A = (Field32A) mtField;
			dateAndDateTimeChoice = new DateAndDateTimeChoice();

			try {
				String date = Utils.dateSimpleFormat(field32A.getDate());
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