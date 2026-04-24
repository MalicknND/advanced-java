package genericite;

//-----------------------------
// interface Comparable
//----------------------------
public class BankAccount implements Comparable<BankAccount> {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public int compareTo(BankAccount bankAccount) {
        return (int) (balance - bankAccount.balance);

    }
}
