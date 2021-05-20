package exceptions;

public class MyUncheckedException extends RuntimeException {
    public MyUncheckedException(String msg) {
        super(msg);
    }
}
