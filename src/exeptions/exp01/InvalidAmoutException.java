package exeptions.exp01;

// Checked => Exception
// unChecked => RuntimeException
public class InvalidAmoutException extends Exception {


    public InvalidAmoutException() {
        super("Amount must be positive");
    }

    public InvalidAmoutException(String message) {
        super(message);
    }
}
