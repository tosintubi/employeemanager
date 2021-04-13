package org.tommot.employeemanager.exception;

public class UserNotFoundException extends RuntimeException {
    
    //Calls the constructor on the class and pass the "message
    public UserNotFoundException(String message) {
        super(message);
    }
}
