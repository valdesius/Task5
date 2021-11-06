package valdes.inc.com.company;

public class RhombusSizeException extends Exception{

    public RhombusSizeException(String message) {super(message);
    }

    public RhombusSizeException(String message, Throwable cause) {
        super(message, cause);
    }

    public RhombusSizeException(Throwable cause) {
        super(cause);
    }

    public RhombusSizeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
