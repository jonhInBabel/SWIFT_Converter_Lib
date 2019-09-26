package com.babel.swift.rules;

import java.util.Map;

import com.babel.swift.exceptions.MTFieldParsingException;

public interface IMTComplexRule {
//    Object apply (List<Object> mtFields, IMTRule... functions) throws MTFieldParsingException;
//	Object apply (List<Object> mtFields) throws MTFieldParsingException;
	Object apply ( Map<String, Object> mtFields ) throws MTFieldParsingException;
}
