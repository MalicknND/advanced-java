package exeptions.exp01;

import java.io.IOException;

public class MyBankApp {
    public static void start() throws IOException {
        BankAcount bankAcount = new BankAcount();
        try {
            bankAcount.desposit(-100);
        } catch (IOException e) {
            System.out.println("Logging");
            throw e;
        }
    }
}
