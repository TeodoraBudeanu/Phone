package main.com.siit.exceptions;

public class DuplicateContactException extends RuntimeException {

    public DuplicateContactException(String message){
        super(message);
    }
}
