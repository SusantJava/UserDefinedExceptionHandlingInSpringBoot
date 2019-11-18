package com.demo.exception;

public class NoBookFoundException extends RuntimeException {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6741201110192945998L;

	public NoBookFoundException(String msg){
		super(msg);
	}

}
