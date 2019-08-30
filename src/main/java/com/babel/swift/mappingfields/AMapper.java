package com.babel.swift.mappingfields;

import com.babel.swift.exceptions.MTConversionException;
import com.babel.swift.exceptions.MTFieldParsingException;
import com.prowidesoftware.swift.model.mt.AbstractMT;

public abstract class AMapper {

    protected Object mxObject;
    protected IXMLGenerator xmlGen;

    public AMapper (IXMLGenerator xmlGen) {
        this.xmlGen = xmlGen;
    }

/*    public Object getMxObject() {
        return mxObject;
    }

    public void setMxObject(Object mxObject) {
        this.mxObject = mxObject;
    }

    public IXMLGenerator getXmlGen() {
        return xmlGen;
    }

    public void setXmlGen(IXMLGenerator xmlGen) {
        this.xmlGen = xmlGen;
    }*/

    public String generateXML(AbstractMT mtMessage) throws MTConversionException {
        this.convert(mtMessage);
        return this.xmlGen.getXML(this.mxObject);
    }

    abstract protected void convert(AbstractMT mtMessage) throws MTFieldParsingException;

}
