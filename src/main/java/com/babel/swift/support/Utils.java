package com.babel.swift.support;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;


public class Utils {

	/**
	 * (String) yyMMdd -> (String) yyyy-MM-dd
	 * @param strDate
	 * @return
	 * @throws ParseException
	 */
	public static String dateSimpleFormat( String strDate ) throws ParseException {
		
		Date date 						= new SimpleDateFormat( Constants.YYMMDD ).parse( strDate );
		SimpleDateFormat formatterDate 	= new SimpleDateFormat( Constants.YYYY_MM_DD );
		String formatDate 				= formatterDate.format( date );
		
		return formatDate;
	}
	
	/**
	 * (String) yyMMdd -> (String) yyyy-MM-ddTHH:mm:ss
	 * @param strDate
	 * @return
	 * @throws ParseException
	 */
	public static String dateComplexFormat( String strDate ) throws ParseException {
		
		Date date 						= new SimpleDateFormat( Constants.YYMMDD ).parse(strDate);
		SimpleDateFormat formatterDate 	= new SimpleDateFormat( Constants.YYYY_MM_DDTHH_MM_SS );
		String formatDate 				= formatterDate.format( date );
		
		return formatDate;
	}
	
	/**
	 * (String) yyMMdd -> (XMLGregorianCalendar) yyyy-MM-dd
	 * @param strDate
	 * @return
	 * @throws DatatypeConfigurationException
	 * @throws ParseException
	 */
	public static XMLGregorianCalendar stringToXMLGregorianCalendar( String strDate ) throws DatatypeConfigurationException, ParseException {
		
		DateFormat format 	= new SimpleDateFormat( Constants.YYYY_MM_DD );
    	Date date 			= format.parse( strDate );
    	
    	XMLGregorianCalendar xmlGregCal =
    			DatatypeFactory.newInstance().newXMLGregorianCalendar( format.format( date ) );
    	
		return xmlGregCal;
	}
}