package exceptions;

public class NullBaseException extends IllegalArgumentException {
    public NullBaseException() {
        super();
    }

    public NullBaseException(String message) {
        super(message);
    }

    public NullBaseException(String message, Throwable cause) {
        super(message, cause);
    }
}