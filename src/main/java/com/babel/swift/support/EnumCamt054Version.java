package com.babel.swift.support;

import java.util.ArrayList;
import java.util.List;


public enum EnumCamt054Version {

	V000_00( "" ),
	
	V001_02( "001.02" ),
	// añadir las versiones posteriores debajo de esta línea de comentarios
	;
	
	private final String type;
	
	EnumCamt054Version( final String type ) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
	
	public static EnumCamt054Version fromString( String type ) {
        for ( EnumCamt054Version mxVersion : EnumCamt054Version.values() ) {
            if (mxVersion.type.equalsIgnoreCase( type )) {
                return mxVersion;
            }
        }
        return V000_00;
    }
	
	public static String getLast() {
		List<EnumCamt054Version> lst = new ArrayList<>();
		for ( EnumCamt054Version mxVersion : EnumCamt054Version.values() ) {
            lst.add(mxVersion);
        }
		int last = lst.size();
		return lst.get(last - 1).getType();
	}
	
}