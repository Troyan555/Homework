package hw6;

public class ArraySizeException extends Throwable implements MyException {
    private String message;

    public ArraySizeException(String m) {
        message = m;
    }

    public void PrintMessage() {
        System.out.println(message);
    }
}
