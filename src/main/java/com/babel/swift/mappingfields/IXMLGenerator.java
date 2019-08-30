package com.babel.swift.mappingfields;

import com.babel.swift.exceptions.MTConversionException;

public interface IXMLGenerator {

    String getXML(Object mxObject) throws MTConversionException;
}
