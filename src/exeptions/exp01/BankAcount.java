package exeptions.exp01;

import java.io.IOException;

public class BankAcount {
    private double balance;

    public void deposit (double amount) throws BankAccountException {
        if (amount <= 0){
            throw new BankAccountException(new InvalidAmoutException());
        }
        balance += amount;

    }
}
