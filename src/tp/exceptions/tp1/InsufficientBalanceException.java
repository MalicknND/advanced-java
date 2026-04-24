package tp.exceptions.tp1;

//Exception : solde insuffisant
public class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
