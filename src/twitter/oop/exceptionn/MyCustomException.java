package twitter.oop.exceptionn;

// kelas exception Khusus yang kita buat bray
public class MyCustomException extends Exception {

    public MyCustomException(String message) {
        super(message);
    }
}
