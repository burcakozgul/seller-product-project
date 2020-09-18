package com.example.sellerproductproject.exception;

public class GeneralException extends Exception{

    public GeneralException(String message) {
        super(message);
    }

    public GeneralException(String message, Throwable cause) {
        super(message, cause);
    }

}
