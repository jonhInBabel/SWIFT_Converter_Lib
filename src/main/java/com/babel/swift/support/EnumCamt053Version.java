package com.babel.swift.support;

import java.util.ArrayList;
import java.util.List;


public enum EnumCamt053Version {

	V000_00( "" ),
	
	V001_02( "001.02" ),
	// añadir las versiones posteriores debajo de esta línea de comentarios
	;
	
	private final String type;
	
	EnumCamt053Version( final String type ) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
	
	public static EnumCamt053Version fromString( String type ) {
        for ( EnumCamt053Version mxVersion : EnumCamt053Version.values() ) {
            if (mxVersion.type.equalsIgnoreCase( type )) {
                return mxVersion;
            }
        }
        return V000_00;
    }
	
	public static String getLast() {
		List<EnumCamt053Version> lst = new ArrayList<>();
		for ( EnumCamt053Version mxVersion : EnumCamt053Version.values() ) {
            lst.add(mxVersion);
        }
		int last = lst.size();
		return lst.get(last - 1).getType();
	}
	
}