package com.babel.swift.support;

import java.util.ArrayList;
import java.util.List;


public enum EnumMTVersion {

	V000_00( "" ),
	
	V001_02( "001.02" ),
	// añadir las versiones posteriores debajo de esta línea de comentarios
	;
	
	private final String type;
	
	EnumMTVersion(final String type ) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
	
	public static EnumMTVersion fromString(String type ) {
        for ( EnumMTVersion mxVersion : EnumMTVersion.values() ) {
            if (mxVersion.type.equalsIgnoreCase( type )) {
                return mxVersion;
            }
        }
        return V000_00;
    }
	
	public static String getLast() {
		List<EnumMTVersion> lst = new ArrayList<>();
		for ( EnumMTVersion mxVersion : EnumMTVersion.values() ) {
            lst.add(mxVersion);
        }
		int last = lst.size();
		return lst.get(last - 1).getType();
	}
	
}