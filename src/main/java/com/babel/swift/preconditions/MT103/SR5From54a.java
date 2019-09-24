package com.babel.swift.preconditions.MT103;

import com.babel.swift.exceptions.MTPreconditionException;
import com.babel.swift.preconditions.IMTPrecondition;
import com.babel.swift.support.Constants;
import com.prowidesoftware.swift.model.field.Field54B;
import org.springframework.util.StringUtils;

import java.util.List;

public class SR5From54a implements IMTPrecondition {
    /**
     * @param mtFields One element 54a opt B
     * @throws MTPreconditionException If conditions are not met
     */
    @Override
    public void apply(List<Object> mtFields) throws MTPreconditionException {
        if( !StringUtils.isEmpty( mtFields.get(0) ) ) {
            Field54B field54B = (Field54B) mtFields.get(0);
            if (!StringUtils.isEmpty(field54B.getLocation())) {
                throw new MTPreconditionException( Constants.FIELD54B_PRECONDITION );
            }
        }
    }
}
