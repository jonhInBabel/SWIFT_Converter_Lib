package com.babel.swift.rules.MT900.MTRules;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.babel.swift.exceptions.MTFieldParsingException;
import com.babel.swift.rules.IMTRule;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.model.mt.mt9xx.MT900;

import iso.std.iso._20022.tech.xsd.camt_054_001_02.PostalAddress6;


public class AddressLinesFromField52D implements IMTRule {

    @Override
    public Object apply(AbstractMT mt) throws MTFieldParsingException {
       
    	MT900 mt900 = (MT900) mt;
    	
        //Ntfctn
        List<String> adrLine = null;
        PostalAddress6 pstlAdr = null;
        if( !StringUtils.isEmpty( mt900.getField52D() ) ) {

            if(!StringUtils.isEmpty(mt900.getField52D().getNameAndAddressLine2()) ||
            		!StringUtils.isEmpty(mt900.getField52D().getNameAndAddressLine3()) ||
            		!StringUtils.isEmpty(mt900.getField52D().getNameAndAddressLine4())) {
                adrLine = new ArrayList<String>();
                adrLine.add(mt900.getField52D().getNameAndAddressLine2());
                adrLine.add(mt900.getField52D().getNameAndAddressLine3());
                adrLine.add(mt900.getField52D().getNameAndAddressLine4());
            }

            if(adrLine != null) {
                pstlAdr = new PostalAddress6();
                pstlAdr.getAdrLine().addAll(adrLine);
            }

        }

        return pstlAdr;
    }

}