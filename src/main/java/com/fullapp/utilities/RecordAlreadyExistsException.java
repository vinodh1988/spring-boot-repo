package com.fullapp.utilities;

public class RecordAlreadyExistsException extends Exception {
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 public RecordAlreadyExistsException() {}
     
     public String toString() {
    	 return "Record with given ID already exists";
     }
     
     public String getMessage() {
    	 return toString();
     }
}
