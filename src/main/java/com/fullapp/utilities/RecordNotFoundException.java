package com.fullapp.utilities;

public class RecordNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
     
	public void RecordNotFoundException() {
		
	}
	
	public String toString() {
		return "record with given id not present";
	}
	
	public String getMessage() {
		return toString();
		
	}
	
}
