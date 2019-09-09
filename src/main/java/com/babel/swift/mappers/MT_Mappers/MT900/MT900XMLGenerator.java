package com.babel.swift.mappers.MT_Mappers.MT900;

import com.babel.swift.exceptions.MTConversionException;
import com.babel.swift.mappers.MT_Mappers.IXMLGenerator;
import com.babel.swift.support.Constants;
import iso.std.iso._20022.tech.xsd.camt_054_001_02.Document;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import java.io.StringWriter;
import java.io.Writer;

public class MT900XMLGenerator implements IXMLGenerator {
    @Override
    public String getXML(Object mxObject) throws MTConversionException {
        JAXBContext contextObj = null;
        Marshaller marshallerObj = null;
        try {
            contextObj = JAXBContext.newInstance(Document.class);
            marshallerObj = contextObj.createMarshaller();
            marshallerObj.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, true );

            Document document = (Document) mxObject;

            /* este codigo es por si las clases no tienen la anotacion de @XmlRootElement
             * en el Qname se le pone el xmlns del document sino pone esto antes de cada etiqueta :ns2....example:
             *
             * <root xmlns:ns2="http://www.something.com/something">
             *	<ns2:food>steak</ns2:food>
             */
            JAXBElement<Document> jaxbElement = new JAXBElement<Document>( new QName( Constants.CAMT054_XMLNS, "Document"),
                    Document.class,
                    document);

            // output string writer
            Writer sw = new StringWriter();

            // si @XmlRootElement viene en las clases, entonces:
            marshallerObj.marshal(jaxbElement, sw);
            return sw.toString();
        } catch (JAXBException e) {
            e.printStackTrace();
            throw new MTConversionException("JAXBException [" + e.getMessage() + "]");
        }
    }
}
