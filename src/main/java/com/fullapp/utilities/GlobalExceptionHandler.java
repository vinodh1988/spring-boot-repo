package com.fullapp.utilities;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

@ExceptionHandler(value= {IllegalStateException.class})
protected ResponseEntity<Object> handleIllegalArgumentException(IllegalArgumentException e){
	 String response= e.getMessage();
	 return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
}

@ExceptionHandler(value= {RecordNotFoundException.class})
protected ResponseEntity<Object> handleRecordNotFoundException(RecordNotFoundException e){
	 String response= e.getMessage();
	 return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
}

@ExceptionHandler(value= {RecordAlreadyExistsException.class})
protected ResponseEntity<Object> handleRecordAlreadyExistsException(RecordAlreadyExistsException e){
	System.out.println("this exception called-global rec");
	String response= e.getMessage();
	 return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
}

@ExceptionHandler(value= {Exception.class})
protected ResponseEntity<Object> handleException(Exception e){
	 String response= e.getMessage();
	 return new ResponseEntity<>(response,HttpStatus.INTERNAL_SERVER_ERROR);
}
}


//a class that is annotated with controlled advice instantiates
//automatically as singleton	@ExceptionHandler(value= {IllegalArgumentException.class})
// the advice is active and oversess execution of every controller method
// if any controller throws exception and appropriate exceptionhandler will be
// invoked