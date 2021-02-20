package org.sathya.person;


import org.springframework.http.HttpStatus;

public class PersonException extends RuntimeException{
    private String message;
    private HttpStatus httpStatus;

    PersonException(String message,HttpStatus httpStatus) {
        super();
        this.message = message;
        this.httpStatus = httpStatus;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
