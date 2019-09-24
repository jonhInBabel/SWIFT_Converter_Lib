package com.babel.swift.preconditions.MT103;

import java.util.List;

import org.springframework.util.StringUtils;

import com.babel.swift.exceptions.MTPreconditionException;
import com.babel.swift.preconditions.IMTPrecondition;
import com.babel.swift.support.Constants;
import com.prowidesoftware.swift.model.field.Field32A;
import com.prowidesoftware.swift.model.field.Field71F;

/*
 * Input: first element = Field32A, rest = 71Fs
 */
public class SR2 implements IMTPrecondition {

	@Override
	public void apply( List<Object> mtFields ) throws MTPreconditionException {

		Field32A field32A = (Field32A) mtFields.get(0);
		mtFields.remove(0);
		for( Object object : mtFields ) {
			if( !StringUtils.isEmpty( object ) ) {
				Field71F field71F = (Field71F) object;
				if( !( field32A.getCurrency().equals(field71F.getCurrency() ) ) ) {
					throw new MTPreconditionException( Constants.FIELD71F_PRECONDITION );
				}
			}
		}
		
	}

}