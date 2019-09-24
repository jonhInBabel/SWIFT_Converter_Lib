package com.babel.swift.preconditions.MT103;

import com.babel.swift.exceptions.MTPreconditionException;
import com.babel.swift.preconditions.IMTPrecondition;
import com.babel.swift.support.Constants;
import com.prowidesoftware.swift.model.field.Field53B;
import com.prowidesoftware.swift.model.field.Field54A;
import org.springframework.util.StringUtils;

import java.util.List;

public class SR8From53a54a implements IMTPrecondition {
    /**
     * @param mtFields 1. 53a 2. 54a
     * @throws MTPreconditionException If conditions are not met
     */
    @Override
    public void apply(List<Object> mtFields) throws MTPreconditionException {
        Field53B field53B = (Field53B) mtFields.get(0);
        Field54A field54A = (Field54A) mtFields.get(1);

        if( !StringUtils.isEmpty( field53B ) && !StringUtils.isEmpty( field54A )) {
            throw new MTPreconditionException( Constants.FIELD53A_PRECONDITION);
        }
    }
}
