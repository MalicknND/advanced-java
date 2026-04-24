package exeptions.exp01;

import java.io.IOException;

public class MyBankApp {
    public static void start()  {
        BankAcount bankAcount = new BankAcount();
        try {
            bankAcount.deposit(-100);
        } catch (BankAccountException e) {
            System.out.println(e.getCause().getMessage());
        }
    }
}
