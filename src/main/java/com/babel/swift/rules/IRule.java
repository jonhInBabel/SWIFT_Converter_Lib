package com.babel.swift.rules;

import com.babel.swift.exceptions.MTFieldParsingException;

public interface IRule {
    Object apply (Object mtField) throws MTFieldParsingException;
}
