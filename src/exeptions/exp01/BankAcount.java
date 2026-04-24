package exeptions.exp01;

import java.io.IOException;

public class BankAcount {
    private double balance;

    public void desposit (double amount) throws InvalidAmoutException {
        if (amount <= 0)
            throw new InvalidAmoutException();
        balance += amount;
    }
}
