package com.babel.swift.constructors;

import java.io.StringWriter;
import java.io.Writer;
import java.text.ParseException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.namespace.QName;

import com.babel.swift.mappingfields.Camt054V00102_From_MT900_Mapper;
import com.babel.swift.support.Constants;

import iso.std.iso._20022.tech.xsd.camt_054_001_02.Document;



public class Camt054V00102_From_MT900_Constructor {

	private Camt054V00102_From_MT900_Mapper camt054V00102_from_mt900_mapper;
	
	public Camt054V00102_From_MT900_Constructor( Camt054V00102_From_MT900_Mapper mapping ) {
		camt054V00102_from_mt900_mapper = mapping;
	}
	
	public String xmlGenerator() 
			throws JAXBException, DatatypeConfigurationException, ParseException {
		
		JAXBContext contextObj = JAXBContext.newInstance(Document.class);

	    Marshaller marshallerObj = contextObj.createMarshaller();
	    marshallerObj.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, true );

	    Document document = new Document();

	    document.setBkToCstmrDbtCdtNtfctn( null );

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

	    // return the string from the string writer
		return sw.toString();
	}
	


	public Camt054V00102_From_MT900_Mapper getCamt054V00102_from_mt900_mapper() {
		return camt054V00102_from_mt900_mapper;
	}

	public void setCamt054V00102_from_mt900_mapper(Camt054V00102_From_MT900_Mapper camt054V00102_from_mt900_mapper) {
		this.camt054V00102_from_mt900_mapper = camt054V00102_from_mt900_mapper;
	}
	
}