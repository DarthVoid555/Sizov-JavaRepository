package exceptions;

public class NegativeRadiusException extends IllegalArgumentException {
    public NegativeRadiusException() {
        super();
    }

    public NegativeRadiusException(String message) {
        super(message);
    }

    public NegativeRadiusException(String message, Throwable cause) {
        super(message, cause);
    }
}