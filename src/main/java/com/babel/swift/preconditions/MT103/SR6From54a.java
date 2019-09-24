package com.babel.swift.preconditions.MT103;

import com.babel.swift.exceptions.MTPreconditionException;
import com.babel.swift.preconditions.IMTPrecondition;
import com.babel.swift.support.Constants;
import com.prowidesoftware.swift.model.field.Field55B;
import org.springframework.util.StringUtils;

import java.util.List;

public class SR6From54a implements IMTPrecondition {
    /**
     * @param mtFields Only 55a option B
     * @throws MTPreconditionException If conditions are not met
     */
    @Override
    public void apply(List<Object> mtFields) throws MTPreconditionException {
        Field55B field55B = (Field55B) mtFields.get(0);
        if( !StringUtils.isEmpty( field55B ) ) {
            throw new MTPreconditionException( Constants.FIELD55B_PRECONDITION);
        }
    }
}
