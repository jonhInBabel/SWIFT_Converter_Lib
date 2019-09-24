package com.babel.swift.preconditions;

import java.util.List;

import com.babel.swift.exceptions.MTPreconditionException;

public interface IMTPrecondition {
	/**
	 * @param mtFields
	 * @throws MTPreconditionException
	 */
	void apply( List<Object> mtFields ) throws MTPreconditionException;
	
}