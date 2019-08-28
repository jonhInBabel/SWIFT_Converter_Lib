package com.babel.swift.support;

import java.util.ArrayList;
import java.util.List;


public enum EnumPacs009Version {

	V000_00( "" ),
	
	V001_02( "001.02" ),
	// añadir las versiones posteriores debajo de esta línea de comentarios
	;
	
	private final String type;
	
	EnumPacs009Version( final String type ) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
	
	public static EnumPacs009Version fromString( String type ) {
        for ( EnumPacs009Version mxVersion : EnumPacs009Version.values() ) {
            if (mxVersion.type.equalsIgnoreCase( type )) {
                return mxVersion;
            }
        }
        return V000_00;
    }
	
	public static String getLast() {
		List<EnumPacs009Version> lst = new ArrayList<>();
		for ( EnumPacs009Version mxVersion : EnumPacs009Version.values() ) {
            lst.add(mxVersion);
        }
		int last = lst.size();
		return lst.get(last - 1).getType();
	}
	
}