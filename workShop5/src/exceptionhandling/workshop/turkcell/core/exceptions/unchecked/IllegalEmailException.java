package exceptionhandling.workshop.turkcell.core.exceptions.unchecked;

public class IllegalEmailException extends RuntimeException {

    public IllegalEmailException(String message)
    {
        super(message);
    }
}
