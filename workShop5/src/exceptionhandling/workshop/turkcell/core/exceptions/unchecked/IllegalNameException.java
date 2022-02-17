package exceptionhandling.workshop.turkcell.core.exceptions.unchecked;

public class IllegalNameException extends RuntimeException{

    public IllegalNameException(String message) {
        super(message);
    }
}
