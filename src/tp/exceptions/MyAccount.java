package tp.exceptions;

public class MyAccount {


        private String owner;
        private double balance;

        public MyAccount(String owner, double balance) {
            this.owner = owner;
            this.balance = balance;
        }

        public void deposit(double amount) throws InvalidAmountException{
            if (amount <= 0){
                throw new InvalidAmountException("Amount must be positive");
            }
            balance += amount;
        }

        public void withdraw(double amount) throws InvalidAmountException, InsufficientBalanceException {
            if (amount <= 0){
                throw new InvalidAmountException("Amount must be positive");
            }
            if (amount > balance){
                throw new InsufficientBalanceException("Insufficient balance");
            }
            balance -= amount;
        }

        public double getBalance(){
            return balance;
        }
    }


