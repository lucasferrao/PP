package Exceptions;

public class UserDoesntExistException extends Exception {
    public UserDoesntExistException() {
    }

    public UserDoesntExistException(String message) {
        super(message);
    }
}
