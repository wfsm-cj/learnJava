package homework;

/**
 * @author chenjie
 * @date 2021/5/18-19:24
 */
public class IllegalCharacterException extends RuntimeException{
    public IllegalCharacterException() {
    }

    public IllegalCharacterException(String message) {
        super(message);
    }

    public void showDetails() {
        System.out.println("不是全数字~~~~~~~~~~~~~~~~~~");
    }
}
