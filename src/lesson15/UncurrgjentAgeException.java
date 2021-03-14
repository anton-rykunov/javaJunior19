package lesson15;

public class UncurrgjentAgeException extends RuntimeException {
    public UncurrgjentAgeException() {
    }

    public UncurrgjentAgeException(String message) {
        super(message);
    }

    public UncurrgjentAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public UncurrgjentAgeException(Throwable cause) {
        super(cause);
    }

    public UncurrgjentAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
