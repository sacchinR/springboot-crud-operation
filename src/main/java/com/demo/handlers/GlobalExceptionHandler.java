package com.demo.handlers;

import com.demo.constants.MessageCodes;
import com.demo.io.ExceptionResponseModel;
import com.demo.io.StatusMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.io.IOException;
import java.text.ParseException;


@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ExceptionResponseModel> generalException(Exception e) throws Exception{
		log.error("Exception type Exception in generalException() in  class GlobalExceptionHandler and exception is " +  e);
		ExceptionResponseModel model = new ExceptionResponseModel();
		model.setStatus(MessageCodes.INTERNAL_SERVER_ERROR);
		model.setStatusMessage(new StatusMessage(MessageCodes.INTERNAL_SERVER_ERROR_MSG, "Internal Server Error. Please try again later."));
		return new ResponseEntity<ExceptionResponseModel>(model, HttpStatus.INTERNAL_SERVER_ERROR);
	}


	@ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ExceptionResponseModel> badRequest(MethodArgumentNotValidException e) throws IOException{
		log.error("Exception type MethodArgumentNotValidException in badRequest() in  class GlobalExceptionHandler and exception is " +  e);
		ExceptionResponseModel model = new ExceptionResponseModel();
		model.setStatus(MessageCodes.BAD_REQUEST);
		model.setStatusMessage(new StatusMessage(MessageCodes.BAD_REQUEST, e.getMessage()));
        return new ResponseEntity<ExceptionResponseModel>(model, HttpStatus.BAD_REQUEST);
    }

	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<ExceptionResponseModel> handleIllegalArgumentException(IllegalArgumentException e) throws IOException {
		log.error("Exception type IllegalArgumentException in handleIllegalArgumentException() in  class GlobalExceptionHandler and exception is " + e);
		ExceptionResponseModel model = new ExceptionResponseModel();
		model.setStatus(MessageCodes.BAD_REQUEST);
		model.setStatusMessage(new StatusMessage(MessageCodes.BAD_REQUEST, e.getMessage()));
		return new ResponseEntity<ExceptionResponseModel>(model, HttpStatus.BAD_REQUEST);
	}
	

	@ExceptionHandler({ParseException.class})
    public ResponseEntity<ExceptionResponseModel> unsupportedMediaType(ParseException e) throws IOException {
		log.error("Exception type ParseException in unsupportedMediaType() in  class GlobalExceptionHandler and exception is " +  e);
		ExceptionResponseModel model = new ExceptionResponseModel();
		model.setStatus(MessageCodes.UNSUPPORTED_MEDIA_TYPE);
		model.setStatusMessage(new StatusMessage(MessageCodes.UNSUPPORTED_MEDIA_TYPE_MSG, MessageCodes.UNSUPPORTED_MEDIA_TYPE_DESC));
        return new ResponseEntity<ExceptionResponseModel>(model, HttpStatus.UNSUPPORTED_MEDIA_TYPE);
    }
	
	
}
