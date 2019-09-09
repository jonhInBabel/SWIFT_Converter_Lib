package com.babel.swift.mappers.MT_Mappers;

import com.babel.swift.exceptions.MTConversionException;
import com.babel.swift.exceptions.MTFieldParsingException;
import com.prowidesoftware.swift.model.mt.AbstractMT;

public abstract class AMTMapper {

    protected Object mxObject;
    protected IXMLGenerator xmlGen;

    public AMTMapper(IXMLGenerator xmlGen) {
        this.xmlGen = xmlGen;
    }

    public String convert2MX(AbstractMT mtMessage) throws MTConversionException {
        this.applyMTRules(mtMessage);
        return this.xmlGen.getXML(this.mxObject);
    }

    abstract protected void applyMTRules(AbstractMT mtMessage) throws MTFieldParsingException;
}
