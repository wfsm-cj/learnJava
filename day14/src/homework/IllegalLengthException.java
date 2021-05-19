package homework;

/**
 * @author chenjie
 * @date 2021/5/18-19:27
 */
public class IllegalLengthException extends RuntimeException{
    public IllegalLengthException() {
    }

    public IllegalLengthException(String message) {
        super(message);
    }

    public void showDetails() {
        System.out.println("长度不是11位~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
