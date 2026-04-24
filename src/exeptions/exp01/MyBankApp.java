package exeptions.exp01;

import java.io.IOException;

public class MyBankApp {
    public static void start()  {
        BankAcount bankAcount = new BankAcount();
        try {
            bankAcount.desposit(-100);
        } catch (InvalidAmoutException e) {
            System.out.println("Logging");
                e.printStackTrace();
        }
    }
}
