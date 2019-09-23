package com.babel.swift.rules;

import com.babel.swift.exceptions.MTFieldParsingException;

public interface IMTRule {
    Object apply (Object mtField) throws MTFieldParsingException;
}
