package com.babel.swift.rules;

import com.babel.swift.exceptions.MTFieldParsingException;

import java.text.ParseException;

public interface IMTRule {
    Object apply (Object mtField) throws MTFieldParsingException;
}
