package com.example.sellerproductproject.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(value = {GeneralException.class})
    public ResponseEntity<Object> handleApiRequestException(GeneralException e){
        ApiException apiException = new ApiException(
                e.getMessage()
        );
        return new ResponseEntity<>(apiException,HttpStatus.BAD_GATEWAY);
    }
}
