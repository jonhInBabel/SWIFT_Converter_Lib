package com.babel.swift.preconditions.MT103;

import com.babel.swift.exceptions.MTPreconditionException;
import com.babel.swift.preconditions.IMTPrecondition;
import com.babel.swift.support.Constants;
import com.prowidesoftware.swift.model.field.Field53B;
import org.springframework.util.StringUtils;

import java.util.List;

public class SR1From53a implements IMTPrecondition {
    /**
     * @param mtFields Only element of the list is field 53a option B
     * @throws MTPreconditionException If conditions are not met
     */
    @Override
    public void apply(List<Object> mtFields) throws MTPreconditionException {
        if( !StringUtils.isEmpty( mtFields.get(0) ) ) {
            Field53B field53B = (Field53B) mtFields.get(0);
            if (!StringUtils.isEmpty(field53B.getLocation()) && StringUtils.isEmpty(field53B.getValue())) {
                throw new MTPreconditionException( Constants.FIELD53B_PRECONDITION );
            }
        }
    }
}
