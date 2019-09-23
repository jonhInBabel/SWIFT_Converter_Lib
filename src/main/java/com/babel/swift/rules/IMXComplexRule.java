package com.babel.swift.rules;

import com.babel.swift.exceptions.MXFieldParsingException;

import java.util.List;

public interface IMXComplexRule {
    Object apply (List<Object> mtFields, IMXRule... functions) throws MXFieldParsingException;
}
