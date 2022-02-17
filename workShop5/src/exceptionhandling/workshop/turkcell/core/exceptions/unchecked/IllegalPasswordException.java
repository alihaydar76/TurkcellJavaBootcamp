package exceptionhandling.workshop.turkcell.core.exceptions.unchecked;

public class IllegalPasswordException extends RuntimeException{

    public IllegalPasswordException(String message) {
        super(message);
    }
}
