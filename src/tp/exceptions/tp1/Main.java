package tp.exceptions.tp1;

public class Main {
    public static void main(String[] args) {
        MyAccount account = new MyAccount("Malick", 1000);

        try {
            account.deposit(500);
            account.withdraw(2000);
        } catch (InvalidAmountException e){
            System.out.println("Error amount " + e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println("Error balance " + e.getMessage());
        }
        System.out.println("Balance: " + account.getBalance());


        try {
            account.withdraw(20000);
        } catch (Exception e){
            LoggerService.log(e.getMessage());
        }
    }
}