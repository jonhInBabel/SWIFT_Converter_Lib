package com.babel.swift.mappers.MX_Mappers;

import com.babel.swift.exceptions.MXConversionException;
import com.babel.swift.exceptions.MXFieldParsingException;
import com.prowidesoftware.swift.model.mx.AbstractMX;

public abstract class AMXMapper {

    protected Object mtObject;

    public AMXMapper() { }

    public String convert2MT(AbstractMX mxMessage) throws MXConversionException {
        this.applyMXRules(mxMessage);
        // TODO: figure out how we will convert from mtObject to String
        return "";
    }

    abstract protected void applyMXRules(AbstractMX mxMessage) throws MXFieldParsingException;
}
