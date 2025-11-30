package exceptions;

public class NegativeSideException extends IllegalArgumentException {
    public NegativeSideException() {
        super();
    }

    public NegativeSideException(String message) {
        super(message);
    }

    public NegativeSideException(String message, Throwable cause) {
        super(message, cause);
    }
}