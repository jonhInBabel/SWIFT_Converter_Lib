package com.babel.swift.converters;

import java.text.ParseException;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;

import com.babel.swift.exceptions.MXVersionNotFoundException;
import com.prowidesoftware.swift.model.mt.AbstractMT;


public interface I_MT_MX_Converter {

	public String mt_to_mx( AbstractMT mt, String mxVersion ) 
			throws MXVersionNotFoundException, ParseException, JAXBException, DatatypeConfigurationException;
	
	public void mx_to_mt( String mxMessage );
	
}