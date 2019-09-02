package com.babel.swift.mappers;

import com.babel.swift.exceptions.MTConversionException;
import com.babel.swift.exceptions.MTFieldParsingException;
import com.babel.swift.exceptions.MXConversionException;
import com.babel.swift.exceptions.MXFieldParsingException;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.model.mx.AbstractMX;

public abstract class AMapper {

    protected Object mxObject;
    protected IXMLGenerator xmlGen;

    public AMapper (IXMLGenerator xmlGen) {
        this.xmlGen = xmlGen;
    }

    public String convert2MX(AbstractMT mtMessage) throws MTConversionException {
        this.applyMTRules(mtMessage);
        return this.xmlGen.getXML(this.mxObject);
    }

    public String convert2MT(AbstractMX mxMessage) throws MXConversionException {
        this.applyMXRules(mxMessage);
        //TODO: work out how to return transform the object (mt) to string and return it
        return null;
    }

    abstract protected void applyMTRules(AbstractMT mtMessage) throws MTFieldParsingException;

    abstract protected void applyMXRules(AbstractMX mxMessage) throws MXFieldParsingException;
}
