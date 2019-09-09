package com.babel.swift.mappers.MT_Mappers;

import com.babel.swift.exceptions.MTConversionException;

public interface IXMLGenerator {

    String getXML(Object mxObject) throws MTConversionException;
}
