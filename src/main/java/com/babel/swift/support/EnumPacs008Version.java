package com.babel.swift.support;

import java.util.ArrayList;
import java.util.List;


public enum EnumPacs008Version {

	V000_00( "" ),
	
	V001_02( "001.02" ),
	// añadir las versiones posteriores debajo de esta línea de comentarios
	;
	
	private final String type;
	
	EnumPacs008Version( final String type ) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
	
	public static EnumPacs008Version fromString( String type ) {
        for ( EnumPacs008Version mxVersion : EnumPacs008Version.values() ) {
            if (mxVersion.type.equalsIgnoreCase( type )) {
                return mxVersion;
            }
        }
        return V000_00;
    }
	
	public static String getLast() {
		List<EnumPacs008Version> lst = new ArrayList<>();
		for ( EnumPacs008Version mxVersion : EnumPacs008Version.values() ) {
            lst.add(mxVersion);
        }
		int last = lst.size();
		return lst.get(last - 1).getType();
	}
	
}