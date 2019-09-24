package com.babel.swift.preconditions.MT103;

import com.babel.swift.exceptions.MTPreconditionException;
import com.babel.swift.preconditions.IMTPrecondition;
import com.babel.swift.support.Constants;
import com.prowidesoftware.swift.model.field.Field56C;
import org.springframework.util.StringUtils;

import java.util.List;

public class SR3From56a implements IMTPrecondition {
    /**
     * @param mtFields Only element of the list is field 56a option C
     * @throws MTPreconditionException If conditions are not met
     */
    @Override
    public void apply(List<Object> mtFields) throws MTPreconditionException {
        if( !StringUtils.isEmpty( mtFields.get(0) ) ) {
            Field56C field56C = (Field56C) mtFields.get(0);
            String field56CS = field56C.toString();
            if (!field56CS.substring(0, 1).equals("//")
                    || field56CS.substring(0, 3).equals("//RT")
                    && !field56CS.substring(0, 5).equals("//RT//")
                    || field56CS.substring(0, 5).equals("//RT//")
                    && field56CS.length() < 10){
                throw new MTPreconditionException( Constants.FIELD56C_PRECONDITION);
            }
        }
    }
}
