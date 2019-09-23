package com.babel.swift.rules;

import java.util.List;

import com.babel.swift.exceptions.MTPreconditionException;

public interface IMTPrecondition {

	void apply( List<Object> mtFields ) throws MTPreconditionException;
	
}