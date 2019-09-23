package com.babel.swift.rules;

import com.babel.swift.exceptions.MTFieldParsingException;

import java.util.List;

public interface IMTComplexRule {
    Object apply (List<Object> mtFields, IMTRule... functions) throws MTFieldParsingException;
}
