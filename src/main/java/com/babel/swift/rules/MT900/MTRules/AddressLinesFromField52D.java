package com.babel.swift.rules.MT900.MTRules;

import com.babel.swift.exceptions.MTFieldParsingException;
import com.babel.swift.rules.IMTRule;
import com.prowidesoftware.swift.model.field.Field52D;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.PostalAddress6;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class AddressLinesFromField52D implements IMTRule {

    /*
	public static List<String> getField20Value( Field52D field52D ) {
		List<String> nameAndAddress_lines = new ArrayList<String>();
		if(field52D != null) {
			nameAndAddress_lines.add(field52D.getNameAndAddressLine1());
			nameAndAddress_lines.add(field52D.getNameAndAddressLine2());
			nameAndAddress_lines.add(field52D.getNameAndAddressLine3());
			nameAndAddress_lines.add(field52D.getNameAndAddressLine4());
		}

		return nameAndAddress_lines;
	}
	*/

    @Override
    public Object apply(Object mtField) throws MTFieldParsingException {
       

        //Ntfctn
        List<String> adrLine = null;
        PostalAddress6 pstlAdr = null;

        if( !StringUtils.isEmpty( mtField ) ) {
        	 Field52D field52D = (Field52D) mtField;
            adrLine = new ArrayList<String>();
            adrLine.add(field52D.getNameAndAddressLine2());
            adrLine.add(field52D.getNameAndAddressLine3());
            adrLine.add(field52D.getNameAndAddressLine4());
            if(!adrLine.isEmpty()) {
                pstlAdr = new PostalAddress6();
                pstlAdr.getAdrLine().addAll(adrLine);
            }

        }

        return pstlAdr;
    }

}