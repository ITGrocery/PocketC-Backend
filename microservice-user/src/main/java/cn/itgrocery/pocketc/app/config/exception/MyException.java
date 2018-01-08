package cn.itgrocery.pocketc.app.config.exception;

/**
 * @ author chenxl
 * @ date 2018/1/3 14:30
 * @ describe
 */
public class MyException extends RuntimeException {

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(String msg, String... args) {
        super(String.format(msg, args));
    }
}
