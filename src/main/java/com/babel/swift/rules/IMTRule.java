package com.babel.swift.rules;

import com.babel.swift.exceptions.MTFieldParsingException;
import com.prowidesoftware.swift.model.mt.AbstractMT;


public interface IMTRule {
    Object apply ( AbstractMT mt ) throws MTFieldParsingException;
}