package hw6;

public class ArrayDataException extends Throwable implements MyException {
    private String message;

    public ArrayDataException(String m) {
        message = m;
    }

    public void PrintMessage() {
        System.out.println(message);
    }
}
