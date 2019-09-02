package com.babel.swift.rules;

import com.babel.swift.exceptions.MXFieldParsingException;

public interface IMXRule {
    Object apply (Object mxField) throws MXFieldParsingException;
}
