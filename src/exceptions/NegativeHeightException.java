package exceptions;

public class NegativeHeightException extends IllegalArgumentException {
    public NegativeHeightException() {
        super();
    }

    public NegativeHeightException(String message) {
        super(message);
    }

    public NegativeHeightException(String message, Throwable cause) {
        super(message, cause);
    }
}